package com.kuaishou.live.common.core.component.multipk.game.model.LiveAnchorMultiPkEndInAdvanceSource;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveAnchorMultiPkEndInAdvanceSource extends Enum	// class@0015dd
{
    public static final LiveAnchorMultiPkEndInAdvanceSource[] $VALUES;
    public static final LiveAnchorMultiPkEndInAdvanceSource BANGS;
    public static final LiveAnchorMultiPkEndInAdvanceSource OPERATION_PANEL;
    public static final LiveAnchorMultiPkEndInAdvanceSource X_BUTTON;

    static {
       LiveAnchorMultiPkEndInAdvanceSource liveAnchorMu1;
       LiveAnchorMultiPkEndInAdvanceSource[] liveAnchorMu = new LiveAnchorMultiPkEndInAdvanceSource[]{liveAnchorMu1,liveAnchorMu1,liveAnchorMu1};
       liveAnchorMu1 = new LiveAnchorMultiPkEndInAdvanceSource("BANGS", 0);
       LiveAnchorMultiPkEndInAdvanceSource.BANGS = liveAnchorMu1;
       liveAnchorMu1 = new LiveAnchorMultiPkEndInAdvanceSource("X_BUTTON", 1);
       LiveAnchorMultiPkEndInAdvanceSource.X_BUTTON = liveAnchorMu1;
       liveAnchorMu1 = new LiveAnchorMultiPkEndInAdvanceSource("OPERATION_PANEL", 2);
       LiveAnchorMultiPkEndInAdvanceSource.OPERATION_PANEL = liveAnchorMu1;
       LiveAnchorMultiPkEndInAdvanceSource.$VALUES = liveAnchorMu;
    }
    public void LiveAnchorMultiPkEndInAdvanceSource(String p0,int p1){
       super(p0, p1);
    }
    public static LiveAnchorMultiPkEndInAdvanceSource valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveAnchorMultiPkEndInAdvanceSource.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveAnchorMultiPkEndInAdvanceSource.class, p0);
    }
    public static LiveAnchorMultiPkEndInAdvanceSource[] values(){
       Object obj = PatchProxy.apply(null, null, LiveAnchorMultiPkEndInAdvanceSource.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveAnchorMultiPkEndInAdvanceSource.$VALUES.clone();
    }
}
