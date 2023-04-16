package com.kwai.performance.fluency.startup.scheduler.analyser.TaskCostAnalyser$writeAnalysisResult$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import lf7.b;
import kotlin.Result;
import java.lang.StringBuilder;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.String;
import java.lang.Number;
import java.io.File;
import kotlin.jvm.internal.a;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import kf7.a;
import java.util.LinkedHashMap;
import trd.s0;
import java.lang.Iterable;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import kotlin.TypeCastException;
import android.content.Context;
import com.google.gson.Gson;
import java.lang.Throwable;
import qrd.j0;

public final class TaskCostAnalyser$writeAnalysisResult$1 extends Lambda implements a	// class@000d96
{
    public static final TaskCostAnalyser$writeAnalysisResult$1 INSTANCE;

    static {
       TaskCostAnalyser$writeAnalysisResult$1.INSTANCE = new TaskCostAnalyser$writeAnalysisResult$1();
    }
    public void TaskCostAnalyser$writeAnalysisResult$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       File obj;
       b e = b.e;
       String str = "";
       Iterator iterator = b.a(e).entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          str = str+uEntry.getKey()+':'+uEntry.getValue().longValue()+10;
       }
       str = str;
       a.h(str, "it.toString\(\)");
       FilesKt__FileReadWriteKt.G(e.d(), str, null, 2, null);
       if (a.e) {
          ConcurrentHashMap uConcurrentH = b.a(e);
          LinkedHashMap linkedHashMa = new LinkedHashMap(s0.j(uConcurrentH.size()));
          Iterator iterator1 = uConcurrentH.entrySet().iterator();
          while (true) {
             if (iterator1.hasNext()) {
                obj = iterator1.next();
                String obj1 = obj;
                String key = obj1.getKey();
                int i = StringsKt__StringsKt.w3(obj1.getKey(), ".", 0, false, 6, null) + 1;
                if (key != null) {
                   obj1 = key.substring(i);
                   a.h(obj1, "\(this as java.lang.String\).substring\(startIndex\)");
                   linkedHashMa.put(obj1, obj.getValue());
                }else {
                   break ;
                }
             }else {
                Context d = a.d;
                if (d == null) {
                   a.L();
                }
                obj = new File(d.getExternalFilesDir(null), "performance/startup/scheduler/taskCost.json");
                File parentFile = obj.getParentFile();
                if (parentFile != null) {
                   parentFile.mkdirs();
                }
                String str1 = new Gson().q(linkedHashMa);
                a.h(str1, "Gson\(\).toJson\(it\)");
                FilesKt__FileReadWriteKt.G(obj, str1, null, 2, null);
             }
          }
          throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
       }
       Result.constructor-impl(l1.a);
       return;
    }
}
