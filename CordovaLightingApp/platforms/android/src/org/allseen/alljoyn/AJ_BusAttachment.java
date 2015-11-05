/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.allseen.alljoyn;

public class AJ_BusAttachment {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AJ_BusAttachment(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AJ_BusAttachment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        alljoynJNI.delete_AJ_BusAttachment(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAboutPort(long value) {
    alljoynJNI.AJ_BusAttachment_aboutPort_set(swigCPtr, this, value);
  }

  public long getAboutPort() {
    return alljoynJNI.AJ_BusAttachment_aboutPort_get(swigCPtr, this);
  }

  public void setUniqueName(String value) {
    alljoynJNI.AJ_BusAttachment_uniqueName_set(swigCPtr, this, value);
  }

  public String getUniqueName() {
    return alljoynJNI.AJ_BusAttachment_uniqueName_get(swigCPtr, this);
  }

  public void setSock(AJ_NetSocket value) {
    alljoynJNI.AJ_BusAttachment_sock_set(swigCPtr, this, AJ_NetSocket.getCPtr(value), value);
  }

  public AJ_NetSocket getSock() {
    long cPtr = alljoynJNI.AJ_BusAttachment_sock_get(swigCPtr, this);
    return (cPtr == 0) ? null : new AJ_NetSocket(cPtr, false);
  }

  public void setSerial(long value) {
    alljoynJNI.AJ_BusAttachment_serial_set(swigCPtr, this, value);
  }

  public long getSerial() {
    return alljoynJNI.AJ_BusAttachment_serial_get(swigCPtr, this);
  }

  public void setPwdCallback(SWIGTYPE_p_f_p_uint8_t_uint32_t__uint32_t value) {
    alljoynJNI.AJ_BusAttachment_pwdCallback_set(swigCPtr, this, SWIGTYPE_p_f_p_uint8_t_uint32_t__uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_uint8_t_uint32_t__uint32_t getPwdCallback() {
    long cPtr = alljoynJNI.AJ_BusAttachment_pwdCallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_uint8_t_uint32_t__uint32_t(cPtr, false);
  }

  public void setAuthListenerCallback(SWIGTYPE_p_f_uint32_t_uint32_t_p_struct__AJ_Credential__AJ_Status value) {
    alljoynJNI.AJ_BusAttachment_authListenerCallback_set(swigCPtr, this, SWIGTYPE_p_f_uint32_t_uint32_t_p_struct__AJ_Credential__AJ_Status.getCPtr(value));
  }

  public SWIGTYPE_p_f_uint32_t_uint32_t_p_struct__AJ_Credential__AJ_Status getAuthListenerCallback() {
    long cPtr = alljoynJNI.AJ_BusAttachment_authListenerCallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_uint32_t_uint32_t_p_struct__AJ_Credential__AJ_Status(cPtr, false);
  }

  public void setSuites(SWIGTYPE_p_uint32_t value) {
    alljoynJNI.AJ_BusAttachment_suites_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getSuites() {
    long cPtr = alljoynJNI.AJ_BusAttachment_suites_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint32_t(cPtr, false);
  }

  public void setNumsuites(long value) {
    alljoynJNI.AJ_BusAttachment_numsuites_set(swigCPtr, this, value);
  }

  public long getNumsuites() {
    return alljoynJNI.AJ_BusAttachment_numsuites_get(swigCPtr, this);
  }

  public AJ_BusAttachment() {
    this(alljoynJNI.new_AJ_BusAttachment(), true);
  }

}