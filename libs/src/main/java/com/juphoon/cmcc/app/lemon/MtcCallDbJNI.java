/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.juphoon.cmcc.app.lemon;

public class MtcCallDbJNI {
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
  public final static native int Mtc_CallDbRestoreProvision(int jarg1);
  public final static native int Mtc_CallDbGetDtmfType();
  public final static native int Mtc_CallDbSetDtmfType(int jarg1);
  public final static native int Mtc_CallDbGetDtmfPayload();
  public final static native int Mtc_CallDbSetDtmfPayload(int jarg1);
  public final static native boolean Mtc_CallDbGetDtmfWatch();
  public final static native int Mtc_CallDbSetDtmfWatch(boolean jarg1);
  public final static native int Mtc_CallDbGetAudioJitterParms(MtcNumber jarg1, MtcNumber jarg2);
  public final static native int Mtc_CallDbSetAudioJitterParms(int jarg1, int jarg2);
  public final static native int Mtc_CallDbGetAudioQos(MtcNumber jarg1, MtcNumber jarg2, MtcNumber jarg3, MtcNumber jarg4);
  public final static native int Mtc_CallDbSetAudioQos(boolean jarg1, boolean jarg2, boolean jarg3, boolean jarg4);
  public final static native int Mtc_CallDbSetAecEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetAecEnable();
  public final static native int Mtc_CallDbSetAecMode(short jarg1);
  public final static native short Mtc_CallDbGetAecMode();
  public final static native int Mtc_CallDbSetVadEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetVadEnable();
  public final static native int Mtc_CallDbSetVadMode(short jarg1);
  public final static native short Mtc_CallDbGetVadMode();
  public final static native int Mtc_CallDbSetAgcEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetAgcEnable();
  public final static native int Mtc_CallDbSetAgcMode(short jarg1);
  public final static native short Mtc_CallDbGetAgcMode();
  public final static native int Mtc_CallDbSetAgcTarget(short jarg1);
  public final static native short Mtc_CallDbGetAgcTarget();
  public final static native int Mtc_CallDbSetRxAgcEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetRxAgcEnable();
  public final static native int Mtc_CallDbSetRxAgcMode(short jarg1);
  public final static native short Mtc_CallDbGetRxAgcMode();
  public final static native int Mtc_CallDbSetRxAgcTarget(short jarg1);
  public final static native short Mtc_CallDbGetRxAgcTarget();
  public final static native int Mtc_CallDbSetAnrEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetAnrEnable();
  public final static native int Mtc_CallDbSetAnrMode(short jarg1);
  public final static native short Mtc_CallDbGetAnrMode();
  public final static native boolean Mtc_CallDbGetAudioArsEnable();
  public final static native int Mtc_CallDbSetAudioArsEnable(boolean jarg1);
  public final static native int Mtc_CallDbSetRxAnrEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetRxAnrEnable();
  public final static native int Mtc_CallDbSetRxAnrMode(short jarg1);
  public final static native short Mtc_CallDbGetRxAnrMode();
  public final static native int Mtc_CallDbSetAudioRed(boolean jarg1);
  public final static native boolean Mtc_CallDbGetAudioRed();
  public final static native boolean Mtc_CallDbGetAudioRtxEnable();
  public final static native int Mtc_CallDbSetAudioRtxEnable(boolean jarg1);
  public final static native int Mtc_CallDbSetAmrWbBitrate(int jarg1);
  public final static native int Mtc_CallDbGetAmrWbBitrate();
  public final static native int Mtc_CallDbSetAmrBitrate(int jarg1);
  public final static native int Mtc_CallDbGetAmrBitrate();
  public final static native int Mtc_CallDbGetSuptAudioCodecCount();
  public final static native String Mtc_CallDbGetSuptAudioCodec(int jarg1);
  public final static native int Mtc_CallDbGetAudioCodecCount();
  public final static native String Mtc_CallDbGetAudioCodecByPriority(short jarg1);
  public final static native int Mtc_CallDbSetAudioCodecEnable(String jarg1, boolean jarg2);
  public final static native int Mtc_CallDbSetAudioCodecByPriority(String jarg1, short jarg2);
  public final static native int Mtc_CallDbGetSpkDftVol();
  public final static native int Mtc_CallDbSetSpkDftVol(int jarg1);
  public final static native int Mtc_CallDbGetSuptVideoCodecCount();
  public final static native String Mtc_CallDbGetSuptVideoCodec(int jarg1);
  public final static native int Mtc_CallDbGetVideoCodecCount();
  public final static native String Mtc_CallDbGetVideoCodecByPriority(short jarg1);
  public final static native boolean Mtc_CallDbGetCodecPriorityAutoAdjust();
  public final static native int Mtc_CallDbSetVideoCodecEnable(String jarg1, boolean jarg2);
  public final static native int Mtc_CallDbSetVideoCodecByPriority(String jarg1, short jarg2);
  public final static native int Mtc_CallDbSetCodecPriorityAutoAdjust(boolean jarg1);
  public final static native int Mtc_CallDbSetVideoH264Profile(short jarg1);
  public final static native short Mtc_CallDbGetVideoH264Profile();
  public final static native int Mtc_CallDbSetVideoH264Packetmode(short jarg1);
  public final static native short Mtc_CallDbGetVideoH264Packetmode();
  public final static native int Mtc_CallDbSetVideoImgAttrEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetVideoImgAttrEnable();
  public final static native int Mtc_CallDbSetVideoCvoEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetVideoCvoEnable();
  public final static native int Mtc_CallDbGetVideoBitrate();
  public final static native int Mtc_CallDbSetVideoBitrate(int jarg1);
  public final static native int Mtc_CallDbGetVideoFramerate();
  public final static native int Mtc_CallDbSetVideoFramerate(int jarg1);
  public final static native int Mtc_CallDbGetVideoResolution(MtcNumber jarg1, MtcNumber jarg2);
  public final static native int Mtc_CallDbSetVideoResolution(int jarg1, int jarg2);
  public final static native String Mtc_CallDbGetVideoResolutionX();
  public final static native int Mtc_CallDbSetVideoResolutionX(String jarg1);
  public final static native boolean Mtc_CallDbGetMdmEnable();
  public final static native int Mtc_CallDbSetMdmEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetResolutionControl();
  public final static native int Mtc_CallDbSetResolutionControl(boolean jarg1);
  public final static native boolean Mtc_CallDbGetFramerateControl();
  public final static native int Mtc_CallDbSetFramerateControl(boolean jarg1);
  public final static native boolean Mtc_CallDbGetCpuLoadControl();
  public final static native int Mtc_CallDbSetCpuLoadControl(boolean jarg1);
  public final static native int Mtc_CallDbGetCpuLoadTarget();
  public final static native int Mtc_CallDbSetCpuLoadTarget(int jarg1);
  public final static native boolean Mtc_CallDbGetFir();
  public final static native int Mtc_CallDbSetFir(boolean jarg1);
  public final static native boolean Mtc_CallDbGetFirByInfo();
  public final static native int Mtc_CallDbSetFirByInfo(boolean jarg1);
  public final static native int Mtc_CallDbGetKeyPeriod();
  public final static native int Mtc_CallDbSetKeyPeriod(int jarg1);
  public final static native int Mtc_CallDbGetKeyRepeat();
  public final static native int Mtc_CallDbSetKeyRepeat(int jarg1);
  public final static native boolean Mtc_CallDbGetVideoBem();
  public final static native int Mtc_CallDbSetVideoBem(boolean jarg1);
  public final static native int Mtc_CallDbGetVideoBandwidth(MtcNumber jarg1, MtcNumber jarg2);
  public final static native int Mtc_CallDbSetVideoBandwidth(int jarg1, int jarg2);
  public final static native boolean Mtc_CallDbGetVideoOrientSend();
  public final static native int Mtc_CallDbSetVideoOrientSend(boolean jarg1);
  public final static native boolean Mtc_CallDbGetVideoOrientRecv();
  public final static native int Mtc_CallDbSetVideoOrientRecv(boolean jarg1);
  public final static native int Mtc_CallDbGetVideoOrientId();
  public final static native int Mtc_CallDbSetVideoOrientId(int jarg1);
  public final static native boolean Mtc_CallDbGetVideoArs();
  public final static native int Mtc_CallDbSetVideoArs(boolean jarg1);
  public final static native int Mtc_CallDbSetArsMode(short jarg1);
  public final static native short Mtc_CallDbGetArsMode();
  public final static native int Mtc_CallDbGetVideoArsParm(MtcNumber jarg1, MtcNumber jarg2, MtcNumber jarg3, MtcNumber jarg4);
  public final static native int Mtc_CallDbSetVideoArsParm(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native int Mtc_CallDbSetVideoArsParmX(boolean jarg1);
  public final static native int Mtc_CallDbGetVideoFecType();
  public final static native int Mtc_CallDbSetVideoFecType(int jarg1);
  public final static native boolean Mtc_CallDbGetRtcpEnable();
  public final static native int Mtc_CallDbSetRtcpEnable(boolean jarg1);
  public final static native int Mtc_CallDbGetRtpPort(MtcNumber jarg1, MtcNumber jarg2, MtcNumber jarg3, MtcNumber jarg4);
  public final static native int Mtc_CallDbSetRtpPort(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native int Mtc_CallDbGetRtpBreakTime();
  public final static native int Mtc_CallDbSetRtpBreakTime(int jarg1);
  public final static native int Mtc_CallDbGetSrtpCryptoType();
  public final static native int Mtc_CallDbSetSrtpCryptoType(int jarg1);
  public final static native boolean Mtc_CallDbGetSrtpAuthRtp();
  public final static native int Mtc_CallDbSetSrtpAuthRtp(boolean jarg1);
  public final static native boolean Mtc_CallDbGetSrtpEncryptRtp();
  public final static native int Mtc_CallDbSetSrtpEncryptRtp(boolean jarg1);
  public final static native boolean Mtc_CallDbGetSrtpEncryptRtcp();
  public final static native int Mtc_CallDbSetSrtpEncryptRtcp(boolean jarg1);
  public final static native boolean Mtc_CallDbGetNackEnable();
  public final static native int Mtc_CallDbSetNackEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetRtxEnable();
  public final static native int Mtc_CallDbSetRtxEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetTmmbrEnable();
  public final static native int Mtc_CallDbSetTmmbrEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetAudioRtcpMuxEnable();
  public final static native int Mtc_CallDbSetAudioRtcpMuxEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetVideoRtcpMuxEnable();
  public final static native int Mtc_CallDbSetVideoRtcpMuxEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetRpsiEnable();
  public final static native int Mtc_CallDbSetRpsiEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetSmallNaluEnable();
  public final static native int Mtc_CallDbSetSmallNaluEnable(boolean jarg1);
  public final static native int Mtc_CallDbGetPtime();
  public final static native int Mtc_CallDbSetPtime(int jarg1);
  public final static native boolean Mtc_CallDbGetAutoAcptCall();
  public final static native int Mtc_CallDbSetAutoAcptCall(boolean jarg1);
  public final static native boolean Mtc_CallDbGetCwc();
  public final static native int Mtc_CallDbSetCwc(boolean jarg1);
  public final static native boolean Mtc_CallDbGetDoNotDisturb();
  public final static native int Mtc_CallDbSetDoNotDisturb(boolean jarg1);
  public final static native boolean Mtc_CallDbGetCfuInfo(MtcString jarg1);
  public final static native int Mtc_CallDbSetCfuInfo(boolean jarg1, String jarg2);
  public final static native boolean Mtc_CallDbGetCfbInfo(MtcString jarg1);
  public final static native int Mtc_CallDbSetCfbInfo(boolean jarg1, String jarg2);
  public final static native boolean Mtc_CallDbGetCfnaInfo(MtcString jarg1, MtcNumber jarg2);
  public final static native int Mtc_CallDbSetCfnaInfo(boolean jarg1, String jarg2, int jarg3);
  public final static native boolean Mtc_CallDbGetPrivacyOpt(short jarg1);
  public final static native int Mtc_CallDbSetPrivacyOpt(short jarg1, boolean jarg2);
  public final static native boolean Mtc_CallDbGetSymNego();
  public final static native int Mtc_CallDbSetSymNego(boolean jarg1);
  public final static native int Mtc_CallDbGetSessTmrInfo(MtcNumber jarg1, MtcNumber jarg2, MtcNumber jarg3);
  public final static native int Mtc_CallDbSetSessTmrInfo(int jarg1, int jarg2, int jarg3);
  public final static native int Mtc_CallDbGetVoiceDscpValue();
  public final static native int Mtc_CallDbGetVideoDscpValue();
  public final static native int Mtc_CallDbGetRcsIpVoiceCallAuth();
  public final static native int Mtc_CallDbGetRcsIpVideoCallAuth();
  public final static native boolean Mtc_CallDbGetIpCallBreakOut();
  public final static native boolean Mtc_CallDbGetIpCallBreakOutCs();
  public final static native boolean Mtc_CallDbGetVCallUpgFromCs();
  public final static native boolean Mtc_CallDbGetVCallUpgAttemptEarly();
  public final static native boolean Mtc_CallDbGetVCallUpgOnCapError();
  public final static native int Mtc_CallDbSetVoiceDscpValue(int jarg1);
  public final static native int Mtc_CallDbSetVideoDscpValue(int jarg1);
  public final static native int Mtc_CallDbSetRcsIpVoiceCallAuth(int jarg1);
  public final static native int Mtc_CallDbSetRcsIpVideoCallAuth(int jarg1);
  public final static native int Mtc_CallDbSetIpCallBreakOut(boolean jarg1);
  public final static native int Mtc_CallDbSetIpCallBreakOutCs(boolean jarg1);
  public final static native int Mtc_CallDbSetVCallUpgFromCs(boolean jarg1);
  public final static native int Mtc_CallDbSetVCallUpgAttemptEarly(boolean jarg1);
  public final static native int Mtc_CallDbSetVCallUpgOnCapError(boolean jarg1);
  public final static native String Mtc_CallDbGetPrefixCont();
  public final static native int Mtc_CallDbSetPrefixCont(String jarg1);
  public final static native int Mtc_CallDbGetPrefixOption();
  public final static native int Mtc_CallDbSetPrefixOption(int jarg1);
  public final static native int Mtc_CallDbGetPAIPolicy();
  public final static native int Mtc_CallDbSetPAIPolicy(int jarg1);
  public final static native int Mtc_CallDbSetRtpReportEnable(boolean jarg1, boolean jarg2, boolean jarg3);
  public final static native boolean Mtc_CallDbGetRtpReportEnable(boolean jarg1);
  public final static native int Mtc_CallDbGetH264Payload();
  public final static native int Mtc_CallDbSetH264Payload(int jarg1);
  public final static native int Mtc_CallDbSetAutoRingEnable(boolean jarg1);
  public final static native boolean Mtc_CallDbGetAutoRingEnable();
  public final static native int Mtc_CallDbSetAstrmDirectionType(int jarg1);
  public final static native int Mtc_CallDbGetAstrmDirectionType();
  public final static native int Mtc_CallDbSet182Enable(boolean jarg1);
  public final static native boolean Mtc_CallDbGet182Enable();
  public final static native int Mtc_CallDbGetSessHearBeatTmrLen(MtcNumber jarg1);
  public final static native int Mtc_CallDbSetSessHearBeatTmrLen(int jarg1);
}
