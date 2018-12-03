/**
 * @file MtcCliCfgConstants.java
 * @brief MtcCliCfgConstants constants
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
 * @brief MtcCliCfgConstants constants
 */
public interface MtcCliCfgConstants {
  public final static int MTC_REG_CAP_OPT_NULL = 0; /**< @brief no capability. */
  public final static int MTC_REG_CAP_OPT_QVAL = 1; /**< @brief qvalue */
  public final static int MTC_REG_CAP_OPT_CS_VOICE = 2; /**< @brief 3GPP cs voice */
  public final static int MTC_REG_CAP_OPT_MMTEL = 3; /**< @brief IMS MMTel */
  public final static int MTC_REG_CAP_OPT_ISHARE = 4; /**< @brief IMS Image Share */
  public final static int MTC_REG_CAP_OPT_IM = 5; /**< @brief OMA IM */
  public final static int MTC_REG_CAP_OPT_IM_LMSG = 6; /**< @brief OMA Large Message  */
  public final static int MTC_REG_CAP_OPT_RCS_CS = 7; /**< @brief RCS cs telephony */
  public final static int MTC_REG_CAP_OPT_RCS_GEO = 8; /**< @brief RCS geopush */
  public final static int MTC_REG_CAP_OPT_RCSE_IM = 9; /**< @brief RCSE file transfer */
  public final static int MTC_REG_CAP_OPT_RCSE_FT = 10; /**< @brief RCSE file transfer */
  public final static int MTC_REG_CAP_OPT_AUDIO = 11; /**< @brief audio */
  public final static int MTC_REG_CAP_OPT_VIDEO = 12; /**< @brief video */
  public final static int MTC_REG_CAP_OPT_CPM = 13; /**< @brief CPM message */
  public final static int MTC_REG_CAP_OPT_CPM_LMSG = 14; /**< @brief CPM large message */
  public final static int MTC_REG_CAP_OPT_CPM_FT = 15; /**< @brief CPM file transfer */
  public final static int MTC_REG_CAP_OPT_CPM_SESS = 16; /**< @brief CPM session */
  public final static int MTC_REG_CAP_OPT_SMS_IP = 17; /**< @brief 3GPP SMS over IP */
  public final static int MTC_REG_CAP_OPT_ALL = -1; /**< @brief all capabilties. */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_NULL = 0; /**< @brief no capability. */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_BURN = 1; /**< @brief burn after read */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_GRP_MAN = 2; /**< @brief group manage */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_CLOUD_FILE = 3; /**< @brief cloud file */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_VEM = 4; /**< @brief vemoticon */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_CMRED_BAG = 5; /**< @brief cmcc redbag */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_CARD_MSG = 6; /**< @brief cmcc cardmsg */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_OFF_MSG = 7; /**< @brief 3GPP offline msg */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_139MAIL_NEW = 8; /**< @brief cmcc 139 new mail notify msg */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_GRP_QRCODE = 9; /**< @brief group qrcode  */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_EXVCARD_MSG = 10; /**< @brief x-vcard msg */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_OMAPUSH = 11; /**< @brief app push msg */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_COM_TEMPLATE = 12; /**< @brief app common template */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_CALLCOM = 13; /**< @brief app callcomposer msg */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_MSG_REVOKE = 14; /**< @brief app message revoke */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_CHRED_BAG = 15; /**< @brief cmcc cash redbag */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_PUB_MSG = 16; /**< @brief cmcc pub msg */
  public final static int MTC_CMCC_EXT_REG_CAP_OPT_ALL = 0xFFFFFFFF; /**< @brief all capabilties. */
  // EN_MTC_REG_SRV_TYPE 
  public final static int EN_MTC_REG_SRV_VOIP = 0; /**< @brief voip service */
  public final static int EN_MTC_REG_SRV_MMTEL = EN_MTC_REG_SRV_VOIP + 1; /**< @brief 3GPP IMS service */
  public final static int EN_MTC_REG_SRV_VOLTE = EN_MTC_REG_SRV_MMTEL + 1; /**< @brief 3GPP VoLTE service */
  public final static int EN_MTC_REG_SRV_RCS5 = EN_MTC_REG_SRV_VOLTE + 1; /**< @brief GSMA RCS5 service */
  public final static int EN_MTC_REG_SRV_JOYN_HF = EN_MTC_REG_SRV_RCS5 + 1; /**< @brief GSMA joyn hotfixes service */
  public final static int EN_MTC_REG_SRV_JOYN_BB = EN_MTC_REG_SRV_JOYN_HF + 1; /**< @brief GSMA joyn blackbird service */
  public final static int EN_MTC_REG_SRV_CMCC_RCS = EN_MTC_REG_SRV_JOYN_BB + 1; /**< @brief CMCC RCS service */

  // EN_MTC_LOG_LEVEL_TYPE 
  public final static int EN_MTC_LOG_LEVEL_DISABLE = 0; /** @brief Disable log output. */
  public final static int EN_MTC_LOG_LEVEL_ERROR = EN_MTC_LOG_LEVEL_DISABLE + 1; /** @brief Only error message. */
  public final static int EN_MTC_LOG_LEVEL_INFO = EN_MTC_LOG_LEVEL_ERROR + 1; /** @brief Include error, info message. */
  public final static int EN_MTC_LOG_LEVEL_DEBUG = EN_MTC_LOG_LEVEL_INFO + 1; /** @brief Inlcude error, info and debug message. */
  public final static int EN_MTC_LOG_LEVEL_FUNCTION = EN_MTC_LOG_LEVEL_DEBUG + 1; /** @brief Include error, info, debug and function message. */

}
