package com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantHideReason;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePendantHideReason extends Enum	// class@000f9e
{
    public final int mReason;
    public static final LivePendantHideReason[] $VALUES;
    public static final LivePendantHideReason CONTAINER_HEIGHT_NOT_ENOUGH;
    public static final LivePendantHideReason CONTAINER_NOT_VISIBLE;
    public static final LivePendantHideReason INCOMPATIBLE;
    public static final LivePendantHideReason REMOVED;

    static {
       LivePendantHideReason livePendantH = new LivePendantHideReason("REMOVED", 0, 0);
       LivePendantHideReason.REMOVED = livePendantH;
       LivePendantHideReason livePendantH1 = new LivePendantHideReason("CONTAINER_NOT_VISIBLE", 1, 1);
       LivePendantHideReason.CONTAINER_NOT_VISIBLE = livePendantH1;
       LivePendantHideReason livePendantH2 = new LivePendantHideReason("INCOMPATIBLE", 2, 2);
       LivePendantHideReason.INCOMPATIBLE = livePendantH2;
       LivePendantHideReason livePendantH3 = new LivePendantHideReason("CONTAINER_HEIGHT_NOT_ENOUGH", 3, 3);
       LivePendantHideReason.CONTAINER_HEIGHT_NOT_ENOUGH = livePendantH3;
       LivePendantHideReason[] livePendantH4 = new LivePendantHideReason[]{livePendantH,livePendantH1,livePendantH2,livePendantH3};
       LivePendantHideReason.$VALUES = livePendantH4;
    }
    public void LivePendantHideReason(String p0,int p1,int p2){
       super(p0, p1);
       this.mReason = p2;
    }
    public static LivePendantHideReason valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePendantHideReason.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePendantHideReason.class, p0);
    }
    public static LivePendantHideReason[] values(){
       Object obj = PatchProxy.apply(null, null, LivePendantHideReason.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePendantHideReason.$VALUES.clone();
    }
    public int getReason(){
       return this.mReason;
    }
}
