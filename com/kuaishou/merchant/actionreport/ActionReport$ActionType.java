package com.kuaishou.merchant.actionreport.ActionReport$ActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ActionReport$ActionType extends Enum	// class@0014c9
{
    public int action;
    public static final ActionReport$ActionType[] $VALUES;
    public static final ActionReport$ActionType CLOSE;
    public static final ActionReport$ActionType NONE;
    public static final ActionReport$ActionType SHOW;

    static {
       ActionReport$ActionType uActionType;
       ActionReport$ActionType[] uActionTypeA = new ActionReport$ActionType[]{uActionType,uActionType,uActionType};
       uActionType = new ActionReport$ActionType("NONE", 0, 0);
       ActionReport$ActionType.NONE = uActionType;
       uActionType = new ActionReport$ActionType("SHOW", 1, 1);
       ActionReport$ActionType.SHOW = uActionType;
       uActionType = new ActionReport$ActionType("CLOSE", 2, 2);
       ActionReport$ActionType.CLOSE = uActionType;
       ActionReport$ActionType.$VALUES = uActionTypeA;
    }
    public void ActionReport$ActionType(String p0,int p1,int p2){
       super(p0, p1);
       this.action = p2;
    }
    public static ActionReport$ActionType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ActionReport$ActionType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ActionReport$ActionType.class, p0);
    }
    public static ActionReport$ActionType[] values(){
       Object obj = PatchProxy.apply(null, null, ActionReport$ActionType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActionReport$ActionType.$VALUES.clone();
    }
    public final int getAction(){
       return this.action;
    }
    public final void setAction(int p0){
       this.action = p0;
    }
}
