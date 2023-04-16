package com.kwai.yoda.function.system.StartAccelerometerFunction;
import ay7.a;
import com.kwai.yoda.function.system.StartAccelerometerFunction$b;
import nsd.u;
import java.util.LinkedHashMap;
import com.kwai.yoda.function.system.StartAccelerometerFunction$Companion$clearSensorOnDestroy$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.function.system.StartAccelerometerFunction$c;
import yz7.e;
import android.content.Context;
import android.widget.AbsoluteLayout;
import android.hardware.SensorManager;
import android.hardware.Sensor;
import com.kwai.yoda.bridge.YodaException;
import java.lang.Integer;
import java.util.Map;
import android.hardware.SensorEventListener;
import com.kwai.yoda.function.system.StartAccelerometerFunction$d;
import java.util.Objects;
import crd.b;
import com.kwai.yoda.function.FunctionResultParams$a;
import kotlin.TypeCastException;

public final class StartAccelerometerFunction extends a	// class@0011f9
{
    public static final Map d;
    public static final p e;
    public static final StartAccelerometerFunction$b f;

    static {
       StartAccelerometerFunction.f = new StartAccelerometerFunction$b(null);
       StartAccelerometerFunction.d = new LinkedHashMap();
       StartAccelerometerFunction.e = s.c(StartAccelerometerFunction$Companion$clearSensorOnDestroy$2.INSTANCE);
    }
    public void StartAccelerometerFunction(){
       super();
    }
    public String c(){
       return "startAccelerometer";
    }
    public String d(){
       return "system";
    }
    public FunctionResultParams k(YodaBaseWebView p0,String p1){
       Object[] systemServic;
       Sensor defaultSenso;
       String obj = PatchProxy.applyTwoRefs(p0, p1, this, StartAccelerometerFunction.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "The Input parameter can NOT be null.";
       Context uContext = 0x1e84e;
       if (p1 == null) {
          throw new YodaException(uContext, obj);
       }
       StartAccelerometerFunction$c uoc = e.a(p1, StartAccelerometerFunction$c.class);
       if (uoc == null) {
          throw new YodaException(uContext, obj);
       }
       if (p0 != null) {
          uContext = p0.getContext();
          if (uContext != null) {
             systemServic = uContext.getSystemService("sensor");
          label_0031 :
             if (systemServic != null) {
                Map map = 0x1e84b;
                if (uoc.includingGravity != null) {
                   defaultSenso = systemServic.getDefaultSensor(1);
                   if (defaultSenso == null) {
                      throw new YodaException(map, "no ACCELEROMETER sensor on this phone.");
                   }
                }else {
                   defaultSenso = systemServic.getDefaultSensor(10);
                   if (defaultSenso == null) {
                      throw new YodaException(map, "no LINEAR ACCELEROMETER sensor on this phone.");
                   }
                }
                Sensor defaultSenso1 = systemServic.getDefaultSensor(2);
                if (defaultSenso1 != null) {
                   map = StartAccelerometerFunction.d;
                   SensorEventListener sensorEventL = map.get(Integer.valueOf(p0.hashCode()));
                   if (sensorEventL != null) {
                      systemServic.unregisterListener(sensorEventL);
                   }
                   int i = 60;
                   if (uoc.interval < i) {
                      uoc.interval = i;
                   }
                   if (uoc.interval > 0x2710) {
                      uoc.interval = 0x2710;
                   }
                   StartAccelerometerFunction$d uod = new StartAccelerometerFunction$d(p0, uoc.interval);
                   systemServic.registerListener(uod, defaultSenso, 2);
                   systemServic.registerListener(uod, defaultSenso1, 2);
                   map.put(Integer.valueOf(p0.hashCode()), uod);
                   StartAccelerometerFunction$b f = StartAccelerometerFunction.f;
                   Objects.requireNonNull(f);
                   if (PatchProxy.apply(null, f, StartAccelerometerFunction$b.class, "1") == PatchProxyResult.class) {
                      b value = StartAccelerometerFunction.e.getValue();
                   }
                   return FunctionResultParams.Companion.b();
                }else {
                   throw new YodaException(map, "no MAGNETOMETER sensor on this phone.");
                }
             }else {
                throw new TypeCastException("null cannot be cast to non-null type android.hardware.SensorManager");
             }
          }
       }
       systemServic = null;
       goto label_0031 ;
    }
}
