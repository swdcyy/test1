package com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import fd.b;
import java.lang.Object;
import android.graphics.Bitmap;

public class NativeBlurFilter	// class@00110a
{
    public static final int a;

    static {
       b.a();
    }
    public void NativeBlurFilter(){
       super();
    }
    public static native void nativeIterativeBoxBlur(Bitmap p0,int p1,int p2);
}
