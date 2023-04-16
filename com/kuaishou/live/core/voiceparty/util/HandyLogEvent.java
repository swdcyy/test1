package com.kuaishou.live.core.voiceparty.util.HandyLogEvent;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class HandyLogEvent extends Enum	// class@001ad1
{
    public static final HandyLogEvent[] $VALUES;
    public static final HandyLogEvent CLICK;
    public static final HandyLogEvent SHOW;
    public static final HandyLogEvent TASK;

    static {
       HandyLogEvent handyLogEven1;
       HandyLogEvent[] handyLogEven = new HandyLogEvent[]{handyLogEven1,handyLogEven1,handyLogEven1};
       handyLogEven1 = new HandyLogEvent("SHOW", 0);
       HandyLogEvent.SHOW = handyLogEven1;
       handyLogEven1 = new HandyLogEvent("CLICK", 1);
       HandyLogEvent.CLICK = handyLogEven1;
       handyLogEven1 = new HandyLogEvent("TASK", 2);
       HandyLogEvent.TASK = handyLogEven1;
       HandyLogEvent.$VALUES = handyLogEven;
    }
    public void HandyLogEvent(String p0,int p1){
       super(p0, p1);
    }
    public static HandyLogEvent valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, HandyLogEvent.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(HandyLogEvent.class, p0);
    }
    public static HandyLogEvent[] values(){
       Object obj = PatchProxy.apply(null, null, HandyLogEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return HandyLogEvent.$VALUES.clone();
    }
}
