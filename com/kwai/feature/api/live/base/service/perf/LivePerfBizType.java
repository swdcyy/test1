package com.kwai.feature.api.live.base.service.perf.LivePerfBizType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LivePerfBizType extends Enum	// class@000fa4
{
    public static final LivePerfBizType[] $VALUES;
    public static final LivePerfBizType KRN;
    public static final LivePerfBizType MINI_WIDGET;
    public static final LivePerfBizType PK;
    public static final LivePerfBizType WEB;

    static {
       LivePerfBizType livePerfBizT1;
       LivePerfBizType[] livePerfBizT = new LivePerfBizType[]{livePerfBizT1,livePerfBizT1,livePerfBizT1,livePerfBizT1};
       livePerfBizT1 = new LivePerfBizType("KRN", 0);
       LivePerfBizType.KRN = livePerfBizT1;
       livePerfBizT1 = new LivePerfBizType("WEB", 1);
       LivePerfBizType.WEB = livePerfBizT1;
       livePerfBizT1 = new LivePerfBizType("PK", 2);
       LivePerfBizType.PK = livePerfBizT1;
       livePerfBizT1 = new LivePerfBizType("MINI_WIDGET", 3);
       LivePerfBizType.MINI_WIDGET = livePerfBizT1;
       LivePerfBizType.$VALUES = livePerfBizT;
    }
    public void LivePerfBizType(String p0,int p1){
       super(p0, p1);
    }
    public static LivePerfBizType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LivePerfBizType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LivePerfBizType.class, p0);
    }
    public static LivePerfBizType[] values(){
       Object obj = PatchProxy.apply(null, null, LivePerfBizType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LivePerfBizType.$VALUES.clone();
    }
}
