package com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.jni.HybridData;
import java.lang.Object;
import java.lang.String;

public abstract class NativeMap	// class@00120a
{
    public HybridData mHybridData;

    static {
       ReactBridge.staticInit();
    }
    public void NativeMap(HybridData p0){
       super();
       this.mHybridData = p0;
    }
    public native String toString();
}
