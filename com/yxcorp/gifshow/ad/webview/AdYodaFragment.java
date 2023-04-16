package com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import l59.g;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment$a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment$c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.webview.config.a;
import myc.k;
import com.kuaishou.webkit.WebChromeClient;
import com.yxcorp.gifshow.webview.view.c;
import ekd.i;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout;
import android.view.ViewGroup$MarginLayoutParams;
import k59.h2;
import m59.p;
import k59.d;
import k59.m1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.framework.model.feed.BaseFeed;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity;
import android.widget.TextView;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.yxcorp.gifshow.ad.util.k;
import com.kuaishou.commercial.splash.presenter.h;
import android.app.Activity;
import com.yxcorp.gifshow.ad.webview.q;
import wkd.b;
import ez.a;
import com.yxcorp.gifshow.ad.webview.RiskTipPresenter;
import com.yxcorp.gifshow.ad.award.presenter.webView.AwardVideoH5CountDownPresenter;
import iy8.b;
import k59.m2;
import k59.u2;
import k59.r2;
import com.yxcorp.gifshow.ad.webview.n;
import k59.s2;
import k59.b1;
import com.yxcorp.gifshow.webview.yoda.view.c;
import k59.a2;
import com.kuaishou.webkit.WebViewClient;
import k59.j2;
import com.yxcorp.gifshow.ad.webview.l;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment$d;

public class AdYodaFragment extends KwaiYodaWebViewFragment implements g	// class@0018a2
{
    public BaseFeed C;
    public PresenterV2 D;
    public d E;
    public AdYodaFragment$d F;
    public h2 G;
    public p H;

    public void AdYodaFragment(){
       super();
    }
    public KwaiEmptyStateView J0(){
       Object obj = PatchProxy.apply(null, this, AdYodaFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.xh();
    }
    public void Jh(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment.class, "4")) {
          return;
       }
       super.Jh();
       KwaiYodaWebViewFragment tr = this.r;
       if (tr == null) {
          return;
       }
       tr.setOnUrlChangeCallback(new AdYodaFragment$a(this));
       this.ch(new AdYodaFragment$b(this));
       AdYodaFragment$c uoc = new AdYodaFragment$c(this, this.r);
       if (this.getActivity() instanceof GifshowActivity) {
          uoc.g(new a(this.getActivity()));
       }
       this.r.setWebChromeClient(uoc);
       return;
    }
    public void Oh(String p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, AdYodaFragment.class, "6")) {
          return;
       }
       c uoc = this.vh();
       if (("4").equals(p0) && (i.c() && (uoc != null && uoc.l != null))) {
          i = n.A(a.B);
          ViewGroup$MarginLayoutParams layoutParams = uoc.l.getLayoutParams();
          if (layoutParams != null) {
             layoutParams.topMargin = i;
             uoc.l.setLayoutParams(layoutParams);
          }
       }
    label_003a :
       return;
    }
    public void Ph(h2 p0){
       this.G = p0;
    }
    public void Qh(p p0){
       this.H = p0;
    }
    public void Rh(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment.class, "9")) {
          return;
       }
       AdYodaFragment tE = this.E;
       if (tE != null) {
          d n = tE.n;
          if (n != null) {
             n.onClose();
          }
       }
       return;
    }
    public void Sh(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment.class, "8")) {
          return;
       }
       AdYodaFragment tE = this.E;
       if (tE != null) {
          d n = tE.n;
          if (n != null) {
             n.D();
          }
       }
       return;
    }
    public void Th(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment.class, "7")) {
          return;
       }
       AdYodaFragment tE = this.E;
       if (tE != null) {
          d n = tE.n;
          if (n != null) {
             n.a();
          }
       }
       return;
    }
    public View d4(){
       Object obj = PatchProxy.apply(null, this, AdYodaFragment.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.vh().b();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Bundle obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, AdYodaFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getArguments();
       if (obj != null) {
          Serializable serializable = SerializableHook.getSerializable(obj, "KEY_EXTRA");
          if (serializable instanceof BaseFeed) {
             this.C = serializable;
          }
       }
       return super.onCreateView(p0, p1, p2);
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment.class, "12")) {
          return;
       }
       super.onDestroy();
       AdYodaFragment tD = this.D;
       if (tD != null) {
          tD.destroy();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       c l;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdYodaFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, AdYodaFragment.class, "5") && !this.getActivity() instanceof AdYodaActivity) {
          l = this.vh();
          if (l != null) {
             l = l.l;
             if (l != null) {
                String str = "0";
                if (this.getArguments() != null) {
                   str = this.getArguments().getString("KEY_THEME", str);
                }
                if (("4").equals(str)) {
                   l.setBackgroundColor(i);
                   TextView titleTextVie = l.getTitleTextView();
                   if (titleTextVie != null) {
                      titleTextVie.setTextColor(i);
                   }
                }
             }
          }
       }
       if (this.C == null) {
          return;
       }else if(PatchProxy.applyVoidOneRefs(p0, this, AdYodaFragment.class, "16")){
          this.E = new d();
          p1 = this.getArguments();
          if (p1 != null) {
             this.E.l = p1.getLong("KEY_EXTRA_ENTER_TIME", 0);
             this.E.j = p1.getBoolean("KEY_EXTRA_SHOULD_ADD_AVATAR_HEAD_INFO", i);
             this.E.e = p1.getBoolean("KEY_EXTRA_DISPLAY_PLAYABLE_POPUP", i);
             p1.o = this.getArguments().getBoolean("KEY_EXTRA_ENABLE_OPEN_LANDING_PAGE", i);
          }
          p1.b = k.b(this.getWebUrl());
          AdYodaFragment tE = this.E;
          tE.g = this.k;
          tE.c = this;
          tE.d = this;
          tE.k = this.getWebUrl();
          tE = this.E;
          if (tE.e != null) {
             tE.h = new h(this.getActivity());
          }
          l = this.q.l;
          if (l == null) {
             l = p0.findViewById(R.id.title_root);
          }
          AdYodaFragment tE1 = this.E;
          tE1.i = l;
          tE1.m = this.G;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, AdYodaFragment.class, "10") && this.D == null) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.D = presenterV2;
          presenterV2.U7(new q());
          this.D.U7(b.a(-143737653).a());
          this.D.U7(new RiskTipPresenter());
          this.D.U7(new AwardVideoH5CountDownPresenter());
          this.D.U7(new b());
          if (this.E.j != null) {
             this.D.U7(new m2());
          }else {
             this.D.U7(new u2());
          }
          if (this.E.o != null) {
             this.D.U7(new r2());
          }
          this.D.U7(new n());
          this.D.U7(new s2());
          this.D.U7(new b1());
          this.D.f(p0);
       }
       Object[] objArray = new Object[]{this.C,this.E,this.getActivity(),this};
       this.D.i(objArray);
       return;
    }
    public c rh(){
       Object obj = PatchProxy.apply(null, this, AdYodaFragment.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a2(this, this.C, false);
    }
    public WebViewClient sh(){
       Object[] objArray = null;
       AdYodaFragment obj = PatchProxy.apply(objArray, this, AdYodaFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.H;
       if (obj != null) {
          objArray = obj.a(this.Ch(), this, objArray);
       }
       return objArray;
    }
    public c uh(View p0){
       AdYodaFragment obj = PatchProxy.applyOneRefs(p0, this, AdYodaFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.F;
       if (obj != null) {
          return obj.a(p0);
       }
       return new l(p0, this.Ah());
    }
}
