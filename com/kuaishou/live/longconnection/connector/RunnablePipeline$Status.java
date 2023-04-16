package com.kuaishou.live.longconnection.connector.RunnablePipeline$Status;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class RunnablePipeline$Status extends Enum	// class@000c56
{
    public static final RunnablePipeline$Status[] $VALUES;
    public static final RunnablePipeline$Status IDLE;
    public static final RunnablePipeline$Status RUNNING;
    public static final RunnablePipeline$Status WAIT;

    static {
       RunnablePipeline$Status status = new RunnablePipeline$Status("IDLE", 0);
       RunnablePipeline$Status.IDLE = status;
       RunnablePipeline$Status status1 = new RunnablePipeline$Status("WAIT", 1);
       RunnablePipeline$Status.WAIT = status1;
       RunnablePipeline$Status status2 = new RunnablePipeline$Status("RUNNING", 2);
       RunnablePipeline$Status.RUNNING = status2;
       RunnablePipeline$Status[] statusArray = new RunnablePipeline$Status[]{status,status1,status2};
       RunnablePipeline$Status.$VALUES = statusArray;
    }
    public void RunnablePipeline$Status(String p0,int p1){
       super(p0, p1);
    }
    public static RunnablePipeline$Status valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, RunnablePipeline$Status.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(RunnablePipeline$Status.class, p0);
    }
    public static RunnablePipeline$Status[] values(){
       Object obj = PatchProxy.apply(null, null, RunnablePipeline$Status.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return RunnablePipeline$Status.$VALUES.clone();
    }
}
