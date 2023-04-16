package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$g;
import erd.g;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class FeaturedRankPrefetchPresenter$g implements g	// class@000f2b
{
    public final FeaturedRankPrefetchPresenter b;

    public void FeaturedRankPrefetchPresenter$g(FeaturedRankPrefetchPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeaturedRankPrefetchPresenter$g.class, "1")) {
       }else {
          a.p(p0, "fragmentEvent");
          FeaturedRankPrefetchPresenter$g tb = this.b;
          if (tb.A != null) {
             if (p0 == FragmentEvent.RESUME) {
                tb.S8();
             }else if(p0 == FragmentEvent.PAUSE){
                tb.V8();
             }
          }
       }
       return;
    }
}
