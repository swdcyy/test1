package com.yxcorp.gifshow.ad.webview.AdYodaActivity;
import sl9.d;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import java.util.HashSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.content.Intent;
import android.app.Activity;
import ekd.j0;
import mxb.j0;
import mxb.i0;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import k59.q1;
import erd.g;
import tyc.k3;
import java.util.Set;
import android.view.MotionEvent;
import java.lang.Boolean;
import java.util.Iterator;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import android.os.Bundle;
import k59.j2;
import java.io.Serializable;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import tw.j;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import nx8.k;
import ekd.x0;
import java.lang.IllegalArgumentException;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import lnc.f;
import java.lang.System;
import k59.p1;
import o49.d;
import com.yxcorp.gifshow.entity.QPhoto;
import p59.t;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import k59.r1;
import androidx.fragment.app.Fragment;
import m59.p;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import k59.o1;
import uxc.a;
import k59.n1;
import k59.h2;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.ad.webview.AdYodaActivity$a;
import com.yxcorp.gifshow.webview.api.WebViewFragment$a;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebSettings;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.ad.webview.o;
import com.google.common.base.Optional;
import com.kuaishou.android.model.feed.VideoFeed;
import tw.g;
import android.util.LruCache;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import r59.b;
import r59.i;
import com.yxcorp.gifshow.ad.webview.jshandler.d;
import zl9.b;
import p59.x;
import k59.a;
import r59.d;
import r59.h;
import r59.c;
import r59.f;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kuaishou.webkit.WebViewClient;
import m59.o;
import wkd.b;
import k59.d2;
import l59.b;
import com.kuaishou.webkit.DownloadListener;
import yx.j0;

public class AdYodaActivity extends KwaiYodaWebViewActivity implements d	// class@001899
{
    public BaseFeed J;
    public PhotoAdvertisement K;
    public int L;
    public int M;
    public boolean N;
    public AdDataWrapper$AdLogParamAppender O;
    public t P;
    public j2 Q;
    public d R;
    public Set S;
    public static final int T;

    public void AdYodaActivity(){
       super();
       this.S = new HashSet();
    }
    public final int M3(){
       Object obj = PatchProxy.apply(null, this, AdYodaActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.getIntent() == null) {
          return 0;
       }
       return j0.b(this.getIntent(), "extra_detail_ad_position", 0);
    }
    public void N3(){
       if (PatchProxy.applyVoid(null, this, AdYodaActivity.class, "10")) {
          return;
       }
       if (this.J != null) {
          i0.a().e(59, this.J).f(this.O).d(new q1(this)).a();
       }
       return;
    }
    public void P0(k3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdYodaActivity.class, "12")) {
          return;
       }
       this.S.add(p0);
       return;
    }
    public void T(k3 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdYodaActivity.class, "13")) {
          return;
       }
       this.S.remove(p0);
       return;
    }
    public boolean dispatchTouchEvent(MotionEvent p0){
       Iterator obj = PatchProxy.applyOneRefs(p0, this, AdYodaActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.S.isEmpty()) {
          obj = this.S.iterator();
          while (obj.hasNext()) {
             obj.next().onDispatchTouchEvent(p0);
          }
       }
       return super.dispatchTouchEvent(p0);
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, AdYodaActivity.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public String getUrl(){
       return "ks://photoadvertisement/webview";
    }
    public String o(){
       return "AD_YODA";
    }
    public void onCreate(Bundle p0){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AdYodaActivity uAdYodaActiv = AdYodaActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uAdYodaActiv, "1")) {
          return;
       }
       this.Q = new j2();
       this.J = this.D3();
       this.L = this.M3();
       AdYodaActivity tQ = this.Q;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, uAdYodaActiv, "8");
       long l = (obj != patchProxyRe)? obj.longValue(): j0.c(this.getIntent(), "KEY_EXTRA_AD_CLICK_TIME", 0);
       tQ.d(l);
       this.M = j0.b(this.getIntent(), "KEY_EXTRA_WEB_FORM_DETAIL_WEB", 1);
       this.N = j0.a(this.getIntent(), "KEY_EXTRA_DISABLE_LANDING_PAGE_DEEP_LINK", false);
       this.O = j0.e(this.getIntent(), "KEY_EXTRA_AD_LOG_APPENDER");
       tQ = this.J;
       if (tQ != null) {
          this.K = j.k(tQ);
       }
       String str = j0.f(this.getIntent(), "KEY_URL");
       if (TextUtils.x(str)) {
          Object obj1 = PatchProxy.apply(objArray, this, uAdYodaActiv, "2");
          if (obj1 != patchProxyRe) {
             str = obj1;
          }else {
             Uri data = this.getIntent().getData();
             if (data != null) {
                str = data.getHost();
                if (("kwai").equals(data.getScheme()) && ("adwebview").equals(str)) {
                   str1 = k.d(data.getQueryParameter("url"), this.J);
                label_00c3 :
                   str = str1;
                }
             }
             str1 = "";
             goto label_00c3 ;
          }
       }
       if (!TextUtils.x(str) && (x0.f(str) == null || x0.f(str).getHost() == null)) {
          this.getIntent().putExtra("KEY_URL", "");
          ExceptionHandler.handleCaughtException(new IllegalArgumentException(a.a.q(this.J)));
       }
       this.getIntent().putExtra("KEY_URL", k.d(f.a(str, this.J), this.J));
       super.onCreate(p0);
       long l1 = System.currentTimeMillis();
       this.Q.f(l1);
       this.getIntent().putExtra("KEY_EXTRA_ENTER_TIME", l1);
       if (this.J != null) {
          i0.a().e(50, this.J).f(this.O).d(new p1(this)).a();
          d.b(this.J, this.getWebUrl());
       }
       AdYodaActivity tJ = this.J;
       if (tJ != null && !TextUtils.x(tJ.getId())) {
          this.I3("key_qphoto", new QPhoto(this.J));
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, AdYodaActivity.class, "4")) {
          return;
       }
       super.onDestroy();
       AdYodaActivity tP = this.P;
       if (tP != null) {
          tP.b();
       }
       KwaiYodaWebViewActivity ty = this.y;
       if (ty instanceof AdYodaFragment) {
          ty.Rh();
       }
       this.Q.e(System.currentTimeMillis());
       long l = this.Q.a();
       long l1 = this.Q.b();
       int i = this.Q.c();
       if (this.J != null) {
          r1 or1 = new r1(this, l1, l, i);
          i0.a().e(52, this.J).f(this.O).d(v8).a();
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, AdYodaActivity.class, "6")) {
          return;
       }
       super.onPause();
       KwaiYodaWebViewActivity ty = this.y;
       if (ty instanceof AdYodaFragment) {
          ty.Sh();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, AdYodaActivity.class, "5")) {
          return;
       }
       super.onResume();
       AdYodaActivity tP = this.P;
       if (tP != null) {
          tP.c();
       }
       KwaiYodaWebViewActivity ty = this.y;
       if (ty instanceof AdYodaFragment) {
          ty.Th();
       }
       return;
    }
    public Fragment u3(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, AdYodaActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          return obj;
       }
       AdYodaFragment uAdYodaFragm = new AdYodaFragment();
       p op = new p(this, this.R0(), this.D3(), this.M3(), -1, -1, this.O, this.Q);
       uAdYodaFragm.Qh(v10);
       this.y = uAdYodaFragm;
       uAdYodaFragm.gh(new o1(this));
       this.y.Ph(new n1(this));
       this.y.lh(this);
       this.y.setArguments(this.getIntent().getExtras());
       this.y.ch(new AdYodaActivity$a(this));
       return this.y;
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AdYodaActivity.class, "3")) {
          return;
       }
       AdYodaActivity tK = this.K;
       if (tK == null || tK.mConversionType == 3) {
          p1.getSettings().setUserAgentString(p1.getSettings().getUserAgentString()+o.o);
       }
       p1.getSettings().setUserAgentString(p1.getSettings().getUserAgentString()+" AllowKsCallApp");
       if (p0 instanceof AdYodaFragment && p0.getArguments() != null) {
          p0.Oh(p0.getArguments().getString("KEY_THEME", "0"));
       }
       QPhoto qPhoto = new QPhoto(Optional.fromNullable(this.J).or(g.a()));
       t ot = new t();
       this.P = ot;
       ot.a = this;
       ot.b = p1;
       ot.d = this.J;
       ot.h.put("landingPageWebViewType", String.valueOf(2));
       g og = new g(p1, this);
       b uob = new b();
       i oi = new i(this.P);
       d.a(og, this.P, j0.f(this.getIntent(), "KEY_URL"));
       og.f(uob);
       og.f(oi);
       og.f(new x(this.P));
       a.a(og, p1);
       this.R = new d();
       if (j.g(this.J)) {
          this.R.k(new h(p1));
       }
       this.R.k(uob);
       this.R.k(oi);
       if (this.N != null) {
          this.R.k(new f());
       }
       WebViewClient webViewClien = p1.getWebViewClient();
       if (webViewClien instanceof o) {
          webViewClien.M(this.R);
          p1.setDownloadListener(b.a(0xb238bc2).b(this, qPhoto.mEntity, p1, webViewClien));
       }else {
          Object[] objArray = new Object[0];
          j0.c("AdYodaActivity", "webclient is not PhotoAdvertisementWebViewClient", objArray);
       }
       return;
    }
}
