package com.kuaishou.live.core.show.enterroom.floatingscreen.framework.task.LiveQueueTaskState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveQueueTaskState extends Enum	// class@000b12
{
    public static final LiveQueueTaskState[] $VALUES;
    public static final LiveQueueTaskState CANCELED;
    public static final LiveQueueTaskState END;
    public static final LiveQueueTaskState INIT;
    public static final LiveQueueTaskState READY;
    public static final LiveQueueTaskState RUNNING;

    static {
       LiveQueueTaskState liveQueueTas1;
       LiveQueueTaskState[] liveQueueTas = new LiveQueueTaskState[]{liveQueueTas1,liveQueueTas1,liveQueueTas1,liveQueueTas1,liveQueueTas1};
       liveQueueTas1 = new LiveQueueTaskState("INIT", 0);
       LiveQueueTaskState.INIT = liveQueueTas1;
       liveQueueTas1 = new LiveQueueTaskState("READY", 1);
       LiveQueueTaskState.READY = liveQueueTas1;
       liveQueueTas1 = new LiveQueueTaskState("RUNNING", 2);
       LiveQueueTaskState.RUNNING = liveQueueTas1;
       liveQueueTas1 = new LiveQueueTaskState("END", 3);
       LiveQueueTaskState.END = liveQueueTas1;
       liveQueueTas1 = new LiveQueueTaskState("CANCELED", 4);
       LiveQueueTaskState.CANCELED = liveQueueTas1;
       LiveQueueTaskState.$VALUES = liveQueueTas;
    }
    public void LiveQueueTaskState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveQueueTaskState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveQueueTaskState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveQueueTaskState.class, p0);
    }
    public static LiveQueueTaskState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveQueueTaskState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveQueueTaskState.$VALUES.clone();
    }
}
