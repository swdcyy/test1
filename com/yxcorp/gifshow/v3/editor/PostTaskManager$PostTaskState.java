package com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class PostTaskManager$PostTaskState extends Enum	// class@000d98
{
    public static final PostTaskManager$PostTaskState[] $VALUES;
    public static final PostTaskManager$PostTaskState FAILED;
    public static final PostTaskManager$PostTaskState IDLE;
    public static final PostTaskManager$PostTaskState LOADING;
    public static final PostTaskManager$PostTaskState SUCCESS;

    static {
       PostTaskManager$PostTaskState postTaskStat1;
       PostTaskManager$PostTaskState[] postTaskStat = new PostTaskManager$PostTaskState[]{postTaskStat1,postTaskStat1,postTaskStat1,postTaskStat1};
       postTaskStat1 = new PostTaskManager$PostTaskState("IDLE", 0);
       PostTaskManager$PostTaskState.IDLE = postTaskStat1;
       postTaskStat1 = new PostTaskManager$PostTaskState("LOADING", 1);
       PostTaskManager$PostTaskState.LOADING = postTaskStat1;
       postTaskStat1 = new PostTaskManager$PostTaskState("SUCCESS", 2);
       PostTaskManager$PostTaskState.SUCCESS = postTaskStat1;
       postTaskStat1 = new PostTaskManager$PostTaskState("FAILED", 3);
       PostTaskManager$PostTaskState.FAILED = postTaskStat1;
       PostTaskManager$PostTaskState.$VALUES = postTaskStat;
    }
    public void PostTaskManager$PostTaskState(String p0,int p1){
       super(p0, p1);
    }
    public static PostTaskManager$PostTaskState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PostTaskManager$PostTaskState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(PostTaskManager$PostTaskState.class, p0);
    }
    public static PostTaskManager$PostTaskState[] values(){
       Object obj = PatchProxy.apply(null, null, PostTaskManager$PostTaskState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PostTaskManager$PostTaskState.$VALUES.clone();
    }
}
