package com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import l27.h;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import com.kwai.library.wolverine.impl.WolverinePerformanceConfig;
import java.util.Objects;
import u27.c;
import java.util.List;
import java.util.Collection;

public final class FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$1 extends Lambda implements a	// class@001a7d
{
    public final Object $config;

    public void FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$1(Object p0){
       this.$config = p0;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final h invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       FeedWolverinePerformanceHolder obj = PatchProxy.apply(objArray, this, FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$1.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = FeedWolverinePerformanceHolder.c;
       FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$1 t$config = this.$config;
       Objects.requireNonNull(obj);
       Object[] objArray1 = PatchProxy.applyOneRefs(t$config, obj, FeedWolverinePerformanceHolder.class, "3");
       if (objArray1 != patchProxyRe) {
       }else {
          List list = t$config.gradeConfig();
          objArray1 = (list == null || list.isEmpty())? 1: null;
          if (!objArray1) {
             objArray = new c(list, String.valueOf(t$config.getVersion()));
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
}
