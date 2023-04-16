package com.kwai.feature.api.live.service.basic.model.LiveStreamStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ekd.n0;

public final class LiveStreamStatus extends Enum	// class@001009
{
    public static final LiveStreamStatus[] $VALUES;
    public static final LiveStreamStatus AVAILABLE;
    public static final LiveStreamStatus BANNED;
    public static final LiveStreamStatus FORCE_REQUEST_PERMISSION;
    public static final LiveStreamStatus HIDDEN;
    public static final LiveStreamStatus LOCKED;
    public static final LiveStreamStatus VOICEPARTY;

    static {
       LiveStreamStatus liveStreamSt = new LiveStreamStatus("HIDDEN", 0);
       LiveStreamStatus.HIDDEN = liveStreamSt;
       LiveStreamStatus liveStreamSt1 = new LiveStreamStatus("FORCE_REQUEST_PERMISSION", 1);
       LiveStreamStatus.FORCE_REQUEST_PERMISSION = liveStreamSt1;
       LiveStreamStatus liveStreamSt2 = new LiveStreamStatus("BANNED", 2);
       LiveStreamStatus.BANNED = liveStreamSt2;
       LiveStreamStatus liveStreamSt3 = new LiveStreamStatus("LOCKED", 3);
       LiveStreamStatus.LOCKED = liveStreamSt3;
       LiveStreamStatus liveStreamSt4 = new LiveStreamStatus("AVAILABLE", 4);
       LiveStreamStatus.AVAILABLE = liveStreamSt4;
       LiveStreamStatus liveStreamSt5 = new LiveStreamStatus("VOICEPARTY", 5);
       LiveStreamStatus.VOICEPARTY = liveStreamSt5;
       LiveStreamStatus[] liveStreamSt6 = new LiveStreamStatus[]{liveStreamSt,liveStreamSt1,liveStreamSt2,liveStreamSt3,liveStreamSt4,liveStreamSt5};
       LiveStreamStatus.$VALUES = liveStreamSt6;
    }
    public void LiveStreamStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveStreamStatus parseFrom(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveStreamStatus.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return LiveStreamStatus.valueOf(n0.e(p0));
       }catch(java.lang.Exception e0){
          return LiveStreamStatus.HIDDEN;
       }
    }
    public static LiveStreamStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveStreamStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveStreamStatus.class, p0);
    }
    public static LiveStreamStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveStreamStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveStreamStatus.$VALUES.clone();
    }
}
