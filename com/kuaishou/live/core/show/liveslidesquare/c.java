package com.kuaishou.live.core.show.liveslidesquare.c;
import erd.o;
import com.kuaishou.live.core.show.liveslidesquare.d;
import java.lang.Object;
import com.kuaishou.live.core.show.liveslidesquare.LiveSlideSquareResponse;
import qvb.n0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import tkd.b;
import tkd.d;
import lm9.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import za2.s;
import io.reactivex.g;

public final class c implements o	// class@000c93
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t ot;
       c tb = this.b;
       boolean b = tb.K();
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          ot = PatchProxy.applyTwoRefs(Boolean.valueOf(b), p0, tb, uod, "13");
          if (ot != PatchProxyResult.class) {
          }else if(b && (tb.h2(p0) instanceof LiveStreamFeed && d.a(-1638991736).SW(tb.h2(p0), Boolean.FALSE))){
             b.Z(LiveLogTag.LIVE_TVC_AD, "prepareTVC need call TVC");
             ot = t.create(new s(tb, p0));
          }else {
             ot = t.just(p0);
          }
       }else {
          goto label_0021 ;
       }
       return ot;
    }
}
