package com.facebook.react.bridge.CxxCallbackImpl;
import com.facebook.react.bridge.Callback;
import com.facebook.jni.HybridData;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.NativeArray;
import java.lang.Boolean;
import td.a;

public class CxxCallbackImpl implements Callback	// class@0011b6
{
    public final HybridData mHybridData;

    public void CxxCallbackImpl(HybridData p0){
       super();
       this.mHybridData = p0;
    }
    public void invoke(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CxxCallbackImpl.class, "1")) {
          return;
       }
       this.nativeInvoke(Arguments.fromJavaArgs(p0));
       return;
    }
    public void invokeNew(Boolean p0,String[] p1){
       a.a(this, p0, p1);
    }
    public native final void nativeInvoke(NativeArray p0);
}
