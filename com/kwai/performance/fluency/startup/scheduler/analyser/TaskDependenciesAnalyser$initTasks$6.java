package com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser$initTasks$6;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.lang.String;
import java.lang.Object;
import qrd.l1;
import com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser;

public final class TaskDependenciesAnalyser$initTasks$6 extends Lambda implements a	// class@000d9a
{
    public final String $currentAnalyzedTaskName;
    public final DependencyTask $currentTask;

    public void TaskDependenciesAnalyser$initTasks$6(DependencyTask p0,String p1){
       this.$currentTask = p0;
       this.$currentAnalyzedTaskName = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       TaskDependenciesAnalyser b = TaskDependenciesAnalyser.b;
       b.c(this.$currentTask);
       b.l(this.$currentAnalyzedTaskName, true);
    }
}
