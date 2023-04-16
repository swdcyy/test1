package com.kuaishou.live.ad.social.g;
import erd.g;
import com.kuaishou.live.ad.social.i;
import zl0.a1;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.social.LiveAdLogParamAppender;
import cm0.f;
import zl0.u;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import com.kuaishou.live.ad.social.NonAdLogHelper;

public final class g implements g	// class@000a11
{
    public final i b;
    public final a1 c;
    public final BaseFeed d;

    public void g(i p0,a1 p1,BaseFeed p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       g tb = this.b;
       g tc = this.c;
       g td = this.d;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidThreeRefs(tc, td, p0, tb, i.class, "9")) {
       }else {
          NonAdLogHelper.a(309, f.a(tc), td, new u(tb, p0));
       }
       return;
    }
}
