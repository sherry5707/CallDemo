/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.juphoon.cmcc.app.lemon;

public class MtcImIshareJNI {
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
  public final static native int Mtc_ImIShareSend(Object jarg1, String jarg2, String jarg3, int jarg4);
  public final static native int Mtc_ImIShareAccept(int jarg1, String jarg2);
  public final static native int Mtc_ImIShareReject(int jarg1);
  public final static native int Mtc_ImIShareCancel(int jarg1);
  public final static native int Mtc_ImIShareRelease(int jarg1);
  public final static native Object Mtc_ImIShareGetCookie(int jarg1);
  public final static native int Mtc_ImIShareSetCookie(int jarg1, Object jarg2);
  public final static native String Mtc_ImIShareGetName(int jarg1);
  public final static native int Mtc_ImIShareGetType(int jarg1);
  public final static native int Mtc_ImIShareGetSize(int jarg1);
  public final static native int Mtc_ImIShareGetSentSize(int jarg1);
  public final static native int Mtc_ImIShareGetRecvSize(int jarg1);
  public final static native int Mtc_ImIShareGetPartpType(int jarg1);
  public final static native int Mtc_ImIShareGetPartp(int jarg1, MtcString jarg2, MtcString jarg3);
  public final static native int Mtc_ImIShareGetPartpLstId(int jarg1);
  public final static native int Mtc_ImIShareGetOrigPartp(int jarg1, MtcString jarg2, MtcString jarg3);
  public final static native int Mtc_ImIShareGetOrigIdPartp(int jarg1, MtcString jarg2, MtcString jarg3);
  public final static native int Mtc_ImIShareGetSysDateTime(int jarg1, long jarg2);
  public final static native int Mtc_ImIShareGetDateTime(int jarg1);
}
