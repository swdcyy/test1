package com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import txc.j;
import txc.k;
import ck8.a;
import com.yxcorp.gifshow.activity.SingleFragmentActivity;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.basic.MerchantYodaWebViewActivity;
import bt3.e;
import bt3.j$b;
import bt3.j;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$a;
import kx8.b;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$d;
import yoa.h;
import yoa.g;
import ps6.a;
import com.yxcorp.gifshow.growth.util.a;
import cra.n;
import java.util.HashMap;
import java.util.List;
import android.content.Context;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.Intent;
import android.app.Activity;
import android.content.ComponentName;
import com.kwai.yoda.Yoda;
import java.lang.StringBuilder;
import yz7.r;
import com.yxcorp.gifshow.webview.c;
import java.util.Map;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import uxc.g;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.io.Serializable;
import ekd.j0;
import java.lang.Number;
import android.content.res.Resources;
import com.yxcorp.utility.TextUtils;
import com.kwai.performance.stability.crash.monitor.util.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import yz7.e;
import java.lang.Boolean;
import android.net.Uri;
import ekd.w0;
import java.lang.CharSequence;
import uv8.g1;
import java.lang.Throwable;
import q87.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.view.ContextThemeWrapper;
import com.google.android.play.core.splitinstall.SplitInstallHelper;
import uxc.d;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.kwai.yoda.event.d;
import android.os.Bundle;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import java.lang.System;
import android.os.SystemClock;
import java.util.Iterator;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import ekd.x0;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$b;
import e17.i;
import com.kwai.yoda.util.a;
import java.lang.Exception;
import jyc.b;
import android.view.Window;
import ekd.i;
import mz7.a;
import nz7.e;
import sz7.l;
import com.kwai.sdk.switchconfig.a;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import ry7.e;
import java.lang.Long;
import s66.a;
import com.kwai.yoda.session.logger.webviewload.ExtraInfo;
import lnc.u1;
import com.kwai.yoda.helper.WebViewMemOptHelper;
import txc.d;
import sy7.b;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;

public class KwaiYodaWebViewActivity extends SingleFragmentActivity implements WebViewFragment$b, j, k, a	// class@001357
{
    public boolean A;
    public boolean B;
    public int C;
    public Map D;
    public String E;
    public Boolean F;
    public WebViewFragment y;
    public String z;
    public static KwaiYodaWebViewActivity$b G;
    public static List H;
    public static CopyOnWriteArrayList I;

    static {
       KwaiYodaWebViewActivity kwaiYodaWebV = KwaiYodaWebViewActivity.class;
       KwaiYodaWebViewActivity.H = new ArrayList();
       if (PatchProxy.applyVoid(null, null, kwaiYodaWebV, "1")) {
       }else if(PatchProxy.applyVoid(null, null, MerchantYodaWebViewActivity.class, "1")){
          KwaiYodaWebViewActivity.G = new e();
       }
       if (!PatchProxy.applyVoid(null, null, j$b.class, "1")) {
          KwaiYodaWebViewActivity.J3(new j());
       }
       if (!PatchProxy.applyVoid(null, null, kwaiYodaWebV, "2")) {
          if (!PatchProxy.applyVoid(null, null, b.class, "1")) {
             KwaiYodaWebViewActivity.A3(new b());
          }
          if (!PatchProxy.applyVoid(null, null, h.class, "1")) {
             KwaiYodaWebViewActivity.A3(new g());
          }
       }
       if (!PatchProxy.applyVoid(null, null, kwaiYodaWebV, "3")) {
          if (!PatchProxy.applyVoid(null, null, a.class, "1")) {
             KwaiYodaWebViewActivity.J3(new a());
          }
          if (!PatchProxy.applyVoid(null, null, a.class, "2")) {
             KwaiYodaWebViewActivity.J3(new n());
          }
       }
    }
    public void KwaiYodaWebViewActivity(){
       super();
       this.B = false;
       this.C = 0;
       this.D = new HashMap();
       this.E = null;
       this.F = null;
    }
    public static void A3(KwaiYodaWebViewActivity$d p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KwaiYodaWebViewActivity.class, "6")) {
          return;
       }
       KwaiYodaWebViewActivity.H.add(p0);
       return;
    }
    public static KwaiYodaWebViewActivity$c F3(Context p0,Class p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, KwaiYodaWebViewActivity.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiYodaWebViewActivity$c(p0, p1, p2);
    }
    public static KwaiYodaWebViewActivity$c G3(Context p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, KwaiYodaWebViewActivity.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KwaiYodaWebViewActivity$c(p0, p1);
    }
    public static void J3(KwaiYodaWebViewActivity$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KwaiYodaWebViewActivity.class, "7")) {
          return;
       }
       if (KwaiYodaWebViewActivity.I == null) {
          KwaiYodaWebViewActivity.I = new CopyOnWriteArrayList();
       }
       KwaiYodaWebViewActivity.I.add(p0);
       return;
    }
    public static void L3(Context p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KwaiYodaWebViewActivity.class, "8")) {
          return;
       }
       Intent intent = KwaiYodaWebViewActivity.G3(p0, p1).a();
       if (!p0 instanceof Activity) {
          intent.addFlags(0x10000000);
       }
       String className = (intent.getComponent() != null)? intent.getComponent().getClassName(): "";
       Class jumpActivity = Yoda.get().getJumpActivity(p1, className);
       if (jumpActivity != null) {
          r.h("KwaiYodaWebViewActivity", "startActivity, setClass name:"+jumpActivity.getName());
          intent.setClass(p0, jumpActivity);
       }
       c.i(p0, intent);
       return;
    }
    public Object B3(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiYodaWebViewActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.D.get(p0);
    }
    public WebViewFragment$d C1(){
       return g.a(this);
    }
    public String C3(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj != null && obj.eh() != null) {
          return this.y.eh().getUrl();
       }
       return null;
    }
    public Serializable D3(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return j0.e(this.getIntent(), "KEY_EXTRA");
    }
    public int E3(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getResources().getColor(0x106000b);
    }
    public final void H3(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewActivity.class, "37")) {
          return;
       }
       e.v("web_url", TextUtils.k(this.getWebUrl()));
       e.v("current_web_url", TextUtils.k(this.C3()));
       e.v("url", TextUtils.k(this.getUrl()));
       return;
    }
    public void I3(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KwaiYodaWebViewActivity.class, "10")) {
          return;
       }
       this.D.put(p0, p1);
       return;
    }
    public boolean J(WebView p0,String p1){
       return g.d(this, p0, p1);
    }
    public void K3(boolean p0){
       this.A = p0;
    }
    public int M(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.y;
       if (obj == null) {
          return 1;
       }
       return obj.M();
    }
    public WebViewFragment R0(){
       return this.y;
    }
    public void S1(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebViewActivity.class, "5")) {
          return;
       }
       r.h("KwaiYodaWebViewActivity", "onSubPageRemoved, "+e.f(p0));
       return;
    }
    public String T1(){
       return g.c(this);
    }
    public boolean X2(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.F;
       if (obj != null) {
          return obj.booleanValue();
       }
       int i = 0;
       try{
          boolean b = (!TextUtils.x(w0.a(Uri.parse(this.C3()), "ignoreHole")))? true: false;
          this.F = Boolean.valueOf(b);
       }catch(java.lang.Exception e1){
          Object[] objArray = new Object[i];
          g1.C().u("KwaiYodaWebViewActivity", e1, objArray);
          this.F = Boolean.FALSE;
       }
       return this.F.booleanValue();
    }
    public int f(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.C;
       if (obj != null) {
          return obj;
       }
       return 0;
    }
    public void f3(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewActivity.class, "31")) {
          return;
       }
       if (this.B == null) {
          super.f3();
       }
       this.B = true;
       return;
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       SplitInstallHelper.loadResources(this, super.getResources());
       return super.getResources();
    }
    public int getStatusColor(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.getStatusColor();
    }
    public String getUrl(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          return "ks://yodaweb";
       }
       return obj.getUrl();
    }
    public String getWebUrl(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          return j0.f(this.getIntent(), "KEY_URL");
       }
       return obj.getWebUrl();
    }
    public boolean isCustomImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!("4").equals(this.z) && (("11").equals(this.z) || ("12").equals(this.z)))? true: false;
       return b;
    }
    public boolean isDarkImmersiveMode(){
       return true;
    }
    public boolean isImmersiveMode(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.isCustomImmersiveMode();
    }
    public void j1(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebViewActivity.class, "4")) {
          return;
       }
       String str = "KwaiYodaWebViewActivity";
       if (p0 != null) {
          r.h(str, "onReceiveBackParam, "+e.f(p0));
       }else {
          r.h(str, "onReceiveBackParam, empty data");
       }
       if (this.R0() == null) {
          return;
       }else {
          WebView webView = this.R0().eh();
          if (!webView instanceof YodaBaseWebView) {
             return;
          }else {
             d.f().c(webView, "YodaReceiveNavigateBackParamEvent", e.f(p0));
             return;
          }
       }
    }
    public String o(){
       KwaiYodaWebViewActivity obj = PatchProxy.apply(null, this, KwaiYodaWebViewActivity.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.y;
       if (obj == null) {
          return "";
       }
       return obj.o();
    }
    public void onCreate(Bundle p0){
       boolean b;
       boolean b1;
       Uri data;
       Intent intent;
       Intent intent1;
       Iterator iterator;
       int i;
       String str3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KwaiYodaWebViewActivity kwaiYodaWebV = KwaiYodaWebViewActivity.class;
       String str = "12";
       if (PatchProxy.applyVoidOneRefs(p0, this, kwaiYodaWebV, str)) {
          return;
       }
       q.b(a.a().a());
       long l = System.currentTimeMillis();
       long l1 = SystemClock.elapsedRealtime();
       Object[] objArray = null;
       KwaiYodaWebViewActivity$b obj = PatchProxy.apply(objArray, this, kwaiYodaWebV, "13");
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          CopyOnWriteArrayList i1 = KwaiYodaWebViewActivity.I;
          if (i1 != null) {
             Iterator iterator1 = i1.iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   if (iterator1.next().a(this, this.getWebUrl())) {
                      b = true;
                      break ;
                   }
                }
             }
          }
          b = false;
       }
       if (b) {
          super.onCreate(p0);
          this.H3();
          this.finish();
          return;
       }else {
          obj = PatchProxy.apply(objArray, this, kwaiYodaWebV, "21");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(this.getClass() != kwaiYodaWebV && this.getClass() != KwaiWebViewActivity.class){
             intent1 = this.getIntent();
             if (intent1 != null) {
                data = intent1.getData();
                if (data != null) {
                   str3 = x0.a(data, "url");
                label_0096 :
                   if (!TextUtils.x(str3)) {
                      obj = KwaiYodaWebViewActivity.G;
                      if (obj != null && obj.b(str3)) {
                         b1 = true;
                      }else if(this.getIntent() != null && (this.getIntent().getData() != null && ((this.getIntent().getData().toString()).contains("openFrom") || (this.getIntent().getData().toString()).contains("returnBack")))){
                         this.B = false;
                      }
                   }
                }
             }
             str3 = this.getWebUrl();
             goto label_0096 ;
          }
       label_007d :
          b1 = false;
          if (b1) {
             super.onCreate(p0);
             this.B = true;
             this.H3();
             this.finish();
             this.B = false;
             KwaiYodaWebViewActivity$b g = KwaiYodaWebViewActivity.G;
             if (g != null) {
                g.a(this, this.getIntent(), this.getWebUrl());
             }
             return;
          }else if(!c.d(this.getIntent())){
             i.a(R.style.arg_RES_7f110668, 0x7f100d71);
             super.onCreate(p0);
             this.H3();
             this.finish();
             return;
          }else if(this.getComponentName() != null && this.getIntent() != null){
             q.b(a.a().a());
             data = this.getIntent().getData();
             Class jumpActivity = (data != null && data.isHierarchical())? Yoda.get().getJumpActivity(data, ""): objArray;
             if (jumpActivity == null) {
                jumpActivity = Yoda.get().getJumpActivity(this.getWebUrl(), this.getComponentName().getClassName());
             }
             if (jumpActivity != null && !TextUtils.n(jumpActivity.getName(), this.getComponentName().getClassName())) {
                super.onCreate(p0);
                this.H3();
                this.finish();
                intent = this.getIntent();
                if (intent != null) {
                   intent.setClass(this, jumpActivity);
                }
                r.h("KwaiYodaWebViewActivity", "--- jump subBiz container activity: "+jumpActivity.getName());
                this.startActivity(intent);
                return;
             }
          }
          try{
          label_01ad :
             a.a(this);
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
          this.H3();
          if (!PatchProxy.applyVoid(objArray, this, kwaiYodaWebV, "15")) {
             intent1 = this.getIntent();
             if (intent1 != null) {
                String str1 = "KEY_THEME";
                String str2 = j0.f(intent1, str1);
                this.z = str2;
                if (TextUtils.x(str2)) {
                   str2 = b.b(this.getWebUrl());
                   this.z = str2;
                   intent1.putExtra(str1, str2);
                }
                i = 0x7f11015a;
                if (("1").equals(this.z) || ("3").equals(this.z)) {
                   this.setTheme(i);
                }else if(("2").equals(this.z)){
                   this.setTheme(R.style.arg_RES_7f110158);
                   Window window = this.getWindow();
                   if (window != null) {
                      window.addFlags(1024);
                   }
                }else if(("4").equals(this.z) || str.equals(this.z)){
                   this.setTheme(i);
                   i.i(this, false, false, true);
                }else if(("11").equals(this.z)){
                   i.i(this, false, true, true);
                }
             }
          }
          intent1 = this.getIntent();
          if (intent1 != null) {
             try{
                intent1.putExtra("pageStartTimestamp", l);
                intent1.putExtra("pageStartRealTime", l1);
                a uoa = new a();
                e uoe = uoa.c();
                uoe.k().m("activity");
                uoe.k().l(this.getClass().getSimpleName());
                uoe.v(this.getWebUrl(), "");
                if (a.t().d("pre_inject_cookie", false)) {
                   YodaCookie.f.d(this.getWebUrl(), true);
                }
                long l2 = 0;
                long longExtra = intent1.getLongExtra("buildIntentTimestamp", l2);
                if (longExtra - l2 > 0) {
                   uoe.x("build_intent", Long.valueOf(longExtra));
                }
                longExtra = intent1.getLongExtra("userIntentTimestamp", l2);
                if (longExtra - l2 > 0) {
                   uoe.x("user_click", Long.valueOf(longExtra));
                }
                uoe.w("page_start");
                intent1.putExtra("hasSessionId", uoa.b());
                if (Yoda.get().isColdStartWebView()) {
                   a.d("webview_user_click", String.valueOf(longExtra));
                   a.d("webview_csession_id", uoa.b());
                   a.d("webview_web_url", this.getWebUrl());
                }
                uoe.k().extraInfo.loadingWaitInfo = intent1.getStringExtra("loading_wait_info");
                c.g(intent1);
             }catch(java.lang.Exception e1){
                g1.C().e(this.getClass().getSimpleName(), "throw exception when putExtra£¬with intent.getExtras\(\) = "+intent1.getExtras(), e1);
             }
          }
       }
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewActivity.class, "18")) {
          return;
       }
       WebViewMemOptHelper.g.i(this, this.getWebUrl());
       u1.b(this);
       super.onDestroy();
       Iterator iterator = KwaiYodaWebViewActivity.H.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(this);
       }
       return;
    }
    public void onEventMainThread(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebViewActivity.class, "20")) {
          return;
       }
       this.finish();
       return;
    }
    public void onNewIntent(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebViewActivity.class, "14")) {
          return;
       }
       super.onNewIntent(p0);
       if (!c.d(p0)) {
          this.finish();
       }
       return;
    }
    public void onResume(){
       boolean b;
       KwaiYodaWebViewActivity kwaiYodaWebV = KwaiYodaWebViewActivity.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, kwaiYodaWebV, "16")) {
          return;
       }
       try{
          super.onResume();
          WebView obj = PatchProxy.apply(objArray, this, kwaiYodaWebV, "17");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             obj = this.R0().eh();
             b = (a.t().d("ks_auto_restore_render_kill", false) && obj instanceof YodaBaseWebView)? obj.isRenderProcessKilled(): false;
          }
          if (b) {
             this.R0().eh().reload();
          }
       }catch(java.lang.Exception e0){
          b.b.e("Try to auto restore fail", e0);
       }
       return;
    }
    public void r1(String p0){
       this.E = p0;
    }
    public Fragment u3(){
       Object[] objArray = null;
       Fragment obj = PatchProxy.apply(objArray, this, KwaiYodaWebViewActivity.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.y == null) {
          obj = this.w3();
          if (obj instanceof WebViewFragment) {
             this.y = obj;
             obj.lh(this);
             return objArray;
          }
       }
       KwaiYodaWebViewActivity ty = this.y;
       if (ty != null) {
          ty.lh(this);
          return this.y;
       }else {
          KwaiYodaWebViewFragment kwaiYodaWebV = new KwaiYodaWebViewFragment();
          this.y = kwaiYodaWebV;
          kwaiYodaWebV.lh(this);
          this.y.setArguments(this.getIntent().getExtras());
          return this.y;
       }
    }
    public int v3(){
       return 0x7f0a3698;
    }
    public void w1(WebViewFragment p0,WebView p1){
       g.b(this, p0, p1);
    }
    public int x3(){
       return 0x7f0d003c;
    }
    public String y(){
       return this.E;
    }
    public void z2(int p0){
       this.C = p0;
    }
}
