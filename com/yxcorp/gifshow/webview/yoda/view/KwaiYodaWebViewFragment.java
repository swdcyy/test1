package com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import ml8.d;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment$a;
import java.util.HashMap;
import vxc.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebView;
import tkd.b;
import tkd.d;
import vxc.f;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import yb7.b;
import com.kwai.yoda.controller.YodaWebViewFragmentController;
import java.lang.CharSequence;
import android.text.TextUtils;
import mz7.b;
import java.util.Objects;
import mz7.a;
import java.util.Map;
import nz7.e;
import sz7.l;
import com.kwai.yoda.Yoda;
import s66.a;
import java.lang.Long;
import java.lang.System;
import android.os.SystemClock;
import java.lang.Boolean;
import com.kwai.yoda.model.LaunchModel;
import ryc.c;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication;
import brd.t;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import syc.i;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.webview.yoda.view.c;
import com.kwai.yoda.controller.YodaWebViewController;
import syc.g;
import java.lang.Throwable;
import android.util.Log;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.yxcorp.gifshow.webview.yoda.c;
import java.lang.IllegalStateException;
import k59.a;
import kotlin.jvm.internal.a;
import p55.a;
import com.yxcorp.gifshow.webview.helper.e;
import txc.b;
import yx.j0;
import k59.b;
import f55.a;
import com.kwai.bridge.context.AbsBridgeContext;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment;
import com.yxcorp.gifshow.ad.webview.AdYodaFragment2;
import java.lang.Integer;
import android.app.Application;
import o56.a;
import com.yxcorp.utility.repo.a;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import android.os.Parcelable;
import org.parceler.b;
import p59.t;
import android.util.LruCache;
import com.yxcorp.gifshow.ad.webview.jsbridge.g;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.ad.webview.jshandler.d;
import p59.x;
import zl9.b;
import y55.a;
import vxc.c0;
import com.kwai.yoda.bridge.NewYodaJavascriptBridge;
import com.yxcorp.gifshow.webview.yoda.function.a;
import ny7.a;
import com.kwai.yoda.kernel.bridge.YodaWebBridge;
import com.yxcorp.gifshow.webview.yoda.function.d;
import oyc.d;
import com.yxcorp.gifshow.webview.yoda.function.e;
import com.yxcorp.gifshow.webview.yoda.function.h;
import oyc.g;
import oyc.h;
import com.yxcorp.gifshow.webview.yoda.function.GetStabilityInfoFunction;
import com.yxcorp.gifshow.webview.view.c;
import syc.f;
import lnc.c3$a;
import lnc.c3;
import android.view.View;
import android.widget.RelativeLayout;
import com.yxcorp.gifshow.webview.jsmodel.JsEmitParameter;
import com.kwai.yoda.event.d;
import ekd.m1;
import java.lang.Number;
import myc.b;
import com.kwai.yoda.model.LaunchModelInternal;
import com.yxcorp.gifshow.webview.yoda.view.f;
import lnc.c3$b;
import uxc.a;
import com.kwai.yoda.model.PageStyleParams;
import com.kwai.yoda.model.StatusBarParams;
import px7.c;
import android.util.Pair;
import uxc.b;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import myc.h;
import o56.c;
import com.yxcorp.gifshow.webview.yoda.utils.q;
import com.yxcorp.gifshow.webview.c;
import java.lang.StringBuilder;
import yz7.r;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.google.gson.JsonObject;
import c97.d;
import r97.a0;
import uxc.e$a;
import uxc.e;
import android.net.Uri;
import ekd.x0;
import px7.b;
import yz7.c;
import android.graphics.Color;
import ca7.u;
import lyc.a;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import com.kwai.yoda.model.PullDownTypeParams;
import ekd.i;
import android.content.Context;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import lnc.a1;
import com.yxcorp.gifshow.webview.api.WebViewFragment$d;
import android.widget.RelativeLayout$LayoutParams;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.webview.yoda.g;
import com.yxcorp.gifshow.webview.yoda.g$b;
import syc.j;
import ekd.w0;
import java.lang.Exception;
import java.util.Collection;
import java.util.Iterator;
import com.yxcorp.gifshow.webview.helper.event.JsNativeEventCommunication$b;
import com.kuaishou.webkit.WebViewClient;
import com.yxcorp.gifshow.webview.api.WebViewFragment$c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import syc.h;
import com.yxcorp.gifshow.webview.config.e;
import com.kuaishou.webkit.DownloadListener;
import byc.c;
import myc.k;
import com.yxcorp.gifshow.webview.config.a;
import syc.b;
import com.yxcorp.gifshow.webview.yoda.g$c;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import qyc.d;

public class KwaiYodaWebViewFragment extends WebViewFragment implements d	// class@0017e3
{
    public a A;
    public c k;
    public b l;
    public a m;
    public WebViewFragment$b n;
    public e o;
    public final Map p;
    public c q;
    public KwaiYodaWebView r;
    public View s;
    public boolean t;
    public boolean u;
    public boolean v;
    public JsNativeEventCommunication w;
    public e x;
    public boolean y;
    public boolean z;
    public static final int B;

    public void KwaiYodaWebViewFragment(){
       super();
       this.n = new KwaiYodaWebViewFragment$a(this);
       this.p = new HashMap();
       this.t = false;
       this.u = true;
       this.v = true;
       this.z = false;
    }
    private e yh(){
       YodaBaseWebView obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.o == null) {
          obj = this.Ch();
          this.o = (obj instanceof KwaiYodaWebView)? obj.getJsInjectKwai(): d.a(-1995910978).gL();
       }
    label_0034 :
       return this.o;
    }
    public String Ah(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getArguments() != null) {
          return this.getArguments().getString("KEY_LEFT_TOP_BTN_TYPE");
       }
       return "back";
    }
    public String Bh(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "59");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.d(this.getArguments(), "KEY_PAGE_URI", null);
    }
    public YodaBaseWebView Ch(){
       KwaiYodaWebViewFragment obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "46");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          return null;
       }
       return obj.getWebView();
    }
    public final void Dh(){
       String obj;
       a uoa;
       boolean b;
       long longx1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiYodaWebViewFragment.class, "4")) {
          return;
       }
       Bundle arguments = this.getArguments();
       String str = (arguments != null)? arguments.getString("hasSessionId"): objArray;
       if (!TextUtils.isEmpty(str)) {
          b d = b.d;
          Objects.requireNonNull(d);
          obj = PatchProxy.applyOneRefs(str, d, b.class, "1");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else if(str == null || !str.length()){
             obj = 1;
          }else {
             obj = null;
          }
          if (!obj) {
             uoa = b.a.get(str);
          }
          this.A = objArray;
       }
       if (this.A != null) {
          return;
       }else {
          uoa = new a();
          this.A = uoa;
          uoa.c().k().m("fragment");
          this.A.c().k().l(this.getClass().getSimpleName());
          this.A.c().v(this.getWebUrl(), "");
          b = Yoda.get().isColdStartWebView();
          if (b) {
             a.d("webview_csession_id", this.A.b());
             a.d("webview_web_url", this.getWebUrl());
          }
          obj = "pageStartTimestamp";
          long l = 0;
          if (TextUtils.isEmpty(str) && arguments != null) {
             long longx = arguments.getLong("userIntentTimestamp", l);
             if (longx - l > 0) {
                this.A.c().x("user_click", Long.valueOf(longx));
                if (b) {
                   a.d("webview_user_click", String.valueOf(longx));
                }
             }
             longx1 = arguments.getLong(obj, l);
          }else {
             longx1 = l;
          }
          str = "page_start";
          if (longx1 - l > 0) {
             this.A.c().x(str, Long.valueOf(longx1));
          }else {
             longx1 = System.currentTimeMillis();
             this.A.c().x(str, Long.valueOf(longx1));
             this.getArguments().putLong(obj, longx1);
             this.getArguments().putLong("pageStartRealTime", SystemClock.elapsedRealtime());
          }
          return;
       }
    }
    public boolean Eh(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.Gh()) {
          return ("default").equals(this.k.getLaunchModel().getTopBarPosition());
       }
       return this.u;
    }
    public boolean Fh(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (c.b(this.k.getLaunchModel().getTopBarPositionGrade())) {
          return this.k.getLaunchModel().isEnableProgress();
       }
       return this.v;
    }
    public final boolean Gh(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (c.b(this.k.getLaunchModel().getTopBarPositionGrade())) {
          return true;
       }
       if ((this.getArguments().getString("KEY_THEME", "0")).equals("0")) {
          return true;
       }
       return false;
    }
    public boolean Hh(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.Gh()) {
          return (("default").equals(this.k.getLaunchModel().getTopBarPosition()) ^ 0x01);
       }
       return this.t;
    }
    public void Ih(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewFragment.class, "18")) {
          return;
       }
       if (!this.w.k()) {
          return;
       }
       this.Z0().compose(c.c(this.m(), FragmentEvent.DESTROY_VIEW)).subscribe(new i(this), h.b);
       return;
    }
    public void Jh(){
       int i;
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewFragment.class, "13")) {
          return;
       }
       c uoc = this.rh();
       this.k = uoc;
       uoc.setContainerSession(this.A);
       KwaiYodaWebViewFragment tk = this.k;
       tk.k = new g(this);
       try{
          i = 1;
          tk.k();
       }catch(android.util.AndroidRuntimeException e0){
          ExceptionHandler.handleCaughtException(e0);
          this.k.j();
          this.z = i;
       }catch(java.lang.Exception e0){
          Log.getStackTraceString(e0);
          this.k.j();
          this.z = i;
       }
       return;
    }
    public void Kh(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewFragment.class, "48")) {
          return;
       }
       c uoc = this.k.g();
       Objects.requireNonNull(uoc);
       if (!PatchProxy.applyVoid(null, uoc, c.class, "2")) {
          c g = uoc.g;
          if (g != null && !g.isDisposed()) {
             uoc.g.dispose();
             uoc.g = null;
          }
       }
       return;
    }
    public void Lh(){
       Object[] objArray1;
       BaseFeed obj;
       int i1;
       a b;
       t ot;
       g og;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KwaiYodaWebViewFragment.class, "41")) {
          return;
       }
       KwaiYodaWebViewFragment tr = this.r;
       if (tr == null) {
          Log.getStackTraceString(new IllegalStateException("init config WebView didn\'t finish completely."));
          return;
       }else {
          String str = "1";
          if (!PatchProxy.applyVoidTwoRefs(tr, this, objArray, KwaiYodaWebViewFragment.class, str)) {
             a uoa = a.class;
             if (!PatchProxy.applyVoidTwoRefs(tr, this, objArray, uoa, str)) {
                a.p(tr, "webView");
                a.p(this, "fragment");
                a uoa1 = e.e(tr);
                String str1 = "AdBridgeRegister";
                int i = 0;
                if (!uoa1 instanceof b) {
                   objArray1 = new Object[i];
                   j0.c(str1, "bridge context is not H5BridgeContext", objArray1);
                }else {
                   b uob = new b(uoa1);
                   String str2 = "KwaiAd";
                   uoa1.m(str2, "callAdBridge", uob);
                   uoa1.m(str2, "callCardHandler", uob);
                   if (this instanceof AdYodaFragment || this instanceof AdYodaFragment2) {
                      objArray1 = new Object[i];
                      j0.f(str1, "bridge Service is already exist", objArray1);
                   }else {
                      Bundle arguments = this.getArguments();
                      Object[] objArray2 = (arguments != null)? arguments.get("config"): objArray;
                      if (!objArray2 instanceof Bundle) {
                         objArray2 = objArray;
                      }
                      objArray2 = (objArray2 != null)? objArray2.get("ext_map"): objArray;
                      if (!objArray2 instanceof HashMap) {
                         objArray2 = objArray;
                      }
                      str2 = "feedSaveId";
                      Object[] objArray3 = (objArray2 != null)? objArray2.get(str2): objArray;
                      if (objArray3 != null) {
                         obj = objArray2.get(str2);
                         Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
                         i1 = obj.intValue();
                      }else {
                         i1 = 0;
                      }
                      obj = a.b(a.b()).a(i1, this.getActivity());
                      if (obj == null) {
                         try{
                            Bundle arguments1 = this.getArguments();
                            Object[] objArray5 = (arguments1 != null)? arguments1.get("key_photo"): objArray;
                            if (!objArray5 instanceof Parcelable) {
                               objArray5 = objArray;
                            }
                            obj = b.a(objArray5);
                         }catch(java.lang.Exception e8){
                            Object[] objArray4 = new Object[i];
                            j0.d(str1, e8, objArray4);
                         }
                      }
                   }
                }
             }
             if (!PatchProxy.applyVoidTwoRefs(tr, this, objArray, c0.class, str)) {
                tr.getJavascriptBridge().o("component", "bindPhone", new a(tr, this.getActivity()));
                tr.getJavascriptBridge().o("component", "download", new d(tr, this.getActivity()));
                tr.getJavascriptBridge().o("component", "emitFreeTrafficUpdate", new d(tr));
                tr.getJavascriptBridge().o("component", "gete2", new e(tr, this.getActivity()));
                tr.getJavascriptBridge().o("ui", "showBottomSheet", new h(tr, this.getActivity()));
                tr.getJavascriptBridge().o("webview", "openKsWebview", new g(tr, this.getActivity()));
                tr.getJavascriptBridge().o("tool", "setClipBoard", new h(tr));
                tr.getJavascriptBridge().o("system", "getStabilityInfo", new GetStabilityInfoFunction());
             }
          }
          return;
       }
    }
    public int M(){
       return 1;
    }
    public void Mh(boolean p0){
       if (PatchProxy.isSupport(KwaiYodaWebViewFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiYodaWebViewFragment.class, "27")) {
          return;
       }
       c3.c(this.q.l, new f(this, p0));
       return;
    }
    public void Nh(boolean p0){
       if (PatchProxy.isSupport(KwaiYodaWebViewFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiYodaWebViewFragment.class, "37")) {
          return;
       }
       if (p0) {
          Integer integer = this.wh(this.q.l);
          if (integer != null && !integer.intValue()) {
             integer = this.wh(this.s);
             if (integer != null) {
                this.y = true;
                this.q.l.setBackgroundColor(integer.intValue());
             }
          }
       }else if(this.y != null){
          this.y = false;
          this.q.l.setBackgroundColor(false);
       }
       return;
    }
    public void dh(JsEmitParameter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebViewFragment.class, "64")) {
          return;
       }
       d.f().c(this.Ch(), p0.mType, p0.mData);
       this.w.c(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebViewFragment.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a16a3);
       return;
    }
    public WebView eh(){
       return this.Ch();
    }
    public int getLayoutResId(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Bundle obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "6");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.getArguments();
       String str = "0";
       if (obj != null) {
          str = obj.getString("KEY_THEME", str);
       }
       Object obj1 = PatchProxy.applyOneRefs(str, null, b.class, "3");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = b.a.get(str);
       }
       if (obj1 == null) {
          obj1 = Integer.valueOf(R.layout.arg_RES_7f0d1709);
       }
       return obj1.intValue();
    }
    public int getPage(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, KwaiYodaWebViewFragment.class, "54");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       if (TextUtils.equals(this.Bh(), "ks://reward_record")) {
          return 67;
       }
       obj = PatchProxy.apply(objArray, this, KwaiYodaWebViewFragment.class, "60");
       int i = (obj != patchProxyRe)? obj.intValue(): b.b(this.getArguments(), "KEY_PAGE", 0);
       return i;
    }
    public String getUrl(){
       String obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "58");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (TextUtils.isEmpty(this.Bh()))? "ks://webview": this.Bh();
       return obj;
    }
    public String getWebUrl(){
       KwaiYodaWebViewFragment obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "63");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null || obj.getLaunchModel() == null) {
          return c3.b(this.getArguments(), f.a, "");
       }
       return this.k.getLaunchModel().getUrl();
    }
    public void gh(a p0){
       this.m = p0;
    }
    public void hh(int p0){
       if (PatchProxy.isSupport(KwaiYodaWebViewFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiYodaWebViewFragment.class, "53")) {
          return;
       }
       PageStyleParams pageStylePar = new PageStyleParams();
       String str = (!p0)? "default": "none";
       pageStylePar.mPosition = str;
       c.d(this.Ch(), pageStylePar);
       return;
    }
    public void ih(Pair p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebViewFragment.class, "45")) {
          return;
       }
       Pair first = p0.first;
       if (first != null) {
          p0 = p0.second;
          if (p0 != null) {
             this.p.put(first, p0);
          }
       }
       return;
    }
    public void jh(boolean p0){
       if (PatchProxy.isSupport(KwaiYodaWebViewFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiYodaWebViewFragment.class, "52")) {
          return;
       }
       this.Ch().getLaunchModel().setEnableLoading(false);
       return;
    }
    public void kh(b p0){
       this.l = p0;
    }
    public void lh(WebViewFragment$b p0){
       if (p0 != null) {
          this.n = p0;
       }
       return;
    }
    public void mh(int p0){
       if (PatchProxy.isSupport(KwaiYodaWebViewFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiYodaWebViewFragment.class, "50")) {
          return;
       }
       this.Ch().setProgress(p0);
       return;
    }
    public void nh(int p0){
       if (PatchProxy.isSupport(KwaiYodaWebViewFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, KwaiYodaWebViewFragment.class, "51")) {
          return;
       }
       this.Ch().setProgressVisibility(p0);
       return;
    }
    public String o(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, KwaiYodaWebViewFragment.class, "55");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.getPage()) {
          return super.o();
       }
       String str = PatchProxy.apply(objArray, this, KwaiYodaWebViewFragment.class, "61");
       if (str != patchProxyRe) {
       }else {
          try{
             str = "";
             if (this.getArguments() != null && this.getArguments().getString("KEY_PAGE_2") != null) {
                str = b.d(this.getArguments(), "KEY_PAGE_2", str);
             }
          }catch(java.lang.Exception e0){
          }
       }
       return str;
    }
    public void oh(boolean p0){
       if (PatchProxy.isSupport(KwaiYodaWebViewFragment.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, KwaiYodaWebViewFragment.class, "65")) {
          return;
       }
       KwaiYodaWebViewFragment tk = this.k;
       if (tk != null) {
          tk.f().r(p0);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebViewFragment.class, "3")) {
          return;
       }
       super.onCreate(p0);
       q.b(a.a().a());
       this.Dh();
       c.h(this.getArguments());
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KwaiYodaWebViewFragment.class, "5");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, this.getLayoutResId(), p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewFragment.class, "19")) {
          return;
       }
       KwaiYodaWebViewFragment tr = this.r;
       if (tr != null) {
          JsonObject currentPageD = tr.getCurrentPageData();
          if (currentPageD != null) {
             d.a().g().F(currentPageD);
          }
       }
       tr = this.k;
       if (tr != null) {
          tr.onDestroy();
       }
       tr = this.x;
       if (tr != null) {
          tr.j5(this.w);
       }
       super.onDestroyView();
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewFragment.class, "20")) {
          return;
       }
       super.onPause();
       KwaiYodaWebViewFragment tw = this.w;
       if (tw != null) {
          tw.n();
       }
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewFragment.class, "23")) {
          return;
       }
       super.onResume();
       KwaiYodaWebViewFragment tw = this.w;
       if (tw != null) {
          tw.o();
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewFragment.class, "22")) {
          return;
       }
       super.onStart();
       KwaiYodaWebViewFragment tk = this.k;
       if (tk != null) {
          tk.onStart();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, KwaiYodaWebViewFragment.class, "25")) {
          return;
       }
       super.onStop();
       KwaiYodaWebViewFragment tk = this.k;
       if (tk != null) {
          tk.onStop();
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       Iterator iterator;
       WebViewFragment$d b;
       boolean b1;
       String obj1;
       int b2;
       KwaiYodaWebViewFragment obj2;
       int i;
       Object[] objArray;
       c uoc = this;
       KwaiYodaWebViewFragment obj = p0;
       String str = "7";
       if (PatchProxy.applyVoidTwoRefs(obj, p1, uoc, KwaiYodaWebViewFragment.class, str)) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       uoc.q = this.uh(p0);
       this.Jh();
       if (uoc.z != null || (uoc.k.getLaunchModel() != null && uoc.k.getWebView() != null)) {
          Uri uri = x0.f(this.getWebUrl());
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoidOneRefs(uri, uoc, KwaiYodaWebViewFragment.class, "8")) {
             KwaiYodaWebViewFragment r = uoc.r;
             c uoc1 = c.class;
             String str2 = "KEY_HIDE_ACTIONBAR";
             String str3 = "4";
             String str4 = null;
             if (!PatchProxy.applyVoidOneRefs(r, null, uoc1, "1") && r != null) {
                LaunchModel launchModel1 = r.getLaunchModel();
                if (launchModel1 != null) {
                   if (!PatchProxy.applyVoidTwoRefs(r, launchModel1, null, uoc1, "2") && (launchModel1.getExtras().get("KEY_ENABLE_SWIPE_BACK") == null || c.b(launchModel1.getSlideBackBehaviorGrade()))) {
                      b.d(r, launchModel1.getSlideBackBehavior());
                   }
                   if (!PatchProxy.applyVoidTwoRefs(r, launchModel1, null, uoc1, "3") && (launchModel1.getExtras().get("webview_bgcolor") == null || (c.b(launchModel1.getWebViewBgColorGrade()) && c.a(launchModel1.getWebViewBgColorGrade())))) {
                      if (c.b(launchModel1.getWebViewBgColor())) {
                         r.setBackgroundColor(Color.parseColor(launchModel1.getWebViewBgColor()));
                      }else if(!u.c(launchModel1.getWebViewBgColor())){
                         r.setBackgroundColor(str4);
                      }
                   }
                   if (!PatchProxy.applyVoidTwoRefs(r, launchModel1, null, uoc1, str3)) {
                      c actionBarMan = r.getActionBarManager();
                      actionBarMan = (actionBarMan != null)? actionBarMan.l: null;
                      if (actionBarMan != null) {
                         if (!u.c(launchModel1.getTitle()) && a.a(r)) {
                            actionBarMan.r(launchModel1.getTitle());
                         }
                         if (!u.c(launchModel1.getTitleColor()) && (c.c(launchModel1) && (launchModel1.getExtras().get("ACTIONBAR_TITLE_COLOR") != null || (c.a(launchModel1.getTitleColorGrade()) || c.b(launchModel1.getTitleColorGrade()))))) {
                            actionBarMan.t(Color.parseColor(launchModel1.getTitleColor()));
                         }
                      }
                   }
                label_0146 :
                   if (!PatchProxy.applyVoidTwoRefs(r, launchModel1, null, uoc1, "5")) {
                      PageStyleParams pageStylePar = new PageStyleParams();
                      if (c.c(launchModel1) && (launchModel1.getExtras().get(str2) == null && c.a(launchModel1.getTopBarPositionGrade()))) {
                         pageStylePar.mPosition = launchModel1.getTopBarPosition();
                      }
                   label_0174 :
                      if (c.d(launchModel1, launchModel1.getTopBarBgColorGrade())) {
                         pageStylePar.mBackgroundColor = launchModel1.getTopBarBgColor();
                      }
                      if (c.d(launchModel1, launchModel1.getTopBarBorderColorGrade())) {
                         pageStylePar.mBorderBottomColor = launchModel1.getTopBarBorderColor();
                      }
                      if (c.d(launchModel1, launchModel1.getStatusBarColorTypeGrade())) {
                         pageStylePar.mStatusBarColorType = launchModel1.getStatusBarColorType();
                      }
                      c.d(r, pageStylePar);
                   }
                   PullDownTypeParams pullDownType = new PullDownTypeParams();
                   pullDownType.mBehavior = launchModel1.getBounceStyle();
                   b.c(r, pullDownType);
                }
             }
             uoc.k.g();
             r = uoc.k;
             KwaiYodaWebViewFragment m = uoc.m;
             Objects.requireNonNull(r);
             if (!PatchProxy.applyVoidOneRefs(m, r, c.class, "21")) {
                r.f().h = m;
             }
             String str5 = "12";
             if (!PatchProxy.applyVoid(null, uoc, KwaiYodaWebViewFragment.class, "32") && uoc.r != null) {
                obj1 = this.getArguments().getString("KEY_THEME", "0");
                if (!PatchProxy.applyVoidOneRefs(obj1, uoc, KwaiYodaWebViewFragment.class, "39") && (("11").equals(obj1) && i.c())) {
                   obj2 = uoc.q;
                   if (obj2 != null && obj2.l != null) {
                      b2 = n.A(this.getActivity());
                      ViewGroup$LayoutParams layoutParams1 = uoc.q.l.getLayoutParams();
                      layoutParams1.height = a1.d(0x7f070fdf) + b2;
                      uoc.q.l.setLayoutParams(layoutParams1);
                      uoc.q.l.setPadding(0, b2, 0, 0);
                   }
                }
             label_023a :
                String str6 = "6";
                b2 = (!"3".equals(obj1) && (!str5.equals(obj1) && (!str3.equals(obj1) && (str6.equals(obj1) || str.equals(obj1)))))? true: false;
                uoc.t = b2;
                if (!str.equals(obj1)) {
                   obj2 = PatchProxy.apply(null, uoc, KwaiYodaWebViewFragment.class, "40");
                   if (obj2 != patchProxyRe) {
                      b2 = obj2.booleanValue();
                      b1 = false;
                   }else if(this.getArguments().containsKey(str2)){
                      b1 = false;
                      if (this.getArguments().getBoolean(str2, b1)) {
                         b2 = true;
                      }
                   }else {
                      b1 = false;
                   }
                   b2 = false;
                   if (!b2) {
                      b2 = true;
                   label_0297 :
                      uoc.u = b2;
                      uoc.v = str.equals(obj1) ^ 1;
                      obj2 = uoc.r;
                      i = (this.Fh())? 0: 8;
                      obj2.setProgressVisibility(i);
                      uoc.q.y = this.Hh();
                      obj2 = uoc.q;
                      boolean b3 = (!"3".equals(obj1) && (str6.equals(obj1) || str.equals(obj1)))? true: false;
                      obj2.z = b3;
                   }
                }else {
                   b1 = false;
                }
                b2 = false;
                goto label_0297 ;
             }else {
                b1 = false;
             }
             KwaiYodaWebViewFragment q = uoc.q;
             obj1 = PatchProxy.applyOneRefs(uri, uoc, KwaiYodaWebViewFragment.class, str5);
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                LaunchModel launchModel = uoc.k.getLaunchModel();
                String layoutType = (launchModel != null)? launchModel.getLayoutType(): null;
                if (TextUtils.isEmpty(layoutType) || !layoutType.equals(str5)) {
                   b1 = Boolean.parseBoolean(x0.a(uri, "noBackNavi")) ^ 0x01;
                }
             }
             q.x = b1;
             uoc.q.u(this.getActivity());
          }
          if (!PatchProxy.applyVoidOneRefs(obj, uoc, KwaiYodaWebViewFragment.class, "43")) {
             WebViewFragment$d uod = uoc.n.C1();
             if (uod != null) {
                View view = obj.findViewById(R.id.webview_overlay);
                RelativeLayout$LayoutParams layoutParams = view.getLayoutParams();
                b = uod.b;
                if (b != null) {
                   if (b != 1) {
                      if (b == 2) {
                         layoutParams.addRule(12);
                      }
                   }else {
                      layoutParams.addRule(13);
                   }
                }else {
                   layoutParams.addRule(10);
                }
                view.setLayoutParams(layoutParams);
                e uoe = this.getChildFragmentManager().beginTransaction();
                uoe.f(R.id.webview_overlay, uod.a);
                uoe.m();
             }
          }
          this.Lh();
          if (!PatchProxy.applyVoid(null, uoc, KwaiYodaWebViewFragment.class, "16")) {
             obj = uoc.r;
             if (obj != null) {
                g yodaWebViewC = obj.getYodaWebViewClient();
                if (yodaWebViewC != null && yodaWebViewC.v() == null) {
                   yodaWebViewC.h = new j(uoc);
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(uri, uoc, KwaiYodaWebViewFragment.class, "15")) {
             try{
                String str1 = w0.a(uri, "webview_bgcolor");
                if (str1 != null) {
                   uoc.r.setBackgroundColor(Color.parseColor(str1));
                }
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
          }
       }
    }
    public WebViewClient p5(){
       KwaiYodaWebViewFragment obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "57");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj != null) {
          return obj.getWebViewClient();
       }
       return null;
    }
    public void ph(WebViewFragment$c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebViewFragment.class, "44")) {
          return;
       }
       KwaiYodaWebViewFragment to = this.o;
       if (to != null) {
          to.b(p0);
       }
       return;
    }
    public void qh(e p0){
       this.x = p0;
    }
    public c rh(){
       Object obj = PatchProxy.apply(null, this, KwaiYodaWebViewFragment.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public WebViewClient sh(){
       return null;
    }
    public void th(YodaBaseWebView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiYodaWebViewFragment.class, "26")) {
          return;
       }
       GifshowActivity activity = this.getActivity();
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, KwaiYodaWebViewFragment.class, "17")) {
          boolean b = false;
          try{
             Bundle arguments = this.getArguments();
             if (arguments != null && arguments.getBoolean("KEY_IS_SELECTABLE_PAGE")) {
                b = true;
             }
          }catch(java.lang.Exception e0){
          }
          JsNativeEventCommunication jsNativeEven = new JsNativeEventCommunication(this.getActivity(), this.getLifecycle(), this.Ch(), b);
          this.w = jsNativeEven;
          jsNativeEven.j = new h(this);
          KwaiYodaWebViewFragment tx = this.x;
          if (tx != null) {
             tx.i5(jsNativeEven);
          }
       }
       this.Ih();
       this.q.k(this.m);
       this.k.getWebView().setDownloadListener(new e(this));
       if (this.Ch() instanceof KwaiYodaWebView) {
          this.r = this.Ch();
       }
       if (!PatchProxy.applyVoid(objArray, this, KwaiYodaWebViewFragment.class, "30")) {
          this.yh().d(this.getActivity(), this.Ch(), this.q, this.w);
       }
       this.yh().g(this.p);
       this.yh().c(this.l);
       this.q.s(p0);
       if (this.Ch() instanceof KwaiYodaWebView) {
          this.r.setWebViewActionBarManager(this.q);
          this.r.setLifeEventCallback(this.w.e());
          this.r.addJavascriptInterface(this.yh(), "Kwai");
          k yodaChromeCl = this.r.getYodaChromeClient();
          if (yodaChromeCl != null) {
             yodaChromeCl.g(new a(activity));
          }
          g yodaWebViewC = this.r.getYodaWebViewClient();
          if (yodaWebViewC != null) {
             yodaWebViewC.A(this.w);
             yodaWebViewC.B(new b(this));
          }
       }
       return;
    }
    public c uh(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiYodaWebViewFragment.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(p0, this.Ah());
    }
    public c vh(){
       return this.q;
    }
    public final Integer wh(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KwaiYodaWebViewFragment.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Drawable background = p0.getBackground();
       if (background == null) {
          return Integer.valueOf(0);
       }
       if (background instanceof ColorDrawable) {
          return Integer.valueOf(background.getColor());
       }
       return null;
    }
    public View xh(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, KwaiYodaWebViewFragment.class, "47");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.k.g();
       Objects.requireNonNull(obj);
       View view = PatchProxy.apply(objArray, obj, c.class, "1");
       if (view != patchProxyRe) {
       }else {
          view = obj.d.a();
       }
       return view;
    }
    public JsNativeEventCommunication zh(){
       return this.w;
    }
}
