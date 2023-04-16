package com.yxcorp.gifshow.ad.webview.AdYodaFragment2;
import l59.g;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import k59.j2;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2$a;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView$c;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2$c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.webview.config.a;
import myc.k;
import com.kuaishou.webkit.WebChromeClient;
import com.yxcorp.gifshow.commercial.api.web.AdYodaConfig;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import tw.j;
import com.kuaishou.webkit.WebSettings;
import com.kuaishou.webkit.WebView;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.ad.webview.o;
import mxb.j0;
import mxb.i0;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import k59.x1;
import erd.g;
import java.lang.System;
import k59.y1;
import k59.w1;
import o49.d;
import k59.d;
import k59.m1;
import com.yxcorp.gifshow.webview.view.c;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity2;
import android.widget.RelativeLayout;
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
import com.yxcorp.gifshow.ad.webview.AdPageJumpCheckPresenter;
import k59.z0;
import com.yxcorp.gifshow.ad.webview.n;
import k59.s2;
import k59.b1;
import k59.k1;
import com.yxcorp.gifshow.webview.yoda.view.c;
import k59.a2;
import com.kuaishou.webkit.WebViewClient;
import m59.p;
import com.yxcorp.gifshow.ad.webview.l;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment$d;

public class AdYodaFragment2 extends KwaiYodaWebViewFragment implements g	// class@0018a1
{
    public PresenterV2 C;
    public d D;
    public AdYodaFragment$d E;
    public h2 F;
    public List G;
    public p H;
    public final j2 I;
    public AdYodaConfig J;

    public void AdYodaFragment2(){
       super();
       this.I = new j2();
    }
    public KwaiEmptyStateView J0(){
       Object obj = PatchProxy.apply(null, this, AdYodaFragment2.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.xh();
    }
    public void Jh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AdYodaFragment2.class, "10")) {
          return;
       }
       super.Jh();
       KwaiYodaWebViewFragment tr = this.r;
       if (tr == null) {
          return;
       }
       tr.setOnUrlChangeCallback(new AdYodaFragment2$a(this));
       this.ch(new AdYodaFragment2$b(this));
       AdYodaFragment2$c uoc = new AdYodaFragment2$c(this, this.r);
       if (this.getActivity() instanceof GifshowActivity) {
          uoc.g(new a(this.getActivity()));
       }
       this.r.setWebChromeClient(uoc);
       tr = this.r;
       if (!PatchProxy.applyVoidOneRefs(tr, this, AdYodaFragment2.class, "11")) {
          AdYodaFragment2 tJ = this.J;
          if (tJ != null) {
             AdYodaConfig mFeed = tJ.mFeed;
             if (mFeed != null) {
                objArray = j.k(mFeed);
             }
          }
          if (objArray == null || objArray.mConversionType == 3) {
             tr.getSettings().setUserAgentString(tr.getSettings().getUserAgentString()+o.o);
          }
          tr.getSettings().setUserAgentString(tr.getSettings().getUserAgentString()+" AllowKsCallApp");
       }
       return;
    }
    public void Oh(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment2.class, "4")) {
          return;
       }
       AdYodaFragment2 tJ = this.J;
       if (tJ != null && tJ.mFeed != null) {
          i0.a().e(59, this.J.mFeed).f(this.J.mLogParamAppender).d(new x1(this)).a();
       }
       return;
    }
    public void Ph(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment2.class, "5")) {
          return;
       }
       this.I.e(System.currentTimeMillis());
       long l = this.I.a();
       long l1 = this.I.b();
       int i = this.I.c();
       AdYodaFragment2 tJ = this.J;
       if (tJ != null && tJ.mFeed != null) {
          y1 oy1 = new y1(this, l1, l, i);
          i0.a().e(52, this.J.mFeed).f(this.J.mLogParamAppender).d(v8).a();
       }
       return;
    }
    public void Qh(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment2.class, "2")) {
          return;
       }
       AdYodaFragment2 tJ = this.J;
       if (tJ != null && tJ.mFeed != null) {
          i0.a().e(50, this.J.mFeed).f(this.J.mLogParamAppender).d(new w1(this)).a();
          d.b(this.J.mFeed, this.getWebUrl());
       }
       return;
    }
    public void Rh(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment2.class, "16")) {
          return;
       }
       AdYodaFragment2 tD = this.D;
       if (tD != null) {
          d n = tD.n;
          if (n != null) {
             n.onClose();
          }
       }
       return;
    }
    public void Sh(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment2.class, "15")) {
          return;
       }
       AdYodaFragment2 tD = this.D;
       if (tD != null) {
          d n = tD.n;
          if (n != null) {
             n.D();
          }
       }
       return;
    }
    public void Th(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment2.class, "14")) {
          return;
       }
       AdYodaFragment2 tD = this.D;
       if (tD != null) {
          d n = tD.n;
          if (n != null) {
             n.a();
          }
       }
       return;
    }
    public View d4(){
       Object obj = PatchProxy.apply(null, this, AdYodaFragment2.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.vh().b();
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdYodaFragment2.class, "1")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       if (p0 == null) {
          return;
       }
       Serializable serializable = SerializableHook.getSerializable(p0, "AD_YODA_CONFIG");
       if (!serializable instanceof AdYodaConfig) {
          return;
       }
       this.J = serializable;
       this.I.d(serializable.mAdClickTime);
       this.I.f(this.J.mEnterTime);
       AdYodaFragment2 tJ = this.J;
       if (tJ != null && tJ.mIsPreload == null) {
          this.Qh();
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment2.class, "20")) {
          return;
       }
       super.onDestroy();
       AdYodaFragment2 tC = this.C;
       if (tC != null) {
          tC.destroy();
       }
       tC = this.J;
       if (tC != null && tC.mNotifyAdWebViewVisibleChanged != null) {
          this.Rh();
       }
       tC = this.J;
       if (tC != null && tC.mIsPreload == null) {
          this.Ph();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment2.class, "6")) {
          return;
       }
       super.onPause();
       AdYodaFragment2 tJ = this.J;
       if (tJ != null && tJ.mNotifyAdWebViewVisibleChanged != null) {
          this.Sh();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AdYodaFragment2.class, "7")) {
          return;
       }
       super.onResume();
       AdYodaFragment2 tJ = this.J;
       if (tJ != null && tJ.mNotifyAdWebViewVisibleChanged != null) {
          this.Th();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       c l;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdYodaFragment2.class, "8")) {
          return;
       }
       super.onViewCreated(p0, p1);
       int i = 0;
       if (!PatchProxy.applyVoid(null, this, AdYodaFragment2.class, "12") && !this.getActivity() instanceof AdYodaActivity2) {
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
       AdYodaFragment2 tJ = this.J;
       if (tJ != null && tJ.mFeed != null) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, AdYodaFragment2.class, "24")) {
             this.D = new d();
             tJ = this.getArguments();
             if (tJ != null) {
                this.D.l = tJ.getLong("KEY_EXTRA_ENTER_TIME", 0);
                this.D.j = tJ.getBoolean("KEY_EXTRA_SHOULD_ADD_AVATAR_HEAD_INFO", i);
                this.D.e = tJ.getBoolean("KEY_EXTRA_DISPLAY_PLAYABLE_POPUP", i);
                tJ.o = this.getArguments().getBoolean("KEY_EXTRA_ENABLE_OPEN_LANDING_PAGE", i);
             }
             tJ.b = k.b(this.getWebUrl());
             tJ = this.D;
             tJ.g = this.k;
             tJ.c = this;
             tJ.d = this;
             tJ.k = this.getWebUrl();
             tJ = this.D;
             if (tJ.e != null) {
                tJ.h = new h(this.getActivity());
             }
             l = this.q.l;
             if (l == null) {
                l = p0.findViewById(R.id.title_root);
             }
             AdYodaFragment2 tD = this.D;
             tD.i = l;
             tD.m = this.F;
             tD.p = this.G;
          }
          if (!PatchProxy.applyVoidOneRefs(p0, this, AdYodaFragment2.class, "17") && this.C == null) {
             PresenterV2 presenterV2 = new PresenterV2();
             this.C = presenterV2;
             presenterV2.U7(new q());
             this.C.U7(b.a(-143737653).a());
             this.C.U7(new RiskTipPresenter());
             this.C.U7(new AwardVideoH5CountDownPresenter());
             this.C.U7(new b());
             if (this.D.j != null) {
                this.C.U7(new m2());
             }else {
                this.C.U7(new u2());
             }
             if (this.D.o != null) {
                this.C.U7(new r2());
                this.C.U7(new AdPageJumpCheckPresenter());
                this.C.U7(new z0());
             }
             this.C.U7(new n());
             this.C.U7(new s2());
             this.C.U7(new b1());
             this.C.U7(new k1());
             this.C.f(p0);
          }
          Object[] objArray = new Object[]{this.J.mFeed,this.D,this.getActivity(),this};
          this.C.i(objArray);
       }
       return;
    }
    public c rh(){
       Object[] objArray = null;
       AdYodaConfig obj = PatchProxy.apply(objArray, this, AdYodaFragment2.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       AdYodaFragment2 tJ = this.J;
       if (tJ != null) {
          objArray = tJ.mFeed;
          obj = tJ.mNeedCheckOverScroll;
       }
       return new a2(this, objArray, obj);
    }
    public WebViewClient sh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AdYodaFragment2 obj = PatchProxy.apply(objArray, this, AdYodaFragment2.class, "18");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.H;
       if (obj != null) {
          return obj.a(this.Ch(), this, this.I);
       }
       obj = this.J;
       if (obj != null) {
          objArray = PatchProxy.applyOneRefs(obj, this, AdYodaFragment2.class, "19");
          if (objArray != patchProxyRe) {
          }else {
             p op = new p(this.getActivity(), this, obj.mFeed, obj.mAdPosition, obj.mWebSource, obj.mEntrySource, obj.mLogParamAppender, this.I);
             this.H = patchProxyRe;
             objArray = patchProxyRe.a(this.Ch(), this, this.I);
          }
       }
       return objArray;
    }
    public c uh(View p0){
       AdYodaFragment2 obj = PatchProxy.applyOneRefs(p0, this, AdYodaFragment2.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E;
       if (obj != null) {
          return obj.a(p0);
       }
       return new l(p0, this.Ah());
    }
}
