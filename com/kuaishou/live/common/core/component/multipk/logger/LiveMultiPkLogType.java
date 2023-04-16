package com.kuaishou.live.common.core.component.multipk.logger.LiveMultiPkLogType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiPkLogType extends Enum	// class@001649
{
    public static final LiveMultiPkLogType[] $VALUES;
    public static final LiveMultiPkLogType CLICK;
    public static final LiveMultiPkLogType SHOW;

    static {
       LiveMultiPkLogType liveMultiPkL1;
       LiveMultiPkLogType[] liveMultiPkL = new LiveMultiPkLogType[]{liveMultiPkL1,liveMultiPkL1};
       liveMultiPkL1 = new LiveMultiPkLogType("SHOW", 0);
       LiveMultiPkLogType.SHOW = liveMultiPkL1;
       liveMultiPkL1 = new LiveMultiPkLogType("CLICK", 1);
       LiveMultiPkLogType.CLICK = liveMultiPkL1;
       LiveMultiPkLogType.$VALUES = liveMultiPkL;
    }
    public void LiveMultiPkLogType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiPkLogType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiPkLogType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiPkLogType.class, p0);
    }
    public static LiveMultiPkLogType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkLogType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkLogType.$VALUES.clone();
    }
}
