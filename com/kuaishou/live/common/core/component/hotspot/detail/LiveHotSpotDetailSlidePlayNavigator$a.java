package com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailSlidePlayNavigator$a;
import qvb.f;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.hotspot.detail.LiveHotSpotDetailSlidePlayNavigator$FixedCountListResponse;

public final class LiveHotSpotDetailSlidePlayNavigator$a extends f	// class@001369
{
    public final List p;

    public void LiveHotSpotDetailSlidePlayNavigator$a(List p0){
       a.p(p0, "originList");
       super();
       this.p = p0;
    }
    public t I1(){
       t obj = PatchProxy.apply(null, this, LiveHotSpotDetailSlidePlayNavigator$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = t.just(new LiveHotSpotDetailSlidePlayNavigator$FixedCountListResponse(this.p));
       a.o(obj, "Observable.just\(FixedCou¡­ListResponse\(originList\)\)");
       return obj;
    }
}
