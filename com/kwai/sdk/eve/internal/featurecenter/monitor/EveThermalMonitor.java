package com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$Companion;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$powerManager$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$thermalStatusChangedListener$2;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.featurecenter.AppCachedFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$createFeatureProvider$1;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.List;
import trd.t;
import android.os.PowerManager;
import android.os.PowerManager$OnThermalStatusChangedListener;
import android.os.Handler;
import android.os.Build$VERSION;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveThermalMonitor$init$1;
import java.lang.Runnable;
import ekd.k1;

public final class EveThermalMonitor extends FeatureMonitor	// class@00153b
{
    public final p powerManager$delegate;
    public int thermalStatus;
    public final p thermalStatusChangedListener$delegate;
    public static final EveThermalMonitor$Companion Companion;

    static {
       EveThermalMonitor.Companion = new EveThermalMonitor$Companion(null);
    }
    public void EveThermalMonitor(Context p0){
       a.p(p0, "context");
       super(p0);
       this.powerManager$delegate = s.c(new EveThermalMonitor$powerManager$2(p0));
       this.thermalStatus = -1;
       this.thermalStatusChangedListener$delegate = s.c(new EveThermalMonitor$thermalStatusChangedListener$2(this));
    }
    public IFeatureProvider createFeatureProvider(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, EveThermalMonitor.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feature");
       if (p0.hashCode() == 0x517cd9a) {
          obj = "thermal_status";
          if (p0.equals(obj)) {
             return new AppCachedFeatureProvider(obj, new EveThermalMonitor$createFeatureProvider$1(this));
          }
       }
       throw new RuntimeException("EveThermalMonitor not expect feature:"+p0);
    }
    public List features(){
       Object obj = PatchProxy.apply(null, this, EveThermalMonitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.k("thermal_status");
    }
    public final PowerManager getPowerManager(){
       Object obj = PatchProxy.apply(null, this, EveThermalMonitor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.powerManager$delegate.getValue();
    }
    public final PowerManager$OnThermalStatusChangedListener getThermalStatusChangedListener(){
       Object obj = PatchProxy.apply(null, this, EveThermalMonitor.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.thermalStatusChangedListener$delegate.getValue();
    }
    public void init(Handler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveThermalMonitor.class, "3")) {
          return;
       }
       a.p(p0, "handler");
       if (Build$VERSION.SDK_INT >= 29) {
          this.thermalStatus = this.getPowerManager().getCurrentThermalStatus();
          EveLog.i$default("EveThermalMonitor thermalStatus init with "+this.thermalStatus, false, 2, null);
          k1.o(new EveThermalMonitor$init$1(this));
       }
       return;
    }
}
