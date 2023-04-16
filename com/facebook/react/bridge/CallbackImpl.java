package com.facebook.react.bridge.CallbackImpl;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSInstance;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.CallbackImpl$InvokeListener;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeArrayInterface;
import java.lang.RuntimeException;
import java.lang.Boolean;

public final class CallbackImpl implements Callback	// class@0011a2
{
    public final int mCallbackId;
    public CallbackImpl$InvokeListener mInvokeListener;
    public boolean mInvoked;
    public JSInstance mJSInstance;

    public void CallbackImpl(JSInstance p0,int p1){
       super();
       this.mJSInstance = p0;
       this.mCallbackId = p1;
       this.mInvoked = false;
    }
    public void invoke(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CallbackImpl.class, "1")) {
          return;
       }
       if (this.mInvoked != null) {
          throw new RuntimeException("Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
       }
       CallbackImpl tmInvokeList = this.mInvokeListener;
       if (tmInvokeList != null) {
          tmInvokeList.onCallbackInvoke(p0);
       }
       tmInvokeList = this.mJSInstance;
       if (tmInvokeList != null && !tmInvokeList.isDestroyed()) {
          this.mJSInstance.invokeCallback(this.mCallbackId, Arguments.fromJavaArgs(p0));
       }else {
          this.mJSInstance = null;
       }
       this.mInvoked = true;
       return;
    }
    public void invokeNew(Boolean p0,String[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, CallbackImpl.class, "2")) {
          return;
       }
       if (this.mInvoked != null) {
          throw new RuntimeException("Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
       }
       CallbackImpl tmInvokeList = this.mInvokeListener;
       if (tmInvokeList != null) {
          Object[] objArray = new Object[]{p1};
          tmInvokeList.onCallbackInvoke(objArray);
       }
       tmInvokeList = this.mJSInstance;
       if (tmInvokeList != null && !tmInvokeList.isDestroyed()) {
          this.mJSInstance.invokeCallback(p0, this.mCallbackId, Arguments.fromJavaArgs(p1));
       }else {
          this.mJSInstance = null;
       }
       this.mInvoked = true;
       return;
    }
    public void setInvokeListener(CallbackImpl$InvokeListener p0){
       this.mInvokeListener = p0;
    }
}
