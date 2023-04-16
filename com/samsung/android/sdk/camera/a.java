package com.samsung.android.sdk.camera.a;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import android.hardware.camera2.CameraMetadata;
import java.lang.Object;
import vk8.h;

public abstract class a	// class@000b79
{
    public final CameraMetadata b;
    public static final String c;
    public static final int d;

    static {
       a.c = "SEC_SDK/"+a.class.getSimpleName();
    }
    public void a(CameraMetadata p0){
       super();
       h.c(p0, "CameraMetadata must not null");
       this.b = p0;
    }
    public abstract Class a();
    public abstract Object b(Object p0);
}
