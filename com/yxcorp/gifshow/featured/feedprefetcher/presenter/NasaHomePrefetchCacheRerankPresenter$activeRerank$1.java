package com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter$activeRerank$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.featured.feedprefetcher.presenter.NasaHomePrefetchCacheRerankPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import java.lang.StringBuilder;
import java.lang.System;

public final class NasaHomePrefetchCacheRerankPresenter$activeRerank$1 extends Lambda implements l	// class@000fca
{
    public final NasaHomePrefetchCacheRerankPresenter this$0;

    public void NasaHomePrefetchCacheRerankPresenter$activeRerank$1(NasaHomePrefetchCacheRerankPresenter p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       NasaHomePrefetchCacheRerankPresenter obj = PatchProxy.applyOneRefs(p0, this, NasaHomePrefetchCacheRerankPresenter$activeRerank$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pipeline");
       obj = this.this$0.r;
       _monitor_enter(obj);
       if (!TextUtils.x(this.this$0.s)) {
          NasaHomePrefetchCacheRerankPresenter$activeRerank$1 tthis$0 = this.this$0;
          NasaHomePrefetchCacheRerankPresenter s = tthis$0.s;
          a.m(s);
          EveManagerWrapper.e.e(tthis$0.q, s);
          this.this$0.s = null;
       }
       this.this$0.s = System.nanoTime()+'_'+p0;
       NasaHomePrefetchCacheRerankPresenter s1 = this.this$0.s;
       a.m(s1);
       _monitor_exit(obj);
       return s1;
    }
}
