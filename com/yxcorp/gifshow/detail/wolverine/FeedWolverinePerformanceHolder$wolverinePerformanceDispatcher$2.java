package com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import l27.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder;
import com.yxcorp.utility.SystemUtil;
import r9a.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import m27.d;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2$1;

public final class FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2 extends Lambda implements a	// class@001a82
{
    public static final FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2 INSTANCE;

    static {
       FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2.INSTANCE = new FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2();
    }
    public void FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final g invoke(){
       Object[] objArray = null;
       FeedWolverinePerformanceHolder obj = PatchProxy.apply(objArray, this, FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = FeedWolverinePerformanceHolder.c;
       if (!FeedWolverinePerformanceHolder.a(obj)) {
          return objArray;
       }
       if (SystemUtil.K()) {
          g og = a.a();
          if (og != null) {
             return og;
          }
       }
       g og1 = obj.b();
       if (og1 != null) {
          return og1;
       }else {
          return new d(FeedWolverinePerformanceHolder$wolverinePerformanceDispatcher$2$1.INSTANCE);
       }
    }
}
