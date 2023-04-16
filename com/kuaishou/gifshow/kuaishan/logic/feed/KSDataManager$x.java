package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$x;
import erd.o;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c;
import brd.t;

public final class KSDataManager$x implements o	// class@001a3b
{
    public final KSDataManager b;

    public void KSDataManager$x(KSDataManager p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, KSDataManager$x.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "feedResponse");
          ot = t.just(new KSDataManager$c(this.b, p0, false));
       }
       return ot;
    }
}
