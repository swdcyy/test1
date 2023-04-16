package com.yxcorp.gifshow.follow.init.plugin.live.LiveCoverAnnexHelper$j;
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

public final class LiveCoverAnnexHelper$j implements o	// class@0010d1
{
    public final LiveCoverAnnexHelper b;

    public void LiveCoverAnnexHelper$j(LiveCoverAnnexHelper p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, LiveCoverAnnexHelper$j.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          ot = this.b.e();
       }
       return ot;
    }
}
