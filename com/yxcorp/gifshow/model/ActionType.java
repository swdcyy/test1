package com.yxcorp.gifshow.model.ActionType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ActionType extends Enum	// class@001deb
{
    public static final ActionType[] $VALUES;
    public static final ActionType DOWNLOAD;
    public static final ActionType INNER_REDIRECT;
    public static final ActionType JS_CALLBACK;
    public static final ActionType QQ_FRIENDS;
    public static final ActionType REPORT;
    public static final ActionType WEB;

    static {
       ActionType uActionType = new ActionType("REPORT", 0);
       ActionType.REPORT = uActionType;
       ActionType uActionType1 = new ActionType("WEB", 1);
       ActionType.WEB = uActionType1;
       ActionType uActionType2 = new ActionType("INNER_REDIRECT", 2);
       ActionType.INNER_REDIRECT = uActionType2;
       ActionType uActionType3 = new ActionType("QQ_FRIENDS", 3);
       ActionType.QQ_FRIENDS = uActionType3;
       ActionType uActionType4 = new ActionType("JS_CALLBACK", 4);
       ActionType.JS_CALLBACK = uActionType4;
       ActionType uActionType5 = new ActionType("DOWNLOAD", 5);
       ActionType.DOWNLOAD = uActionType5;
       ActionType[] uActionTypeA = new ActionType[]{uActionType,uActionType1,uActionType2,uActionType3,uActionType4,uActionType5};
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
