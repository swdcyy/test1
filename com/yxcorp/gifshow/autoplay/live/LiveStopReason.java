package com.yxcorp.gifshow.autoplay.live.LiveStopReason;
import t99.b0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveStopReason extends Enum implements b0	// class@001c0d
{
    public final int mReason;
    public static final LiveStopReason[] $VALUES;
    public static final LiveStopReason FLOAT_WINDOW_SHOW;
    public static final LiveStopReason LIVE_END;
    public static final LiveStopReason LIVE_HIDE;
    public static final LiveStopReason LOCK_SCREEN;
    public static final LiveStopReason MASK_SHOW;
    public static final LiveStopReason PREVIEW_LIVE_CLICK2_NORMAL_LIVE;
    public static final LiveStopReason SLIDE_AWAY;

    static {
       LiveStopReason liveStopReas = new LiveStopReason("LOCK_SCREEN", 0, 27);
       LiveStopReason.LOCK_SCREEN = liveStopReas;
       LiveStopReason liveStopReas1 = new LiveStopReason("LIVE_HIDE", 1, 7);
       LiveStopReason.LIVE_HIDE = liveStopReas1;
       LiveStopReason liveStopReas2 = new LiveStopReason("SLIDE_AWAY", 2, 15);
       LiveStopReason.SLIDE_AWAY = liveStopReas2;
       LiveStopReason liveStopReas3 = new LiveStopReason("MASK_SHOW", 3, 21);
       LiveStopReason.MASK_SHOW = liveStopReas3;
       LiveStopReason liveStopReas4 = new LiveStopReason("FLOAT_WINDOW_SHOW", 4, 7);
       LiveStopReason.FLOAT_WINDOW_SHOW = liveStopReas4;
       LiveStopReason liveStopReas5 = new LiveStopReason("LIVE_END", 5, 6);
       LiveStopReason.LIVE_END = liveStopReas5;
       LiveStopReason liveStopReas6 = new LiveStopReason("PREVIEW_LIVE_CLICK2_NORMAL_LIVE", 6, 29);
       LiveStopReason.PREVIEW_LIVE_CLICK2_NORMAL_LIVE = liveStopReas6;
       LiveStopReason[] liveStopReas7 = new LiveStopReason[]{liveStopReas,liveStopReas1,liveStopReas2,liveStopReas3,liveStopReas4,liveStopReas5,liveStopReas6};
       LiveStopReason.$VALUES = liveStopReas7;
    }
    public void LiveStopReason(String p0,int p1,int p2){
       super(p0, p1);
       this.mReason = p2;
    }
    public static LiveStopReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveStopReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveStopReason.class, p0);
    }
    public static LiveStopReason[] values(){
       Object obj = PatchProxy.apply(null, null, LiveStopReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveStopReason.$VALUES.clone();
    }
    public int ofReason(){
       return this.mReason;
    }
}
