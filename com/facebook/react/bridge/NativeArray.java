package com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeArrayInterface;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.jni.HybridData;
import java.lang.Object;
import java.lang.String;

public abstract class NativeArray implements NativeArrayInterface	// class@001208
{
    public HybridData mHybridData;

    static {
       ReactBridge.staticInit();
    }
    public void NativeArray(HybridData p0){
       super();
       this.mHybridData = p0;
    }
    public native String toString();
}
