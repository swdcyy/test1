package com.facebook.imagepipeline.nativecode.Bitmaps;
import fd.a;
import java.lang.Object;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.lang.Boolean;
import ab.e;

public class Bitmaps	// class@001107
{
    public static final int a;

    static {
       a.a();
    }
    public void Bitmaps(){
       super();
    }
    public static void copyBitmap(Bitmap p0,Bitmap p1){
       boolean b = true;
       boolean b1 = (p1.getConfig() == p0.getConfig())? true: false;
       e.a(Boolean.valueOf(b1));
       e.a(Boolean.valueOf(p0.isMutable()));
       b1 = (p0.getWidth() == p1.getWidth())? true: false;
       e.a(Boolean.valueOf(b1));
       if (p0.getHeight() != p1.getHeight()) {
          b = false;
       }
       e.a(Boolean.valueOf(b));
       Bitmaps.nativeCopyBitmap(p0, p0.getRowBytes(), p1, p1.getRowBytes(), p0.getHeight());
       return;
    }
    public static native void nativeCopyBitmap(Bitmap p0,int p1,Bitmap p2,int p3,int p4);
}
