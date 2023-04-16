package com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$a;
import java.lang.Enum;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId$WatchingAudience;
import java.lang.String;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId$WatchingCount;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$a$b;

public abstract class LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId extends Enum implements LiveLiteAnchorInfoAreaService$a	// class@001e36
{
    public static final LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId[] $VALUES;
    public static final LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId WatchingAudience;
    public static final LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId WatchingCount;

    static {
       LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId$WatchingAudience uAnchorInfoR1;
       LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId$WatchingCount uAnchorInfoR2;
       LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId[] uAnchorInfoR = new LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId[]{uAnchorInfoR1,uAnchorInfoR2};
       uAnchorInfoR1 = new LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId$WatchingAudience("WatchingAudience", 0);
       LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId.WatchingAudience = uAnchorInfoR1;
       uAnchorInfoR2 = new LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId$WatchingCount("WatchingCount", 1);
       LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId.WatchingCount = uAnchorInfoR2;
       LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId.$VALUES = uAnchorInfoR;
    }
    public void LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId(String p0,int p1){
       super(p0, p1);
    }
    public void LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId.class, p0);
    }
    public static LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId.$VALUES.clone();
    }
    public Set excludeBizIds(){
       Object obj = PatchProxy.apply(null, this, LiveLiteAnchorInfoAreaService$AnchorInfoRightPartBizId.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteAnchorInfoAreaService$a$b.a(this);
    }
}
