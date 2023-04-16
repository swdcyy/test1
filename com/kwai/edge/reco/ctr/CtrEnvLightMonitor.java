package com.kwai.edge.reco.ctr.CtrEnvLightMonitor;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor$config$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor$sensorManager$2;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor$envLightSensor$2;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor$envLightListener$2;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor$logPageListener$2;
import java.lang.Object;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.edge.reco.ctr.CtrEnvLightMonitor$envLightListener$2$a;
import android.hardware.Sensor;
import k2b.s1;
import android.hardware.SensorManager;
import com.kwai.edge.reco.ctr.config.CTRFeatureConfig;
import android.hardware.SensorEventListener;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import m56.f;
import kotlin.jvm.internal.a;
import m56.g;
import com.kwai.edge.reco.ctr.CTRPredictor;
import com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import java.util.List;

public final class CtrEnvLightMonitor	// class@000d49
{
    public static final p a;
    public static boolean b;
    public static final p c;
    public static final p d;
    public static final p e;
    public static float f;
    public static final p g;
    public static final CtrEnvLightMonitor h;

    static {
       CtrEnvLightMonitor.h = new CtrEnvLightMonitor();
       CtrEnvLightMonitor.a = s.c(CtrEnvLightMonitor$config$2.INSTANCE);
       CtrEnvLightMonitor.c = s.c(CtrEnvLightMonitor$sensorManager$2.INSTANCE);
       CtrEnvLightMonitor.d = s.c(CtrEnvLightMonitor$envLightSensor$2.INSTANCE);
       CtrEnvLightMonitor.e = s.c(CtrEnvLightMonitor$envLightListener$2.INSTANCE);
       CtrEnvLightMonitor.f = 0xbf800000;
       CtrEnvLightMonitor.g = s.c(CtrEnvLightMonitor$logPageListener$2.INSTANCE);
    }
    public void CtrEnvLightMonitor(){
       super();
    }
    public final CtrPredictionRuntimeConfig a(){
       Object obj = PatchProxy.apply(null, this, CtrEnvLightMonitor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CtrEnvLightMonitor.a.getValue();
    }
    public final CtrEnvLightMonitor$envLightListener$2$a b(){
       Object obj = PatchProxy.apply(null, this, CtrEnvLightMonitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CtrEnvLightMonitor.e.getValue();
    }
    public final Sensor c(){
       Object obj = PatchProxy.apply(null, this, CtrEnvLightMonitor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CtrEnvLightMonitor.d.getValue();
    }
    public final s1 d(){
       Object obj = PatchProxy.apply(null, this, CtrEnvLightMonitor.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CtrEnvLightMonitor.g.getValue();
    }
    public final SensorManager e(){
       Object obj = PatchProxy.apply(null, this, CtrEnvLightMonitor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return CtrEnvLightMonitor.c.getValue();
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, CtrEnvLightMonitor.class, "6")) {
          return;
       }
       if (!this.a().c().b()) {
          return;
       }
       if (CtrEnvLightMonitor.b) {
          return;
       }
       CtrEnvLightMonitor.b = true;
       this.e().registerListener(this.b(), this.c(), 3);
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, CtrEnvLightMonitor.class, "11")) {
          return;
       }
       b.a(0x4b316083).T0(this.d());
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, CtrEnvLightMonitor.class, "7")) {
          return;
       }
       if (!this.a().c().b()) {
          return;
       }
       if (!CtrEnvLightMonitor.b) {
          return;
       }
       CtrEnvLightMonitor.b = false;
       this.e().unregisterListener(this.b(), this.c());
       return;
    }
    public final void onBackground(f p0){
       CtrEnvLightMonitor uCtrEnvLight = CtrEnvLightMonitor.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uCtrEnvLight, "8")) {
          return;
       }
       a.p(p0, "e");
       this.h();
       if (!PatchProxy.applyVoid(null, this, uCtrEnvLight, "12")) {
          b.a(0x4b316083).w0(this.d());
       }
       return;
    }
    public final void onForeground(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CtrEnvLightMonitor.class, "9")) {
          return;
       }
       a.p(p0, "e");
       if (this.a().d().b().contains(CTRPredictor.v.m())) {
          this.f();
       }
       this.g();
       return;
    }
}
