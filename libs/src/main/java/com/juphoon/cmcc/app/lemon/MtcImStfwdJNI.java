/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.juphoon.cmcc.app.lemon;

public class MtcImStfwdJNI {
  public final static native void MtcNumber_value_set(long jarg1, MtcNumber jarg1_, int jarg2);
  public final static native int MtcNumber_value_get(long jarg1, MtcNumber jarg1_);
  public final static native long new_MtcNumber();
  public final static native void delete_MtcNumber(long jarg1);
  public final static native void MtcByteArray_data_set(long jarg1, MtcByteArray jarg1_, long jarg2);
  public final static native long MtcByteArray_data_get(long jarg1, MtcByteArray jarg1_);
  public final static native void MtcByteArray_size_set(long jarg1, MtcByteArray jarg1_, long jarg2);
  public final static native long MtcByteArray_size_get(long jarg1, MtcByteArray jarg1_);
  public final static native void MtcByteArray_value_set(long jarg1, MtcByteArray jarg1_, byte[] jarg2);
  public final static native byte[] MtcByteArray_value_get(long jarg1, MtcByteArray jarg1_);
  public final static native long new_MtcByteArray();
  public final static native void delete_MtcByteArray(long jarg1);
  public final static native void MtcString_value_set(long jarg1, MtcString jarg1_, String jarg2);
  public final static native String MtcString_value_get(long jarg1, MtcString jarg1_);
  public final static native long new_MtcString();
  public final static native void delete_MtcString(long jarg1);
  public final static native int Mtc_ImStFwdAccept(int jarg1);
  public final static native int Mtc_ImStFwdReject(int jarg1);
  public final static native String Mtc_ImStFwdGetSubject(int jarg1);
  public final static native int Mtc_ImStFwdGetPartpType(int jarg1);
  public final static native int Mtc_ImStFwdGetPartp(int jarg1, MtcString jarg2, MtcString jarg3);
  public final static native int Mtc_ImStFwdGetPartpLstId(int jarg1);
  public final static native int Mtc_ImStFwdGetOrigPartp(int jarg1, MtcString jarg2, MtcString jarg3);
  public final static native int Mtc_ImStFwdGetOrigIdPartp(int jarg1, MtcString jarg2, MtcString jarg3);
  public final static native int Mtc_ImStFwdGetSysDateTime(int jarg1, long jarg2);
  public final static native int Mtc_ImStFwdGetDateTime(int jarg1);
  public final static native int Mtc_ImStFwdMsgGetImdnType(int jarg1, int jarg2);
  public final static native String Mtc_ImStFwdMsgGetImdnMsgId(int jarg1, int jarg2);
  public final static native String Mtc_ImStFwdMsgGetDeviceId(int jarg1, int jarg2);
  public final static native int Mtc_ImStFwdMsgGetContentType(int jarg1, int jarg2);
  public final static native int Mtc_ImStFwdMsgGetContentLen(int jarg1, int jarg2);
  public final static native String Mtc_ImStFwdMsgGetContent(int jarg1, int jarg2);
  public final static native int Mtc_ImStFwdMsgGetMContent(int jarg1, int jarg2, MtcByteArray jarg3);
  public final static native int Mtc_ImStFwdMsgGetPartp(int jarg1, int jarg2, MtcString jarg3, MtcString jarg4);
  public final static native int Mtc_ImStFwdMsgGetSysDateTime(int jarg1, int jarg2, long jarg3);
  public final static native int Mtc_ImStFwdMsgGetDateTime(int jarg1, int jarg2);
}
