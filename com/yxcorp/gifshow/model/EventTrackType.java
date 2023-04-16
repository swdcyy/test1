package com.yxcorp.gifshow.model.EventTrackType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EventTrackType extends Enum	// class@001e07
{
    public final int type;
    public static final EventTrackType[] $VALUES;
    public static final EventTrackType CLOSE_TYPE;
    public static final EventTrackType DIS_SATISFY_TYPE;
    public static final EventTrackType NOT_SURE_TYPE;
    public static final EventTrackType SATISFY_TYPE;
    public static final EventTrackType SHOW_TYPE;

    static {
       EventTrackType uEventTrackT1;
       EventTrackType[] uEventTrackT = new EventTrackType[]{uEventTrackT1,uEventTrackT1,uEventTrackT1,uEventTrackT1,uEventTrackT1};
       uEventTrackT1 = new EventTrackType("SHOW_TYPE", 0, 1);
       EventTrackType.SHOW_TYPE = uEventTrackT1;
       uEventTrackT1 = new EventTrackType("SATISFY_TYPE", 1, 0);
       EventTrackType.SATISFY_TYPE = uEventTrackT1;
       uEventTrackT1 = new EventTrackType("DIS_SATISFY_TYPE", 2, 0);
       EventTrackType.DIS_SATISFY_TYPE = uEventTrackT1;
       uEventTrackT1 = new EventTrackType("CLOSE_TYPE", 3, 3);
       EventTrackType.CLOSE_TYPE = uEventTrackT1;
       uEventTrackT1 = new EventTrackType("NOT_SURE_TYPE", 4, 0);
       EventTrackType.NOT_SURE_TYPE = uEventTrackT1;
       EventTrackType.$VALUES = uEventTrackT;
    }
    public void EventTrackType(String p0,int p1,int p2){
       super(p0, p1);
       this.type = p2;
    }
    public static EventTrackType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EventTrackType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(EventTrackType.class, p0);
    }
    public static EventTrackType[] values(){
       Object obj = PatchProxy.apply(null, null, EventTrackType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EventTrackType.$VALUES.clone();
    }
    public final int getType(){
       return this.type;
    }
}
