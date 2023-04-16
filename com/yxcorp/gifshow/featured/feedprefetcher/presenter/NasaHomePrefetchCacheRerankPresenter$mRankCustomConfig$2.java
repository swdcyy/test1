package com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$mRankCustomConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import rea.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class NasaHomePrefetchCacheRerankPresenter$mRankCustomConfig$2 extends Lambda implements a	// class@000fd4
{
    public static final NasaHomePrefetchCacheRerankPresenter$mRankCustomConfig$2 INSTANCE;

    static {
       NasaHomePrefetchCacheRerankPresenter$mRankCustomConfig$2.INSTANCE = new NasaHomePrefetchCacheRerankPresenter$mRankCustomConfig$2();
    }
    public void NasaHomePrefetchCacheRerankPresenter$mRankCustomConfig$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final e invoke(){
       Object obj = PatchProxy.apply(null, this, NasaHomePrefetchCacheRerankPresenter$mRankCustomConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("ksNasaPrefetchEveLuaConfig", e.class, new e());
    }
}
