package com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$d;
import erd.g;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptRerankReqEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pea.b;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptManager;
import java.util.List;
import java.util.Collection;
import java.lang.Boolean;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.kwai.sdk.eve.proto.CustomEvent$Builder;
import com.kwai.sdk.eve.proto.CustomEvent;
import java.lang.StringBuilder;
import qrd.l1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import kotlin.jvm.internal.a;

public final class NasaHomePrefetchCacheRerankPresenter$d implements g	// class@000fd1
{
    public final NasaHomePrefetchCacheRerankPresenter b;

    public void NasaHomePrefetchCacheRerankPresenter$d(NasaHomePrefetchCacheRerankPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaHomePrefetchCacheRerankPresenter$d.class, "1")) {
       }else {
          b.b(this.b.p, "NasaLaunchOptRerankReqEvent receive");
          if (NasaLaunchOptManager.i()) {
             List candidates = p0.getCandidates();
             Boolean uBoolean = (candidates != null)? Boolean.valueOf((candidates.isEmpty() ^ 0x01)): null;
             if (uBoolean.booleanValue()) {
                NasaHomePrefetchCacheRerankPresenter t = this.b.t;
                _monitor_enter(t);
                this.b.t.clear();
                this.b.t.addAll(p0.getCandidates());
                _monitor_exit(t);
                CustomEvent$Builder uBuilder = CustomEvent.newBuilder();
                uBuilder.setCustomKey("custom_infer_"+this.b.q);
                uBuilder.setCustomValue("launchOptCache");
                GeneratedMessageLite generatedMes = uBuilder.build();
                a.o(generatedMes, "CustomEvent.newBuilder\(\)¡­ache\"\n          }.build\(\)");
                EveManagerWrapper.e.n(generatedMes);
             }
          }
       }
       return;
    }
}
