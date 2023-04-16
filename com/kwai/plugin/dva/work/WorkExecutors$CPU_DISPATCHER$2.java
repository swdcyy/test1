package com.kwai.plugin.dva.work.WorkExecutors$CPU_DISPATCHER$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.ExecutorService;
import com.kwai.plugin.dva.work.WorkExecutors;
import ftd.o1;

public final class WorkExecutors$CPU_DISPATCHER$2 extends Lambda implements a	// class@000ec9
{
    public static final WorkExecutors$CPU_DISPATCHER$2 INSTANCE;

    static {
       WorkExecutors$CPU_DISPATCHER$2.INSTANCE = new WorkExecutors$CPU_DISPATCHER$2();
    }
    public void WorkExecutors$CPU_DISPATCHER$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ExecutorCoroutineDispatcher invoke(){
       Object obj = PatchProxy.apply(null, this, WorkExecutors$CPU_DISPATCHER$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return o1.c(WorkExecutors.a());
    }
}
