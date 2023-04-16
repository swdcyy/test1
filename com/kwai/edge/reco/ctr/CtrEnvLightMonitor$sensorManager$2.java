package com.kwai.edge.reco.ctr.CtrEnvLightMonitor$sensorManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.hardware.SensorManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Application;
import o56.a;
import java.util.Objects;

public final class CtrEnvLightMonitor$sensorManager$2 extends Lambda implements a	// class@000d48
{
    public static final CtrEnvLightMonitor$sensorManager$2 INSTANCE;

    static {
       CtrEnvLightMonitor$sensorManager$2.INSTANCE = new CtrEnvLightMonitor$sensorManager$2();
    }
    public void CtrEnvLightMonitor$sensorManager$2(){
       super(0);
    }
    public final SensorManager invoke(){
       Object obj = PatchProxy.apply(null, this, CtrEnvLightMonitor$sensorManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.b().getSystemService("sensor");
       Objects.requireNonNull(obj, "null cannot be cast to non-null type android.hardware.SensorManager");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
