package com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$Follow;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1;
import java.lang.String;
import nsd.u;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import trd.d1;

public final class LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$Follow extends LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1	// class@001e2e
{
    public final int layoutOrder;

    public void LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$Follow(String p0,int p1){
       super(p0, p1, null);
       this.layoutOrder = 2;
    }
    public Set excludeBizIds(){
       LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1[] obj = PatchProxy.apply(null, this, LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1$Follow.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1[]{LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.LivingTag,LiveLiteAnchorInfoAreaService$AnchorInfoLeftPartBizIdV1.RecommendTag};
       return d1.u(obj);
    }
    public int getLayoutOrder(){
       return this.layoutOrder;
    }
}
