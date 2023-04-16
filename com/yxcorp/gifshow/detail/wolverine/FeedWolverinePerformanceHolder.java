package com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import l27.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.wolverine.impl.WolverinePerformanceConfig;
import java.lang.reflect.Type;
import k27.c;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import com.kwai.library.wolverine.contract.WolverinePerformanceLevelInterface;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$1;
import l27.d;
import kotlin.jvm.internal.a;
import java.util.Objects;
import k27.a;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$2;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$3;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$4;

public final class FeedWolverinePerformanceHolder	// class@001a83
{
    public static final boolean a;
    public static final p b;
    public static final FeedWolverinePerformanceHolder c;

    static {
       FeedWolverinePerformanceHolder.c = new FeedWolverinePerformanceHolder();
       FeedWolverinePerformanceHolder.a = a.t().d("feedCombineWolverinePerformanceEnable", false);
       FeedWolverinePerformanceHolder.b = s.c(FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2.INSTANCE);
    }
    public void FeedWolverinePerformanceHolder(){
       super();
    }
    public static final boolean a(FeedWolverinePerformanceHolder p0){
       return FeedWolverinePerformanceHolder.a;
    }
    public final g b(){
       c a;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, FeedWolverinePerformanceHolder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.t().getValue("wolverineEvaluatorConfig", WolverinePerformanceConfig.class, objArray);
       if (!obj instanceof WolverinePerformanceConfig) {
          return objArray;
       }
       c uoc = new c();
       uoc.b(0);
       uoc.c(WolverinePerformanceLevel.GRADE_E);
       uoc.d(new FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$1(obj));
       d uod = new d();
       a.p(uod, "filter");
       a = uoc.a;
       Objects.requireNonNull(a);
       a.p(uod, "filter");
       a.e = uod;
       uoc.a(new FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$2(obj));
       uoc.a(new FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$3(obj));
       uoc.a(new FeedWolverinePerformanceHolder$createWolverinePerformanceDispatcher$4(obj));
       return uoc.e(obj.getCoolDownInterval());
    }
    public final g c(){
       Object obj = PatchProxy.apply(null, this, FeedWolverinePerformanceHolder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return FeedWolverinePerformanceHolder.b.getValue();
    }
}
