package com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager$ScatterLoadStatus;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteScatterLoadManager$ScatterLoadStatus extends Enum	// class@000901
{
    public static final LiveLiteScatterLoadManager$ScatterLoadStatus[] $VALUES;
    public static final LiveLiteScatterLoadManager$ScatterLoadStatus FORCE_FLUSH;
    public static final LiveLiteScatterLoadManager$ScatterLoadStatus NORMAL;

    static {
       LiveLiteScatterLoadManager$ScatterLoadStatus scatterLoadS1;
       LiveLiteScatterLoadManager$ScatterLoadStatus[] scatterLoadS = new LiveLiteScatterLoadManager$ScatterLoadStatus[]{scatterLoadS1,scatterLoadS1};
       scatterLoadS1 = new LiveLiteScatterLoadManager$ScatterLoadStatus("NORMAL", 0);
       LiveLiteScatterLoadManager$ScatterLoadStatus.NORMAL = scatterLoadS1;
       scatterLoadS1 = new LiveLiteScatterLoadManager$ScatterLoadStatus("FORCE_FLUSH", 1);
       LiveLiteScatterLoadManager$ScatterLoadStatus.FORCE_FLUSH = scatterLoadS1;
       LiveLiteScatterLoadManager$ScatterLoadStatus.$VALUES = scatterLoadS;
    }
    public void LiveLiteScatterLoadManager$ScatterLoadStatus(String p0,int p1){
       super(p0, p1);
    }
    public static LiveLiteScatterLoadManager$ScatterLoadStatus valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteScatterLoadManager$ScatterLoadStatus.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteScatterLoadManager$ScatterLoadStatus.class, p0);
    }
    public static LiveLiteScatterLoadManager$ScatterLoadStatus[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteScatterLoadManager$ScatterLoadStatus.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteScatterLoadManager$ScatterLoadStatus.$VALUES.clone();
    }
}
