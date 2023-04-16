package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$m;
import erd.o;
import com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import brd.t;

public final class LiveCoverAnnexHelper$m implements o	// class@0010d4
{
    public final LiveCoverAnnexHelper b;

    public void LiveCoverAnnexHelper$m(LiveCoverAnnexHelper p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, LiveCoverAnnexHelper$m.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = this.b.e();
       }
       return ot;
    }
}
