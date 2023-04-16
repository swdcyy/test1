package com.kwai.feature.api.live.base.model.LiveFlowDiversionRepostParams$FlowDiversionSourceType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveFlowDiversionRepostParams$FlowDiversionSourceType extends Enum	// class@000f85
{
    public int sourceType;
    public static final LiveFlowDiversionRepostParams$FlowDiversionSourceType[] $VALUES;
    public static final LiveFlowDiversionRepostParams$FlowDiversionSourceType LIVE_LINE;
    public static final LiveFlowDiversionRepostParams$FlowDiversionSourceType LIVE_LINE_PROFILE;
    public static final LiveFlowDiversionRepostParams$FlowDiversionSourceType LIVE_MULTI_LINE;
    public static final LiveFlowDiversionRepostParams$FlowDiversionSourceType LIVE_MULTI_LINE_PROFILE;
    public static final LiveFlowDiversionRepostParams$FlowDiversionSourceType LIVE_MULTI_PK;
    public static final LiveFlowDiversionRepostParams$FlowDiversionSourceType LIVE_MULTI_PK_PROFILE;
    public static final LiveFlowDiversionRepostParams$FlowDiversionSourceType LIVE_PK;
    public static final LiveFlowDiversionRepostParams$FlowDiversionSourceType LIVE_PK_PROFILE;
    public static final LiveFlowDiversionRepostParams$FlowDiversionSourceType UNKNOW;

    static {
       LiveFlowDiversionRepostParams$FlowDiversionSourceType uFlowDiversi = new LiveFlowDiversionRepostParams$FlowDiversionSourceType("UNKNOW", 0, 0);
       LiveFlowDiversionRepostParams$FlowDiversionSourceType.UNKNOW = uFlowDiversi;
       LiveFlowDiversionRepostParams$FlowDiversionSourceType uFlowDiversi1 = new LiveFlowDiversionRepostParams$FlowDiversionSourceType("LIVE_LINE", 1, 1);
       LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_LINE = uFlowDiversi1;
       LiveFlowDiversionRepostParams$FlowDiversionSourceType uFlowDiversi2 = new LiveFlowDiversionRepostParams$FlowDiversionSourceType("LIVE_LINE_PROFILE", 2, 2);
       LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_LINE_PROFILE = uFlowDiversi2;
       LiveFlowDiversionRepostParams$FlowDiversionSourceType uFlowDiversi3 = new LiveFlowDiversionRepostParams$FlowDiversionSourceType("LIVE_PK", 3, 3);
       LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_PK = uFlowDiversi3;
       LiveFlowDiversionRepostParams$FlowDiversionSourceType uFlowDiversi4 = new LiveFlowDiversionRepostParams$FlowDiversionSourceType("LIVE_PK_PROFILE", 4, 4);
       LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_PK_PROFILE = uFlowDiversi4;
       LiveFlowDiversionRepostParams$FlowDiversionSourceType uFlowDiversi5 = new LiveFlowDiversionRepostParams$FlowDiversionSourceType("LIVE_MULTI_LINE", 5, 5);
       LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_MULTI_LINE = uFlowDiversi5;
       LiveFlowDiversionRepostParams$FlowDiversionSourceType uFlowDiversi6 = new LiveFlowDiversionRepostParams$FlowDiversionSourceType("LIVE_MULTI_LINE_PROFILE", 6, 6);
       LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_MULTI_LINE_PROFILE = uFlowDiversi6;
       LiveFlowDiversionRepostParams$FlowDiversionSourceType uFlowDiversi7 = new LiveFlowDiversionRepostParams$FlowDiversionSourceType("LIVE_MULTI_PK", 7, 7);
       LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_MULTI_PK = uFlowDiversi7;
       LiveFlowDiversionRepostParams$FlowDiversionSourceType uFlowDiversi8 = new LiveFlowDiversionRepostParams$FlowDiversionSourceType("LIVE_MULTI_PK_PROFILE", 8, 8);
       LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_MULTI_PK_PROFILE = uFlowDiversi8;
       LiveFlowDiversionRepostParams$FlowDiversionSourceType[] uFlowDiversi9 = new LiveFlowDiversionRepostParams$FlowDiversionSourceType[9];
       uFlowDiversi9[0] = uFlowDiversi;
       uFlowDiversi9[1] = uFlowDiversi1;
       uFlowDiversi9[2] = uFlowDiversi2;
       uFlowDiversi9[3] = uFlowDiversi3;
       uFlowDiversi9[4] = uFlowDiversi4;
       uFlowDiversi9[5] = uFlowDiversi5;
       uFlowDiversi9[6] = uFlowDiversi6;
       uFlowDiversi9[7] = uFlowDiversi7;
       uFlowDiversi9[8] = uFlowDiversi8;
       LiveFlowDiversionRepostParams$FlowDiversionSourceType.$VALUES = uFlowDiversi9;
    }
    public void LiveFlowDiversionRepostParams$FlowDiversionSourceType(String p0,int p1,int p2){
       super(p0, p1);
       this.sourceType = p2;
    }
    public static boolean isValid(LiveFlowDiversionRepostParams$FlowDiversionSourceType p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       p0 = p0.sourceType;
       if (p0 > LiveFlowDiversionRepostParams$FlowDiversionSourceType.UNKNOW.sourceType && p0 <= LiveFlowDiversionRepostParams$FlowDiversionSourceType.LIVE_MULTI_PK_PROFILE.sourceType) {
          b = true;
       }
       return b;
    }
    public static LiveFlowDiversionRepostParams$FlowDiversionSourceType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveFlowDiversionRepostParams$FlowDiversionSourceType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveFlowDiversionRepostParams$FlowDiversionSourceType.class, p0);
    }
    public static LiveFlowDiversionRepostParams$FlowDiversionSourceType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveFlowDiversionRepostParams$FlowDiversionSourceType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveFlowDiversionRepostParams$FlowDiversionSourceType.$VALUES.clone();
    }
}
