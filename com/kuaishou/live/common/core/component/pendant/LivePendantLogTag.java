package com.kuaishou.live.common.core.component.pendant.LivePendantLogTag;
import pp.c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.kuaishou.android.live.log.a;

public final class LivePendantLogTag extends Enum implements c	// class@0016e9
{
    public final String mName;
    public static final LivePendantLogTag[] $VALUES;
    public static final LivePendantLogTag LIVE_GUEST_ACTIVITY_PENDANT;
    public static final LivePendantLogTag LIVE_PENDANT;
    public static final LivePendantLogTag LIVE_RIGHT_BOTTOM_PENDANT;
    public static final LivePendantLogTag LIVE_RIGHT_TOP_PENDANT;

    static {
       LivePendantLogTag livePendantL = new LivePendantLogTag("LIVE_PENDANT", 0, "LivePendant");
       LivePendantLogTag.LIVE_PENDANT = livePendantL;
       LivePendantLogTag livePendantL1 = new LivePendantLogTag("LIVE_RIGHT_TOP_PENDANT", 1, "LiveRightTopPendant");
       LivePendantLogTag.LIVE_RIGHT_TOP_PENDANT = livePendantL1;
       LivePendantLogTag livePendantL2 = new LivePendantLogTag("LIVE_GUEST_ACTIVITY_PENDANT", 2, "LiveGuestActivity");
       LivePendantLogTag.LIVE_GUEST_ACTIVITY_PENDANT = livePendantL2;
       LivePendantLogTag livePendantL3 = new LivePendantLogTag("LIVE_RIGHT_BOTTOM_PENDANT", 3, "LiveRightBottomPendant");
       LivePendantLogTag.LIVE_RIGHT_BOTTOM_PENDANT = livePendantL3;
       LivePendantLogTag[] livePendantL4 = new LivePendantLogTag[]{livePendantL,livePendantL1,livePendantL2,livePendantL3};
       LivePendantLogTag.$VALUES = livePendantL4;
    }
    public void LivePendantLogTag(String p0,int p1,String p2){
       super(p0, p1);
       this.mName = p2;
    }
    public static LivePendantLogTag valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePendantLogTag.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePendantLogTag.class, p0);
    }
    public static LivePendantLogTag[] values(){
       Object obj = PatchProxy.apply(null, null, LivePendantLogTag.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePendantLogTag.$VALUES.clone();
    }
    public List appendTag(String p0){
       return a.a(this, p0);
    }
    public String getName(){
       return this.mName;
    }
}
