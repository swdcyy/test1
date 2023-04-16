package com.facebook.react.bridge.queue.NativeRunnable;
import java.lang.Runnable;
import com.facebook.jni.HybridData;
import java.lang.Object;

public class NativeRunnable implements Runnable	// class@001250
{
    public final HybridData mHybridData;

    public void NativeRunnable(HybridData p0){
       super();
       this.mHybridData = p0;
    }
    public native void run();
}
