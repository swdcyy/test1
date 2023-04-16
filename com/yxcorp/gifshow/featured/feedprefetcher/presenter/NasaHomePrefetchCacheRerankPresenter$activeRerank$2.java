package com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$2;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter;
import java.lang.Object;
import brd.t;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$2$a;
import erd.o;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$2$b;
import erd.g;
import crd.b;

public final class NasaHomePrefetchCacheRerankPresenter$activeRerank$2 extends Lambda implements l	// class@000fcd
{
    public final NasaHomePrefetchCacheRerankPresenter this$0;

    public void NasaHomePrefetchCacheRerankPresenter$activeRerank$2(NasaHomePrefetchCacheRerankPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(t p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaHomePrefetchCacheRerankPresenter$activeRerank$2.class, "1")) {
          return;
       }
       a.p(p0, "o");
       this.this$0.w = p0.map(new NasaHomePrefetchCacheRerankPresenter$activeRerank$2$a(this)).subscribeOn(d.c).subscribe(new NasaHomePrefetchCacheRerankPresenter$activeRerank$2$b(this));
       return;
    }
}
