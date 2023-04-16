package com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser;
import java.lang.Object;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.util.Set;
import java.util.List;
import trd.d1;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Iterator;
import msd.a;
import kf7.a;
import java.util.ArrayList;
import java.lang.Iterable;
import com.kwai.performance.fluency.startup.scheduler.task.base.BarrierTask;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser$executeAncestorTasks$$inlined$run$lambda$1;
import java.util.Objects;
import java.lang.String;
import kotlin.jvm.internal.a;
import qf7.b;
import java.util.concurrent.locks.Lock;
import java.util.LinkedList;
import qrd.l1;
import pf7.b;
import pf7.a;
import java.io.File;
import android.content.Context;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser$a;
import java.io.FilenameFilter;
import kotlin.collections.ArraysKt___ArraysKt;
import java.lang.Boolean;
import android.app.ActivityManager;
import kotlin.collections.CollectionsKt__CollectionsKt;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.os.Process;
import java.lang.StringBuilder;
import java.nio.charset.Charset;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.TypeCastException;
import java.lang.Exception;
import com.google.gson.Gson;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser$b;
import java.lang.reflect.Type;
import el.a;
import java.util.Map;
import trd.t0;
import java.util.LinkedHashMap;

public final class TaskDependenciesAnalyser	// class@000d9b
{
    public static Boolean a;
    public static final TaskDependenciesAnalyser b;

    static {
       TaskDependenciesAnalyser.b = new TaskDependenciesAnalyser();
    }
    public void TaskDependenciesAnalyser(){
       super();
    }
    public final Set a(DependencyTask p0){
       if (p0.u().isEmpty()) {
          return d1.k();
       }
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       linkedHashSe.addAll(p0.u());
       Iterator iterator = p0.u().iterator();
       while (iterator.hasNext()) {
          linkedHashSe.addAll(this.a(iterator.next()));
       }
       return linkedHashSe;
    }
    public final void b(List p0,a p1){
       if (p0.isEmpty()) {
          p1.invoke();
          a.g = false;
          return;
       }else {
          ArrayList uArrayList = new ArrayList(p0);
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj instanceof BarrierTask) {
                Object obj1 = obj;
                TaskDependenciesAnalyser$executeAncestorTasks$$inlined$run$lambda$1 uoexecuteAnc = new TaskDependenciesAnalyser$executeAncestorTasks$$inlined$run$lambda$1(obj, this, p0, uArrayList, p1);
                Objects.requireNonNull(obj1);
                a.q(v8, "interceptor");
                obj1.r.add(false, v8);
                break ;
             }else {
                this.c(obj);
                uArrayList.remove(obj);
                if (uArrayList.isEmpty()) {
                   p1.invoke();
                   a.g = false;
                }
             }
          }
          return;
       }
    }
    public final void c(DependencyTask p0){
       a.q(p0, "task");
       ReentrantLock e = b.e;
       e.lock();
       if (b.d.remove(p0) || b.c.remove(p0)) {
          e.unlock();
       }else {
          e.unlock();
       }
       if (p0.H7()) {
          b.b.a(p0);
       }else {
          a.d.a(p0);
       }
       do {
       } while (p0.r() != 2);
       return;
    }
    public final File d(){
       Context d = a.d;
       if (d == null) {
          a.L();
       }
       File uFile = new File(d.getExternalFilesDir(null), "performance/startup/scheduler/analysis/allTasks.json");
       File parentFile = uFile.getParentFile();
       if (parentFile != null) {
          parentFile.mkdirs();
       }
       if (!uFile.exists()) {
          uFile.createNewFile();
       }
       return uFile;
    }
    public final File e(){
       Context d = a.d;
       if (d == null) {
          a.L();
       }
       File uFile = new File(d.getExternalFilesDir(null), "performance/startup/scheduler/analysis/analyzedTasks.json");
       File parentFile = uFile.getParentFile();
       if (parentFile != null) {
          parentFile.mkdirs();
       }
       if (!uFile.exists()) {
          uFile.createNewFile();
       }
       return uFile;
    }
    public final File f(){
       Context d = a.d;
       if (d == null) {
          a.L();
       }
       String str = null;
       File[] uFileArray = new File(d.getExternalFilesDir(str), "performance/startup/scheduler/analysis").listFiles(TaskDependenciesAnalyser$a.b);
       if (uFileArray != null) {
          str = ArraysKt___ArraysKt.Ib(uFileArray);
       }
       return str;
    }
    public final File g(){
       Context d = a.d;
       if (d == null) {
          a.L();
       }
       File uFile = new File(d.getExternalFilesDir(null), "performance/startup/scheduler/analysis/lastAnalyzedSuccessTask.dat");
       File parentFile = uFile.getParentFile();
       if (parentFile != null) {
          parentFile.mkdirs();
       }
       return uFile;
    }
    public final File h(){
       Context d = a.d;
       if (d == null) {
          a.L();
       }
       File uFile = new File(d.getExternalFilesDir(null), "performance/startup/scheduler/analysis/lastAnalyzedTask.dat");
       File parentFile = uFile.getParentFile();
       if (parentFile != null) {
          parentFile.mkdirs();
       }
       return uFile;
    }
    public final File i(){
       Context d = a.d;
       if (d == null) {
          a.L();
       }
       File uFile = new File(d.getExternalFilesDir(null), "performance/startup/scheduler/analysis/taskAncestors.json");
       File parentFile = uFile.getParentFile();
       if (parentFile != null) {
          parentFile.mkdirs();
       }
       if (!uFile.exists()) {
          uFile.createNewFile();
       }
       return uFile;
    }
    public final boolean j(){
       Boolean a;
       if (TaskDependenciesAnalyser.a == null) {
          Context d = a.d;
          if (d == null) {
             a.L();
          }
          TaskDependenciesAnalyser.a = Boolean.valueOf(new File(d.getExternalFilesDir(null), "performance/startup/scheduler/analysis/tda.flag").exists());
       }
       a = TaskDependenciesAnalyser.a;
       if (a == null) {
          a.L();
       }
       return a.booleanValue();
    }
    public final boolean k(){
       Context d = a.d;
       if (d == null) {
          a.L();
       }
       File uFile = new File(d.getExternalFilesDir(null), "performance/startup/scheduler/analysis/process.dat");
       if (uFile.exists()) {
          String str = "";
          int i = 2;
          try{
             Context d1 = a.d;
             if (d1 == null) {
                a.L();
             label_0024 :
                List systemServic = d1.getSystemService("activity");
                if (systemServic != null) {
                   systemServic = systemServic.getRunningAppProcesses();
                   if (systemServic == null) {
                      systemServic = CollectionsKt__CollectionsKt.E();
                   }
                   Iterator iterator = systemServic.iterator();
                   while (iterator.hasNext()) {
                      ActivityManager$RunningAppProcessInfo runningAppPr = iterator.next();
                      if (runningAppPr.pid == Process.myPid()) {
                         str = runningAppPr.processName;
                      }
                   }
                   if (str == null) {
                      char[] uocharArray = new char[i];
                      uocharArray[0] = ' ';
                      uocharArray[1] = 0;
                      str = StringsKt__StringsKt.t5(FilesKt__FileReadWriteKt.z(new File("/proc/"+Process.myPid()+"/"+"cmdline"), null, 1, null), uocharArray);
                   }
                }else {
                   throw new TypeCastException("null cannot be cast to non-null type android.app.ActivityManager");
                }
             }else {
                goto label_0024 ;
             }
          }catch(java.lang.Exception e5){
             e5.printStackTrace();
          }
          str = (str != null)? StringsKt__StringsKt.f5(str, ":", null, i, null): null;
          return a.g(str, FilesKt__FileReadWriteKt.z(uFile, null, 1, null));
       }else {
          return 1;
       }
    }
    public final void l(String p0,boolean p1){
       Map map = new Gson().i(FilesKt__FileReadWriteKt.z(this.e(), null, 1, null), new TaskDependenciesAnalyser$b().getType());
       if (map != null) {
          map = t0.J0(map);
          if (map != null) {
          label_002c :
             String str = (p1)? "success": "fail";
             map.put(p0, str);
             String str1 = new Gson().q(map);
             a.h(str1, "Gson\(\).toJson\(resultMap\)");
             FilesKt__FileReadWriteKt.G(this.e(), str1, null, 2, null);
             if (p1) {
                FilesKt__FileReadWriteKt.G(this.g(), p0, null, 2, null);
             }
             return;
          }
       }
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       goto label_002c ;
    }
}
