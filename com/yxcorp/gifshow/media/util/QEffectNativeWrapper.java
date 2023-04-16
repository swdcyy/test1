package com.yxcorp.gifshow.media.util.QEffectNativeWrapper;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rg.d;
import java.lang.System;
import android.graphics.Bitmap;

public class QEffectNativeWrapper	// class@001d1c
{

    public void QEffectNativeWrapper(){
       super();
    }
    public static void a(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, QEffectNativeWrapper.class, "1")) {
          return;
       }
       if (p0 != null) {
          d.a(p0, "ksvideoprocessor");
       }else {
          System.loadLibrary("ksvideoprocessor");
       }
       return;
    }
    public static native void applyBlur(Bitmap p0,int p1,int p2,int p3,int p4,int p5,int p6);
}
