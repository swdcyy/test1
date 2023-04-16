package com.kwai.library.NativeBitmapHooker;
import android.os.Build$VERSION;
import java.lang.String;
import java.lang.System;
import java.lang.StringBuilder;
import java.lang.Object;
import yf7.h;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import kotlin.jvm.internal.a;
import ukd.a;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;

public final class NativeBitmapHooker	// class@000819
{
    public static boolean a = true;
    public static boolean b;
    public static boolean c;
    public static final NativeBitmapHooker d;

    static {
       NativeBitmapHooker.d = new NativeBitmapHooker();
       switch (Build$VERSION.SDK_INT){
           case 23:
             System.loadLibrary("native_bitmap");
             break;
           case 24:
           case 25:
             System.loadLibrary("native_bitmap_nougat");
             break;
           default:
       }
    }
    public void NativeBitmapHooker(){
       super();
    }
    public final void a(Bitmap p0,int p1,int p2,Bitmap$Config p3){
       a.q(p0, "bitmap");
       if (p0.isRecycled()) {
          throw new IllegalStateException("Can\'t call reconfigure\(\) on a recycled bitmap");
       }
       if (p1 <= 0 || p2 <= 0) {
          throw new IllegalArgumentException("width and height must be > 0");
       }
       if (!p0.isMutable()) {
          throw new IllegalStateException("only mutable bitmaps may be reconfigured");
       }
       Object[] objArray = new Object[]{a.d(p0, "mNativePtr"),Integer.valueOf(p1),Integer.valueOf(p2),a.d(p3, "nativeInt"),Integer.valueOf(p0.getByteCount()),a.d(p0, "mRequestPremultiplied")};
       a.b("android.graphics.Bitmap", "nativeReconfigure", objArray);
       a.o(p0, "mWidth", Integer.valueOf(p1));
       a.o(p0, "mHeight", Integer.valueOf(p2));
       return;
    }
    public native final void disable();
    public native final int enable();
    public native final void enableDebug(boolean p0);
}
