package com.kuaishou.live.core.show.luckystar.v2.openresult.LiveLuckyStarOpenResultPanelState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLuckyStarOpenResultPanelState extends Enum	// class@000d0a
{
    public static final LiveLuckyStarOpenResultPanelState[] $VALUES;
    public static final LiveLuckyStarOpenResultPanelState EMPTY;
    public static final LiveLuckyStarOpenResultPanelState OPENED;
    public static final LiveLuckyStarOpenResultPanelState ROLLING;

    static {
       LiveLuckyStarOpenResultPanelState liveLuckySta = new LiveLuckyStarOpenResultPanelState("EMPTY", 0);
       LiveLuckyStarOpenResultPanelState.EMPTY = liveLuckySta;
       LiveLuckyStarOpenResultPanelState liveLuckySta1 = new LiveLuckyStarOpenResultPanelState("ROLLING", 1);
       LiveLuckyStarOpenResultPanelState.ROLLING = liveLuckySta1;
       LiveLuckyStarOpenResultPanelState liveLuckySta2 = new LiveLuckyStarOpenResultPanelState("OPENED", 2);
       LiveLuckyStarOpenResultPanelState.OPENED = liveLuckySta2;
       LiveLuckyStarOpenResultPanelState[] liveLuckySta3 = new LiveLuckyStarOpenResultPanelState[]{liveLuckySta,liveLuckySta1,liveLuckySta2};
       LiveLuckyStarOpenResultPanelState.$VALUES = liveLuckySta3;
    }
    public void LiveLuckyStarOpenResultPanelState(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLuckyStarOpenResultPanelState valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLuckyStarOpenResultPanelState.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLuckyStarOpenResultPanelState.class, p0);
    }
    public static LiveLuckyStarOpenResultPanelState[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLuckyStarOpenResultPanelState.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLuckyStarOpenResultPanelState.$VALUES.clone();
    }
}
