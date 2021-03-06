/**
 * @file MtcPartp.java
 * @brief MtcPartp interface
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
 * @brief MtcPartp interface
 */
public class MtcPartp implements MtcPartpConstants {
/**
 * @brief Create a participant list.
 *
 * @param [in] iType The type for participant, see @ref MtcPartpConstants::EN_MTC_PARTP_LST_ONE.
 *
 * @return The list id when create a participant list successfully, 
 *              otherwise return ZMAXUINT.
 */
  public static int Mtc_PartpLstCreate(int iType) {
    return MtcPartpJNI.Mtc_PartpLstCreate(iType);
  }

/**
 * @brief Delete a participant list.
 *
 * @param [in] iLstId The list id for participants.
 *
 */
  public static void Mtc_PartpLstDelete(int iLstId) {
    MtcPartpJNI.Mtc_PartpLstDelete(iLstId);
  }

/**
 * @brief Clone a participant list.
 *
 * @param [in] iLstId The list id for participants.
 *
 * @return The new list id when copy a participant list successfully, 
 *              otherwise return ZMAXUINT.
 */
  public static int Mtc_PartpLstClone(int iLstId) {
    return MtcPartpJNI.Mtc_PartpLstClone(iLstId);
  }

/**
 * @brief Get participant list type.
 *
 * @param [in] iLstId The list id for participants.
 *
 * @return Participant list type, see @ref MtcPartpConstants::EN_MTC_PARTP_LST_ONE.
 */
  public static int Mtc_PartpLstGetType(int iLstId) {
    return MtcPartpJNI.Mtc_PartpLstGetType(iLstId);
  }

/**
 * @brief Set participant list type.
 *
 * @param [in] iLstId The list id for participants.
 * @param [in] iType The type for participant, see @ref MtcPartpConstants::EN_MTC_PARTP_LST_ONE.
 *
 * @retval MtcCommonConstants::ZOK Set participant list type successfully.
 * @retval MtcCommonConstants::ZFAILED Set participant list type failed.
 */
  public static int Mtc_PartpLstSetType(int iLstId, int iType) {
    return MtcPartpJNI.Mtc_PartpLstSetType(iLstId, iType);
  }

/**
 * @brief Get participant list size.
 *
 * @param [in] iLstId The list id for participants.
 *
 * @return Participant list size.
 */
  public static int Mtc_PartpLstGetSize(int iLstId) {
    return MtcPartpJNI.Mtc_PartpLstGetSize(iLstId);
  }

/**
 * @brief Get a participant from participant list.
 *
 * @param [in] iLstId The list id for participants.
 * @param [in] iIndex The index of participant.
 * @param [out] ppcName The participant name.
 * @param [out] ppcUri The participant URI.
 * @param [out] piPartpId The participant id.
 * 
 * The caller must copy *ppcName and *ppcUri, then use.
 *
 * @retval MtcCommonConstants::ZOK Get a participant successfully.
 * @retval MtcCommonConstants::ZFAILED Get a participant failed.
 */
  public static int Mtc_PartpLstGetPartp(int iLstId, int iIndex, MtcString ppcName, MtcString ppcUri, MtcNumber piPartpId) {
    return MtcPartpJNI.Mtc_PartpLstGetPartp(iLstId, iIndex, ppcName, ppcUri, piPartpId);
  }

/**
 * @brief Add a participant into participant list.
 *
 * @param [in] iLstId The list id for participants.
 * @param [in] pcName The participant name.
 * @param [in] pcUri The participant URI.
 *
 * @retval The participant id when add a participant successfully, 
 *              otherwise return ZMAXUINT.
 */
  public static int Mtc_PartpLstAddPartp(int iLstId, String pcName, String pcUri) {
    return MtcPartpJNI.Mtc_PartpLstAddPartp(iLstId, pcName, pcUri);
  }

/**
 * @brief Remove a participant from participant list.
 *
 * @param [in] iLstId The list id for participants.
 * @param [in] iPartpId The participant id.
 *
 * @retval MtcCommonConstants::ZOK Remove a participant successfully.
 * @retval MtcCommonConstants::ZFAILED Remove a participant failed.
 */
  public static int Mtc_PartpLstRmvPartp(int iLstId, int iPartpId) {
    return MtcPartpJNI.Mtc_PartpLstRmvPartp(iLstId, iPartpId);
  }

/**
 * @brief Find a participant in participant list.
 *
 * @param [in] iLstId The list id for participants.
 * @param [in] pcUri The participant URI.
 *
 * @return The participant id if exist the participant, otherwise return ZMAXUINT.
 */
  public static int Mtc_PartpLstFindPartp(int iLstId, String pcUri) {
    return MtcPartpJNI.Mtc_PartpLstFindPartp(iLstId, pcUri);
  }

/**
 * @brief Get a participant name from participant list.
 *
 * @param [in] iPartpId The participant id.
 *
 * @return The participant name string when get a participant name successfully, 
 *              otherwise return empty string.
 * The caller must copy it, then use.
 */
  public static String Mtc_PartpGetName(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetName(iPartpId);
  }

/**
 * @brief Get a participant URI from participant.
 *
 * @param [in] iPartpId The participant id.
 *
 * @return The participant URI string when get participant URI successfully, 
 *              otherwise return empty string.
 * The caller must copy it, then use.
 */
  public static String Mtc_PartpGetUri(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetUri(iPartpId);
  }

/**
 * @brief Get a participant status by participant id.
 *
 * @param [in] iPartpId The participant id.
 *
 * @return The participant status, see @ref MtcPartpConstants::EN_MTC_PARTP_STAT_PENDING.
 */
  public static int Mtc_PartpGetStat(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetStat(iPartpId);
  }

/**
 * @brief Get a participant video stream id by participant id.
 *
 * @param [in] iPartpId The participant id.
 *
 * @return The participant video stream id.
 */
  public static int Mtc_PartpGetVideoStrmId(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetVideoStrmId(iPartpId);
  }

/**
 * @brief Get a participant video stream state by participant id.
 *
 * @param [in] iPartpId The participant state, see @ref MtcPartpConstants::EN_MTC_PARTP_VIDEO_STRM_STATE_DISABLE.
 *
 * @return The participant video stream state.
 */
  public static int Mtc_PartpGetVideoStrmState(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetVideoStrmState(iPartpId);
  }

/**
 * @brief Get a cmccc conf participant status from participant list.
 *
 * @param [in] iPartpId The participant id.
 *
 * @return The cmcc conf participant status, see @ref MtcPartpConstants::EN_MTC_CMCC_CONF_PARTP_STATE_PENDING.
 */
  public static int Mtc_PartpGetCmccConfStat(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetCmccConfStat(iPartpId);
  }

/**
 * @brief Get a participant roles from participant list.
 *
 * @param [in] iPartpId The participant id.
 *
 * @return The participant roles, see @ref MtcPartpConstants::EN_MTC_PARTP_ROLES_UNKNOWN.
 */
  public static int Mtc_PartpGetRoles(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetRoles(iPartpId);
  }

/**
 * @brief Get a participant etype.
 * @param [in] iPartpId The participant id.
 *
 * @return The participant etype, see @ref MtcPartpConstants::EN_MTC_PARTP_ETYPE_UNKNOWN.
 */
  public static int Mtc_PartpGetEtype(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetEtype(iPartpId);
  }

/**
 * @brief Get a participant composing status.
 *
 * @param [in] iPartpId The participant id.
 *
 * @return The participant composing status, see @ref MtcPartpConstants::EN_MTC_PARTP_ISCOMP_STAT_UNKNOWN.
 */
  public static short Mtc_PartpGetCompsStat(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetCompsStat(iPartpId);
  }

/**
 * @brief Get a participant session id from participant list.
 *
 * @param [in] iPartpId The participant id.
 *
 * @return The participant session id.
 */
  public static int Mtc_PartpGetSessId(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetSessId(iPartpId);
  }

/**
 * @brief Set a participant session id.
 *
 * @param [in] iPartpId The participant id.
 * @param [in] iSessId The participant session id.
 *
 * @retval MtcCommonConstants::ZOK Set a participant session id successfully.
 * @retval MtcCommonConstants::ZFAILED Set a participant session id failed.
 */
  public static int Mtc_PartpSetSessId(int iPartpId, int iSessId) {
    return MtcPartpJNI.Mtc_PartpSetSessId(iPartpId, iSessId);
  }

/**
 * @brief Get a participant log id.
 *
 * @param [in] iPartpId The participant id.
 *
 * @return The participant log id.
 */
  public static int Mtc_PartpGetLogId(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetLogId(iPartpId);
  }

/**
 * @brief Set a participant log id.
 *
 * @param [in] iPartpId The participant id.
 * @param [in] iLogId The participant log id.
 *
 * @retval MtcCommonConstants::ZOK Set a participant log id successfully.
 * @retval MtcCommonConstants::ZFAILED Set a participant log id failed.
 */
  public static int Mtc_PartpSetLogId(int iPartpId, int iLogId) {
    return MtcPartpJNI.Mtc_PartpSetLogId(iPartpId, iLogId);
  }

/**
 * @brief Get a participant access network type from participant id.
 *
 * @param [in] iPartpId The participant id.
 *
 * @retval The participant access network type, see @ref MtcPartpConstants::EN_MTC_PARTP_ACC_NET_OTHER.
 */
  public static int Mtc_PartpGetAccNetType(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetAccNetType(iPartpId);
  }

/**
* @brief Get a participant selected flag from participant id.
*
* @param [in] iPartpId The participant id.
*
* @retval The participant selected flag(true or false).
*/
  public static boolean Mtc_PartpGetSelected(int iPartpId) {
    return MtcPartpJNI.Mtc_PartpGetSelected(iPartpId);
  }

}
