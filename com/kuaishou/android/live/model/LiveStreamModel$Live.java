package com.kuaishou.android.live.model.LiveStreamModel$Live;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveStreamModel$Live extends Enum	// class@000813
{
    public static final LiveStreamModel$Live[] $VALUES;
    public static final LiveStreamModel$Live FREE_LIVE;
    public static final LiveStreamModel$Live PAID_LIVE;

    static {
       LiveStreamModel$Live live = new LiveStreamModel$Live("FREE_LIVE", 0);
       LiveStreamModel$Live.FREE_LIVE = live;
       LiveStreamModel$Live live1 = new LiveStreamModel$Live("PAID_LIVE", 1);
       LiveStreamModel$Live.PAID_LIVE = live1;
       LiveStreamModel$Live[] liveArray = new LiveStreamModel$Live[]{live,live1};
       LiveStreamModel$Live.$VALUES = liveArray;
    }
    public void LiveStreamModel$Live(String p0,int p1){
       super(p0, p1);
    }
    public static LiveStreamModel$Live valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveStreamModel$Live.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveStreamModel$Live.class, p0);
    }
    public static LiveStreamModel$Live[] values(){
       Object obj = PatchProxy.apply(null, null, LiveStreamModel$Live.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveStreamModel$Live.$VALUES.clone();
    }
}
