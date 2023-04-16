package com.kuaishou.live.core.basic.model.LiveSubscribeBookStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveSubscribeBookStatus extends Enum	// class@000887
{
    public static final LiveSubscribeBookStatus[] $VALUES;
    public static final LiveSubscribeBookStatus BOOKED;
    public static final LiveSubscribeBookStatus NOT_BOOK;
    public static final LiveSubscribeBookStatus UNKNOWN;

    static {
       LiveSubscribeBookStatus liveSubscrib = new LiveSubscribeBookStatus("UNKNOWN", 0);
       LiveSubscribeBookStatus.UNKNOWN = liveSubscrib;
       LiveSubscribeBookStatus liveSubscrib1 = new LiveSubscribeBookStatus("BOOKED", 1);
       LiveSubscribeBookStatus.BOOKED = liveSubscrib1;
       LiveSubscribeBookStatus liveSubscrib2 = new LiveSubscribeBookStatus("NOT_BOOK", 2);
       LiveSubscribeBookStatus.NOT_BOOK = liveSubscrib2;
       LiveSubscribeBookStatus[] liveSubscrib3 = new LiveSubscribeBookStatus[]{liveSubscrib,liveSubscrib1,liveSubscrib2};
       LiveSubscribeBookStatus.$VALUES = liveSubscrib3;
    }
    public void LiveSubscribeBookStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveSubscribeBookStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveSubscribeBookStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveSubscribeBookStatus.class, p0);
    }
    public static LiveSubscribeBookStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveSubscribeBookStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveSubscribeBookStatus.$VALUES.clone();
    }
}
