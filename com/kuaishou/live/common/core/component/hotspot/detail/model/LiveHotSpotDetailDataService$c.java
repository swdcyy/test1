package com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataService$c;
import erd.g;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailDataService;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import mrd.a;
import ln1.a$b;
import kotlin.jvm.internal.a;

public final class LiveHotSpotDetailDataService$c implements g	// class@0013c2
{
    public final LiveHotSpotDetailDataService b;
    public final String c;
    public final int d;

    public void LiveHotSpotDetailDataService$c(LiveHotSpotDetailDataService p0,String p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveHotSpotDetailDataService$c.class, "1")) {
       }else {
          b.I(LiveLogTag.LIVE_HOT_SPOT, "fetchDetailData error", p0);
          a.o(p0, "it");
          this.b.b().onNext(new a$b(this.c, this.d, p0));
       }
       return;
    }
}
