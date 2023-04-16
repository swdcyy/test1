package com.kwai.performance.stability.crash.monitor.LifecycleCallbacksHandler$LifeCycle;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class LifecycleCallbacksHandler$LifeCycle extends Enum	// class@001196
{
    public static final LifecycleCallbacksHandler$LifeCycle[] $VALUES;
    public static final LifecycleCallbacksHandler$LifeCycle onActivityCreated;
    public static final LifecycleCallbacksHandler$LifeCycle onActivityDestroyed;
    public static final LifecycleCallbacksHandler$LifeCycle onActivityPaused;
    public static final LifecycleCallbacksHandler$LifeCycle onActivityResumed;
    public static final LifecycleCallbacksHandler$LifeCycle onActivitySaveInstanceState;
    public static final LifecycleCallbacksHandler$LifeCycle onActivityStarted;
    public static final LifecycleCallbacksHandler$LifeCycle onActivityStopped;

    public static final LifecycleCallbacksHandler$LifeCycle[] $values(){
       LifecycleCallbacksHandler$LifeCycle[] lifeCycleArr = new LifecycleCallbacksHandler$LifeCycle[]{LifecycleCallbacksHandler$LifeCycle.onActivityCreated,LifecycleCallbacksHandler$LifeCycle.onActivityStarted,LifecycleCallbacksHandler$LifeCycle.onActivityResumed,LifecycleCallbacksHandler$LifeCycle.onActivityPaused,LifecycleCallbacksHandler$LifeCycle.onActivityStopped,LifecycleCallbacksHandler$LifeCycle.onActivitySaveInstanceState,LifecycleCallbacksHandler$LifeCycle.onActivityDestroyed};
       return lifeCycleArr;
    }
    static {
       LifecycleCallbacksHandler$LifeCycle.onActivityCreated = new LifecycleCallbacksHandler$LifeCycle("onActivityCreated", 0);
       LifecycleCallbacksHandler$LifeCycle.onActivityStarted = new LifecycleCallbacksHandler$LifeCycle("onActivityStarted", 1);
       LifecycleCallbacksHandler$LifeCycle.onActivityResumed = new LifecycleCallbacksHandler$LifeCycle("onActivityResumed", 2);
       LifecycleCallbacksHandler$LifeCycle.onActivityPaused = new LifecycleCallbacksHandler$LifeCycle("onActivityPaused", 3);
       LifecycleCallbacksHandler$LifeCycle.onActivityStopped = new LifecycleCallbacksHandler$LifeCycle("onActivityStopped", 4);
       LifecycleCallbacksHandler$LifeCycle.onActivitySaveInstanceState = new LifecycleCallbacksHandler$LifeCycle("onActivitySaveInstanceState", 5);
       LifecycleCallbacksHandler$LifeCycle.onActivityDestroyed = new LifecycleCallbacksHandler$LifeCycle("onActivityDestroyed", 6);
       LifecycleCallbacksHandler$LifeCycle.$VALUES = LifecycleCallbacksHandler$LifeCycle.$values();
    }
    public void LifecycleCallbacksHandler$LifeCycle(String p0,int p1){
       super(p0, p1);
    }
    public static LifecycleCallbacksHandler$LifeCycle valueOf(String p0){
       return Enum.valueOf(LifecycleCallbacksHandler$LifeCycle.class, p0);
    }
    public static LifecycleCallbacksHandler$LifeCycle[] values(){
       return LifecycleCallbacksHandler$LifeCycle.$VALUES.clone();
    }
}
