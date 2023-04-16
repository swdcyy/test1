package com.kuaishou.live.core.show.subscribe.plc.LiveSubscribeHalfDialogEvent$EventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveSubscribeHalfDialogEvent$EventType extends Enum	// class@001158
{
    public static final LiveSubscribeHalfDialogEvent$EventType[] $VALUES;
    public static final LiveSubscribeHalfDialogEvent$EventType FOLLOW_SUCCESS;
    public static final LiveSubscribeHalfDialogEvent$EventType SUBSCRIBE_SUCCESS;
    public static final LiveSubscribeHalfDialogEvent$EventType UNFOLLOW_SUCCESS;
    public static final LiveSubscribeHalfDialogEvent$EventType UNSUBSCRIBE_SUCCESS;

    static {
       LiveSubscribeHalfDialogEvent$EventType uEventType = new LiveSubscribeHalfDialogEvent$EventType("SUBSCRIBE_SUCCESS", 0);
       LiveSubscribeHalfDialogEvent$EventType.SUBSCRIBE_SUCCESS = uEventType;
       LiveSubscribeHalfDialogEvent$EventType uEventType1 = new LiveSubscribeHalfDialogEvent$EventType("UNSUBSCRIBE_SUCCESS", 1);
       LiveSubscribeHalfDialogEvent$EventType.UNSUBSCRIBE_SUCCESS = uEventType1;
       LiveSubscribeHalfDialogEvent$EventType uEventType2 = new LiveSubscribeHalfDialogEvent$EventType("FOLLOW_SUCCESS", 2);
       LiveSubscribeHalfDialogEvent$EventType.FOLLOW_SUCCESS = uEventType2;
       LiveSubscribeHalfDialogEvent$EventType uEventType3 = new LiveSubscribeHalfDialogEvent$EventType("UNFOLLOW_SUCCESS", 3);
       LiveSubscribeHalfDialogEvent$EventType.UNFOLLOW_SUCCESS = uEventType3;
       LiveSubscribeHalfDialogEvent$EventType[] uEventTypeAr = new LiveSubscribeHalfDialogEvent$EventType[]{uEventType,uEventType1,uEventType2,uEventType3};
       LiveSubscribeHalfDialogEvent$EventType.$VALUES = uEventTypeAr;
    }
    public void LiveSubscribeHalfDialogEvent$EventType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveSubscribeHalfDialogEvent$EventType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveSubscribeHalfDialogEvent$EventType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveSubscribeHalfDialogEvent$EventType.class, p0);
    }
    public static LiveSubscribeHalfDialogEvent$EventType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveSubscribeHalfDialogEvent$EventType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveSubscribeHalfDialogEvent$EventType.$VALUES.clone();
    }
}
