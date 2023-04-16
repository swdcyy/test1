package com.yxcorp.gifshow.detail.player.panel.smallwindow.ActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ActionType extends Enum	// class@001633
{
    public final int icon;
    public final int requestCode;
    public static final ActionType[] $VALUES;
    public static final ActionType ACTION_SMALL_WINDOW_LAST;
    public static final ActionType ACTION_SMALL_WINDOW_NEXT;
    public static final ActionType ACTION_SMALL_WINDOW_PAUSE;
    public static final ActionType ACTION_SMALL_WINDOW_PLAY;

    static {
       ActionType uActionType;
       ActionType[] uActionTypeA = new ActionType[]{uActionType,uActionType,uActionType,uActionType};
       uActionType = new ActionType("ACTION_SMALL_WINDOW_PLAY", 0, 3600, 0x7f080efd);
       ActionType.ACTION_SMALL_WINDOW_PLAY = uActionType;
       uActionType = new ActionType("ACTION_SMALL_WINDOW_PAUSE", 1, 3601, 0x7f080efc);
       ActionType.ACTION_SMALL_WINDOW_PAUSE = uActionType;
       uActionType = new ActionType("ACTION_SMALL_WINDOW_NEXT", 2, 3602, 0x7f080efb);
       ActionType.ACTION_SMALL_WINDOW_NEXT = uActionType;
       uActionType = new ActionType("ACTION_SMALL_WINDOW_LAST", 3, 3603, 0x7f080efa);
       ActionType.ACTION_SMALL_WINDOW_LAST = uActionType;
       ActionType.$VALUES = uActionTypeA;
    }
    public void ActionType(String p0,int p1,int p2,int p3){
       super(p0, p1);
       this.requestCode = p2;
       this.icon = p3;
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
    public final int getIcon(){
       return this.icon;
    }
    public final int getRequestCode(){
       return this.requestCode;
    }
}
