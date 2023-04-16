package com.kuaishou.live.common.core.component.chat.model.ChatInfo$RoleType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class ChatInfo$RoleType extends Enum	// class@001041
{
    public static final ChatInfo$RoleType[] $VALUES;
    public static final ChatInfo$RoleType AUDIENCE;
    public static final ChatInfo$RoleType GUEST;

    static {
       ChatInfo$RoleType roleType = new ChatInfo$RoleType("AUDIENCE", 0);
       ChatInfo$RoleType.AUDIENCE = roleType;
       ChatInfo$RoleType roleType1 = new ChatInfo$RoleType("GUEST", 1);
       ChatInfo$RoleType.GUEST = roleType1;
       ChatInfo$RoleType[] roleTypeArra = new ChatInfo$RoleType[]{roleType,roleType1};
       ChatInfo$RoleType.$VALUES = roleTypeArra;
    }
    public void ChatInfo$RoleType(String p0,int p1){
       super(p0, p1);
    }
    public static ChatInfo$RoleType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ChatInfo$RoleType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(ChatInfo$RoleType.class, p0);
    }
    public static ChatInfo$RoleType[] values(){
       Object obj = PatchProxy.apply(null, null, ChatInfo$RoleType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ChatInfo$RoleType.$VALUES.clone();
    }
}
