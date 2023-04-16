package com.kuaishou.live.basic.performance.biz.LiveBizPerfReporter$PerfType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveBizPerfReporter$PerfType extends Enum	// class@000ce4
{
    public static final LiveBizPerfReporter$PerfType[] $VALUES;
    public static final LiveBizPerfReporter$PerfType FPS;
    public static final LiveBizPerfReporter$PerfType MEMORY;

    static {
       LiveBizPerfReporter$PerfType perfType;
       LiveBizPerfReporter$PerfType[] perfTypeArra = new LiveBizPerfReporter$PerfType[]{perfType,perfType};
       perfType = new LiveBizPerfReporter$PerfType("MEMORY", 0);
       LiveBizPerfReporter$PerfType.MEMORY = perfType;
       perfType = new LiveBizPerfReporter$PerfType("FPS", 1);
       LiveBizPerfReporter$PerfType.FPS = perfType;
       LiveBizPerfReporter$PerfType.$VALUES = perfTypeArra;
    }
    public void LiveBizPerfReporter$PerfType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveBizPerfReporter$PerfType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveBizPerfReporter$PerfType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveBizPerfReporter$PerfType.class, p0);
    }
    public static LiveBizPerfReporter$PerfType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveBizPerfReporter$PerfType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveBizPerfReporter$PerfType.$VALUES.clone();
    }
}
