package com.kwai.live.gzone.promotion.r;
import erd.o;
import com.kwai.live.gzone.promotion.o;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGameResourceListResponse;

public class r implements o	// class@000dd7
{
    public final o b;

    public void r(o p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       p0 = PatchProxy.applyOneRefs(p0, this, r.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          p0 = new LiveGzonePromotionGameResourceListResponse();
       }
       return p0;
    }
}
