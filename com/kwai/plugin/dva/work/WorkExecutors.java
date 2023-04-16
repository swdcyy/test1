package com.kwai.plugin.dva.work.WorkExecutors;
import com.kwai.plugin.dva.work.WorkExecutors$b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.plugin.dva.work.WorkExecutors$IO$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.plugin.dva.work.WorkExecutors$CPU$2;
import com.kwai.plugin.dva.work.WorkExecutors$IO_DISPATCHER$2;
import com.kwai.plugin.dva.work.WorkExecutors$CPU_DISPATCHER$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlinx.coroutines.CoroutineDispatcher;

public final class WorkExecutors	// class@000ecf
{
    public static final WorkExecutors a;
    public static final Executor b;
    public static final Executor c;
    public static final p d;
    public static final p e;
    public static ExecutorService f;
    public static ExecutorService g;
    public static final p h;
    public static final p i;

    static {
       WorkExecutors.a = new WorkExecutors();
       WorkExecutors.b = new WorkExecutors$b();
       ExecutorService uExecutorSer = Executors.newSingleThreadExecutor();
       a.o(uExecutorSer, "newSingleThreadExecutor\(\)");
       WorkExecutors.c = uExecutorSer;
       WorkExecutors.d = s.c(WorkExecutors$IO$2.INSTANCE);
       WorkExecutors.e = s.c(WorkExecutors$CPU$2.INSTANCE);
       WorkExecutors.h = s.c(WorkExecutors$IO_DISPATCHER$2.INSTANCE);
       WorkExecutors.i = s.c(WorkExecutors$CPU_DISPATCHER$2.INSTANCE);
    }
    public void WorkExecutors(){
       super();
    }
    public static final ExecutorService a(){
       Object obj = PatchProxy.apply(null, null, WorkExecutors.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WorkExecutors.e.getValue();
    }
    public static final CoroutineDispatcher b(){
       Object obj = PatchProxy.apply(null, null, WorkExecutors.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WorkExecutors.i.getValue();
    }
    public static final ExecutorService c(){
       Object obj = PatchProxy.apply(null, null, WorkExecutors.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WorkExecutors.d.getValue();
    }
    public static final CoroutineDispatcher d(){
       Object obj = PatchProxy.apply(null, null, WorkExecutors.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return WorkExecutors.h.getValue();
    }
}
