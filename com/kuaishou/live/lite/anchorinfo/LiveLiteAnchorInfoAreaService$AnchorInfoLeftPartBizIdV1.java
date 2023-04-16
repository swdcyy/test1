package com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$a;
import java.lang.Enum;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$AnchorInfo;
import java.lang.String;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$Follow;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$LivingTag;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$RecommendTag;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$a$b;

public abstract class LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1 extends Enum implements LiveLiteAnchorInfoAreaService$a	// class@001e31
{
    public static final LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1[] $VALUES;
    public static final LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1 AnchorInfo;
    public static final LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1 Follow;
    public static final LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1 LivingTag;
    public static final LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1 RecommendTag;

    static {
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$AnchorInfo uAnchorInfoL1;
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$Follow uAnchorInfoL2;
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$LivingTag uAnchorInfoL3;
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$RecommendTag uAnchorInfoL4;
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1[] uAnchorInfoL = new LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1[]{uAnchorInfoL1,uAnchorInfoL2,uAnchorInfoL3,uAnchorInfoL4};
       uAnchorInfoL1 = new LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$AnchorInfo("AnchorInfo", 0);
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.AnchorInfo = uAnchorInfoL1;
       uAnchorInfoL2 = new LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$Follow("Follow", 1);
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.Follow = uAnchorInfoL2;
       uAnchorInfoL3 = new LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$LivingTag("LivingTag", 2);
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.LivingTag = uAnchorInfoL3;
       uAnchorInfoL4 = new LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$RecommendTag("RecommendTag", 3);
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.RecommendTag = uAnchorInfoL4;
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.$VALUES = uAnchorInfoL;
    }
    public void LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1(String p0,int p1){
       super(p0, p1);
    }
    public void LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1(String p0,int p1,u p2){
       super(p0, p1);
    }
    public static LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1 valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.class, p0);
    }
    public static LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1[] values(){
       Object obj = PatchProxy.apply(null, null, LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.$VALUES.clone();
    }
    public Set excludeBizIds(){
       Object obj = PatchProxy.apply(null, this, LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return LiveLiteAnchorInfoAreaService$a$b.a(this);
    }
}
