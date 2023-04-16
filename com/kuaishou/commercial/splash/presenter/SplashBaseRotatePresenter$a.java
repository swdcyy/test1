package com.kuaishou.commercial.splash.presenter.SplashBaseRotatePresenter$a;
import android.hardware.SensorEventListener;
import com.kuaishou.commercial.splash.presenter.SplashBaseRotatePresenter;
import java.lang.Object;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import gz.y2;
import java.lang.Math;
import java.lang.StringBuilder;
import yx.j0;

public final class SplashBaseRotatePresenter$a implements SensorEventListener	// class@0015c9
{
    public final SplashBaseRotatePresenter b;

    public void SplashBaseRotatePresenter$a(SplashBaseRotatePresenter p0){
       this.b = p0;
       super();
    }
    public void onAccuracyChanged(Sensor p0,int p1){
    }
    public void onSensorChanged(SensorEvent p0){
       SplashBaseRotatePresenter$a b;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, SplashBaseRotatePresenter$a.class, "1")) {
          return;
       }
       if (obj.b.k9()) {
          return;
       }
       double d = 0;
       if (obj1 != null) {
          SensorEvent values = obj1.values;
          if (values != null) {
             int len = values.length;
             int i = 0;
             int i1 = 0;
             while (i < len) {
                int i2 = values[i];
                int i3 = i1 + 1;
                if (i1 < obj.b.ha() && obj.b.t9() - d) {
                   long l = obj1.timestamp - obj.b.t9();
                   double d1 = (double)l * (double)0x3089705f;
                   double[] uodoubleArra = obj.b.ka();
                   d = (double)i2 * d1;
                   double d2 = uodoubleArra[i1] + Math.toDegrees(d);
                   uodoubleArra[i1] = d2;
                   Object[] objArray = new Object[0];
                   j0.f(obj.b.x9(), "mRotated["+i1+"] : "+obj.b.ka()[i1], objArray);
                   if (Math.abs(obj.b.ka()[i1]) - Math.abs(obj.b.Z[i1]) > 0) {
                      b = obj.b;
                      b.Z[i1] = b.ka()[i1];
                      obj.b.ma();
                   }
                   obj.b.Z9();
                }
                i = i + 1;
                i1 = i3;
                d = 0;
             }
          }
       }
       b = obj.b;
       SensorEvent timestamp = (obj1 != null)? obj1.timestamp: 0;
       b.T9(timestamp);
       return;
    }
}
