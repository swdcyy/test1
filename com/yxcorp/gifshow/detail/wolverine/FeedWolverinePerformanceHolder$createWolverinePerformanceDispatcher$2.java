package com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import p27.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import com.kwai.library.wolverine.impl.WolverinePerformanceConfig;
import java.util.Objects;
import com.kwai.library.wolverine.elements.devicelevel.DeviceLevelConfig;
import yzc.a;
import l27.e;

public final class FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$2 extends Lambda implements a	// class@001a7e
{
    public final Object $config;

    public void FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$2(Object p0){
       this.$config = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FeedWolverinePerformanceHolder obj = PatchProxy.apply(objArray, this, FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$2.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = FeedWolverinePerformanceHolder.c;
       FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$2 t$config = this.$config;
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.applyOneRefs(t$config, obj, FeedWolverinePerformanceHolder.class, "4");
       if (objArray1 != patchProxyRe) {
       }else {
          DeviceLevelConfig deviceLevelC = t$config.getDeviceLevelConfig();
          if (deviceLevelC != null) {
             objArray = new b(deviceLevelC, new a());
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
