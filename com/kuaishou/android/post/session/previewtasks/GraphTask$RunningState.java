package com.kuaishou.android.post.session.previewtasks.GraphTask$RunningState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GraphTask$RunningState extends Enum	// class@000eb5
{
    public static final GraphTask$RunningState[] $VALUES;
    public static final GraphTask$RunningState ERROR;
    public static final GraphTask$RunningState IDLE;
    public static final GraphTask$RunningState RELEASED;
    public static final GraphTask$RunningState RUNNING;
    public static final GraphTask$RunningState SUCCESS;

    static {
       GraphTask$RunningState runningState = new GraphTask$RunningState("IDLE", 0);
       GraphTask$RunningState.IDLE = runningState;
       GraphTask$RunningState runningState1 = new GraphTask$RunningState("RUNNING", 1);
       GraphTask$RunningState.RUNNING = runningState1;
       GraphTask$RunningState runningState2 = new GraphTask$RunningState("SUCCESS", 2);
       GraphTask$RunningState.SUCCESS = runningState2;
       GraphTask$RunningState runningState3 = new GraphTask$RunningState("ERROR", 3);
       GraphTask$RunningState.ERROR = runningState3;
       GraphTask$RunningState runningState4 = new GraphTask$RunningState("RELEASED", 4);
       GraphTask$RunningState.RELEASED = runningState4;
       GraphTask$RunningState[] runningState5 = new GraphTask$RunningState[]{runningState,runningState1,runningState2,runningState3,runningState4};
       GraphTask$RunningState.$VALUES = runningState5;
    }
    public void GraphTask$RunningState(String p0,int p1){
       super(p0, p1);
    }
    public static GraphTask$RunningState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GraphTask$RunningState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GraphTask$RunningState.class, p0);
    }
    public static GraphTask$RunningState[] values(){
       Object obj = PatchProxy.apply(null, null, GraphTask$RunningState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GraphTask$RunningState.$VALUES.clone();
    }
}
