/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.juphoon.cmcc.app.lemon;

public class MtcString {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected MtcString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MtcString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        MtcAcvDbJNI.delete_MtcString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setValue(String value) {
    MtcAcvDbJNI.MtcString_value_set(swigCPtr, this, value);
  }

  public String getValue() {
    return MtcAcvDbJNI.MtcString_value_get(swigCPtr, this);
  }

  public MtcString() {
    this(MtcAcvDbJNI.new_MtcString(), true);
  }

}
