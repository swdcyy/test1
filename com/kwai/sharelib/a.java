package com.kwai.sharelib.a;
import com.kwai.sharelib.a$a;
import nsd.u;
import uo7.k;
import uo7.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import uo7.d0;
import com.kwai.sharelib.KsShareDataEngine;
import yo7.i;
import yo7.j;
import java.lang.System;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.jsshare.StartShareParam$JsShareParam;
import com.kwai.sharelib.jsshare.StartShareParam$shareInitConfig;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sharelib.a$b;
import java.util.concurrent.Callable;
import crd.b;
import com.kwai.sharelib.a$c;
import java.lang.Runnable;
import ekd.k1;
import yo7.e;
import java.lang.Integer;
import java.lang.Throwable;
import yo7.f;
import com.kwai.sharelib.log.KsSharePerformanceStat;
import qrd.l1;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import uo7.h0;
import java.lang.NullPointerException;
import com.kwai.sharelib.a$h;
import erd.g;
import com.kwai.sharelib.model.ShareAnyResponse;
import com.kwai.sharelib.a$f;
import erd.o;
import com.kwai.sharelib.a$g;
import erd.a;
import zsd.u;
import io.reactivex.internal.functions.Functions;
import brd.z;
import io.reactivex.android.schedulers.a;
import uo7.b;
import brd.x;
import com.kwai.sharelib.a$d;
import com.kwai.sharelib.a$e;
import com.google.gson.JsonObject;
import xo7.b;
import ekd.k0;
import uo7.f0;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Boolean;
import uo7.h;
import uo7.e;
import java.util.concurrent.TimeUnit;
import brd.a;
import com.kwai.sharelib.a$i;
import com.kwai.sharelib.KsShareApi;
import java.util.Objects;
import java.lang.StringBuilder;
import java.util.HashSet;
import au6.e;
import uo7.a0;
import yo7.g;
import yo7.b;
import ap7.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import com.kwai.sharelib.a$j;
import erd.r;
import brd.m;
import brd.a0;
import com.kwai.sharelib.a$k;
import com.kwai.sharelib.a$l;
import com.kwai.sharelib.a$m;
import com.kwai.sharelib.a$n;
import com.kwai.sharelib.a$o;
import com.kwai.sharelib.a$p;

public final class a	// class@0016b4
{
    public final d0 a;
    public final KsShareDataEngine b;
    public h c;
    public final i d;
    public final j e;
    public long f;
    public final k g;
    public final u h;
    public static int i;
    public static final a$a j;

    static {
       a.j = new a$a(null);
    }
    public void a(k p0,u p1){
       a.p(p0, "mKsConfiguration");
       a.p(p1, "listener");
       super();
       this.g = p0;
       this.h = p1;
       this.a = new d0();
       KsShareDataEngine ksShareDataE = new KsShareDataEngine();
       this.b = ksShareDataE;
       this.d = new i();
       this.e = new j();
       this.f = System.currentTimeMillis();
       ksShareDataE.a = p0.I;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          StartShareParam$JsShareParam jsShareParam = p0.f();
          jsShareParam = (jsShareParam != null)? jsShareParam.mDefaultPoster: null;
          StartShareParam$JsShareParam jsShareParam1 = p0.f();
          if (jsShareParam1 != null && (jsShareParam != null && jsShareParam1.mAnyExtPainterParams == null)) {
             jsShareParam = jsShareParam1.mShareInitConfig;
             StartShareParam$shareInitConfig mInitExtPain = (jsShareParam != null)? jsShareParam.mInitExtPainterParams: null;
             jsShareParam1.mAnyExtPainterParams = mInitExtPain;
          }
       }
    label_0062 :
       return;
    }
    public final t a(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = t.defer(new a$b(this, p0));
       a.o(p0, "Observable.defer {\n     ¡­gressDlg\) }\n      }\n    }");
       return p0;
    }
    public final void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "10")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (!p0.isDisposed()) {
          p0.dispose();
          return;
       }else {
          k1.o(new a$c(this));
          return;
       }
    }
    public final void c(String p0){
       t ot;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       a.p(p0, "actionUrl");
       a.i = a.i + 1;
       e uoe = new e("social_share_start", p0, null, null, null, null, null, null, null, null, 1020, null);
       f.b(v0, this.g);
       KsSharePerformanceStat ksSharePerfo = new KsSharePerformanceStat("SHARE_SDK_SHAERE_DIRECT_TASK");
       ksSharePerfo.x("share_start");
       this.g.E(ksSharePerfo);
       ShareInitResponse$SharePanelElement sharePanelEl = new ShareInitResponse$SharePanelElement();
       sharePanelEl.mActionUrl = p0;
       h0 oh0 = new h0(p0);
       this.g.B(oh0);
       p0 = oh0.c();
       Object obj = null;
       if (p0 == null) {
          ot = t.error(new NullPointerException());
       }else if(oh0.f()){
          ot = this.a(this.b.b(this.g, oh0, obj)).doOnNext(new a$h(this, p0, oh0));
       }else {
          ShareAnyResponse shareAnyResp = new ShareAnyResponse();
          shareAnyResp.mShareAnyData = obj;
          ot = t.just(shareAnyResp);
       }
       t ot1 = ot.flatMap(new a$f(this, sharePanelEl, p0, oh0)).doFinally(new a$g(this));
       if (u.J1(oh0.d("placeholder"), "true", false, 2, obj)) {
          ot1.subscribe(Functions.d(), Functions.d());
       }else {
          ot1.observeOn(a.c()).compose(new b(this.g, sharePanelEl)).subscribe(new a$d(this, oh0, sharePanelEl), new a$e(this, oh0, sharePanelEl));
       }
       return;
    }
    public final String d(h0 p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g.f() != null) {
          JsonObject jsonObject = b.b(this.g.f(), p0);
          if (jsonObject != null) {
             obj = "imageBytes";
             if (k0.a(jsonObject, obj)) {
                String str = k0.h(jsonObject, obj, "");
                a.o(str, "JsonUtils.optString\(jsonObject, \"imageBytes\", \"\"\)");
                return str;
             }
          }
       }
       return "";
    }
    public final String e(h0 p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g.f() != null) {
          JsonObject jsonObject = b.c(this.g.f(), p0);
          if (jsonObject != null) {
             obj = "imageBytes";
             if (k0.a(jsonObject, obj)) {
                String str = k0.h(jsonObject, obj, "");
                a.o(str, "JsonUtils.optString\(jsonObject, \"imageBytes\", \"\"\)");
                return str;
             }
          }
       }
       return "";
    }
    public final a f(String p0,f0 p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "sharePlatform");
       a.p(p1, "factory");
       this.a.f(p0, p1);
       return this;
    }
    public final a g(Map p0){
       Map$Entry obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "factories");
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          obj = iterator.next();
          String key = obj.getKey();
          this.a.f(key, obj.getValue());
       }
       return this;
    }
    public final void h(k p0,ShareInitResponse$SharePanelElement p1,boolean p2,Throwable p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, a.class, "15")) {
          return;
       }
       this.d.a(p0, p1, p2, p3);
       this.e.a(p0, p1, p2, p3);
       return;
    }
    public final a i(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "realTimeLogValue");
       this.d.b = p0;
       return this;
    }
    public final a j(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "placeHolderHdl");
       this.c = p0;
       return this;
    }
    public final b k(){
       a uoa;
       Object[] objArray = null;
       e obj = PatchProxy.apply(objArray, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.g.g();
       if (obj != null) {
          long l = obj.a();
          v0 = l;
          if (obj > 0) {
             uoa = a.y(l, TimeUnit.MILLISECONDS);
          }else if(!obj){
             uoa = a.g();
          }else {
             uoa = objArray;
          }
          if (uoa != null) {
             uoa = uoa.s(a.c());
             if (uoa != null) {
                objArray = uoa.u(new a$i(this), Functions.d());
             }
          }
       }
    label_004a :
       return objArray;
    }
    public final void l(){
       boolean b;
       String str3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KsShareApi ksShareApi = KsShareApi.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       KsShareApi s = KsShareApi.s;
       String str = this.g.w();
       String str1 = this.g.v();
       Objects.requireNonNull(s);
       String str2 = PatchProxy.applyTwoRefs(str, str1, s, ksShareApi, "24");
       if (str2 != patchProxyRe) {
       }else {
          a.p(str, "subBiz");
          str2 = str1+'@'+str;
          a.o(str2, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
       }
       Objects.requireNonNull(s);
       a0 obj = PatchProxy.applyOneRefs(str2, s, ksShareApi, "21");
       str1 = "scene";
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          a.p(str2, str1);
          b = s.l().contains(str2);
       }
       if (b) {
          return;
       }else {
          Objects.requireNonNull(s);
          a0 obj1 = PatchProxy.applyOneRefs(str2, s, ksShareApi, "22");
          if (obj1 != patchProxyRe) {
             obj1.booleanValue();
          }else {
             a.p(str2, str1);
             s.l().add(str2);
          }
          int i = 1;
          e.d(e.a, objArray, "showSharePanel enter...", i, objArray);
          a0 uoa0 = this.g.q();
          obj1 = this.g.q();
          if (obj1 != null) {
             obj1.a8(new g(this.g));
          }
          a uoa = this.g.e();
          if (uoa != null) {
             obj = this.g.q();
             if (obj != null) {
                obj.Cf(uoa);
             }
          }
          if (uoa0 != null) {
             str3 = uoa0.j2();
             if (str3 != null) {
             label_00c5 :
                a tg = this.g;
                Objects.requireNonNull(tg);
                if (!PatchProxy.applyVoidOneRefs(str3, tg, k.class, "4")) {
                   a.p(str3, "<set-?>");
                   tg.D = str3;
                }
                a.i = a.i + i;
                Ref$ObjectRef objectRef = new Ref$ObjectRef();
                objectRef.element = objArray;
                this.g.L.t(a$j.b).k(new a$k(this, uoa0, objectRef)).o(new a$l(this)).map(new a$m(this, uoa0)).doFinally(new a$n(this, str2)).subscribe(new a$o(this, uoa0, objectRef), new a$p(this, objectRef));
                return;
             }
          }
          str3 = "unknown";
          goto label_00c5 ;
       }
    }
}
