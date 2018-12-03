/**
 * @file MtcConfConstants.java
 * @brief MtcConfConstants constants
 */
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.juphoon.cmcc.app.lemon;

/**
 * @brief MtcConfConstants constants
 */
public interface MtcConfConstants {
  public final static int MTC_EBASE_CP = 0xE000; /**< @brief CP error base */
  public final static int MTC_EBASE_REG = 0xE100; /**< @brief REG error base */
  public final static int MTC_EBASE_CALL = 0xE200; /**< @brief CALL error base */
  public final static int MTC_EBASE_VSHARE = 0xE300; /**< @brief VSHARE error base */
  public final static int MTC_EBASE_CAP = 0xE400; /**< @brief CAP error base */
  public final static int MTC_EBASE_BUDDY = 0xE500; /**< @brief BUDDY error base */
  public final static int MTC_EBASE_GRP = 0xE600; /**< @brief GRP error base */
  public final static int MTC_EBASE_CONF = 0xE700; /**< @brief CONF error base */
  public final static int MTC_EBASE_GS = 0xE800; /**< @brief GS error base */
  public final static int MTC_EBASE_PRES = 0xE900; /**< @brief PRES error base */
  public final static int MTC_EBASE_IM = 0xEA00; /**< @brief IM error base */
  public final static int MTC_EBASE_LCS = 0xEB00; /**< @brief LCS error base */
  public final static int MTC_EBASE_PA = 0xEC00; /**< @brief PA error base */
  public final static int MTC_EBASE_CPROF = 0xED00; /**< @brief CRPOF error base */
  public final static int MTC_EBASE_GBA = 0xEE00; /**< @brief GBA error base */
  public final static int MTC_CONF_ERR_NO = (0xE700+0); /**< @brief no error. */
  public final static int MTC_CONF_ERR_AUTH_FAILED = (0xE700+1); /**< @brief authentication failed, invalid user or password. */
  public final static int MTC_CONF_ERR_SESS_TMR = (0xE700+2); /**< @brief conference refresh error. */
  public final static int MTC_CONF_ERR_FORBIDDEN = (0xE700+3); /**< @brief conference forbidden. */
  public final static int MTC_CONF_ERR_NOT_FOUND = (0xE700+4); /**< @brief conference participant not found. */
  public final static int MTC_CONF_ERR_NOT_ACPTED = (0xE700+5); /**< @brief conference not accepted. */
  public final static int MTC_CONF_ERR_TEMP_UNAVAIL = (0xE700+6); /**< @brief conference participant temp unavailable. */
  public final static int MTC_CONF_ERR_REQ_TERMED = (0xE700+7); /**< @brief conference request terminated. */
  public final static int MTC_CONF_ERR_INTERNAL_ERR = (0xE700+8); /**< @brief server internal error. */
  public final static int MTC_CONF_ERR_SRV_UNAVAIL = (0xE700+9); /**< @brief service unavailable. */
  public final static int MTC_CONF_ERR_COVIB_CANCEL = (0xE700+10); /**< @brief conference terminated co-vibration cancel. */
  public final static int MTC_CONF_ERR_SAMESIDE_TALK = (0xE700+11); /**< @brief conference terminated by same side talk . */
  public final static int MTC_CONF_ERR_SUBS_TERMED = (0xE700+12); /**< @brief conference subscription terminated. */
  public final static int MTC_CONF_TERM_BYE = (0xE700+13); /**< @brief conference terminated by bye . */
  public final static int MTC_CONF_TERM_NETWORK = (0xE700+14); /**< @brief conference terminated by network error . */
  public final static int MTC_CONF_ERR_OTHER = (0xE700+200); /**< @brief other error. */
  // EN_MTC_CONF_PARTP_STATE_TYPE 
  public final static int EN_MTC_CONF_PARTP_STATE_PENDING = 0; /**<@brief Conference participant pending. */
  public final static int EN_MTC_CONF_PARTP_STATE_DIALINGIN = EN_MTC_CONF_PARTP_STATE_PENDING + 1; /**<@brief Conference participant dialing in. */
  public final static int EN_MTC_CONF_PARTP_STATE_DIALINGOUT = EN_MTC_CONF_PARTP_STATE_DIALINGIN + 1; /**<@brief Conference participant dialing out. */
  public final static int EN_MTC_CONF_PARTP_STATE_ALERTING = EN_MTC_CONF_PARTP_STATE_DIALINGOUT + 1; /**<@brief Conference participant alerting. */
  public final static int EN_MTC_CONF_PARTP_STATE_CONNED = EN_MTC_CONF_PARTP_STATE_ALERTING + 1; /**<@brief Conference participant connected. */
  public final static int EN_MTC_CONF_PARTP_STATE_ONHOLD = EN_MTC_CONF_PARTP_STATE_CONNED + 1; /**<@brief Conference participant onhold. */
  public final static int EN_MTC_CONF_PARTP_STATE_DISCING = EN_MTC_CONF_PARTP_STATE_ONHOLD + 1; /**<@brief Conference participant disconnecting. */
  public final static int EN_MTC_CONF_PARTP_STATE_DISCED = EN_MTC_CONF_PARTP_STATE_DISCING + 1; /**<@brief Conference participant disconnected. */

  // EN_MTC_CONF_NET_STATUS_TYPE 
  public final static int EN_MTC_CONF_NET_STATUS_DISCONNECTED = -3; /**< @brief Conference Disconnected from network. */
  public final static int EN_MTC_CONF_NET_STATUS_VERY_BAD = -2; /**< @brief Conference Network status is very bad. */
  public final static int EN_MTC_CONF_NET_STATUS_BAD = -1; /**< @brief Conference Network status is bad. */
  public final static int EN_MTC_CONF_NET_STATUS_NORMAL = 0; /**< @brief Conference Network status is normal. */
  public final static int EN_MTC_CONF_NET_STATUS_GOOD = 1; /**< @brief Conference Network status is good. */
  public final static int EN_MTC_CONF_NET_STATUS_VERY_GOOD = 2; /**< @brief Conference Network status is very good. */

  // EN_MTC_CONF_VIDEO_SWITCH_MODE 
  public final static int EN_MTC_CONF_VOICE_CONTROL_MODE = 1; /**< @brief Conference voice control mode. */
  public final static int EN_MTC_CONF_CHAIRMAN_CONTROL_MODE = 2; /**< @brief Conference chairman control mode . */

  // EN_MTC_CONF_MULTI_PIC_MODE 
  public final static int EN_MTC_CONF_MULTI_PIC_ONE_BIG = 0; /**< @brief One-big picture size mode. */
  public final static int EN_MTC_CONF_MULTI_PIC_ALL_SAME = 1; /**< @brief All same picture size mode. */

}