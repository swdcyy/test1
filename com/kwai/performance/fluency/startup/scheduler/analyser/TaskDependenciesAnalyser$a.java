package com.kwai.performance.fluency.startup.scheduler.analyser.TaskDependenciesAnalyser$a;
import java.io.FilenameFilter;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import kotlin.jvm.internal.a;
import zsd.u;

public final class TaskDependenciesAnalyser$a implements FilenameFilter	// class@0010df
{
    public static final TaskDependenciesAnalyser$a b;

    static {
       TaskDependenciesAnalyser$a.b = new TaskDependenciesAnalyser$a();
    }
    public void TaskDependenciesAnalyser$a(){
       super();
    }
    public final boolean accept(File p0,String p1){
       a.h(p1, "name");
       return u.H1(p1, "deps", false, 2, null);
    }
}
