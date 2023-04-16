package com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ActionStatus extends Enum	// class@000aa7
{
    public final String status;
    public static final ActionStatus[] $VALUES;
    public static final ActionStatus FAIL;
    public static final ActionStatus START;
    public static final ActionStatus SUCCESS;

    static {
       ActionStatus uActionStatu1;
       ActionStatus[] uActionStatu = new ActionStatus[]{uActionStatu1,uActionStatu1,uActionStatu1};
       uActionStatu1 = new ActionStatus("START", 0, "start");
       ActionStatus.START = uActionStatu1;
       uActionStatu1 = new ActionStatus("SUCCESS", 1, "success");
       ActionStatus.SUCCESS = uActionStatu1;
       uActionStatu1 = new ActionStatus("FAIL", 2, "fail");
       ActionStatus.FAIL = uActionStatu1;
       ActionStatus.$VALUES = uActionStatu;
    }
    public void ActionStatus(String p0,int p1,String p2){
       super(p0, p1);
       this.status = p2;
    }
    public static ActionStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ActionStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ActionStatus.class, p0);
    }
    public static ActionStatus[] values(){
       Object obj = PatchProxy.apply(null, null, ActionStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActionStatus.$VALUES.clone();
    }
    public final String getStatus(){
       return this.status;
    }
}
