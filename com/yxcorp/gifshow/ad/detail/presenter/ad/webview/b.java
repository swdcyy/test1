package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.c;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import mxb.o;
import android.view.ViewGroup;
import android.view.View;
import ekd.p1;
import g59.k0;
import android.widget.FrameLayout;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.a1;
import com.yxcorp.gifshow.entity.QPhoto;
import f4a.u;
import jyc.b;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.content.Intent;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.e;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.os.Bundle;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.j;
import m59.p;
import u09.e;
import uxc.a;
import u09.f;
import uxc.b;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import u09.g;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.a;
import erd.g;
import crd.b;
import brd.t;
import rf5.u;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.d;
import jta.d;
import joc.z;

public final class b implements Runnable	// class@001641
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void run(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       c uoc = c.class;
       if (PatchProxy.applyVoid(null, tb, uoc, "6")) {
       }else if(tb.B == null || tb.getActivity() == null){
          tb.V8(false);
          o.b = PublishSubject.g();
          ViewGroup viewGroup = p1.h(tb.B, R.layout.arg_RES_7f0d0093);
          tb.C = viewGroup;
          k0.e(viewGroup);
          tb.B.addView(tb.C);
          int i = 0x7f0a36a6;
          FrameLayout uFrameLayout = tb.C.findViewById(i);
          if (!tb.q.enableSlidePlay()) {
             c z = tb.z;
             if (z != null) {
                z.a(uFrameLayout);
             }
          }
          tb.C.findViewById(R.id.fl_root_webview).setTranslationX((float)a1.h());
          String str = u.a(tb.r);
          if (!("4").equals(b.b(str))) {
             ViewGroup$MarginLayoutParams layoutParams = uFrameLayout.getLayoutParams();
             if (layoutParams.topMargin == null) {
                layoutParams.topMargin = p1.f(tb.getActivity());
             }
             uFrameLayout.setLayoutParams(layoutParams);
          }
          Intent intent = KwaiWebViewActivity.N3(tb.getActivity(), str).a();
          e.a(intent, str);
          WebViewFragment webViewFragm = PatchProxy.applyOneRefs(intent, tb, uoc, "7");
          if (webViewFragm != PatchProxyResult.class) {
          }else if(tb.N != null){
             i oi = new i(tb.r.mEntity, tb.getActivity(), intent.getExtras());
             tb.E = oi;
             webViewFragm = oi.b();
          }else {
             webViewFragm = new AdYodaFragment();
             j oj = new j(webViewFragm, tb.r.mEntity, tb.getActivity(), intent.getExtras());
             tb.D = oj;
             webViewFragm.Qh(oj.b());
          }
          webViewFragm.gh(new e(tb));
          webViewFragm.kh(new f(tb));
          e uoe = tb.getActivity().getSupportFragmentManager().beginTransaction();
          uoe.v(i, webViewFragm);
          uoe.o();
          tb.F = o.b.subscribe(new g(tb), a.b);
          tb.p.k(tb.getActivity());
          tb.p.G(new d(tb, str));
          uoc = tb.z;
          if (uoc != null) {
             uoc.c(tb.p);
          }
       }
       return;
    }
}
