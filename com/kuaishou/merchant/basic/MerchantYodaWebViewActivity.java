package com.kuaishou.merchant.basic.MerchantYodaWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import android.content.Context;
import java.lang.String;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.net.Uri;
import java.lang.Integer;
import com.kuaishou.merchant.basic.MerchantYodaTranslucentWebViewActivity;
import android.content.Intent;
import android.app.Activity;
import gr8.a;
import q74.d;
import androidx.fragment.app.FragmentActivity;
import dt3.c;
import com.kuaishou.merchant.live.screenshot.b;
import androidx.lifecycle.Lifecycle$Event;
import bt3.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import z1.k;
import android.content.res.Resources;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ot3.n0;
import kb4.j;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import p74.a;
import o74.a;
import eb4.b;
import eb4.b$a;
import java.util.Objects;
import com.kuaishou.merchant.router.redirect.RedirectLogBiz;
import java.lang.System;
import kotlin.jvm.internal.a;
import com.kuaishou.merchant.router.ruleengine.RuleEngine;
import eb4.a;
import java.lang.Throwable;
import bt3.d;
import com.kuaishou.merchant.router.RouterConfig;
import us3.f;
import us3.g;
import com.kuaishou.merchant.router.b;
import com.kuaishou.merchant.basic.activity.plugin.MakeActivityHalfScreenPlugin;
import com.kuaishou.merchant.basic.activity.plugin.MakeActivityHalfScreenPlugin$a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.kuaishou.merchant.basic.MerchantYodaWebViewFragment;
import com.kuaishou.webkit.WebView;
import com.kuaishou.webkit.WebSettings;
import java.lang.StringBuilder;

public class MerchantYodaWebViewActivity extends KwaiYodaWebViewActivity	// class@0015a1
{
    public b J;
    public boolean K;
    public static final int L;

    public void MerchantYodaWebViewActivity(){
       super();
       this.K = false;
    }
    public static KwaiYodaWebViewActivity$c G3(Context p0,String p1){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       MerchantYodaWebViewActivity merchantYoda = MerchantYodaWebViewActivity.class;
       Object obj = null;
       MerchantYodaWebViewActivity obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, merchantYoda, "8");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = PatchProxy.applyOneRefs(p1, obj, merchantYoda, "9");
       if (obj1 != patchProxyRe) {
       }else {
          try{
             obj = PatchProxy.applyOneRefs(p1, obj, merchantYoda, "10");
             b = true;
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(TextUtils.isEmpty(p1)){
                Uri uri = Uri.parse(p1);
                if (uri != null) {
                   String queryParamet = uri.getQueryParameter("isTranslucent");
                   if (queryParamet != null && (TextUtils.isEmpty(queryParamet) || Integer.parseInt(queryParamet) != b)) {
                   }
                }
             }
          }catch(java.lang.NumberFormatException e0){
             b = false;
          }
          if (b) {
             merchantYoda = MerchantYodaTranslucentWebViewActivity.class;
          }
          obj1 = merchantYoda;
       }
       return KwaiYodaWebViewActivity.F3(p0, obj1, p1);
    }
    public boolean M3(){
       Object obj = PatchProxy.apply(null, this, MerchantYodaWebViewActivity.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.getIntent().getBooleanExtra("isHalf", false);
    }
    public final void N3(){
       if (PatchProxy.applyVoid(null, this, MerchantYodaWebViewActivity.class, "4")) {
          return;
       }
       d.b(this);
       c.a(this);
       b uob = new b();
       this.J = uob;
       uob.c(this, Lifecycle$Event.ON_START, 89, new c(this));
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, MerchantYodaWebViewActivity.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public void onCreate(Bundle p0){
       j oj1;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, MerchantYodaWebViewActivity.class, "2")) {
          return;
       }
       super.onCreate(p0);
       Intent intent = this.getIntent();
       String str = "MerchantYodaUtils";
       String str1 = "KEY_URL";
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RuleEngine obj1 = PatchProxy.applyTwoRefs(obj, intent, null, n0.class, "1");
       int i = 1;
       if (obj1 != patchProxyRe) {
       }else if(a.t().d("MERCHANT_WEB_IMPORT_TRAFFIC_CONTROL", false) && (intent == null || TextUtils.x(intent.getStringExtra(str1)))){
          Uri uri = Uri.parse(intent.getStringExtra(str1));
          a.t(MerchantCommonLogBiz.WEB, str, "h5 redirected", "url", uri.getPath());
          b uob = b.f.a(obj);
          Objects.requireNonNull(uob);
          j oj = PatchProxy.applyThreeRefs(uri, null, this, uob, b.class, "3");
          if (oj != patchProxyRe) {
             obj1 = oj;
          }else if(!a.t().d("MERCHANT_ROUTER_IMPORT_RULE_ENGINE", false)){
             a.s(RedirectLogBiz.REDIRECT_SYSTEM, "RedirectManager", "redirect downgrade");
             oj1 = new j(i, "", uri);
          }else {
             long l = System.currentTimeMillis();
             uob.c();
             obj1 = b.e;
             if (obj1 != null) {
                a.m(obj1);
                if (obj1.f()) {
                   obj1 = b.e;
                   a.m(obj1);
                   j oj2 = obj1.a(uri);
                   try{
                      Activity uActivity = uob.b(obj);
                      Activity uActivity1 = (uActivity != null)? uob.b(uActivity): null;
                      a.a.a(uri, oj2, uActivity1, uActivity, this, (System.currentTimeMillis() - l));
                   }catch(java.lang.Exception e0){
                      a.l(RedirectLogBiz.REDIRECT_SYSTEM, "RedirectManager", "recordFailed", e0);
                   }
                   obj1 = oj2;
                }
             }
             a.A(RedirectLogBiz.REDIRECT_SYSTEM, "RedirectManager", "engineNotReady");
             oj1 = new j(2, "not init", uri);
          }
          obj1 = oj1;
       }
       if (obj1 != null) {
          if (obj1.a != 400) {
             i = 0;
          }
          if (i) {
             b.n(obj, obj1.c.toString(), null, null, new d(obj));
          label_0130 :
             return;
          }
       }
       this.N3();
       goto label_0130 ;
    }
    public void onResume(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MerchantYodaWebViewActivity.class, "7")) {
          return;
       }
       super.onResume();
       if (this.K == null) {
          if (!PatchProxy.applyVoidOneRefs(this, objArray, MakeActivityHalfScreenPlugin.class, "13")) {
             MakeActivityHalfScreenPlugin$a f = MakeActivityHalfScreenPlugin.f;
             Objects.requireNonNull(f);
             if (!PatchProxy.applyVoidOneRefs(this, f, MakeActivityHalfScreenPlugin$a.class, "5") && (f.b(this.getIntent()) && this.getSupportFragmentManager() != null)) {
                Fragment uFragment = this.getSupportFragmentManager().findFragmentByTag("make_activity_half_screen_plugin");
                if (uFragment != null) {
                   c supportFragm = this.getSupportFragmentManager();
                   if (supportFragm != null) {
                      e uoe = supportFragm.beginTransaction();
                      if (uoe != null) {
                         e uoe1 = uoe.u(uFragment);
                         if (uoe1 != null) {
                            uoe1.l();
                         }
                      }
                   }
                }
             }
          }
          this.K = true;
       }
       return;
    }
    public Fragment u3(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, MerchantYodaWebViewActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null) {
          obj.lh(this);
          return this.y;
       }else {
          MerchantYodaWebViewFragment merchantYoda = new MerchantYodaWebViewFragment();
          this.y = merchantYoda;
          merchantYoda.lh(this);
          this.y.setArguments(this.getIntent().getExtras());
          return this.y;
       }
    }
    public void w1(WebViewFragment p0,WebView p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantYodaWebViewActivity.class, "6")) {
          return;
       }
       p1.getSettings().setUserAgentString(p1.getSettings().getUserAgentString()+" MerchantWeb/1.0");
       return;
    }
}
