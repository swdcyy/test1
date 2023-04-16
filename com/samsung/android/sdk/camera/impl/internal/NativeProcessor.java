package com.samsung.android.sdk.camera.impl.internal.NativeProcessor;
import java.lang.AutoCloseable;
import java.lang.String;
import vk8.g;
import java.lang.Object;
import java.lang.ref.WeakReference;
import java.lang.IllegalStateException;
import java.nio.ByteBuffer;

public class NativeProcessor implements AutoCloseable	// class@000b7e
{
    public Handler b;
    public NativeProcessor$a c;
    public final Object d;
    public final String e;
    public boolean f;
    public boolean g;
    public long h;
    public static final String i;

    static {
       NativeProcessor.i = "SEC_SDK/NativeProcessor";
    }
    public void NativeProcessor(String p0,g p1){
       super();
       this.d = new Object();
       this.f = false;
       this.g = false;
       this.e = p0;
       this.native_setup(new WeakReference(this), p0, p1.a());
    }
    public static boolean a(){
       return NativeProcessor.native_CoreBaseLoaded();
    }
    public static native final boolean native_CoreBaseLoaded();
    public synchronized void c(){
       this.e();
       if (this.f == null) {
          return;
       }
       this.native_deinitialize();
       this.f = false;
       return;
    }
    public synchronized void close(){
       if (this.g != null) {
          return;
       }
       this.c();
       this.native_release();
       this.g = true;
       return;
    }
    public void e(){
       if (this.g == null) {
          return;
       }
       throw new IllegalStateException("NativeProcessor is already closed.");
    }
    public void finalize(){
       this.close();
       super.finalize();
    }
    public native final int native_deinitialize();
    public native final String native_getParameters();
    public native final int native_initialize();
    public native final int native_release();
    public native final int native_sendCommand(int p0,int p1,int p2);
    public native final int native_sendData(int p0,ByteBuffer p1);
    public native final ByteBuffer native_sendData(int p0,ByteBuffer p1,int p2,int p3,int p4);
    public native final int native_setParameters(String p0);
    public native final int native_setup(Object p0,String p1,String p2);
}
