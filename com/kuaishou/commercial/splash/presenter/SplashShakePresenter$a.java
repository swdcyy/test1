package com.kuaishou.commercial.splash.presenter.SplashShakePresenter$a;
import android.hardware.SensorEventListener;
import com.kuaishou.commercial.splash.presenter.SplashShakePresenter;
import java.lang.Object;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gz.y2;
import java.lang.System;

public final class SplashShakePresenter$a implements SensorEventListener	// class@0015d1
{
    public final SplashShakePresenter b;

    public void SplashShakePresenter$a(SplashShakePresenter p0){
       this.b = p0;
       super();
    }
    public void onAccuracyChanged(Sensor p0,int p1){
    }
    public void onSensorChanged(SensorEvent p0){
       long l2;
       Object obj = this;
       SensorEvent obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SplashShakePresenter$a.class, "1")) {
          return;
       }
       if (obj.b.k9()) {
          return;
       }
       long l = System.currentTimeMillis();
       SplashShakePresenter splashShakeP = null;
       int i = 1;
       if (obj1 != null) {
          SensorEvent values = obj1.values;
          if (values != null) {
             int len = values.length;
             int i1 = 0;
             int i2 = 0;
             while (true) {
                if (i1 < len) {
                   int i3 = values[i1];
                   int i4 = i2 + 1;
                   SplashShakePresenter$a b = obj.b;
                   if (i2 < b.X0) {
                      float f = 0x3f4ccccd;
                      if (b.t9() - splashShakeP) {
                         b = obj.b;
                         splashShakeP = b.Z;
                         float f1 = splashShakeP[i2] * f;
                         float f2 = (float)i - f;
                         f2 = f2 * i3;
                         f1 = f1 + f2;
                         splashShakeP[i2] = f1;
                         float f3 = i3 - splashShakeP[i2];
                         b.U0[i2] = f3;
                         long l1 = l - b.Y0;
                         if (l1 - (long)50 < 0) {
                            return;
                         }
                      }else {
                         obj.b.Z[i2] = i3;
                      }
                   }
                   i1 = i1 + 1;
                   i2 = i4;
                   splashShakeP = null;
                }
             }
          }
       }
       SplashShakePresenter$a b1 = obj.b;
       SplashShakePresenter u0 = b1.U0;
       b1.Y9(u0[0], u0[i], u0[2]);
       b1 = obj.b;
       b1.Y0 = l;
       obj1 = (obj1 != null)? obj1.timestamp: 0;
       b1.T9(obj1);
       return;
    }
}
