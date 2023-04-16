package com.kwai.edge.reco.ctr.CtrEnvLightMonitor$envLightSensor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.hardware.Sensor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor;
import android.hardware.SensorManager;

public final class CtrEnvLightMonitor$envLightSensor$2 extends Lambda implements a	// class@000d45
{
    public static final CtrEnvLightMonitor$envLightSensor$2 INSTANCE;

    static {
       CtrEnvLightMonitor$envLightSensor$2.INSTANCE = new CtrEnvLightMonitor$envLightSensor$2();
    }
    public void CtrEnvLightMonitor$envLightSensor$2(){
       super(0);
    }
    public final Sensor invoke(){
       Object obj = PatchProxy.apply(null, this, CtrEnvLightMonitor$envLightSensor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CtrEnvLightMonitor.h.e().getDefaultSensor(5);
    }
    public Object invoke(){
       return this.invoke();
    }
}
