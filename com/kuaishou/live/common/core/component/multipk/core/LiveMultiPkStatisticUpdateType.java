package com.kuaishou.live.common.core.component.multipk.core.LiveMultiPkStatisticUpdateType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveMultiPkStatisticUpdateType extends Enum	// class@0015cf
{
    public static final LiveMultiPkStatisticUpdateType[] $VALUES;
    public static final LiveMultiPkStatisticUpdateType LAYOUT_CHANGE;
    public static final LiveMultiPkStatisticUpdateType RECEIVE_PK_STATISTIC;
    public static final LiveMultiPkStatisticUpdateType STICKY_NOTIFY;

    static {
       LiveMultiPkStatisticUpdateType liveMultiPkS1;
       LiveMultiPkStatisticUpdateType[] liveMultiPkS = new LiveMultiPkStatisticUpdateType[]{liveMultiPkS1,liveMultiPkS1,liveMultiPkS1};
       liveMultiPkS1 = new LiveMultiPkStatisticUpdateType("STICKY_NOTIFY", 0);
       LiveMultiPkStatisticUpdateType.STICKY_NOTIFY = liveMultiPkS1;
       liveMultiPkS1 = new LiveMultiPkStatisticUpdateType("RECEIVE_PK_STATISTIC", 1);
       LiveMultiPkStatisticUpdateType.RECEIVE_PK_STATISTIC = liveMultiPkS1;
       liveMultiPkS1 = new LiveMultiPkStatisticUpdateType("LAYOUT_CHANGE", 2);
       LiveMultiPkStatisticUpdateType.LAYOUT_CHANGE = liveMultiPkS1;
       LiveMultiPkStatisticUpdateType.$VALUES = liveMultiPkS;
    }
    public void LiveMultiPkStatisticUpdateType(String p0,int p1){
       super(p0, p1);
    }
    public static LiveMultiPkStatisticUpdateType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveMultiPkStatisticUpdateType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveMultiPkStatisticUpdateType.class, p0);
    }
    public static LiveMultiPkStatisticUpdateType[] values(){
       Object obj = PatchProxy.apply(null, null, LiveMultiPkStatisticUpdateType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveMultiPkStatisticUpdateType.$VALUES.clone();
    }
}
