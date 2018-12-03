package com.juphoon.rcs.jrdemo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.juphoon.cmcc.app.lemon.MtcCliCfgConstants;
import com.juphoon.cmcc.app.lemon.MtcProf;
import com.juphoon.rcs.JRAccount;
import com.juphoon.rcs.JRAccountConstants;
import com.juphoon.rcs.JRClient;
import com.juphoon.rcs.JRClientCallback;
import com.juphoon.rcs.JRClientConstants;
import com.juphoon.rcs.utils.JRCommonUtils;

import common.utils.JRNumberUtils;

public class AccountListActivity extends AppCompatActivity implements JRClientCallback, OnClickListener {
    private ListView mUserListView;
    private AccountAdapter mAdapter;
    private ProgressDialog mProgress;
    private String mCurLoginedUser;
    private String mLoginTag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        JRClient.getInstance().addCallback(this);
        initViews();
    }

    @Override
    protected void onResume() {
        mAdapter.notifyDataSetChanged();
        super.onResume();
    }

    private void initViews() {
        mUserListView = (ListView) findViewById(R.id.list);
        mAdapter = new AccountAdapter(this);
        mUserListView.setAdapter(mAdapter);
        mUserListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (JRClient.getInstance().getState() == JRClientConstants.JRClientState.JR_REG_STATE_REGED) {
                    if (i == 0) {

                    } else if (i == 1) {
                        mProgress.setMessage("注销中");
                        mProgress.show();
                        JRClient.getInstance().logout();
                    }
                } else {
                    if (i == JRAccount.getInstance().getAccountList().size()) {
                        startActivity(new Intent(AccountListActivity.this, CreateAccountActivity.class));
                    } else {
                        mProgress.setMessage("登录中");
                        mProgress.show();
                        JRAccount.getInstance().setAccountConfig(JRAccount.getInstance().getAccountList().get(i),
                                JRAccountConstants.JRAccountConfigKeyRegType,String.valueOf(MtcCliCfgConstants.EN_MTC_REG_SRV_VOIP));
                        JRClient.getInstance().login(JRAccount.getInstance().getAccountList().get(i));
                        mLoginTag = JRAccount.getInstance().getAccountList().get(i);
                    }

                }
            }
        });
        mUserListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (JRClient.getInstance().getState() != JRClientConstants.JRClientState.JR_REG_STATE_REGED && i < JRAccount.getInstance().getAccountList().size()) {
                    AccountActivity.openAccount(AccountListActivity.this, JRAccount.getInstance().getAccountList().get(i));
                } else if (JRClient.getInstance().getState() == JRClientConstants.JRClientState.JR_REG_STATE_REGED && i == 0) {
                    AccountActivity.openAccount(AccountListActivity.this, MtcProf.Mtc_ProfGetCurUser());
                }
                return true;
            }
        });
        mProgress = new ProgressDialog(this);
        mProgress.setCancelable(false);
    }

    @Override
    public void onClientInitResult(boolean result, JRClientConstants.JRClientReason reason) {

    }

    @Override
    public void onClientLoginResult(boolean result, JRClientConstants.JRClientRegErrorCode reason) {
        mProgress.dismiss();
        if (result) {
            Toast.makeText(this, "已登录", Toast.LENGTH_SHORT).show();
            mCurLoginedUser = mLoginTag;
            mAdapter.notifyDataSetChanged();
        } else {
            mCurLoginedUser = null;
        }
    }

    @Override
    public void onClientLogoutResult() {
        mProgress.dismiss();
//        Toast.makeText(this, "已登出", Toast.LENGTH_SHORT).show();
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClientStateChange(JRClientConstants.JRClientState state, int reason) {
        String errorString = JRNumberUtils.getStatMsg(reason, this);
        if(!TextUtils.isEmpty(errorString)) {
            Toast.makeText(this,errorString , Toast.LENGTH_SHORT).show();
        }
        mProgress.dismiss();
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View view) {

    }

    private static class AccountAdapter extends BaseAdapter {

        private Context mContext;
        AccountAdapter mAccountAdapter;

        public AccountAdapter(Context context) {
            mContext = context;
            mAccountAdapter = this;
        }

        @Override
        public int getCount() {
            //判断登录状态
            if (JRClient.getInstance().getState() == JRClientConstants.JRClientState.JR_REG_STATE_REGED) {
                return 2;
            } else {
                return JRAccount.getInstance().getAccountList().size() + 1;
            }
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            ViewHolder holder = null;
            if (convertView == null) {
                convertView = LayoutInflater.from(mContext).inflate(R.layout.item_drawer, parent, false);
                holder = new ViewHolder();
                holder.name = (TextView) convertView.findViewById(R.id.drawer_item_title);
                holder.delete = (Button) convertView.findViewById(R.id.delete);
                convertView.setTag(holder);

            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            if (JRClient.getInstance().getState() == JRClientConstants.JRClientState.JR_REG_STATE_REGED) {
                String curUser = MtcProf.Mtc_ProfGetCurUser();
                holder.delete.setVisibility(View.GONE);
                if (position == 0) {
                    holder.name.setText(curUser);
                } else if (position == 1) {
                    holder.name.setText("注销");
                }
            } else {
                if (position == JRAccount.getInstance().getAccountList().size()) {
                    holder.name.setText("添加");
                    holder.delete.setVisibility(View.GONE);
                } else {
                    holder.name.setText(JRAccount.getInstance().getAccountList().get(position));
                    holder.delete.setVisibility(View.VISIBLE);
                }
                holder.delete.setTag(position);
                holder.delete.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int pos = (int) view.getTag();
                        if (JRAccount.getInstance().deleteAccount(JRAccount.getInstance().getAccountList().get(pos))) {
                            notifyDataSetChanged();
                        }
                    }
                });
            }

            return convertView;
        }

        class ViewHolder {
            TextView name;
            Button delete;

        }
    }
}
