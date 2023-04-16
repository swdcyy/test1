package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$b$a;
import erd.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.AdWebViewPreloadGuidePresenter;
import yx.j0;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.a;
import u09.l;
import u09.m;
import crd.b;
import brd.t;
import crd.a;

public final class AdWebViewPreloadGuidePresenter$b$a implements g	// class@001637
{
    public final AdWebViewPreloadGuidePresenter$b b;

    public void AdWebViewPreloadGuidePresenter$b$a(AdWebViewPreloadGuidePresenter$b p0){
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdWebViewPreloadGuidePresenter$b$a.class, "1")) {
          return;
       }
       p0 = this.b.b;
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, p0, AdWebViewPreloadGuidePresenter.class, "15")) {
          Object[] objArray1 = new Object[0];
          j0.a("AdWebViewPreloadGuidePresenter", "initView", objArray1);
          AdWebViewPreloadGuidePresenter w = p0.w;
          if (w != null) {
             objArray = w.findViewById(0x7f0a0ef6);
          }
          p0.v = objArray;
          w = p0.u;
          AdWebViewPreloadGuidePresenter q = p0.q;
          if (q == null) {
             a.S("mPlayEndSubject");
          }
          w.c(q.subscribe(new l(p0), m.b));
       }
       return;
    }
}
