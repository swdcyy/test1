package com.kwai.edge.reco.ctr.CtrEnvLightMonitor$envLightListener$2$a;
import android.hardware.SensorEventListener;
import java.lang.Object;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor;
import java.util.Objects;

public final class CtrEnvLightMonitor$envLightListener$2$a implements SensorEventListener	// class@000d43
{

    public void CtrEnvLightMonitor$envLightListener$2$a(){
       super();
    }
    public void onAccuracyChanged(Sensor p0,int p1){
    }
    public void onSensorChanged(SensorEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CtrEnvLightMonitor$envLightListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "event");
       SensorEvent sensor = p0.sensor;
       a.o(sensor, "event.sensor");
       if (sensor.getType() != 5) {
          return;
       }
       p0 = p0.values;
       a.o(p0, "sensorValue");
       CtrEnvLightMonitor uCtrEnvLight = (!p0.length)? 1: null;
       if (uCtrEnvLight) {
          return;
       }else {
          Objects.requireNonNull(CtrEnvLightMonitor.h);
          CtrEnvLightMonitor.f = p0[0];
          return;
       }
    }
}
