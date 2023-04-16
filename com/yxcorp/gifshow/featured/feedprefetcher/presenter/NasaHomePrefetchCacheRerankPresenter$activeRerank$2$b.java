package com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$2$b;
import erd.g;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$2;
import java.lang.Object;
import m50.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter;
import pea.b;
import com.kuaishou.eve.kit.rerank.model.DiversityResult;
import java.lang.StringBuilder;
import java.util.List;
import trd.n;
import nea.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.featured.feedprefetcher.allinone.NasaLaunchOptRerankResultEvent;

public final class NasaHomePrefetchCacheRerankPresenter$activeRerank$2$b implements g	// class@000fcc
{
    public final NasaHomePrefetchCacheRerankPresenter$activeRerank$2 b;

    public void NasaHomePrefetchCacheRerankPresenter$activeRerank$2$b(NasaHomePrefetchCacheRerankPresenter$activeRerank$2 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaHomePrefetchCacheRerankPresenter$activeRerank$2$b.class, "1")) {
       }else {
          b.b(this.b.this$0.p, "get result");
          if (p0 != null) {
             p0 = p0.a();
             if (p0 != null) {
                p0 = p0.getMPhotoIds();
                if (p0 != null) {
                   StringBuilder str = "";
                   int len = p0.length;
                   int i = 0;
                   for (int i1 = 0; i1 < len; i1 = i1 + 1) {
                      str = str+p0[i1]+", ";
                   }
                   b.b(this.b.this$0.p, "result: "+str);
                   if (!p0.length) {
                      i = 1;
                   }
                   if (i ^ 0x01) {
                      b.b(n.t(p0));
                      RxBus.f.b(new NasaLaunchOptRerankResultEvent(n.t(p0)));
                   }
                }
             }
          }
       }
       return;
    }
}
