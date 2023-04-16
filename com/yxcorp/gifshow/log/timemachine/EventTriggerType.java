package com.yxcorp.gifshow.log.timemachine.EventTriggerType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EventTriggerType extends Enum	// class@001b43
{
    public final String messageType;
    public static final EventTriggerType[] $VALUES;
    public static final EventTriggerType SlideDataSource;
    public static final EventTriggerType SlideDispatcher;
    public static final EventTriggerType UserAction;

    static {
       EventTriggerType uEventTrigge1;
       EventTriggerType[] uEventTrigge = new EventTriggerType[]{uEventTrigge1,uEventTrigge1,uEventTrigge1};
       uEventTrigge1 = new EventTriggerType("SlideDataSource", 0, "SlideDataSource");
       EventTriggerType.SlideDataSource = uEventTrigge1;
       uEventTrigge1 = new EventTriggerType("UserAction", 1, "UserAction");
       EventTriggerType.UserAction = uEventTrigge1;
       uEventTrigge1 = new EventTriggerType("SlideDispatcher", 2, "SlideDispatcher");
       EventTriggerType.SlideDispatcher = uEventTrigge1;
       EventTriggerType.$VALUES = uEventTrigge;
    }
    public void EventTriggerType(String p0,int p1,String p2){
       super(p0, p1);
       this.messageType = p2;
    }
    public static EventTriggerType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EventTriggerType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EventTriggerType.class, p0);
    }
    public static EventTriggerType[] values(){
       Object obj = PatchProxy.apply(null, null, EventTriggerType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EventTriggerType.$VALUES.clone();
    }
    public final String getMessageType(){
       return this.messageType;
    }
}
