package com.facebook.react.fabric.StateWrapperImpl;
import ze.m0;
import be.b;
import java.lang.Object;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.ReadableNativeMap;

public class StateWrapperImpl implements m0	// class@001263
{
    public final HybridData mHybridData;

    static {
       b.a();
    }
    public void StateWrapperImpl(){
       super();
       this.mHybridData = StateWrapperImpl.initHybrid();
    }
    public static native HybridData initHybrid();
    public void a(WritableMap p0){
       this.updateStateImpl(p0);
    }
    public native ReadableNativeMap getState();
    public native void updateStateImpl(NativeMap p0);
}
