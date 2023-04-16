package com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$c;
import erd.g;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter;
import java.lang.Object;
import ln5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pea.b;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.kwai.sdk.eve.proto.CustomEvent$Builder;
import com.kwai.sdk.eve.proto.CustomEvent;
import java.lang.StringBuilder;
import qrd.l1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import kotlin.jvm.internal.a;

public final class NasaHomePrefetchCacheRerankPresenter$c implements g	// class@000fd0
{
    public final NasaHomePrefetchCacheRerankPresenter b;

    public void NasaHomePrefetchCacheRerankPresenter$c(NasaHomePrefetchCacheRerankPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaHomePrefetchCacheRerankPresenter$c.class, "1")) {
       }else {
          b.b(this.b.p, "NasaPrefetchUpdateDataEvent post");
          if (!NasaLaunchOptManager.i()) {
             CustomEvent$Builder uBuilder = CustomEvent.newBuilder();
             uBuilder.setCustomKey("custom_infer_"+this.b.q);
             uBuilder.setCustomValue(p0.a);
             p0 = uBuilder.build();
             a.o(p0, "CustomEvent.newBuilder\(\)¡­eason\n          }.build\(\)");
             EveManagerWrapper.e.n(p0);
          }
       }
       return;
    }
}
