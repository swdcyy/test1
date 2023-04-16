package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$weakNetRankConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import pf5.u;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class FeaturedRankPrefetchPresenter$weakNetRankConfig$2 extends Lambda implements a	// class@000f2e
{
    public static final FeaturedRankPrefetchPresenter$weakNetRankConfig$2 INSTANCE;

    static {
       FeaturedRankPrefetchPresenter$weakNetRankConfig$2.INSTANCE = new FeaturedRankPrefetchPresenter$weakNetRankConfig$2();
    }
    public void FeaturedRankPrefetchPresenter$weakNetRankConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final u invoke(){
       Object obj = PatchProxy.apply(null, this, FeaturedRankPrefetchPresenter$weakNetRankConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       u ou = new u(15, 0, 2000, 0);
       return a.t().getValue("weakNetRankConfig", u.class, v9);
    }
}
