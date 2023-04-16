package com.yxcorp.gifshow.performance.monitor.PerformanceMonitorInitModule$Companion$init$commonConfig$4;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class PerformanceMonitorInitModule$Companion$init$commonConfig$4 extends Lambda implements a	// class@001289
{
    public static final PerformanceMonitorInitModule$Companion$init$commonConfig$4 INSTANCE;

    static {
       PerformanceMonitorInitModule$Companion$init$commonConfig$4.INSTANCE = new PerformanceMonitorInitModule$Companion$init$commonConfig$4();
    }
    public void PerformanceMonitorInitModule$Companion$init$commonConfig$4(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       QCurrentUser obj = PatchProxy.apply(null, this, PerformanceMonitorInitModule$Companion$init$commonConfig$4.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = QCurrentUser.ME;
       a.o(obj, "QCurrentUser.ME");
       String sid = obj.getSid();
       a.o(sid, "QCurrentUser.ME.sid");
       return sid;
    }
}
