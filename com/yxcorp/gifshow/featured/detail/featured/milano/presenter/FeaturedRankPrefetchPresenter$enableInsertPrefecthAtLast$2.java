package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.FeaturedRankPrefetchPresenter$enableInsertPrefecthAtLast$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class FeaturedRankPrefetchPresenter$enableInsertPrefecthAtLast$2 extends Lambda implements a	// class@000f29
{
    public static final FeaturedRankPrefetchPresenter$enableInsertPrefecthAtLast$2 INSTANCE;

    static {
       FeaturedRankPrefetchPresenter$enableInsertPrefecthAtLast$2.INSTANCE = new FeaturedRankPrefetchPresenter$enableInsertPrefecthAtLast$2();
    }
    public void FeaturedRankPrefetchPresenter$enableInsertPrefecthAtLast$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, FeaturedRankPrefetchPresenter$enableInsertPrefecthAtLast$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableInsertPrefecthAtLast", false);
    }
}
