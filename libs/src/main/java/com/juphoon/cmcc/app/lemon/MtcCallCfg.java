/**
 * @file MtcCallCfg.java
 * @brief MtcCallCfg interface
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
 * @brief MtcCallCfg interface
 */
public class MtcCallCfg {
/**
 * @brief Get using default call log management.
 *
 * @retval true MTC provide call log management.
 * @retval false MTC don't have call log management.
 *
 * @see @ref MtcCallCfg::Mtc_CallCfgSetUseDftLog
 */
  public static boolean Mtc_CallCfgGetUseDftLog() {
    return MtcCallCfgJNI.Mtc_CallCfgGetUseDftLog();
  }

/**
 * @brief Set using default call log management.
 *
 * @param [in] bUse Use default call log management.
 *
 * @retval MtcCommonConstants::ZOK Set use status successfully.
 * @retval MtcCommonConstants::ZFAILED Set use status failed.
 *
 * @see @ref MtcCallCfg::Mtc_CallCfgGetUseDftLog
 */
  public static int Mtc_CallCfgSetUseDftLog(boolean bUse) {
    return MtcCallCfgJNI.Mtc_CallCfgSetUseDftLog(bUse);
  }

}
