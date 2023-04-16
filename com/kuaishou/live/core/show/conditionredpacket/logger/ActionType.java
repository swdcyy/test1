package com.kuaishou.live.core.show.conditionredpacket.logger.ActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ActionType extends Enum	// class@000aa8
{
    public final int type;
    public static final ActionType[] $VALUES;
    public static final ActionType DEFAULT;
    public static final ActionType TASK;

    static {
       ActionType uActionType;
       ActionType[] uActionTypeA = new ActionType[]{uActionType,uActionType};
       uActionType = new ActionType("DEFAULT", 0, 0);
       ActionType.DEFAULT = uActionType;
       uActionType = new ActionType("TASK", 1, 1);
       ActionType.TASK = uActionType;
       ActionType.$VALUES = uActionTypeA;
    }
    public void ActionType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static ActionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ActionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ActionType.class, p0);
    }
    public static ActionType[] values(){
       Object obj = PatchProxy.apply(null, null, ActionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActionType.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
