package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$b;
import d6a.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import crd.b;
import lnc.b9;
import u09.n;
import msd.a;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$b$a;
import erd.g;
import brd.t;
import crd.a;

public final class AdWebViewPreloadGuidePresenter$b extends a	// class@001638
{
    public final AdWebViewPreloadGuidePresenter b;

    public void AdWebViewPreloadGuidePresenter$b(AdWebViewPreloadGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, AdWebViewPreloadGuidePresenter$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.a("AdWebViewPreloadGuidePresenter", "becomesDetachedOnPageSelected", objArray);
       b9.a(this.b.u);
       AdWebViewPreloadGuidePresenter$b tb = this.b;
       tb.x = false;
       AdWebViewPreloadGuidePresenter b = tb.B;
       if (b != null) {
          b = new n(b);
       }
       k1.m(b);
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdWebViewPreloadGuidePresenter$b.class, "1")) {
          return;
       }
       AdWebViewPreloadGuidePresenter$b tb = this.b;
       AdWebViewPreloadGuidePresenter u = tb.u;
       Objects.requireNonNull(tb);
       AdWebViewPreloadGuidePresenter uAdWebViewPr = PatchProxy.apply(objArray, tb, AdWebViewPreloadGuidePresenter.class, "10");
       if (uAdWebViewPr != PatchProxyResult.class) {
       }else {
          uAdWebViewPr = tb.t;
          if (uAdWebViewPr == null) {
             a.S("mWebViewPreloadComplete");
          }
       }
       u.c(uAdWebViewPr.subscribe(new AdWebViewPreloadGuidePresenter$b$a(this)));
       return;
    }
}
