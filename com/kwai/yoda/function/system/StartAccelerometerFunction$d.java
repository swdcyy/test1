package com.kwai.yoda.function.system.StartAccelerometerFunction$d;
import android.hardware.SensorEventListener;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.ref.WeakReference;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.os.SystemClock;
import com.kwai.yoda.function.system.StartAccelerometerFunction$a;
import com.kwai.yoda.event.d;
import yz7.e;
import android.hardware.SensorManager;
import java.lang.Float;

public final class StartAccelerometerFunction$d implements SensorEventListener	// class@0011f8
{
    public final WeakReference b;
    public long c;
    public float[] d;
    public float[] e;
    public final float f;
    public final int g;

    public void StartAccelerometerFunction$d(YodaBaseWebView p0,int p1){
       a.q(p0, "webView");
       super();
       this.g = p1;
       this.b = new WeakReference(p0);
       this.f = 0x3f000000;
    }
    public void onAccuracyChanged(Sensor p0,int p1){
    }
    public void onSensorChanged(SensorEvent p0){
       StartAccelerometerFunction$a uoa;
       YodaBaseWebView yodaBaseWebV1;
       float[] uofloatArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, StartAccelerometerFunction$d.class, "1")) {
          return;
       }
       YodaBaseWebView yodaBaseWebV = this.b.get();
       if (yodaBaseWebV != null) {
          int i = 1;
          if (yodaBaseWebV.isShowing() == i) {
             if (p0 == null) {
                return;
             }else {
                SensorEvent sensor = p0.sensor;
                a.h(sensor, "event.sensor");
                int type = sensor.getType();
                String str = "accelerometer-change";
                long l = 0;
                int i1 = 0;
                int i2 = 2;
                float f = 9.80f;
                if (type != i) {
                   if (type != i2) {
                      if (type == 10) {
                         if (this.c - l && (SystemClock.elapsedRealtime() - this.c) - (long)this.g < 0) {
                            return;
                         }else {
                            this.c = SystemClock.elapsedRealtime();
                            p0 = p0.values;
                            if (p0 != null) {
                               uoa = new StartAccelerometerFunction$a();
                               uoa.x = p0[i1] / f;
                               uoa.y = p0[i] / f;
                               uoa.z = p0[i2] / f;
                               yodaBaseWebV1 = this.b.get();
                               if (yodaBaseWebV1 != null) {
                                  d.f().c(yodaBaseWebV1, str, e.f(uoa));
                               }
                            }else {
                               return;
                            }
                         }
                      }
                   }else {
                      uofloatArray = p0.values.clone();
                      StartAccelerometerFunction$d te = this.e;
                      if (te != null) {
                         i = uofloatArray.length;
                         for (; i1 < i; i1 = i1 + 1) {
                            float f1 = uofloatArray[i1] - te[i1];
                            float f2 = this.f * f1;
                            float f3 = te[i1] + f2;
                            te[i1] = f3;
                         }
                         uofloatArray = te;
                      }
                      this.e = uofloatArray;
                   }
                }else if(this.c - l && (SystemClock.elapsedRealtime() - this.c) - (long)this.g < 0){
                   return;
                }else {
                   this.c = SystemClock.elapsedRealtime();
                   p0 = p0.values;
                   this.d = p0;
                   if (p0 != null) {
                      uoa = new StartAccelerometerFunction$a();
                      uoa.x = p0[i1] / f;
                      uoa.y = p0[i] / f;
                      uoa.z = p0[i2] / f;
                      if (p0 != null) {
                         StartAccelerometerFunction$d te1 = this.e;
                         if (te1 != null) {
                            float[] uofloatArray1 = new float[9];
                            float[] uofloatArray2 = new float[9];
                            if (SensorManager.getRotationMatrix(uofloatArray1, uofloatArray2, p0, te1)) {
                               uofloatArray = new float[3];
                               SensorManager.getOrientation(uofloatArray1, uofloatArray);
                               uoa.azimuth = Float.valueOf(uofloatArray[i1]);
                               uoa.pitch = Float.valueOf(uofloatArray[i]);
                               uoa.roll = Float.valueOf(uofloatArray[i2]);
                            }
                         }
                      }
                      yodaBaseWebV1 = this.b.get();
                      if (yodaBaseWebV1 != null) {
                         d.f().c(yodaBaseWebV1, str, e.f(uoa));
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
