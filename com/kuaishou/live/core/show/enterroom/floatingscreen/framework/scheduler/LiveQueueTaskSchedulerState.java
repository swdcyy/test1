package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.scheduler.LiveQueueTaskSchedulerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveQueueTaskSchedulerState extends Enum	// class@000b0d
{
    public static final LiveQueueTaskSchedulerState[] $VALUES;
    public static final LiveQueueTaskSchedulerState EXECUTING;
    public static final LiveQueueTaskSchedulerState RUNNABLE;
    public static final LiveQueueTaskSchedulerState WAITING;

    static {
       LiveQueueTaskSchedulerState liveQueueTas1;
       LiveQueueTaskSchedulerState[] liveQueueTas = new LiveQueueTaskSchedulerState[]{liveQueueTas1,liveQueueTas1,liveQueueTas1};
       liveQueueTas1 = new LiveQueueTaskSchedulerState("EXECUTING", 0);
       LiveQueueTaskSchedulerState.EXECUTING = liveQueueTas1;
       liveQueueTas1 = new LiveQueueTaskSchedulerState("WAITING", 1);
       LiveQueueTaskSchedulerState.WAITING = liveQueueTas1;
       liveQueueTas1 = new LiveQueueTaskSchedulerState("RUNNABLE", 2);
       LiveQueueTaskSchedulerState.RUNNABLE = liveQueueTas1;
       LiveQueueTaskSchedulerState.$VALUES = liveQueueTas;
    }
    public void LiveQueueTaskSchedulerState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveQueueTaskSchedulerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveQueueTaskSchedulerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveQueueTaskSchedulerState.class, p0);
    }
    public static LiveQueueTaskSchedulerState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveQueueTaskSchedulerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQueueTaskSchedulerState.$VALUES.clone();
    }
}
