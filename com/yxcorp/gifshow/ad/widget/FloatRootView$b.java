package com.yxcorp.gifshow.ad.widget.FloatRootView$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.widget.FloatRootView;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import android.widget.FrameLayout;
import android.view.ViewParent;
import java.lang.System;
import java.lang.Math;
import java.lang.Float;

public class FloatRootView$b implements Runnable	// class@001921
{
    public Handler b;
    public float c;
    public float d;
    public long e;
    public final FloatRootView f;

    public void FloatRootView$b(FloatRootView p0){
       this.f = p0;
       super();
       this.b = new Handler(Looper.getMainLooper());
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, FloatRootView$b.class, "2")) {
          return;
       }
       if (this.f.getRootView() != null && this.f.getRootView().getParent() != null) {
          float f = Math.min(0x3f800000, ((float)(System.currentTimeMillis() - this.e) / 600.00f));
          float f1 = (this.c - this.f.getX()) * f;
          float f2 = (this.d - this.f.getY()) * f;
          if (!PatchProxy.isSupport(FloatRootView$b.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f1), Float.valueOf(f2), this, FloatRootView$b.class, "3")) {
             FloatRootView$b tf = this.f;
             tf.setX((tf.getX() + f1));
             FloatRootView$b tf1 = this.f;
             tf1.setY((tf1.getY() + f2));
          }
          if (f - 0x3f800000 < 0) {
             this.b.post(this);
          }
       }
    label_0080 :
       return;
    }
}
