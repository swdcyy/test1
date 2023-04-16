package com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataService$b;
import erd.g;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataService;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import mrd.a;
import ln1.a$a;

public final class LiveHotSpotDetailDataService$b implements g	// class@0013c1
{
    public final LiveHotSpotDetailDataService b;
    public final String c;
    public final int d;

    public void LiveHotSpotDetailDataService$b(LiveHotSpotDetailDataService p0,String p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailDataService$b.class, "1")) {
       }else {
          this.b.b().onNext(new a$a(this.c, this.d, p0));
       }
       return;
    }
}
