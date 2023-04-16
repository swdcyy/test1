package com.yxcorp.gifshow.detail.player.panel.elements.ActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ActionType extends Enum	// class@001627
{
    public static final ActionType[] $VALUES;
    public static final ActionType ACCESSIBILITY;
    public static final ActionType MIRROR;
    public static final ActionType SAVE_TRAFFIC;
    public static final ActionType SMALL_WINDOW;
    public static final ActionType SOUND_EFFECT;

    static {
       ActionType uActionType;
       ActionType[] uActionTypeA = new ActionType[]{uActionType,uActionType,uActionType,uActionType,uActionType};
       uActionType = new ActionType("ACCESSIBILITY", 0);
       ActionType.ACCESSIBILITY = uActionType;
       uActionType = new ActionType("MIRROR", 1);
       ActionType.MIRROR = uActionType;
       uActionType = new ActionType("SOUND_EFFECT", 2);
       ActionType.SOUND_EFFECT = uActionType;
       uActionType = new ActionType("SAVE_TRAFFIC", 3);
       ActionType.SAVE_TRAFFIC = uActionType;
       uActionType = new ActionType("SMALL_WINDOW", 4);
       ActionType.SMALL_WINDOW = uActionType;
       ActionType.$VALUES = uActionTypeA;
    }
    public void ActionType(String p0,int p1){
       super(p0, p1);
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
}
