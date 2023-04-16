package com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import n27.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import com.kwai.library.wolverine.impl.WolverinePerformanceConfig;
import java.util.Objects;
import com.kwai.library.wolverine.elements.battery.BatteryPerformanceConfig;

public final class FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$3 extends Lambda implements a	// class@001a7f
{
    public final Object $config;

    public void FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$3(Object p0){
       this.$config = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final a invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FeedWolverinePerformanceHolder obj = PatchProxy.apply(objArray, this, FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$3.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = FeedWolverinePerformanceHolder.c;
       FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$3 t$config = this.$config;
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.applyOneRefs(t$config, obj, FeedWolverinePerformanceHolder.class, "5");
       if (objArray1 != patchProxyRe) {
       }else {
          BatteryPerformanceConfig batteryConfi = t$config.getBatteryConfig();
          if (batteryConfi != null) {
             objArray = new a(batteryConfi, t$config.getBatteryLoopInterval(), t$config.getBatteryLoopEnable());
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
