package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$u;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.network.feed.KSTemplateFeedListResponse;
import kotlin.jvm.internal.a;

public final class KSDataManager$u implements g	// class@001a38
{
    public final KSDataManager b;
    public final String c;
    public final boolean d;

    public void KSDataManager$u(KSDataManager p0,String p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$u.class, "1")) {
       }else {
          KSTemplateFeedListResponse kSTemplateFe = p0.a();
          a.m(kSTemplateFe);
          this.b.x(this.c, kSTemplateFe, this.d, p0.b(), (p0.a().hasMore() ^ 0x01));
       }
       return;
    }
}
