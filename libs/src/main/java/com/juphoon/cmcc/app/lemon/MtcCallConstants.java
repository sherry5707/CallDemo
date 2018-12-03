/**
 * @file MtcCallConstants.java
 * @brief MtcCallConstants constants
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
 * @brief MtcCallConstants constants
 */
public interface MtcCallConstants {
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
  public final static String MTC_CALL_REC_FILE_PCM = "pcm"; /**< @brief pcm content */
  public final static String MTC_CALL_REC_FILE_WAV = "wav"; /**< @brief wav content */
  public final static int MTC_CALL_ERR_NO = (0xE200+0); /**< @brief no error. */
  public final static int MTC_CALL_ERR_AUTH_FAILED = (0xE200+1); /**< @brief authentication failed, invalid user or password. */
  public final static int MTC_CALL_ERR_SESS_TMR = (0xE200+2); /**< @brief call refresh error. */
  public final static int MTC_CALL_ERR_FORBIDDEN = (0xE200+3); /**< @brief call forbidden. */
  public final static int MTC_CALL_ERR_NOT_FOUND = (0xE200+4); /**< @brief call participant not found. */
  public final static int MTC_CALL_ERR_NOT_ACPTED = (0xE200+5); /**< @brief call not accepted. */
  public final static int MTC_CALL_ERR_TEMP_UNAVAIL = (0xE200+6); /**< @brief call participant temp unavailable. */
  public final static int MTC_CALL_ERR_REQ_TERMED = (0xE200+7); /**< @brief call request terminated. */
  public final static int MTC_CALL_ERR_INTERNAL_ERR = (0xE200+8); /**< @brief server internal error. */
  public final static int MTC_CALL_ERR_SRV_UNAVAIL = (0xE200+9); /**< @brief service unavailable. */
  public final static int MTC_CALL_ERR_NOT_EXIST = (0xE200+10); /**< @brief not exist. */
  public final static int MTC_CALL_ERR_USER_NOTREG = (0xE200+11); /**< @brief call participant not Registered. */
  public final static int MTC_CALL_ERR_NOT_FRIEND = (0xE200+12); /**< @brief call participant is not friend. */
  public final static int MTC_CALL_ERR_IN_BACK_LST = (0xE200+13); /**< @brief call participant is in black list. */
  public final static int MTC_CALL_ERR_TRANS_FAIL = (0xE200+14); /**< @brief call transaction error. */
  public final static int MTC_CALL_ERR_REJECTED = (0xE200+15); /**< @brief Add/RMV video failed beacause of rejected by other participant. */
  public final static int MTC_CALL_ERR_NETWORK = (0xE200+16); /**< @brief Add/RMV video failed  or call termed because of local network disconnected . */
  public final static int MTC_CALL_ERR_TIMEOUT = (0xE200+17); /**< @brief Add/RMV video failed because of timeout for the request. */
  public final static int MTC_CALL_ERR_IN_SERVICE = (0xE200+18); /**< @brief Add/RMV video failed because of last request in service. */
  public final static int MTC_CALL_TERM_BYE = (0xE200+21); /**< @brief Terminated by bye. */
  public final static int MTC_CALL_TERM_CANCEL = (0xE200+22); /**< @brief Terminated by cancel. */
  public final static int MTC_CALL_TERM_TIMEOUT = (0xE200+23); /**< @brief Terminated by timeout. */
  public final static int MTC_CALL_TERM_BUSY = (0xE200+24); /**< @brief Terminated by busy. */
  public final static int MTC_CALL_TERM_DECLINE = (0xE200+25); /**< @brief Terminated by decline. */
  public final static int MTC_CALL_TERM_TRSFED = (0xE200+26); /**< @brief Terminated by transfered. */
  public final static int MTC_CALL_TERM_REDIRECT = (0xE200+27); /**< @brief Terminated by redirect. */
  public final static int MTC_CALL_TERM_REPLACE = (0xE200+28); /**< @brief Terminated by replace. */
  public final static int MTC_CALL_TERM_COVIB_CANCEL = (0xE200+29); /**< @brief Terminated by co-vibration cancel. */
  public final static int MTC_CALL_TERM_SAMESIDE_TALK = (0xE200+30); /**< @brief Terminated by same side talk . */
  public final static int MTC_CALL_ALERT_RING = (0xE200+41); /**< @brief Alerted by 180. */
  public final static int MTC_CALL_ALERT_QUEUED = (0xE200+42); /**< @brief Alerted by 182. */
  public final static int MTC_CALL_ALERT_PROGRESS = (0xE200+43); /**< @brief Alerted by 183. */
  public final static int MTC_CALL_ALERT_OTHER = (0xE200+44); /**< @brief Alerted by other type. */
  public final static int MTC_CALL_ERR_OTHER = (0xE200+200); /**< @brief other error. */
  // EN_MTC_CALL_DTMF_TYPE 
  public final static int EN_MTC_CALL_DTMF_0 = 0; /**< @brief DTMF signal 0 */
  public final static int EN_MTC_CALL_DTMF_1 = EN_MTC_CALL_DTMF_0 + 1; /**< @brief DTMF signal 1 */
  public final static int EN_MTC_CALL_DTMF_2 = EN_MTC_CALL_DTMF_1 + 1; /**< @brief DTMF signal 2 */
  public final static int EN_MTC_CALL_DTMF_3 = EN_MTC_CALL_DTMF_2 + 1; /**< @brief DTMF signal 3 */
  public final static int EN_MTC_CALL_DTMF_4 = EN_MTC_CALL_DTMF_3 + 1; /**< @brief DTMF signal 4 */
  public final static int EN_MTC_CALL_DTMF_5 = EN_MTC_CALL_DTMF_4 + 1; /**< @brief DTMF signal 5 */
  public final static int EN_MTC_CALL_DTMF_6 = EN_MTC_CALL_DTMF_5 + 1; /**< @brief DTMF signal 6 */
  public final static int EN_MTC_CALL_DTMF_7 = EN_MTC_CALL_DTMF_6 + 1; /**< @brief DTMF signal 7 */
  public final static int EN_MTC_CALL_DTMF_8 = EN_MTC_CALL_DTMF_7 + 1; /**< @brief DTMF signal 8 */
  public final static int EN_MTC_CALL_DTMF_9 = EN_MTC_CALL_DTMF_8 + 1; /**< @brief DTMF signal 9 */
  public final static int EN_MTC_CALL_DTMF_STAR = EN_MTC_CALL_DTMF_9 + 1; /**< @brief DTMF signal * */
  public final static int EN_MTC_CALL_DTMF_POUND = EN_MTC_CALL_DTMF_STAR + 1; /**< @brief DTMF signal # */
  public final static int EN_MTC_CALL_DTMF_A = EN_MTC_CALL_DTMF_POUND + 1; /**< @brief DTMF signal A */
  public final static int EN_MTC_CALL_DTMF_B = EN_MTC_CALL_DTMF_A + 1; /**< @brief DTMF signal B */
  public final static int EN_MTC_CALL_DTMF_C = EN_MTC_CALL_DTMF_B + 1; /**< @brief DTMF signal C */
  public final static int EN_MTC_CALL_DTMF_D = EN_MTC_CALL_DTMF_C + 1; /**< @brief DTMF signal D */

  // EN_MTC_CALL_MTYPE 
  public final static int EN_MTC_CALL_MTYPE_DISC_TEXT = 0; /**< @brief Type for "text". */
  public final static int EN_MTC_CALL_MTYPE_DISC_APP = EN_MTC_CALL_MTYPE_DISC_TEXT + 1; /**< @brief Type for "application". */

  // EN_MTC_CALL_MSUBTYPE 
  public final static int EN_MTC_CALL_MSUBTYPE_PLAIN = 0; /**< @brief Type for "plain". */
  public final static int EN_MTC_CALL_MSUBTYPE_UD_SIGNAL = EN_MTC_CALL_MSUBTYPE_PLAIN + 1; /**< @brief Type for "ud-signal" */

  // EN_MTC_CALL_ALERT_INFO_TYPE 
  public final static int EN_MTC_CALL_ALERT_INFO_NULL = 0; /**< @brief no alert info */
  public final static int EN_MTC_CALL_ALERT_INFO_DR0 = EN_MTC_CALL_ALERT_INFO_NULL + 1; /**< @brief bellcore_dr0 */
  public final static int EN_MTC_CALL_ALERT_INFO_DR1 = EN_MTC_CALL_ALERT_INFO_DR0 + 1; /**< @brief bellcore_dr1 */
  public final static int EN_MTC_CALL_ALERT_INFO_DR2 = EN_MTC_CALL_ALERT_INFO_DR1 + 1; /**< @brief bellcore_dr2 */
  public final static int EN_MTC_CALL_ALERT_INFO_DR3 = EN_MTC_CALL_ALERT_INFO_DR2 + 1; /**< @brief bellcore_dr3 */
  public final static int EN_MTC_CALL_ALERT_INFO_DR4 = EN_MTC_CALL_ALERT_INFO_DR3 + 1; /**< @brief bellcore_dr4 */
  public final static int EN_MTC_CALL_ALERT_INFO_DR5 = EN_MTC_CALL_ALERT_INFO_DR4 + 1; /**< @brief bellcore_dr5 */

  // EN_MTC_CALL_EM_STATUS_TYPE 
  public final static int EN_MTC_CALL_EM_STATUS_INACTIVE = 0; /**< @brief inactive */
  public final static int EN_MTC_CALL_EM_STATUS_SENDONLY = EN_MTC_CALL_EM_STATUS_INACTIVE + 1; /**< @brief sendonly */
  public final static int EN_MTC_CALL_EM_STATUS_RECVONLY = EN_MTC_CALL_EM_STATUS_SENDONLY + 1; /**< @brief recvonly */
  public final static int EN_MTC_CALL_EM_STATUS_SENDRECV = EN_MTC_CALL_EM_STATUS_RECVONLY + 1; /**< @brief sendrecv */

  // EN_MTC_CALL_TERM_REASON_TYPE 
  public final static int EN_MTC_CALL_TERM_REASON_NORMAL = 0; /**< @brief normal session term, bye or cancel */
  public final static int EN_MTC_CALL_TERM_REASON_BUSY = EN_MTC_CALL_TERM_REASON_NORMAL + 1; /**< @brief the session is rejected */
  public final static int EN_MTC_CALL_TERM_REASON_DECLINE = EN_MTC_CALL_TERM_REASON_BUSY + 1; /**< @brief decline the session */
  public final static int EN_MTC_CALL_TERM_REASON_NOT_AVAILABLE = EN_MTC_CALL_TERM_REASON_DECLINE + 1; /**< @brief the user is not available */
  public final static int EN_MTC_CALL_TERM_REASON_INTERRUPT = EN_MTC_CALL_TERM_REASON_NOT_AVAILABLE + 1; /**< @brief active interrupt because of unavailable network */

  // EN_MTC_CALL_REC_MODE_TYPE 
  public final static int EN_MTC_CALL_REC_MODE_ALL = 0; /**< @brief record all data */
  public final static int EN_MTC_CALL_REC_MODE_PLAY = EN_MTC_CALL_REC_MODE_ALL + 1; /**< @brief record palying data */
  public final static int EN_MTC_CALL_REC_MODE_MIC = EN_MTC_CALL_REC_MODE_PLAY + 1; /**< @brief record microphone data */

  // EN_MTC_CALL_TRANSMISSION_STATE 
  public final static int EN_MTC_CALL_TRANSMISSION_NORMAL = 0x6E726D6C;
  public final static int EN_MTC_CALL_TRANSMISSION_CAMOFF = 0x636F6666;
  public final static int EN_MTC_CALL_TRANSMISSION_PAUSE = 0x70617364;
  public final static int EN_MTC_CALL_TRANSMISSION_PAUSE4QOS = 0x70716F73;

  // EN_MTC_ORIENTATION_TYPE 
  public final static int EN_MTC_ORIENTATION_PORTRAIT = 0; /**< @brief Display like a portrait, home button on the bottom side. */
  public final static int EN_MTC_ORIENTATION_LANDSCAPE_RIGHT = EN_MTC_ORIENTATION_PORTRAIT + 1; /**< @brief Landscape display, home button on the right side. */
  public final static int EN_MTC_ORIENTATION_PORTRAIT_UPSIDEDOWN = EN_MTC_ORIENTATION_LANDSCAPE_RIGHT + 1; /**< @brief Display like a portrait, home button on the top side. */
  public final static int EN_MTC_ORIENTATION_LANDSCAPE_LEFT = EN_MTC_ORIENTATION_PORTRAIT_UPSIDEDOWN + 1; /**< @brief Landscape display, home button on the left side. */

  // EN_MTC_NET_STATUS_TYPE 
  public final static int EN_MTC_NET_STATUS_DISCONNECTED = -3; /**< @brief Disconnected from network. */
  public final static int EN_MTC_NET_STATUS_VERY_BAD = -2; /**< @brief Network status is very bad. */
  public final static int EN_MTC_NET_STATUS_BAD = -1; /**< @brief Network status is bad. */
  public final static int EN_MTC_NET_STATUS_NORMAL = 0; /**< @brief Network status is normal. */
  public final static int EN_MTC_NET_STATUS_GOOD = 1; /**< @brief Network status is good. */
  public final static int EN_MTC_NET_STATUS_VERY_GOOD = 2; /**< @brief Network status is very good. */

  // EN_MTC_SESSION_STATE_TYPE 
  public final static int EN_MTC_SESSION_STATE_IDLE = 0; /**<@brief Session state is idle. */
  public final static int EN_MTC_SESSION_STATE_OUTGOING = EN_MTC_SESSION_STATE_IDLE + 1; /**<@brief Session state is outgoing. */
  public final static int EN_MTC_SESSION_STATE_INCOMING = EN_MTC_SESSION_STATE_OUTGOING + 1; /**<@brief Session state is incoming. */
  public final static int EN_MTC_SESSION_STATE_ALERTED = EN_MTC_SESSION_STATE_INCOMING + 1; /**<@brief Session state is alerted. */
  public final static int EN_MTC_SESSION_STATE_CONNECTING = EN_MTC_SESSION_STATE_ALERTED + 1; /**<@brief Session state is connecting. */
  public final static int EN_MTC_SESSION_STATE_TALKING = EN_MTC_SESSION_STATE_CONNECTING + 1; /**<@brief Session state is talking. */
  public final static int EN_MTC_SESSION_STATE_ENDED = EN_MTC_SESSION_STATE_TALKING + 1; /**<@brief Session state is ended. */
  public final static int EN_MTC_SESSION_STATE_DIDEND = EN_MTC_SESSION_STATE_ENDED + 1; /**<@brief Session state is didend. */

  // EN_MTC_SESS_PARTP_STATE_TYPE 
  public final static int EN_MTC_SESS_PARTP_STATE_PENDING = 0; /**<@brief Session participant pending. */
  public final static int EN_MTC_SESS_PARTP_STATE_DIALINGIN = EN_MTC_SESS_PARTP_STATE_PENDING + 1; /**<@brief Session participant dialing in. */
  public final static int EN_MTC_SESS_PARTP_STATE_DIALINGOUT = EN_MTC_SESS_PARTP_STATE_DIALINGIN + 1; /**<@brief Session participant dialing out. */
  public final static int EN_MTC_SESS_PARTP_STATE_ALERTING = EN_MTC_SESS_PARTP_STATE_DIALINGOUT + 1; /**<@brief Session participant alerting. */
  public final static int EN_MTC_SESS_PARTP_STATE_CONNED = EN_MTC_SESS_PARTP_STATE_ALERTING + 1; /**<@brief Session participant connected. */
  public final static int EN_MTC_SESS_PARTP_STATE_ONHOLD = EN_MTC_SESS_PARTP_STATE_CONNED + 1; /**<@brief Session participant onhold. */
  public final static int EN_MTC_SESS_PARTP_STATE_DISCING = EN_MTC_SESS_PARTP_STATE_ONHOLD + 1; /**<@brief Session participant disconnecting. */
  public final static int EN_MTC_SESS_PARTP_STATE_DISCED = EN_MTC_SESS_PARTP_STATE_DISCING + 1; /**<@brief Session participant disconnected. */

  // EN_MTC_SESS_CRYPTO_STATE_TYPE 
  public final static int EN_MTC_SESS_NO_CRYPTO = 0; /**< @brief session no crypto */
  public final static int EN_MTC_SESS_FIXED_CRYPTO = EN_MTC_SESS_NO_CRYPTO + 1; /**< @brief sesssion with fixed crypto */
  public final static int EN_MTC_SESS_DTLS_SW_CERT = EN_MTC_SESS_FIXED_CRYPTO + 1; /**< @brief sesssion dtls software certificated crypto */
  public final static int EN_MTC_SESS_DTLS_HW_CERT_FAILED = EN_MTC_SESS_DTLS_SW_CERT + 1; /**< @brief sesssion dtls hardware certificated crypto but cert verify failed */
  public final static int EN_MTC_SESS_DTLS_HW_CERT_SUCCESS = EN_MTC_SESS_DTLS_HW_CERT_FAILED + 1; /**< @brief sesssion dtls hardware certificated crypto but cert verify failed */

  // EN_MTC_ALERT_TYPE 
  public final static int EN_MTC_ALERT_RING = 0; /* 180 ring */
  public final static int EN_MTC_ALERT_QUEUED = EN_MTC_ALERT_RING + 1; /* 182 queued */
  public final static int EN_MTC_ALERT_PROGRESS = EN_MTC_ALERT_QUEUED + 1; /* 183 session progress */

}
