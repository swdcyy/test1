package com.kuaishou.android.post.session.previewtasks.GraphTaskExecuteManager$ManagerState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GraphTaskExecuteManager$ManagerState extends Enum	// class@000eb8
{
    public static final GraphTaskExecuteManager$ManagerState[] $VALUES;
    public static final GraphTaskExecuteManager$ManagerState IDLE;
    public static final GraphTaskExecuteManager$ManagerState RELEASED;
    public static final GraphTaskExecuteManager$ManagerState TASKS_ERROR;
    public static final GraphTaskExecuteManager$ManagerState TASKS_RUNNING;
    public static final GraphTaskExecuteManager$ManagerState TASKS_SUCCESS;

    static {
       GraphTaskExecuteManager$ManagerState managerState = new GraphTaskExecuteManager$ManagerState("IDLE", 0);
       GraphTaskExecuteManager$ManagerState.IDLE = managerState;
       GraphTaskExecuteManager$ManagerState managerState1 = new GraphTaskExecuteManager$ManagerState("TASKS_RUNNING", 1);
       GraphTaskExecuteManager$ManagerState.TASKS_RUNNING = managerState1;
       GraphTaskExecuteManager$ManagerState managerState2 = new GraphTaskExecuteManager$ManagerState("TASKS_SUCCESS", 2);
       GraphTaskExecuteManager$ManagerState.TASKS_SUCCESS = managerState2;
       GraphTaskExecuteManager$ManagerState managerState3 = new GraphTaskExecuteManager$ManagerState("TASKS_ERROR", 3);
       GraphTaskExecuteManager$ManagerState.TASKS_ERROR = managerState3;
       GraphTaskExecuteManager$ManagerState managerState4 = new GraphTaskExecuteManager$ManagerState("RELEASED", 4);
       GraphTaskExecuteManager$ManagerState.RELEASED = managerState4;
       GraphTaskExecuteManager$ManagerState[] managerState5 = new GraphTaskExecuteManager$ManagerState[]{managerState,managerState1,managerState2,managerState3,managerState4};
       GraphTaskExecuteManager$ManagerState.$VALUES = managerState5;
    }
    public void GraphTaskExecuteManager$ManagerState(String p0,int p1){
       super(p0, p1);
    }
    public static GraphTaskExecuteManager$ManagerState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GraphTaskExecuteManager$ManagerState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(GraphTaskExecuteManager$ManagerState.class, p0);
    }
    public static GraphTaskExecuteManager$ManagerState[] values(){
       Object obj = PatchProxy.apply(null, null, GraphTaskExecuteManager$ManagerState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GraphTaskExecuteManager$ManagerState.$VALUES.clone();
    }
}
