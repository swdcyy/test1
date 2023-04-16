package com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHelper;
import com.yxcorp.gifshow.detail.wolverine.FeedWolverinePerformanceHelper$demotionGradeConfig$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.library.wolverine.impl.WolverinePerformanceLevel$a;

public final class FeedWolverinePerformanceHelper	// class@001a7c
{
    public static final p a;

    static {
       FeedWolverinePerformanceHelper.a = s.c(FeedWolverinePerformanceHelper$demotionGradeConfig$2.INSTANCE);
    }
    public static final WolverinePerformanceLevel a(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FeedWolverinePerformanceHelper uFeedWolveri = FeedWolverinePerformanceHelper.class;
       String str = null;
       WolverinePerformanceLevel$a obj = PatchProxy.applyOneRefs(p0, str, uFeedWolveri, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "key");
       obj = WolverinePerformanceLevel.Companion;
       Object obj1 = PatchProxy.applyOneRefs(p0, str, uFeedWolveri, "3");
       if (obj1 != patchProxyRe) {
       }else {
          try{
             Object obj2 = PatchProxy.apply(str, str, uFeedWolveri, "1");
             if (obj2 != patchProxyRe) {
             label_0036 :
                if (obj2 != null) {
                   str = obj2.get(p0);
                }
             }else {
                obj2 = FeedWolverinePerformanceHelper.a.getValue();
                goto label_0036 ;
             }
          }catch(java.lang.Exception e5){
             ExceptionHandler.handleCaughtException(e5);
          }
          obj1 = str;
       }
       return obj.b(obj1);
    }
}
