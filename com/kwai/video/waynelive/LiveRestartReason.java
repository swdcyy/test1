package com.kwai.video.waynelive.LiveRestartReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveRestartReason extends Enum	// class@000ddb
{
    public static final LiveRestartReason[] $VALUES;
    public static final LiveRestartReason ANCHOR_FALL_BACK;
    public static final LiveRestartReason DEFAULT;
    public static final LiveRestartReason PULL_STREAM_FAIL;
    public static final LiveRestartReason UPDATE_FULL_CONFIG;

    static {
       LiveRestartReason liveRestartR = new LiveRestartReason("DEFAULT", 0);
       LiveRestartReason.DEFAULT = liveRestartR;
       LiveRestartReason liveRestartR1 = new LiveRestartReason("ANCHOR_FALL_BACK", 1);
       LiveRestartReason.ANCHOR_FALL_BACK = liveRestartR1;
       LiveRestartReason liveRestartR2 = new LiveRestartReason("PULL_STREAM_FAIL", 2);
       LiveRestartReason.PULL_STREAM_FAIL = liveRestartR2;
       LiveRestartReason liveRestartR3 = new LiveRestartReason("UPDATE_FULL_CONFIG", 3);
       LiveRestartReason.UPDATE_FULL_CONFIG = liveRestartR3;
       LiveRestartReason[] liveRestartR4 = new LiveRestartReason[]{liveRestartR,liveRestartR1,liveRestartR2,liveRestartR3};
       LiveRestartReason.$VALUES = liveRestartR4;
    }
    public void LiveRestartReason(String p0,int p1){
       super(p0, p1);
    }
    public static LiveRestartReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveRestartReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveRestartReason.class, p0);
    }
    public static LiveRestartReason[] values(){
       Object obj = PatchProxy.apply(null, null, LiveRestartReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveRestartReason.$VALUES.clone();
    }
}
