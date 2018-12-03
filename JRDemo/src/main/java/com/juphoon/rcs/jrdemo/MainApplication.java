package com.juphoon.rcs.jrdemo;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.baidu.mapapi.SDKInitializer;
import com.juphoon.rcs.JRCall;
import com.juphoon.rcs.JRCallCallback;
import com.juphoon.rcs.JRCallConstants;
import com.juphoon.rcs.JRCallItem;
import com.juphoon.rcs.JRCallStorage;
import com.juphoon.rcs.JRLog;
import com.juphoon.rcs.utils.MtcAudioUtils;

import common.RealmDataHelper;
import io.realm.Realm;

/**
 * Created by Upon on 2017/12/17.
 */

public class MainApplication extends Application implements JRCallCallback {
    public static Context sApp;

    @Override
    public void onCreate() {
        sApp = this;
        SDKInitializer.initialize(this);
        Realm.init(this);
        MtcAudioUtils.init(this);
        JRCall.getInstance().addCallback(this);
        super.onCreate();
    }

    @Override
    public void onCallItemUpdated(JRCallItem item, JRCallConstants.Error error,int updateType) {

    }

    @Override
    public void onCallItemRemove(JRCallItem item, JRCallConstants.TremReason reason) {

    }

    @Override
    public void onCallItemAdd(JRCallItem item) {
        if(JRCallStorage.getInstance().getCurItem() != null){
            JRLog.log("yidao","当前有活跃callItem 不需要启动activity");
            return;
        }
        Intent intent = new Intent(this,JRCallActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        intent.putExtra(JRCommonValue.JRCALL_EXTRA_SESSION_ID,item.getCallId());
        startActivity(intent);
    }
}
