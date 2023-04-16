package com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import r27.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import com.kwai.library.wolverine.impl.WolverinePerformanceConfig;
import java.util.Objects;
import java.util.List;
import s27.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$4 extends Lambda implements a	// class@001a80
{
    public final Object $config;

    public void FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$4(Object p0){
       this.$config = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FeedWolverinePerformanceHolder obj = PatchProxy.apply(objArray, this, FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$4.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = FeedWolverinePerformanceHolder.c;
       FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$4 t$config = this.$config;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(t$config, obj, FeedWolverinePerformanceHolder.class, "6");
       if (obj1 != patchProxyRe) {
          objArray = obj1;
       }else {
          List temperatureC = t$config.getTemperatureConfig();
          if (temperatureC != null) {
             objArray = a.a(temperatureC);
          }
       }
       return objArray;
    }
}
