/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.allseen.alljoyn;

public class PropHandlerEntry {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PropHandlerEntry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PropHandlerEntry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        alljoynJNI.delete_PropHandlerEntry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMsgid(long value) {
    alljoynJNI.PropHandlerEntry_msgid_set(swigCPtr, this, value);
  }

  public long getMsgid() {
    return alljoynJNI.PropHandlerEntry_msgid_get(swigCPtr, this);
  }

  public void setCallback(SWIGTYPE_p_f_p_struct__AJ_Message_uint32_t_p_void__AJ_Status value) {
    alljoynJNI.PropHandlerEntry_callback_set(swigCPtr, this, SWIGTYPE_p_f_p_struct__AJ_Message_uint32_t_p_void__AJ_Status.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_struct__AJ_Message_uint32_t_p_void__AJ_Status getCallback() {
    long cPtr = alljoynJNI.PropHandlerEntry_callback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_struct__AJ_Message_uint32_t_p_void__AJ_Status(cPtr, false);
  }

  public void setContext(SWIGTYPE_p_void value) {
    alljoynJNI.PropHandlerEntry_context_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getContext() {
    long cPtr = alljoynJNI.PropHandlerEntry_context_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public PropHandlerEntry() {
    this(alljoynJNI.new_PropHandlerEntry(), true);
  }

}
