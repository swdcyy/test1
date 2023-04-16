package com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter;
import com.smile.gifmaker.mvps.presenter.a;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$a;
import nsd.u;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$Companion$logTag$1;
import mrd.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import u33.c;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$DelegatePresenter;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$1;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$2;
import msd.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import u33.b;
import pp.c;
import java.lang.StringBuilder;
import com.kwai.feature.api.live.plugin.dva.LivePluginManager;
import com.kuaishou.android.live.log.b;
import brd.t;
import brd.z;
import io.reactivex.android.schedulers.a;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$b;
import erd.g;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$c;
import crd.b;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$d;
import qs5.e;
import ekd.k1;
import java.lang.Boolean;
import nl8.o;
import nl8.n;

public final class LiteLazyLoadRecommendBarPresenter extends a	// class@001ba8
{
    public final Object r;
    public boolean s;
    public final c t;
    public final c u;
    public static final a v;
    public static final LiteLazyLoadRecommendBarPresenter$a w;

    static {
       LiteLazyLoadRecommendBarPresenter.w = new LiteLazyLoadRecommendBarPresenter$a(null);
       LiteLazyLoadRecommendBarPresenter.v = LiteLazyLoadRecommendBarPresenter$Companion$logTag$1.INSTANCE;
    }
    public void LiteLazyLoadRecommendBarPresenter(c p0){
       a.p(p0, "loadRecommendBarSignal");
       super();
       this.u = p0;
       this.r = new Object();
       this.t = new c();
       this.U7(new LiteLazyLoadRecommendBarPresenter$DelegatePresenter(new LiteLazyLoadRecommendBarPresenter$1(this), new LiteLazyLoadRecommendBarPresenter$2(this)));
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiteLazyLoadRecommendBarPresenter.class, "2")) {
          return;
       }
       boolean b = a.t().u("SOURCE_LIVE").d("liteLazyTriggerLoadRecommentBar", false);
       a v = LiteLazyLoadRecommendBarPresenter.v;
       if (v != null) {
          v = new b(v);
       }
       b.Z(v, "onBind - watch plugin load, isInstalled: "+LivePluginManager.c()+", enableLazyLoadRecommendBar: "+b);
       if (b) {
          this.u.take(1).observeOn(a.c()).doOnSubscribe(new LiteLazyLoadRecommendBarPresenter$b(this)).subscribe(new LiteLazyLoadRecommendBarPresenter$c(this));
       }else {
          LivePluginManager.h(false, new LiteLazyLoadRecommendBarPresenter$d(this, "LiteWatchLivePluginLoad"));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiteLazyLoadRecommendBarPresenter.class, "3")) {
          return;
       }
       this.s = true;
       k1.n(this.r);
       return;
    }
    public void P8(boolean p0){
       LiteLazyLoadRecommendBarPresenter liteLazyLoad = LiteLazyLoadRecommendBarPresenter.class;
       if (PatchProxy.isSupport(liteLazyLoad) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liteLazyLoad, "4")) {
          return;
       }
       a v = LiteLazyLoadRecommendBarPresenter.v;
       if (v != null) {
          v = new b(v);
       }
       b.Z(v, "activate");
       super.P8(p0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LiteLazyLoadRecommendBarPresenter.class, "1")) {
          return;
       }
       this.t.a(n.a(this));
       return;
    }
}
