package com.facebook.imagepipeline.nativecode.NativeRoundingFilter;
import fd.b;
import java.lang.Object;
import android.graphics.Bitmap;
import ab.e;

public class NativeRoundingFilter	// class@00110e
{

    static {
       b.a();
    }
    public void NativeRoundingFilter(){
       super();
    }
    public static native void nativeAddRoundedCornersFilter(Bitmap p0,int p1,int p2,int p3,int p4);
    public static native void nativeToCircleFastFilter(Bitmap p0,boolean p1);
    public static native void nativeToCircleFilter(Bitmap p0,boolean p1);
    public static native void nativeToCircleWithBorderFilter(Bitmap p0,int p1,int p2,boolean p3);
    public static void toCircle(Bitmap p0,boolean p1){
       e.d(p0);
       if (p0.getWidth() >= 3 && p0.getHeight() >= 3) {
          NativeRoundingFilter.nativeToCircleFilter(p0, p1);
       }
       return;
    }
    public static void toCircleFast(Bitmap p0,boolean p1){
       e.d(p0);
       if (p0.getWidth() >= 3 && p0.getHeight() >= 3) {
          NativeRoundingFilter.nativeToCircleFastFilter(p0, p1);
       }
       return;
    }
}
