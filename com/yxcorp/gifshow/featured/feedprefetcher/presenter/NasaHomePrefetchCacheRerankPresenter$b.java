package com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.kwai.robust.PatchProxyResult;
import msd.p;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$generatorGather$1;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$1;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$2;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$3;
import msd.l;
import msd.a;

public final class NasaHomePrefetchCacheRerankPresenter$b implements Runnable	// class@000fcf
{
    public final NasaHomePrefetchCacheRerankPresenter b;

    public void NasaHomePrefetchCacheRerankPresenter$b(NasaHomePrefetchCacheRerankPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaHomePrefetchCacheRerankPresenter$b.class, "1")) {
          return;
       }
       NasaHomePrefetchCacheRerankPresenter$b tb = this.b;
       Objects.requireNonNull(tb);
       NasaHomePrefetchCacheRerankPresenter nasaHomePref = NasaHomePrefetchCacheRerankPresenter.class;
       if (!PatchProxy.applyVoid(objArray, tb, nasaHomePref, "5")) {
          EveManagerWrapper e = EveManagerWrapper.e;
          NasaHomePrefetchCacheRerankPresenter q = tb.q;
          NasaHomePrefetchCacheRerankPresenter$generatorGather$1 ogeneratorGa = PatchProxy.apply(objArray, tb, nasaHomePref, "10");
          if (ogeneratorGa != PatchProxyResult.class) {
          }else {
             ogeneratorGa = new NasaHomePrefetchCacheRerankPresenter$generatorGather$1(tb);
          }
          e.c(q, ogeneratorGa, new NasaHomePrefetchCacheRerankPresenter$activeRerank$1(tb), new NasaHomePrefetchCacheRerankPresenter$activeRerank$2(tb), new NasaHomePrefetchCacheRerankPresenter$activeRerank$3(tb));
       }
       return;
    }
}
