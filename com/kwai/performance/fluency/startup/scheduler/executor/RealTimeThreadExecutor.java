package com.kwai.performance.fluency.startup.scheduler.executor.RealTimeThreadExecutor;
import pf7.c;
import com.kwai.performance.fluency.startup.scheduler.executor.RealTimeThreadExecutor$mExecutor$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.concurrent.ExecutorService;
import java.lang.Runnable;

public final class RealTimeThreadExecutor implements c	// class@0010e7
{
    public static final p a;
    public static final RealTimeThreadExecutor b;

    static {
       RealTimeThreadExecutor.b = new RealTimeThreadExecutor();
       RealTimeThreadExecutor.a = s.c(RealTimeThreadExecutor$mExecutor$2.INSTANCE);
    }
    public void RealTimeThreadExecutor(){
       super();
    }
    public void a(DependencyTask p0){
       a.q(p0, "task");
       p0.A(2);
       RealTimeThreadExecutor.a.getValue().execute(p0);
    }
}
