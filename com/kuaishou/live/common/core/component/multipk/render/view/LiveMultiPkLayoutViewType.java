package com.kuaishou.live.common.core.component.multipk.render.view.LiveMultiPkLayoutViewType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiPkLayoutViewType extends Enum	// class@00167a
{
    public static final LiveMultiPkLayoutViewType[] $VALUES;
    public static final LiveMultiPkLayoutViewType MULTI_PK_BEST_AREA;
    public static final LiveMultiPkLayoutViewType MULTI_PK_OTHER_CELL;
    public static final LiveMultiPkLayoutViewType MULTI_PK_OTHER_SIMPLE_CELL;
    public static final LiveMultiPkLayoutViewType MULTI_PK_SCORE_ONLY_TEXT;
    public static final LiveMultiPkLayoutViewType MULTI_PK_SCORE_ONLY_TEXT_SIMPLE;
    public static final LiveMultiPkLayoutViewType MULTI_PK_SCORE_WITH_RANK;
    public static final LiveMultiPkLayoutViewType MULTI_PK_SCORE_WITH_RANK_SIMPLE;
    public static final LiveMultiPkLayoutViewType MULTI_PK_SELF_CELL;
    public static final LiveMultiPkLayoutViewType MULTI_PK_SELF_SIMPLE_CELL;
    public static final LiveMultiPkLayoutViewType MULTI_PK_TEAM_FRAME;

    static {
       LiveMultiPkLayoutViewType[] liveMultiPkL = new LiveMultiPkLayoutViewType[10];
       LiveMultiPkLayoutViewType liveMultiPkL1 = new LiveMultiPkLayoutViewType("MULTI_PK_SELF_CELL", 0);
       LiveMultiPkLayoutViewType.MULTI_PK_SELF_CELL = liveMultiPkL1;
       liveMultiPkL[0] = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLayoutViewType("MULTI_PK_SELF_SIMPLE_CELL", 1);
       LiveMultiPkLayoutViewType.MULTI_PK_SELF_SIMPLE_CELL = liveMultiPkL1;
       liveMultiPkL[1] = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLayoutViewType("MULTI_PK_OTHER_CELL", 2);
       LiveMultiPkLayoutViewType.MULTI_PK_OTHER_CELL = liveMultiPkL1;
       liveMultiPkL[2] = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLayoutViewType("MULTI_PK_OTHER_SIMPLE_CELL", 3);
       LiveMultiPkLayoutViewType.MULTI_PK_OTHER_SIMPLE_CELL = liveMultiPkL1;
       liveMultiPkL[3] = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLayoutViewType("MULTI_PK_SCORE_WITH_RANK", 4);
       LiveMultiPkLayoutViewType.MULTI_PK_SCORE_WITH_RANK = liveMultiPkL1;
       liveMultiPkL[4] = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLayoutViewType("MULTI_PK_SCORE_ONLY_TEXT", 5);
       LiveMultiPkLayoutViewType.MULTI_PK_SCORE_ONLY_TEXT = liveMultiPkL1;
       liveMultiPkL[5] = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLayoutViewType("MULTI_PK_SCORE_WITH_RANK_SIMPLE", 6);
       LiveMultiPkLayoutViewType.MULTI_PK_SCORE_WITH_RANK_SIMPLE = liveMultiPkL1;
       liveMultiPkL[6] = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLayoutViewType("MULTI_PK_SCORE_ONLY_TEXT_SIMPLE", 7);
       LiveMultiPkLayoutViewType.MULTI_PK_SCORE_ONLY_TEXT_SIMPLE = liveMultiPkL1;
       liveMultiPkL[7] = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLayoutViewType("MULTI_PK_TEAM_FRAME", 8);
       LiveMultiPkLayoutViewType.MULTI_PK_TEAM_FRAME = liveMultiPkL1;
       liveMultiPkL[8] = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLayoutViewType("MULTI_PK_BEST_AREA", 9);
       LiveMultiPkLayoutViewType.MULTI_PK_BEST_AREA = liveMultiPkL1;
       liveMultiPkL[9] = liveMultiPkL1;
       LiveMultiPkLayoutViewType.$VALUES = liveMultiPkL;
    }
    public void LiveMultiPkLayoutViewType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiPkLayoutViewType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiPkLayoutViewType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiPkLayoutViewType.class, p0);
    }
    public static LiveMultiPkLayoutViewType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkLayoutViewType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkLayoutViewType.$VALUES.clone();
    }
}
