package com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser$executeAncestorTasks$$inlined$run$lambda$1;
import tf7.a;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser;
import java.util.List;
import java.util.ArrayList;
import msd.a;
import java.lang.Object;
import tf7.a$a;
import java.lang.String;
import kotlin.jvm.internal.a;
import kf7.a;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser$executeAncestorTasks$$inlined$run$lambda$1$1;

public final class TaskDependenciesAnalyser$executeAncestorTasks$$inlined$run$lambda$1 implements a	// class@0010e2
{
    public final DependencyTask a;
    public final TaskDependenciesAnalyser b;
    public final List c;
    public final ArrayList d;
    public final a e;

    public void TaskDependenciesAnalyser$executeAncestorTasks$$inlined$run$lambda$1(DependencyTask p0,TaskDependenciesAnalyser p1,List p2,ArrayList p3,a p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(a$a p0){
       a.q(p0, "chain");
       p0.a();
       this.d.remove(this.a);
       if (this.d.isEmpty()) {
          this.e.invoke();
          a.g = false;
          return;
       }else {
          this.b.b(this.d, new TaskDependenciesAnalyser$executeAncestorTasks$$inlined$run$lambda$1$1(this));
          return;
       }
    }
}
