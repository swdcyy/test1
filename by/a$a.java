package by.a$a;
import android.hardware.SensorEventListener;
import by.a;
import java.lang.Object;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.System;
import java.util.Objects;
import java.lang.Float;
import java.lang.StringBuilder;
import yx.j0;
import by.g;

public final class a$a implements SensorEventListener	// class@0002cc
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void onAccuracyChanged(Sensor p0,int p1){
    }
    public void onSensorChanged(SensorEvent p0){
       a a;
       float f1;
       long l2;
       Object obj = this;
       SensorEvent obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, a$a.class, "1")) {
          return;
       }
       long l = System.currentTimeMillis();
       a uoa = null;
       if (obj1 != null) {
          SensorEvent values = obj1.values;
          if (values != null) {
             int len = values.length;
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i < len) {
                   int i2 = values[i];
                   int i3 = i1 + 1;
                   a$a b = obj.b;
                   if (i1 < b.e) {
                      float f = 0x3f4ccccd;
                      if (b.h - uoa) {
                         a = b.a;
                         f1 = a[i1] * f;
                         float f2 = (float)1 - f;
                         f2 = f2 * i2;
                         f1 = f1 + f2;
                         a[i1] = f1;
                         float f3 = i2 - a[i1];
                         b.b[i1] = f3;
                         long l1 = l - b.f;
                         if (l1 - (long)50 < 0) {
                            return;
                         }
                      }else {
                         b.a[i1] = i2;
                      }
                   }
                   i = i + 1;
                   i1 = i3;
                   uoa = 0;
                }
             }
          }
       }
       a$a b1 = obj.b;
       a b2 = b1.b;
       int i4 = b2[0];
       int i5 = b2[1];
       int i6 = b2[2];
       Objects.requireNonNull(b1);
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(Float.valueOf(i4), Float.valueOf(i5), Float.valueOf(i6), b1, a.class, "1")) {
          f1 = ((i4 * i4) + (i5 * i5)) + (i6 * i6);
          if (f1 - b1.c > 0) {
             b1.c = f1;
          }
          Object[] objArray = new Object[0];
          String str = "AdShakeDetector";
          j0.f(str, "checkShake magnitude: "+f1+" , mMaxShake: "+b1.c, objArray);
          if (f1 - (float)b1.d >= 0) {
             b1.k = b1.k + 1;
             objArray = new Object[0];
             j0.f(str, " mTriggerCount:"+b1.k, objArray);
             if (b1.k >= b1.m) {
                b1.k = 0;
                b2 = b1.j;
                if (b2 != null) {
                   b2.a(b1.c);
                }
             }
          }
       }
    label_00fa :
       b1 = obj.b;
       b1.f = l;
       obj1 = (obj1 != null)? obj1.timestamp: 0;
       b1.h = obj1;
       return;
    }
}
