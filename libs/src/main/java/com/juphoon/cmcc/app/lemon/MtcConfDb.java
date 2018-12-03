/**
 * @file MtcConfDb.java
 * @brief MtcConfDb interface
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
 * @brief MtcConfDb interface
 */
public class MtcConfDb {
/**
 * @brief Get conference factory URI.
 *
 * @return The string of conference factory URI.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbSetFactUri
 */
  public static String Mtc_ConfDbGetFactUri() {
    return MtcConfDbJNI.Mtc_ConfDbGetFactUri();
  }

/**
 * @brief Set conference factory URI.
 *
 * @param [in] pcUri Conference factory URI.
 *
 * @retval MtcCommonConstants::ZOK Set conference factory URI successfully.
 * @retval MtcCommonConstants::ZFAILED Set conference factory URI failed.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbGetFactUri
 */
  public static int Mtc_ConfDbSetFactUri(String pcUri) {
    return MtcConfDbJNI.Mtc_ConfDbSetFactUri(pcUri);
  }

/**
 * @brief Get video conference factory URI.
 *
 * @return The string of video conference factory URI.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbSetVideoFactUri
 */
  public static String Mtc_ConfDbGetVideoFactUri() {
    return MtcConfDbJNI.Mtc_ConfDbGetVideoFactUri();
  }

/**
 * @brief Set video conference factory URI.
 *
 * @param [in] pcUri Video Conference factory URI.
 *
 * @retval MtcCommonConstants::ZOK Set video conference factory URI successfully.
 * @retval MtcCommonConstants::ZFAILED Set video conference factory URI failed.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbGetVideoFactUri
 */
  public static int Mtc_ConfDbSetVideoFactUri(String pcUri) {
    return MtcConfDbJNI.Mtc_ConfDbSetVideoFactUri(pcUri);
  }

/**
 * @brief Get conference control URI.
 *
 * @return The string of conference control URI.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbSetConfControlUri
 */
  public static String Mtc_ConfDbGetConfControlUri() {
    return MtcConfDbJNI.Mtc_ConfDbGetConfControlUri();
  }

/**
 * @brief Set conference control URI.
 *
 * @param [in] pcUri Conference control URI.
 *
 * @retval MtcCommonConstants::ZOK Set conference control URI successfully.
 * @retval MtcCommonConstants::ZFAILED Set conference control URI failed.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbGetConfControlUri
 */
  public static int Mtc_ConfDbSetConfControlUri(String pcUri) {
    return MtcConfDbJNI.Mtc_ConfDbSetConfControlUri(pcUri);
  }

/**
 * @brief Get conference APP ID.
 *
 * @return The string of conference  APP ID.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbSetConfAppId
 */
  public static String Mtc_ConfDbGetConfAppId() {
    return MtcConfDbJNI.Mtc_ConfDbGetConfAppId();
  }

/**
 * @brief Set conference  APP ID.
 *
 * @param [in] pcUri Conference  APP ID.
 *
 * @retval MtcCommonConstants::ZOK Set conference  APP ID successfully.
 * @retval MtcCommonConstants::ZFAILED Set conference  APP ID failed.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbGetConfAppId
 */
  public static int Mtc_ConfDbSetConfAppId(String pcAppId) {
    return MtcConfDbJNI.Mtc_ConfDbSetConfAppId(pcAppId);
  }

/**
 * @brief Get conference APP password.
 *
 * @return The string of conference  APP password.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbSetConfPwd
 */
  public static String Mtc_ConfDbGetConfPwd() {
    return MtcConfDbJNI.Mtc_ConfDbGetConfPwd();
  }

/**
 * @brief Set conference  APP password.
 *
 * @param [in] pcUri Conference  APP password.
 *
 * @retval MtcCommonConstants::ZOK Set conference  APP password successfully.
 * @retval MtcCommonConstants::ZFAILED Set conference  APP password failed.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbGetConfPwd
 */
  public static int Mtc_ConfDbSetConfPwd(String pcPwd) {
    return MtcConfDbJNI.Mtc_ConfDbSetConfPwd(pcPwd);
  }

  public static int Mtc_ConfDbGetVideoSwitchMode() {
    return MtcConfDbJNI.Mtc_ConfDbGetVideoSwitchMode();
  }

/**
 * @brief Set http conference video switch mode.
 *
 * @param [in] iMode video switch mode @ref MtcConfConstants::EN_MTC_CONF_VOICE_CONTROL_MODE.
 *
 * @retval MtcCommonConstants::ZOK Set conference video switch mode successfully.
 * @retval MtcCommonConstants::ZFAILED Set conference video switch mode failed.
 *
 * @see @ref Mtc_ConfDbGetVideoSwitchMode
 */
  public static int Mtc_ConfDbSetVideoSwitchMode(int iMode) {
    return MtcConfDbJNI.Mtc_ConfDbSetVideoSwitchMode(iMode);
  }

  public static boolean Mtc_ConfDbGetUseHttpConfEnable() {
    return MtcConfDbJNI.Mtc_ConfDbGetUseHttpConfEnable();
  }

/**
 * @brief Set use http conf enable.
 *
 * @param [in] bEnable enable http conference.
 *
 * @retval MtcCommonConstants::ZOK Set enable http conference successfully.
 * @retval MtcCommonConstants::ZFAILED Set enable http conference failed.
 *
 * @see @ref Mtc_ConfDbGetUseHttpConfEnable
 */
  public static int Mtc_ConfDbSetUseHttpConfEnable(boolean bEnable) {
    return MtcConfDbJNI.Mtc_ConfDbSetUseHttpConfEnable(bEnable);
  }

/**
 * @brief Get http conf token.
 *
 * @retval ZCHAR * the http conf token.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbSetHttpConfToken
 */
  public static String Mtc_ConfDbGetHttpConfToken() {
    return MtcConfDbJNI.Mtc_ConfDbGetHttpConfToken();
  }

/**
 * @brief Set http conf token.
 *
 * @retval MtcCommonConstants::ZOK Set the http conf token successfully.
 * @retval MtcCommonConstants::ZFAILED Set the http conf token failed.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbGetHttpConfToken
 */
  public static int Mtc_ConfDbSetHttpConfToken(String pcToken) {
    return MtcConfDbJNI.Mtc_ConfDbSetHttpConfToken(pcToken);
  }

  public static boolean Mtc_ConfDbGetConfHttpsEnable() {
    return MtcConfDbJNI.Mtc_ConfDbGetConfHttpsEnable();
  }

/**
 * @brief Set use https conf enable.
 *
 * @param [in] bEnable enable https conference.
 *
 * @retval MtcCommonConstants::ZOK Set enable https conference successfully.
 * @retval MtcCommonConstants::ZFAILED Set enable https conference failed.
 *
 * @see @ref Mtc_ConfDbGetConfHttpsEnable
 */
  public static int Mtc_ConfDbSetConfHttpsEnable(boolean bEnable) {
    return MtcConfDbJNI.Mtc_ConfDbSetConfHttpsEnable(bEnable);
  }

/**
* @brief Get  http conf video max partp count.
*
* @return The video max participants count(default 5) of http conference.
*
* @see @ref MtcConfDb::Mtc_ConfDbSetMaxPartpCount
*/
  public static int Mtc_ConfDbGetMaxPartpCount() {
    return MtcConfDbJNI.Mtc_ConfDbGetMaxPartpCount();
  }

/**
 * @brief Set http conference video participants count.
 *
 * @param [in] iCount(default 5) video max participant count(0 or not set for server's max value
 *                 (at present server supports 9 participants including chairman).
 *
 * @retval MtcCommonConstants::ZOK Set conference video max participants count successfully.
 * @retval MtcCommonConstants::ZFAILED Set conference video max participants count  failed.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbGetMaxPartpCount
 */
  public static int Mtc_ConfDbSetMaxPartpCount(int iCount) {
    return MtcConfDbJNI.Mtc_ConfDbSetMaxPartpCount(iCount);
  }

/**
* @brief Get  http conf video max remote image count.
*
* @return The video max remote image count(default 4) of http conference.
*
* @see @ref MtcConfDb::Mtc_ConfDbSetMaxImageCount
*/
  public static int Mtc_ConfDbGetMaxImageCount() {
    return MtcConfDbJNI.Mtc_ConfDbGetMaxImageCount();
  }

/**
 * @brief Set http conference video remote image count.
 *
 * @param [in] iCount(default 4) video max remote image count(0 or not set for server's max value
 *                 (at present server supports 9 participants including chairman, which means  
 *                  server supports 8 remote images).
 *
 * @retval MtcCommonConstants::ZOK Set conference video max remote image count successfully.
 * @retval MtcCommonConstants::ZFAILED Set conference video max remote image count  failed.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbGetMaxImageCount
 */
  public static int Mtc_ConfDbSetMaxImageCount(int iCount) {
    return MtcConfDbJNI.Mtc_ConfDbSetMaxImageCount(iCount);
  }

/**
 * @brief Set http conf video conference enable flag.
 *
 * @param [in] bEnable enable video conference or enable audio conference.
 *
 * @retval MtcCommonConstants::ZOK Set enable video conference successfully.
 * @retval MtcCommonConstants::ZFAILED Set enable video conference failed.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbGetVideoConfEnable
 */
  public static int Mtc_ConfDbSetVideoConfEnable(boolean bEnable) {
    return MtcConfDbJNI.Mtc_ConfDbSetVideoConfEnable(bEnable);
  }

/**
* @brief Get http conf video conference enable flag.
*
* @return The video http conference enable flag.
*
* @see @ref MtcConfDb::Mtc_ConfDbSetVideoConfEnable
*/
  public static boolean Mtc_ConfDbGetVideoConfEnable() {
    return MtcConfDbJNI.Mtc_ConfDbGetVideoConfEnable();
  }

/**
 * @brief Set http conf video conference enable record audio flag.
 *
 * @param [in] bEnable enable video conference record audio.
 *
 * @retval MtcCommonConstants::ZOK Set enable video conference record audio successfully.
 * @retval MtcCommonConstants::ZFAILED Set enable video conference record audio failed.
 *
 * @see @ref MtcConfDb::Mtc_ConfDbGetAudioRecEnable
 */
  public static int Mtc_ConfDbSetAudioRecEnable(boolean bEnable) {
    return MtcConfDbJNI.Mtc_ConfDbSetAudioRecEnable(bEnable);
  }

/**
* @brief Get http conf video conference enable record audio flag.
*
* @return The video http conference enable record audio flag.
*
* @see @ref MtcConfDb::Mtc_ConfDbSetAudioRecEnable
*/
  public static boolean Mtc_ConfDbGetAudioRecEnable() {
    return MtcConfDbJNI.Mtc_ConfDbGetAudioRecEnable();
  }

}
