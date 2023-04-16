package com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;

public final class LiveApiParams$AssistantType extends Enum	// class@000ca1
{
    public static final LiveApiParams$AssistantType[] $VALUES;
    public static final LiveApiParams$AssistantType ADMIN;
    public static final LiveApiParams$AssistantType AUDIENCE;
    public static final LiveApiParams$AssistantType PUSHER;
    public static final LiveApiParams$AssistantType SUPER_ADMIN;

    static {
       LiveApiParams$AssistantType uAssistantTy = new LiveApiParams$AssistantType("AUDIENCE", 0);
       LiveApiParams$AssistantType.AUDIENCE = uAssistantTy;
       LiveApiParams$AssistantType uAssistantTy1 = new LiveApiParams$AssistantType("SUPER_ADMIN", 1);
       LiveApiParams$AssistantType.SUPER_ADMIN = uAssistantTy1;
       LiveApiParams$AssistantType uAssistantTy2 = new LiveApiParams$AssistantType("ADMIN", 2);
       LiveApiParams$AssistantType.ADMIN = uAssistantTy2;
       LiveApiParams$AssistantType uAssistantTy3 = new LiveApiParams$AssistantType("PUSHER", 3);
       LiveApiParams$AssistantType.PUSHER = uAssistantTy3;
       LiveApiParams$AssistantType[] uAssistantTy4 = new LiveApiParams$AssistantType[]{uAssistantTy,uAssistantTy1,uAssistantTy2,uAssistantTy3};
       LiveApiParams$AssistantType.$VALUES = uAssistantTy4;
    }
    public void LiveApiParams$AssistantType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveApiParams$AssistantType fromInt(int p0){
       LiveApiParams$AssistantType[] obj;
       LiveApiParams$AssistantType uAssistantTy = LiveApiParams$AssistantType.class;
       if (PatchProxy.isSupport(uAssistantTy)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uAssistantTy, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = LiveApiParams$AssistantType.values();
       if (p0 >= 0 && p0 < obj.length) {
          return LiveApiParams$AssistantType.values()[p0];
       }else {
          return LiveApiParams$AssistantType.AUDIENCE;
       }
    }
    public static LiveApiParams$AssistantType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveApiParams$AssistantType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveApiParams$AssistantType.class, p0);
    }
    public static LiveApiParams$AssistantType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveApiParams$AssistantType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveApiParams$AssistantType.$VALUES.clone();
    }
    public boolean isAdmin(){
       boolean b = (this == LiveApiParams$AssistantType.SUPER_ADMIN || this == LiveApiParams$AssistantType.ADMIN)? true: false;
       return b;
    }
    public boolean isAnchor(){
       boolean b = (this == LiveApiParams$AssistantType.PUSHER)? true: false;
       return b;
    }
    public boolean isAudience(){
       boolean b = (this == LiveApiParams$AssistantType.AUDIENCE)? true: false;
       return b;
    }
    public boolean isNormalAdmin(){
       boolean b = (this == LiveApiParams$AssistantType.ADMIN)? true: false;
       return b;
    }
    public boolean isSuperAdmin(){
       boolean b = (this == LiveApiParams$AssistantType.SUPER_ADMIN)? true: false;
       return b;
    }
}
