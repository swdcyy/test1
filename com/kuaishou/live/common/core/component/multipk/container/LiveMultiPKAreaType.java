package com.kuaishou.live.common.core.component.multipk.container.LiveMultiPKAreaType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiPKAreaType extends Enum	// class@0015ce
{
    public static final LiveMultiPKAreaType[] $VALUES;
    public static final LiveMultiPKAreaType BANGS;
    public static final LiveMultiPKAreaType PROGRESS;

    static {
       LiveMultiPKAreaType liveMultiPKA = new LiveMultiPKAreaType("BANGS", 0);
       LiveMultiPKAreaType.BANGS = liveMultiPKA;
       LiveMultiPKAreaType liveMultiPKA1 = new LiveMultiPKAreaType("PROGRESS", 1);
       LiveMultiPKAreaType.PROGRESS = liveMultiPKA1;
       LiveMultiPKAreaType[] liveMultiPKA2 = new LiveMultiPKAreaType[]{liveMultiPKA,liveMultiPKA1};
       LiveMultiPKAreaType.$VALUES = liveMultiPKA2;
    }
    public void LiveMultiPKAreaType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiPKAreaType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiPKAreaType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiPKAreaType.class, p0);
    }
    public static LiveMultiPKAreaType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPKAreaType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPKAreaType.$VALUES.clone();
    }
}
