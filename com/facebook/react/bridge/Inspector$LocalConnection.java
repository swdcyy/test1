package com.facebook.react.bridge.Inspector$LocalConnection;
import com.facebook.jni.HybridData;
import java.lang.Object;
import java.lang.String;

public class Inspector$LocalConnection	// class@0011c7
{
    public final HybridData mHybridData;

    public void Inspector$LocalConnection(HybridData p0){
       super();
       this.mHybridData = p0;
    }
    public native void disconnect();
    public native void sendMessage(String p0);
}
