package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$e;
import erd.g;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter;
import java.lang.Object;
import ub6.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.utility.NetworkUtilsCached;
import v40.a;

public final class FeaturedRankPrefetchPresenter$e implements g	// class@000f28
{
    public final FeaturedRankPrefetchPresenter b;

    public void FeaturedRankPrefetchPresenter$e(FeaturedRankPrefetchPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeaturedRankPrefetchPresenter$e.class, "1")) {
       }else {
          FeaturedRankPrefetchPresenter$e tb = this.b;
          a.o(p0, "event");
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(p0, tb, FeaturedRankPrefetchPresenter.class, "15") && !NetworkUtilsCached.k()) {
             a.a.b("Network connection disconnection");
             tb.P8("broadcast_receiver");
          }
       }
       return;
    }
}
