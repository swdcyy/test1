package com.samsung.android.sdk.camera.impl.filter.CameraFilterContextImpl;
import java.lang.Object;
import com.samsung.android.sdk.camera.impl.internal.NativeProcessor;
import vk8.f;
import java.lang.String;
import java.nio.ByteBuffer;

public final class CameraFilterContextImpl	// class@000b7b
{
    public boolean a;
    public final f b;
    public long c;
    public a d;
    public String e;
    public int f;
    public String g;
    public int h;
    public static final String i = "SEC_SDK/CameraFilterContextImpl";

    static {
       CameraFilterContextImpl.native_init();
    }
    public void CameraFilterContextImpl(){
       super();
       this.a = false;
       this.d = null;
       this.e = null;
       this.f = 0;
       this.h = 1;
       this.b = (NativeProcessor.a())? new f(): null;
       return;
    }
    public static native final void native_init();
    public native final int native_getVersion();
    public native final boolean native_initialize();
    public native final Object native_process_bitmap(Object p0);
    public native final void native_process_file(String p0,String p1);
    public native final ByteBuffer native_process_image(Object p0,int p1);
    public native final boolean native_release();
    public native final boolean native_setEffect_external(String p0);
    public native final boolean native_setEffect_internal(int p0);
    public native final boolean native_setEffect_parameter(String p0);
    public native final void native_setup(Object p0);
}
