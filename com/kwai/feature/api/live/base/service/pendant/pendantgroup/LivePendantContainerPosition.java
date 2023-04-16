package com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerPosition;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePendantContainerPosition extends Enum	// class@000f9c
{
    public int flag;
    public static final LivePendantContainerPosition[] $VALUES;
    public static final LivePendantContainerPosition BOTTOM;
    public static final LivePendantContainerPosition TOP;

    static {
       LivePendantContainerPosition livePendantC = new LivePendantContainerPosition("TOP", 0, 1);
       LivePendantContainerPosition.TOP = livePendantC;
       LivePendantContainerPosition livePendantC1 = new LivePendantContainerPosition("BOTTOM", 1, 2);
       LivePendantContainerPosition.BOTTOM = livePendantC1;
       LivePendantContainerPosition[] livePendantC2 = new LivePendantContainerPosition[]{livePendantC,livePendantC1};
       LivePendantContainerPosition.$VALUES = livePendantC2;
    }
    public void LivePendantContainerPosition(String p0,int p1,int p2){
       super(p0, p1);
       this.flag = p2;
    }
    public static LivePendantContainerPosition valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePendantContainerPosition.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePendantContainerPosition.class, p0);
    }
    public static LivePendantContainerPosition[] values(){
       Object obj = PatchProxy.apply(null, null, LivePendantContainerPosition.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePendantContainerPosition.$VALUES.clone();
    }
}
