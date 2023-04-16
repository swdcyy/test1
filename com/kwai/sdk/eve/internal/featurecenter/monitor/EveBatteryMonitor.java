package com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.FeatureMonitor;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$Companion;
import nsd.u;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$receiver$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.sdk.eve.internal.featurecenter.IFeatureProvider;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.eve.internal.featurecenter.AppCachedFeatureProvider;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$createFeatureProvider$2;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$createFeatureProvider$3;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$createFeatureProvider$1;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$receiver$2$1;
import android.os.Handler;
import com.kwai.sdk.eve.internal.featurecenter.monitor.EveBatteryMonitor$init$1;
import java.lang.Runnable;
import android.content.Intent;
import ekd.j0;
import com.kwai.sdk.eve.internal.common.utils.EveLog;

public final class EveBatteryMonitor extends FeatureMonitor	// class@00151d
{
    public int batteryCharging;
    public int batteryLevel;
    public int batteryTemperature;
    public final p receiver$delegate;
    public static final EveBatteryMonitor$Companion Companion;

    static {
       EveBatteryMonitor.Companion = new EveBatteryMonitor$Companion(null);
    }
    public void EveBatteryMonitor(Context p0){
       a.p(p0, "context");
       super(p0);
       this.receiver$delegate = s.c(new EveBatteryMonitor$receiver$2(this));
       this.batteryLevel = -1;
    }
    public IFeatureProvider createFeatureProvider(String p0){
       AppCachedFeatureProvider uAppCachedFe;
       String obj = PatchProxy.applyOneRefs(p0, this, EveBatteryMonitor.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "feature");
       int i = p0.hashCode();
       if (i != -1679053417) {
          if (i != -1410521534) {
             if (i == 0x55996271) {
                obj = "charging";
                if (p0.equals(obj)) {
                   uAppCachedFe = new AppCachedFeatureProvider(obj, new EveBatteryMonitor$createFeatureProvider$2(this));
                label_005f :
                   return uAppCachedFe;
                }
             }
          }else {
             obj = "battery_temperature";
             if (p0.equals(obj)) {
                uAppCachedFe = new AppCachedFeatureProvider(obj, new EveBatteryMonitor$createFeatureProvider$3(this));
                goto label_005f ;
             }
          }
       }else {
          obj = "batterylevel";
          if (p0.equals(obj)) {
             uAppCachedFe = new AppCachedFeatureProvider(obj, new EveBatteryMonitor$createFeatureProvider$1(this));
             goto label_005f ;
          }
       }
       throw new RuntimeException("EveBatteryMonitor not expect feature:"+p0);
    }
    public List features(){
       String[] obj = PatchProxy.apply(null, this, EveBatteryMonitor.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new String[]{"batterylevel","charging","battery_temperature"};
       return CollectionsKt__CollectionsKt.L(obj);
    }
    public final EveBatteryMonitor$receiver$2$1 getReceiver(){
       Object obj = PatchProxy.apply(null, this, EveBatteryMonitor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.receiver$delegate.getValue();
    }
    public void init(Handler p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveBatteryMonitor.class, "2")) {
          return;
       }
       a.p(p0, "handler");
       p0.post(new EveBatteryMonitor$init$1(this, p0));
       return;
    }
    public final void updateBatteryState(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveBatteryMonitor.class, "5")) {
          return;
       }
       if (p0 != null) {
          int i = 1;
          if (a.g("android.intent.action.BATTERY_CHANGED", p0.getAction()) ^ i) {
             return;
          }else {
             this.batteryLevel = j0.b(p0, "level", 0);
             int i1 = j0.b(p0, "status", -1);
             if (i1 != 2 && i1 != 5) {
                i = 0;
             }
             i1 = j0.b(p0, "plugged", 0);
             int i2 = (i)? i1: 0;
             this.batteryCharging = i2;
             this.batteryTemperature = j0.b(p0, "temperature", 0);
             EveLog.i$default("EveBatteryMonitor updateBatteryState, level:"+this.batteryLevel+", charging:"+i+", plugged:"+i1+", temperature:"+this.batteryTemperature, 0, 2, null);
             this.notifyFeatureChange("batterylevel");
             this.notifyFeatureChange("charging");
             this.notifyFeatureChange("battery_temperature");
          }
       }
       return;
    }
}
