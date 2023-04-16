package com.kwai.performance.fluency.startup.scheduler.analyser.TaskCostAnalyser$readAnalysisResult$1$1$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import lf7.b;
import java.lang.Object;
import java.lang.String;
import qrd.l1;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import java.util.List;
import kotlin.text.StringsKt__StringsKt;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Long;

public final class TaskCostAnalyser$readAnalysisResult$1$1$1 extends Lambda implements l	// class@0010dd
{
    public final b $this_runCatching;

    public void TaskCostAnalyser$readAnalysisResult$1$1$1(b p0){
       this.$this_runCatching = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       a.q(p0, "it");
       String[] stringArray = new String[]{":"};
       List list = StringsKt__StringsKt.H4(p0, stringArray, false, 0, 6, null);
       if (list.size() <= 1) {
          return;
       }
       b.a(this.$this_runCatching).putIfAbsent(list.get(0), Long.valueOf(Long.parseLong(list.get(1))));
       return;
    }
}
