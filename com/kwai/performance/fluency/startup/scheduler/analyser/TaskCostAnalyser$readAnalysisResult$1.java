package com.kwai.performance.fluency.startup.scheduler.analyser.TaskCostAnalyser$readAnalysisResult$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import lf7.b;
import java.io.File;
import kotlin.Result;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskCostAnalyser$readAnalysisResult$1$1$1;
import java.nio.charset.Charset;
import msd.l;
import kotlin.io.FilesKt__FileReadWriteKt;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import qf7.b;
import java.lang.Throwable;
import qrd.j0;

public final class TaskCostAnalyser$readAnalysisResult$1 extends Lambda implements a	// class@000d95
{
    public static final TaskCostAnalyser$readAnalysisResult$1 INSTANCE;

    static {
       TaskCostAnalyser$readAnalysisResult$1.INSTANCE = new TaskCostAnalyser$readAnalysisResult$1();
    }
    public void TaskCostAnalyser$readAnalysisResult$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       b e = b.e;
       if (!e.d().exists()) {
          return;
       }
       FilesKt__FileReadWriteKt.q(e.d(), null, new TaskCostAnalyser$readAnalysisResult$1$1$1(e), 1, null);
       b.c(b.a(e));
       b.d = true;
       Result.constructor-impl(l1.a);
       return;
    }
}
