package com.facebook.jni.NativeRunnable;
import java.lang.Runnable;
import com.facebook.jni.HybridData;
import java.lang.Object;

public class NativeRunnable implements Runnable	// class@00115e
{
    public final HybridData b;

    public void NativeRunnable(HybridData p0){
       super();
       this.b = p0;
    }
    public native void run();
}
