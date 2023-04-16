package com.yxcorp.gifshow.ad.tachikoma.a;
import a59.d;
import com.yxcorp.gifshow.ad.tachikoma.a$a;
import nsd.u;
import java.lang.Object;
import x49.c;
import java.util.UUID;
import java.lang.String;
import kotlin.jvm.internal.a;
import x49.s;
import com.kwai.sdk.switchconfig.a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.ad.tachikoma.bridge.core.TkBridgeGroup;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import x49.p;
import tkd.b;
import tkd.d;
import rx4.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import sx4.g;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.ad.tachikoma.a$d;
import erd.g;
import crd.b;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TkTemplateInfo;
import x49.q;
import xf6.l;
import com.yxcorp.gifshow.ad.tachikoma.AdTkException;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.ad.tachikoma.a$e;
import erd.a;
import com.yxcorp.gifshow.ad.tachikoma.a$f;
import com.yxcorp.gifshow.ad.tachikoma.a$g;
import android.content.Context;
import y49.a;
import com.yxcorp.gifshow.ad.tachikoma.a$c;
import msd.a;
import com.yxcorp.gifshow.ad.tachikoma.a$b;
import sx4.d$a;
import sx4.d;
import tx4.w;
import o56.c;
import o56.a;
import nl9.z;
import yx.j0;
import com.kwai.performance.stability.crash.monitor.util.e;
import java.util.Objects;
import z1.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import nq8.a;
import fg6.a;
import x49.g;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.Map;
import android.text.TextUtils;
import com.tachikoma.template.manage.template.TemplateInfo;
import x49.c$a;
import pq8.k;
import x49.e;
import nq8.b;
import java.io.File;
import pq8.a;
import pq8.j;
import oq8.e;
import pq8.a$b;
import android.os.SystemClock;
import rq8.c;
import com.yxcorp.gifshow.ad.tachikoma.a$h;
import x49.f;
import com.tachikoma.template.manage.template.TemplateException;
import x49.d;
import pq8.p;
import sq8.g;
import android.util.LruCache;
import pq8.o;
import java.lang.Runnable;
import sq8.b;
import nsd.r0;
import java.lang.Integer;
import java.util.Arrays;
import java.lang.Throwable;
import com.kuaishou.tk.api.b;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import rx4.o;
import rx4.o$a;
import rx4.p;
import t45.c;
import com.yxcorp.gifshow.entity.QPhoto;
import wkd.b;
import ip.b;
import com.kwai.framework.model.feed.BaseFeed;
import android.app.Activity;
import u07.t$a;
import u07.f;
import u07.t;
import com.kwai.library.widget.popup.common.c;

public class a implements d	// class@00180a
{
    public final c a;
    public d b;
    public ViewGroup c;
    public final String d;
    public PhotoAdvertisement$TkTemplateInfo e;
    public final p f;
    public boolean g;
    public b h;
    public TkBridgeGroup i;
    public long j;
    public b k;
    public boolean l;
    public static final a$a m;

    static {
       a.m = new a$a(null);
    }
    public void a(){
       super();
       this.a = new c();
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       this.d = str;
       this.f = new s();
       this.j = a.t().b("adtKRenderWithV8SoLoadTimeoutMs", 0x2710);
       this.l = true;
    }
    public boolean a(ViewGroup p0,TkBridgeGroup p1,boolean p2){
       if (PatchProxy.isSupport(a.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Boolean.valueOf(p2), this, a.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       this.c = p0;
       this.i = p1;
       this.l = p2;
       this.f.reset();
       this.j("init\(\)");
       b uob = d.a(0x256720e1);
       a.o(uob, "PluginManager.get\(TKPlugin::class.java\)");
       if (!uob.ei()) {
          this.k("init\(\) tk never init,register v8 event ");
          this.h = RxBus.f.f(g.class).take(1).observeOn(d.a).subscribe(new a$d(this));
          return false;
       }else {
          return this.g(true);
       }
    }
    public void b(PhotoAdvertisement$TkTemplateInfo p0,q p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "7")) {
          return;
       }
       a.p(p0, "tkTemplateInfo");
       boolean b = false;
       if (l.c("ad_tk_force_render_fail", b)) {
          if (p1 != null) {
             p1.a(new AdTkException("force render fail "));
          }
          return;
       }else {
          this.e = p0;
          this.f.j(this.g);
          this.j("render\(\) "+p0);
          if (this.b == null && !this.g(b)) {
             this.k("render \(\) registerV8LoadEvent mV8SoLoadDisposable = "+this.h);
             a th = this.h;
             if (th != null) {
                th.dispose();
             }
             this.h = RxBus.f.f(g.class).take(1).timeout(this.j, TimeUnit.MILLISECONDS).observeOn(d.a).doOnDispose(new a$e(this, p0, p1)).subscribe(new a$f(this, p0, p1), new a$g(this, p0, p1));
          }else {
             this.m(p0, true, p1);
          }
          return;
       }
    }
    public final void c(TkBridgeGroup p0,Context p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "4")) {
          return;
       }
       a.m(p1);
       a uoa = new a(p1, p0, new a$c(this));
       a tb = this.b;
       if (tb != null) {
          tb.k(new a$b(this, uoa));
       }
       return;
    }
    public final w d(PhotoAdvertisement$TkTemplateInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       w ow = new w("", p0.templateId, p0.templateVersion, p0.templateVersionCode, "", -1, "", "");
       return obj;
    }
    public void destroy(){
       String id;
       Object[] objArray1;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, uoa, "5")) {
          return;
       }
       a te = this.e;
       if (te != null) {
          this.j("destroy\(\) "+te);
       }
       boolean b = false;
       if (!PatchProxy.applyVoid(null, this, uoa, "6")) {
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             String str1 = this.f(this.e);
             a tb = this.b;
             if (tb != null) {
                a te1 = this.e;
                if (te1 != null) {
                   id = te1.getId();
                   if (id != null) {
                   label_0054 :
                      objArray1 = tb.h("JSON.stringify\(this.__coverage__\)", id, str1);
                   }
                }
                id = "";
                goto label_0054 ;
             }else {
                objArray1 = null;
             }
             z oz = d.a(-1675041074);
             a.o(oz, "commercialTestPlugin");
             Object[] objArray2 = new Object[b];
             j0.f("kcov", "is ava "+oz.isAvailable(), objArray2);
             if (oz.isAvailable() && objArray1 instanceof String) {
                oz.YW(objArray1, str1);
             }
          }
       }
       te = this.h;
       if (te != null) {
          te.dispose();
       }
       this.g = b;
       te = this.e;
       if (te != null) {
          String str = "tkBundleId";
          PhotoAdvertisement$TkTemplateInfo templateId = te.templateId;
          a.o(templateId, "it.templateId");
          if (!PatchProxy.applyVoidTwoRefs(str, templateId, this, uoa, "18")) {
             e.v(str, templateId);
          }
       }
       uoa = this.k;
       if (uoa != null) {
          uoa.dispose();
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.onDestroy();
       }
       this.b = null;
       uoa = this.a;
       Objects.requireNonNull(uoa);
       if (!PatchProxy.applyVoid(null, uoa, c.class, "7")) {
          Object[] objArray = new Object[b];
          j0.f("AdTKTemplateProvider", "new tk provider destroy", objArray);
       }
       this.e = null;
       return;
    }
    public final void e(PhotoAdvertisement$TkTemplateInfo p0,a p1,p p2){
       a a;
       int b;
       PhotoAdvertisement$TkTemplateInfo templateId;
       String str1;
       k obj2;
       String str2;
       String str3;
       TemplateInfo templateInfo;
       TemplateInfo mTemplateId;
       boolean b3;
       a obj2;
       int this;
       long l;
       String str6;
       PhotoAdvertisement$TkTemplateInfo tkTemplateIn = p0;
       Object obj = p1;
       Object obj1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "14")) {
          return;
       }
       if (!tkTemplateIn || TextUtils.x(tkTemplateIn.templateUrl)) {
          obj.accept(null);
          return;
       }else {
          a = this.a;
          Objects.requireNonNull(a);
          a uoa = a.class;
          if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, a, c.class, "1")) {
             try{
                a.p(tkTemplateIn, "tkTemplateInfo");
                a.p(obj, "consumer");
                String str = "trace";
                a.p(obj1, str);
                b = false;
                boolean b1 = l.c("adTkForceRemote", b);
                boolean b2 = l.c("adTkForceDefault", b);
                templateId = tkTemplateIn.templateId;
                str1 = "2";
                obj2 = PatchProxy.applyOneRefs(templateId, a, c.class, str1);
                if (obj2 != PatchProxyResult.class) {
                   str2 = str;
                }else {
                   try{
                      String str5 = "";
                      if (TextUtils.x(templateId)) {
                         str6 = str5;
                         str2 = str;
                      }else {
                         Map String obj23 = l.g("tachikomaTemplateUrl", str5);
                         str6 = str5;
                         Gson a1 = a.a;
                         g og = new g();
                         str2 = str;
                         obj23 = a1.i(obj23, og.getType());
                         if (obj23 != null && obj23.containsKey(templateId)) {
                            obj23 = obj23.get(templateId);
                         }
                      }
                   }catch(com.google.gson.JsonSyntaxException e0){
                   }
                   obj2 = str6;
                }
             }catch(com.google.gson.JsonSyntaxException e0){
             }
             if (!TextUtils.isEmpty(obj2)) {
                tkTemplateIn.templateUrl = obj2;
                str3 = str2;
                if (!PatchProxy.applyVoidThreeRefs(p0, p2, p1, a, c.class, "6")) {
                   a.p(tkTemplateIn, "tkTemplateInfo");
                   a.p(obj1, str3);
                   a.p(obj, "consumer");
                   templateInfo = c.a.a(tkTemplateIn);
                   k ok = k.d();
                   e uoe = new e(obj1, tkTemplateIn, obj);
                   Objects.requireNonNull(ok);
                   if (!PatchProxy.applyVoidTwoRefs(templateInfo, uoe, ok, k.class, "7")) {
                      obj2 = ok.b;
                      mTemplateId = templateInfo.mTemplateId;
                      File uFile = PatchProxy.applyTwoRefs(obj2, mTemplateId, null, b.class, str1);
                      if (uFile != PatchProxyResult.class) {
                         b3 = false;
                      }else {
                         Object[] objArray = new Object[]{mTemplateId};
                         b3 = 0;
                         uFile = new File(obj2.getFilesDir(), String.format("/adTemplate/debug/%s.js", objArray));
                      }
                      a.a().b(templateInfo.mTemplateUrl, uFile, b3, new j(ok, templateInfo, uFile, uoe));
                   }
                }
             }else {
                obj2 = a;
                str3 = str2;
                boolean b4 = false;
                this = 1;
                if (b2) {
                   if (!PatchProxy.applyVoidThreeRefs(p0, p2, p1, obj2, c.class, "4")) {
                      a.p(tkTemplateIn, "tkTemplateInfo");
                      a.p(obj1, str3);
                      a.p(obj, "consumer");
                      l = SystemClock.elapsedRealtime();
                      c uoc = a.a().b(c.a.a(tkTemplateIn), b4);
                      PhotoAdvertisement$TkTemplateInfo obj21 = tkTemplateIn.templateId;
                      a.o(obj21, "tkTemplateInfo.templateId");
                      obj1.h(obj21, tkTemplateIn.templateVersionCode, this);
                      tkTemplateIn.source = this;
                      b = (uoc != null)? uoc.d(): 0;
                      tkTemplateIn.tmpVer = b;
                      Object[] objArray1 = new Object[b4];
                      j0.f("AdTKTemplateProvider", "force preset load cost time = "+(SystemClock.elapsedRealtime() - l), objArray1);
                      str1 = (uoc != null)? uoc.a(): null;
                      obj.accept(str1);
                   }
                }else if(b1){
                   if (!PatchProxy.applyVoidThreeRefs(p0, p2, p1, obj2, c.class, "5")) {
                      a.p(tkTemplateIn, "tkTemplateInfo");
                      a.p(obj1, str3);
                      a.p(obj, "consumer");
                      templateInfo = c.a.a(tkTemplateIn);
                      a uoa1 = a.a();
                      f uof = new f(tkTemplateIn, obj1, obj);
                      Objects.requireNonNull(uoa1);
                      if (!PatchProxy.applyVoidTwoRefs(templateInfo, uof, uoa1, uoa, "6")) {
                         if (uoa1.b == null) {
                            uof.a(new TemplateException("downloadTemplate must be initialized").setErrorType("init"));
                         }else {
                            k.d().b(templateInfo, uof, b4);
                         }
                      }
                   }
                }else if(PatchProxy.applyVoidThreeRefs(p0, p2, p1, obj2, c.class, "3")){
                   TemplateInfo obj22 = c.a.a(tkTemplateIn);
                   a uoa2 = a.a();
                   d uod = new d(obj1, tkTemplateIn, obj, obj22);
                   Objects.requireNonNull(uoa2);
                   if (!PatchProxy.applyVoidTwoRefs(obj22, uod, uoa2, uoa, "5")) {
                      if (uoa2.b == null) {
                         uod.a(new TemplateException("asyncLoadTKTemplate must be initialized").setErrorType("init"));
                      }else {
                         p op = p.e();
                         Objects.requireNonNull(op);
                         p op1 = p.class;
                         if (!PatchProxy.applyVoidTwoRefs(obj22, uod, op, op1, "4")) {
                            String str4 = "ADTKTemplateManager";
                            if (obj22 == null || !obj22.isValid()) {
                               op.b(uod, new TemplateException(" asyncLoadTKTemplate invalid templateInfo").setErrorType("invalidData"));
                               g.b(str4, " asyncLoadTKTemplate invalid templateInfo");
                            }else {
                               mTemplateId = obj22.mTemplateId;
                               TemplateInfo mTemplateVer = obj22.mTemplateVersionCode;
                               g.d(str4, "now load js  : "+obj22.toString());
                               String idAndVersion = obj22.getIdAndVersion();
                               c uoc1 = PatchProxy.applyOneRefs(idAndVersion, op, op1, "13");
                               if (uoc1 == PatchProxyResult.class) {
                                  uoc1 = op.a.get(idAndVersion);
                               }
                               if (uoc1 != null) {
                                  uoc1.g(4);
                                  g.d(str4, "memory cache hit : "+uoc1.toString());
                                  op.c(uod, uoc1);
                               }else {
                                  o oo = new o(op, obj22, mTemplateId, mTemplateVer, uod);
                                  b.a(uoc1);
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       label_02ca :
          return;
       }
    }
    public final String f(PhotoAdvertisement$TkTemplateInfo p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = null;
       if (p0 == null) {
          return obj;
       }
       Object[] objArray = new Object[]{p0.templateId,Integer.valueOf(p0.templateVersionCode)};
       int i = 0;
       String str = String.format("/AdTKTemplates/%s/%s/", Arrays.copyOf(objArray, 2));
       a.o(str, "java.lang.String.format\(format, *args\)");
       a tc = this.c;
       if (tc != null) {
          Context context = tc.getContext();
          if (context != null) {
             File filesDir = context.getFilesDir();
             if (filesDir != null) {
                obj = filesDir.getPath();
             }
          }
       }
       if (obj == null || !obj.length()) {
          i = 1;
       }
       if (!i) {
          obj = obj+'/'+str;
       }
       return obj;
    }
    public final boolean g(boolean p0){
       Object[] obj;
       Context context;
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uoa, "2");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       obj = null;
       b obj1 = PatchProxy.apply(obj, this, uoa, "15");
       boolean b = false;
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          int i = 0x256720e1;
          obj1 = d.a(i);
          a.o(obj1, "PluginManager.get\(TKPlugin::class.java\)");
          if (!obj1.k4()) {
             this.k("tk has not init success");
          }else {
             this.f.g();
             uoa = (a.t().d("adtkInitWithIsolate", true))? this.l: false;
             this.b = d.a(i).O5(obj, uoa, "", this.c);
             this.f.d();
             b = true;
          }
       }
       this.j("initInternal\(\) initResult: "+b+" isDirectInit : "+p0);
       if (b) {
          a ti = this.i;
          a tc = this.c;
          if (tc != null) {
             context = tc.getContext();
          }
          this.c(ti, context);
       }
       return b;
    }
    public final void h(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "20")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.c("AdTachikomaManager", "UUID:"+this.d+' '+p0, objArray);
       return;
    }
    public final void i(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "21")) {
          return;
       }
       j0.b("AdTachikomaManager", "UUID:"+this.d+' '+p0, p1);
       return;
    }
    public final void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "22")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.f("AdTachikomaManager", "UUID:"+this.d+' '+p0, objArray);
       return;
    }
    public final void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "23")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.l("AdTachikomaManager", "UUID:"+this.d+' '+p0, objArray);
       return;
    }
    public final void l(PhotoAdvertisement$TkTemplateInfo p0,q p1){
       boolean b;
       Exception uException;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "8")) {
          return;
       }
       b uob = b.b();
       a.o(uob, "TKPluginManager.getInstance\(\)");
       b = uob.d();
       String str = (!b)? "tkPlugin": "soInit";
       this.h("render\(\) error maybe event Timeout ,initFailed errorType "+str+' '+p0);
       String str1 = (!b)? "TK_PLUGIN": "SO_INIT";
       this.p(p0.getId()+"‰÷»æ ß∞‹", new Exception(str1));
       PhotoAdvertisement$TkTemplateInfo templateId = p0.templateId;
       a.o(templateId, "tkTemplateInfo.templateId");
       this.f.h(templateId, p0.templateVersionCode, 0);
       this.f.l(str);
       this.f.f();
       if (!b) {
          this.j("TKPlugin is not available");
          uob = b.b();
          a te = this.e;
          te = (te != null)? te.templateId: null;
          uob.f("ad", te, 0, 6001, "TK Plugin not ready");
       }
       if (p1 != null) {
          p1.a(new Exception("initFailed"));
       }
       return;
    }
    public final void m(PhotoAdvertisement$TkTemplateInfo p0,boolean p1,q p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, a.class, "9")) {
          return;
       }
       try{
          this.j("renderInternal\(\) isDirectInit :"+p1);
          this.f.c();
          this.e(p0, new a$h(this, p0, p2), this.f);
       }catch(java.lang.Exception e9){
          this.f.b();
          this.f.l("exception");
          this.f.f();
          if (p2) {
             p2.a(e9);
          }
          ExceptionHandler.handleCaughtException(new AdTkException("tk render exception :"+p0+' ', e9));
          this.i("show failed", e9);
          this.n(p0, false, 4001, 4001);
          this.p(p0.getId()+"‰÷»æ“Ï≥£¡À", e9);
       }
       return;
    }
    public final void n(PhotoAdvertisement$TkTemplateInfo p0,boolean p1,int p2,int p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, a.class, "12")) {
          return;
       }
       w ow = this.d(p0);
       o oo = new o();
       if (!PatchProxy.applyVoidOneRefs(ow, oo, o.class, "1")) {
          a.p(ow, "bundleInfo");
          oo.a = ow;
       }
       PhotoAdvertisement$TkTemplateInfo templateId = p0.templateId;
       a tb = this.b;
       Integer integer = (tb != null)? Integer.valueOf(tb.j()): false;
       Integer integer1 = integer;
       if (PatchProxy.isSupport(o.class)) {
          Object[] objArray = new Object[]{templateId,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),"",integer1};
          if (!PatchProxy.applyVoid(objArray, oo, o.class, "2")) {
          label_007f :
             if (!o.e.c()) {
                p op = new p(oo, p1, p2, "", templateId, integer1);
                c.a(o.e.c());
             }
          }
       }else {
          goto label_007f ;
       }
       return;
    }
    public final void o(QPhoto p0){
       BaseFeed uBaseFeed;
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "19")) {
          return;
       }
       b uob = b.a(-570058679);
       p0 = (p0 != null)? p0.mEntity: null;
       this.g = uob.f(p0);
       return;
    }
    public final void onTKV8SoLoadSuccessEvent(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.k("form init\(\) method tkV8SoLoadSuccessEvent callback ");
       this.g(false);
       return;
    }
    public final void p(String p0,Exception p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "11")) {
          return;
       }
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       if (uoc.c()) {
          a tc = this.c;
          if (tc != null) {
             Context context = tc.getContext();
             if (context != null) {
                if (!context instanceof Activity) {
                   context = null;
                }
                if (context != null) {
                   t$a uoa = new t$a(context);
                   uoa.X0(p0);
                   uoa.S0(R.string.arg_RES_7f100a73);
                   p0 = p1.toString();
                   if (p0 == null) {
                      p0 = "";
                   }
                   uoa.z0(p0);
                   t ot = f.e(uoa).b0();
                   ot.X(true);
                   ot.Z();
                }
             }
          }
       }
       return;
    }
}
