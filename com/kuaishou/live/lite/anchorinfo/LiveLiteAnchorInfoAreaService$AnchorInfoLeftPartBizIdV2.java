package com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$a;
import java.lang.Enum;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2$AnchorInfo;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$a$b;

public abstract class LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2 extends Enum implements LiveLiteAnchorInfoAreaService$a	// class@001e33
{
    public static final LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2[] $VALUES;
    public static final LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2 AnchorInfo;

    static {
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2$AnchorInfo uAnchorInfoL1;
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2[] uAnchorInfoL = new LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2[]{uAnchorInfoL1};
       uAnchorInfoL1 = new LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2$AnchorInfo("AnchorInfo", 0);
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2.AnchorInfo = uAnchorInfoL1;
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2.$VALUES = uAnchorInfoL;
    }
    public void LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2(String p0,int p1){
       super(p0, p1);
    }
    public void LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2 valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2.class, p0);
    }
    public static LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2.$VALUES.clone();
    }
    public Set excludeBizIds(){
       Object obj = PatchProxy.apply(null, this, LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteAnchorInfoAreaService$a$b.a(this);
    }
}
