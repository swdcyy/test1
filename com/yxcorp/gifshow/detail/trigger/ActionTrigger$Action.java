package com.yxcorp.gifshow.detail.trigger.ActionTrigger$Action;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ActionTrigger$Action extends Enum	// class@001a11
{
    public String name;
    public static final ActionTrigger$Action[] $VALUES;
    public static final ActionTrigger$Action COLLECT;
    public static final ActionTrigger$Action COMMENT;
    public static final ActionTrigger$Action DOWNLOAD;
    public static final ActionTrigger$Action FOLLOW;
    public static final ActionTrigger$Action LIKE;
    public static final ActionTrigger$Action REWARD;
    public static final ActionTrigger$Action SHARE;
    public static final ActionTrigger$Action UNKNOWN;

    static {
       ActionTrigger$Action uAction = new ActionTrigger$Action("LIKE", 0, "LIKE");
       ActionTrigger$Action.LIKE = uAction;
       ActionTrigger$Action uAction1 = new ActionTrigger$Action("FOLLOW", 1, "FOLLOW");
       ActionTrigger$Action.FOLLOW = uAction1;
       ActionTrigger$Action uAction2 = new ActionTrigger$Action("COLLECT", 2, "COLLECT");
       ActionTrigger$Action.COLLECT = uAction2;
       ActionTrigger$Action uAction3 = new ActionTrigger$Action("COMMENT", 3, "COMMENT");
       ActionTrigger$Action.COMMENT = uAction3;
       ActionTrigger$Action uAction4 = new ActionTrigger$Action("SHARE", 4, "SHARE");
       ActionTrigger$Action.SHARE = uAction4;
       ActionTrigger$Action uAction5 = new ActionTrigger$Action("REWARD", 5, "REWARD");
       ActionTrigger$Action.REWARD = uAction5;
       ActionTrigger$Action uAction6 = new ActionTrigger$Action("DOWNLOAD", 6, "DOWNLOAD");
       ActionTrigger$Action.DOWNLOAD = uAction6;
       ActionTrigger$Action uAction7 = new ActionTrigger$Action("UNKNOWN", 7, "UNKNOWN");
       ActionTrigger$Action.UNKNOWN = uAction7;
       ActionTrigger$Action[] uActionArray = new ActionTrigger$Action[]{uAction,uAction1,uAction2,uAction3,uAction4,uAction5,uAction6,uAction7};
       ActionTrigger$Action.$VALUES = uActionArray;
    }
    public void ActionTrigger$Action(String p0,int p1,String p2){
       super(p0, p1);
       this.name = p2;
    }
    public static ActionTrigger$Action valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ActionTrigger$Action.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ActionTrigger$Action.class, p0);
    }
    public static ActionTrigger$Action[] values(){
       Object obj = PatchProxy.apply(null, null, ActionTrigger$Action.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ActionTrigger$Action.$VALUES.clone();
    }
}
