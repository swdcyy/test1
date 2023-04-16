package com.kwai.performance.fluency.startup.scheduler.debug.UmlGraph;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import com.kwai.performance.fluency.startup.scheduler.debug.UmlGraph$mUmlRenderers$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.kwai.performance.fluency.startup.scheduler.task.base.DependencyTask;
import java.util.Objects;

public final class UmlGraph	// class@000d9d
{
    public static final CopyOnWriteArrayList a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static final p d;
    public static ScheduledExecutorService e;
    public static long f;
    public static boolean g;
    public static final UmlGraph h;

    static {
       UmlGraph.h = new UmlGraph();
       UmlGraph.a = new CopyOnWriteArrayList();
       UmlGraph.b = new ConcurrentHashMap();
       UmlGraph.c = new ConcurrentHashMap();
       UmlGraph.d = s.c(UmlGraph$mUmlRenderers$2.INSTANCE);
    }
    public void UmlGraph(){
       super();
    }
    public static void a(UmlGraph p0,DependencyTask p1,boolean p2,boolean p3,int p4,Object p5){
       Objects.requireNonNull(p0);
    }
}
