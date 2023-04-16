package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$w;
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

public final class KSDataManager$w implements o	// class@001a3a
{
    public final KSDataManager b;

    public void KSDataManager$w(KSDataManager p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, KSDataManager$w.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "feedResponse");
          ot = t.just(new KSDataManager$c(this.b, p0, false));
       }
       return ot;
    }
}
