package com.kuaishou.krn.c;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import com.kuaishou.krn.c$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.c$b;
import fi0.h;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.ReadableMap;
import kj0.j;
import kj0.l;
import com.kuaishou.krn.exception.KrnException;
import android.content.Context;
import com.google.gson.Gson;
import kj0.f;
import android.content.SharedPreferences;
import java.lang.Integer;
import com.kuaishou.krn.experiment.ExpConfigKt;
import android.os.SystemClock;
import gg.a;
import xj0.f;
import gg.b;
import jn.b;
import pj0.a;
import java.util.Objects;
import java.util.Set;
import yd.h;
import fi0.g;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.modules.fresco.FrescoModule;
import java.lang.Throwable;
import ek0.d;
import fi0.d;
import se.a;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import ekd.e0;
import ek0.e;
import mb.c;
import mb.a;
import hj0.c;
import com.kwai.kxb.KxbManager;
import com.kwai.kxb.PlatformType;
import ij0.c;
import nu6.c;
import qrd.p;
import java.lang.Boolean;
import yd.e;
import jk0.b;
import jk0.c;
import java.util.List;
import java.lang.Number;
import com.facebook.react.modules.diskcache.MetaDiskCache;
import lk0.f;
import kotlin.jvm.internal.a;
import yf.j;
import com.kuaishou.krn.bundle.preload.a;
import com.kuaishou.krn.lifecycle.AppLifecycleManager;
import com.kuaishou.krn.lifecycle.AppLifecycleManager$c;
import if.a;
import ukd.a;
import com.kuaishou.krn.utils.c;
import com.kuaishou.krn.b;
import java.lang.Runnable;
import t45.c;
import pi0.a;
import com.kuaishou.krn.apm.wsd.model.KdsFrameworkConfig;
import com.kuaishou.krn.apm.wsd.WhiteScreenDetector;
import ni0.e;
import fi0.e;
import java.lang.StringBuilder;
import com.kuaishou.krn.KrnInternalManager;
import vj0.a;
import com.kuaishou.krn.instance.JsFramework;
import sj0.b;
import com.facebook.react.a;
import com.facebook.react.bridge.ReactContext;
import com.kuaishou.krn.NativeToJsKt;
import fi0.f;
import ekd.k1;
import bk0.i;
import gj0.a;
import java.lang.Long;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import gj0.d;
import com.kuaishou.krn.bundle.preload.PreloadType;
import java.lang.Enum;
import com.kuaishou.krn.bundle.preload.KrnReactRootPreloadManager$SceneType;
import com.kuaishou.krn.model.LoadingStateTrack;
import com.kuaishou.krn.model.LoadingStateTrack$LoadType;
import com.kuaishou.krn.a;
import com.facebook.react.bridge.UiThreadUtil;

public final class c	// class@00084e
{
    public boolean a;
    public Application b;
    public l c;
    public j d;
    public f e;
    public a f;
    public static AtomicBoolean g;

    static {
       c.g = new AtomicBoolean(false);
    }
    public void c(){
       super();
       this.a = false;
    }
    public void c(c$a p0){
       super();
       this.a = false;
    }
    public static c b(){
       c obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c$b.a;
       if (obj.c == null || obj.a == null) {
          h.b.a("KrnManager get");
       }
       if (obj.c != null && obj.a == null) {
          _monitor_enter(c.class);
          if (obj.a == null) {
             obj.a = true;
             obj.i();
          }
          _monitor_exit(c.class);
       }
       return obj;
    }
    public final Object a(Object p0){
       WritableNativeArray obj = PatchProxy.applyOneRefs(p0, this, c.class, "27");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (WritableNativeArray.class.isAssignableFrom(p0.getClass())) {
          obj = new WritableNativeArray();
          obj.pushArray(p0);
          return obj;
       }else if(WritableNativeMap.class.isAssignableFrom(p0.getClass())){
          WritableNativeMap writableNati = new WritableNativeMap();
          writableNati.merge(p0);
          return writableNati;
       }else {
          return p0;
       }
    }
    public j c(){
       c obj = PatchProxy.apply(null, this, c.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = this.g().getCommonParams();
       }
       obj = this.d;
       if (obj != null) {
          return obj;
       }else {
          throw new KrnException("KrnInitCommonParams cannot be null! Please return non null for method KrnInitParams.getCommonParams\(\)");
       }
    }
    public Context d(){
       return this.b;
    }
    public Gson e(){
       Object obj = PatchProxy.apply(null, this, c.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c().d();
    }
    public f f(){
       return this.e;
    }
    public l g(){
       c obj = PatchProxy.apply(null, this, c.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          return obj;
       }
       throw new KrnException("KrnInitParams cannot be null! Please invoke KrnManager.get\(\).initialize\(\) first!");
    }
    public SharedPreferences h(String p0,int p1){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.c().getSharedPreferences(p0, p1);
    }
    public final void i(){
       e a;
       Boolean uBoolean;
       Number number;
       boolean b;
       ExpConfigKt uExpConfigKt = ExpConfigKt.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c uoc = c.class;
       long l = SystemClock.elapsedRealtime();
       if (!a.b()) {
          a.a(new f());
       }
       b uob = b.a();
       Objects.requireNonNull(uob);
       uob.a.add(new a());
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, uoc, "8")) {
          h.b().a = new g(this);
       }
       String str = "9";
       if (!PatchProxy.applyVoid(objArray, this, uoc, str)) {
          if (!PatchProxy.applyVoid(objArray, this, uoc, "11") && (Fresco.hasBeenInitialized() && !FrescoModule.hasBeenInitialized())) {
             FrescoModule.sHasBeenInitialized = true;
          }
       label_0068 :
          if (!PatchProxy.applyVoid(objArray, this, uoc, "10")) {
             AndroidInfoModule.setAgreePrivacyProvider(new d(this));
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "6") && e0.b == null) {
          e0.b(this.b);
          e0.c(this.c().isDebugMode());
       }
       a = e.a;
       c.a = (a == null)? a.a: a;
       c a1 = c.a;
       Objects.requireNonNull(a1);
       String str1 = "1";
       if (!PatchProxy.applyVoid(objArray, a1, c.class, str1)) {
          KxbManager g = KxbManager.g;
          g.g(PlatformType.KDS_REACT, c.a);
          g.g(PlatformType.KDS_VUE, c.b);
       }
       String str2 = "7";
       String str3 = "4";
       WhiteScreenDetector whiteScreenD = null;
       if (!PatchProxy.applyVoid(objArray, this, uoc, str2)) {
          Boolean uBoolean1 = PatchProxy.apply(objArray, objArray, uExpConfigKt, str1);
          if (uBoolean1 == patchProxyRe) {
             uBoolean1 = ExpConfigKt.a.getValue();
          }
          e.e = uBoolean1.booleanValue();
          uBoolean1 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "44");
          if (uBoolean1 == patchProxyRe) {
             uBoolean1 = ExpConfigKt.Q.getValue();
          }
          e.X = uBoolean1.booleanValue();
          uBoolean1 = PatchProxy.apply(objArray, objArray, uExpConfigKt, str3);
          if (uBoolean1 == patchProxyRe) {
             uBoolean1 = ExpConfigKt.d.getValue();
          }
          e.c = uBoolean1.booleanValue();
          if (c.a().k()) {
             e.D = true;
             e.O = true;
          }else {
             e.D = ExpConfigKt.j();
             e.O = ExpConfigKt.j();
          }
          uBoolean1 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "34");
          if (uBoolean1 == patchProxyRe) {
             uBoolean1 = ExpConfigKt.G.getValue();
          }
          e.S = uBoolean1.booleanValue();
          Boolean uBoolean2 = PatchProxy.apply(objArray, objArray, uExpConfigKt, str2);
          if (uBoolean2 == patchProxyRe) {
             uBoolean2 = ExpConfigKt.g.getValue();
          }
          e.d = uBoolean2.booleanValue();
          uBoolean2 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "17");
          if (uBoolean2 == patchProxyRe) {
             uBoolean2 = ExpConfigKt.q.getValue();
          }
          e.i = uBoolean2.booleanValue();
          uBoolean2 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "18");
          if (uBoolean2 == patchProxyRe) {
             uBoolean2 = ExpConfigKt.r.getValue();
          }
          e.M = uBoolean2.booleanValue();
          uBoolean2 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "20");
          if (uBoolean2 == patchProxyRe) {
             uBoolean2 = ExpConfigKt.t.getValue();
          }
          e.g = uBoolean2.booleanValue();
          e.k.set(ExpConfigKt.d());
          e.u = ExpConfigKt.c();
          uBoolean2 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "31");
          if (uBoolean2 == patchProxyRe) {
             uBoolean2 = ExpConfigKt.D.getValue();
          }
          e.R = uBoolean2.booleanValue();
          uBoolean2 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "28");
          if (uBoolean2 == patchProxyRe) {
             uBoolean2 = ExpConfigKt.A.getValue();
          }
          e.W = uBoolean2.booleanValue();
          uBoolean2 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "29");
          if (uBoolean2 == patchProxyRe) {
             uBoolean2 = ExpConfigKt.B.getValue();
          }
          e.v = uBoolean2.booleanValue();
          uBoolean2 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "37");
          if (uBoolean2 == patchProxyRe) {
             uBoolean2 = ExpConfigKt.J.getValue();
          }
          e.N = uBoolean2.booleanValue();
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, str);
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.i.getValue();
          }
          e.w = uBoolean.booleanValue();
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "38");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.K.getValue();
          }
          e.x = uBoolean.booleanValue();
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "47");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.S.getValue();
          }
          b = (uBoolean.booleanValue() && !c.a().b())? true: false;
          e.m = b;
          e.z = ExpConfigKt.p().isEmpty() ^ true;
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "43");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.P.getValue();
          }
          b = (uBoolean.booleanValue() && !ExpConfigKt.b())? true: false;
          e.l = b;
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "5");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.e.getValue();
          }
          b = (uBoolean.booleanValue() && !ExpConfigKt.b())? true: false;
          e.h = b;
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "52");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.W.getValue();
          }
          e.J = uBoolean.booleanValue();
          number = PatchProxy.apply(objArray, objArray, uExpConfigKt, "53");
          if (number == patchProxyRe) {
             number = ExpConfigKt.X.getValue();
          }
          MetaDiskCache.m = number.intValue();
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "54");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.Y.getValue();
          }
          e.b = uBoolean.booleanValue();
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "51");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.V.getValue();
          }
          e.a = uBoolean.booleanValue();
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "56");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.a0.getValue();
          }
          e.Z = uBoolean.booleanValue();
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "57");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.b0.getValue();
          }
          e.Y = uBoolean.booleanValue();
          uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "58");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.c0.getValue();
          }
          e.a0 = uBoolean.booleanValue();
          e.r = c.a().N();
       }
       c tb = this.b;
       if (!PatchProxy.applyVoidOneRefs(tb, objArray, f.class, str1)) {
          a.p(tb, "context");
          j.c().a(tb, "alte-din", R.font.arg_RES_7f090000);
       }
       this.f = new a();
       AppLifecycleManager.a().b(this.f);
       a uoa = a.a();
       c$a uoa1 = new c$a(this);
       if (uoa.b == null) {
          uoa.a = uoa1;
          uoa.b = true;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "12") && !this.c().c()) {
          Object[] objArray1 = new Object[true];
          objArray1[whiteScreenD] = this.b;
          a.b("com.kwai.kds.watermark.lifecycle.KrnActivityLifecycleCallbacks", "registerActivityLifecycleCallbacks", objArray1);
       }
    label_03c0 :
       uBoolean = PatchProxy.apply(objArray, objArray, uExpConfigKt, "63");
       if (uBoolean == patchProxyRe) {
          uBoolean = ExpConfigKt.g0.getValue();
       }
       c.b = uBoolean.booleanValue();
       number = PatchProxy.apply(objArray, objArray, uExpConfigKt, "64");
       if (number == patchProxyRe) {
          number = ExpConfigKt.h0.getValue();
       }
       c.a = number.intValue();
       if (ExpConfigKt.e()) {
          c.a(b.b);
       }
       if (ExpConfigKt.h() && !PatchProxy.applyVoid(objArray, this, uoc, str3)) {
          a uoa2 = PatchProxy.apply(objArray, objArray, uExpConfigKt, "76");
          if (uoa2 == patchProxyRe) {
             uoa2 = ExpConfigKt.p0.getValue();
          }
          if (uoa2.a() == null) {
             d.i("initializeWsd checkWhiteScreen: get config return null");
          }else {
             whiteScreenD = WhiteScreenDetector.i;
             e uoe = new e();
             e uoe1 = new e(this);
             Objects.requireNonNull(whiteScreenD);
             if (!PatchProxy.applyVoidThreeRefs(uoa2, uoe, uoe1, whiteScreenD, WhiteScreenDetector.class, "3")) {
                a.p(uoa2, "config");
                if (!WhiteScreenDetector.a) {
                   WhiteScreenDetector.b = uoa2;
                   WhiteScreenDetector.c = uoe;
                   WhiteScreenDetector.d = uoe1;
                   WhiteScreenDetector.a = true;
                }
             }
          }
       }
    label_0454 :
       d.e("KrnManager#initialize ºÄÊ±"+(SystemClock.elapsedRealtime() - l));
       return;
    }
    public boolean j(){
       Object obj = PatchProxy.apply(null, this, c.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.c().c();
    }
    public boolean k(){
       Object obj = PatchProxy.apply(null, this, c.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return c.a().b();
    }
    public void l(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "26")) {
          return;
       }
       List list = KrnInternalManager.c.b().d(JsFramework.REACT);
       int i = list.size();
       int i1 = 0;
       while (i1 < i) {
          ReactContext reactContext = list.get(i1).i().n();
          if (reactContext != null) {
             Object obj = (i > 1)? this.a(p1): p1;
             NativeToJsKt.e(reactContext, p0, obj);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, c.class, "24")) {
          return;
       }
       if (!c.a().r0()) {
          return;
       }
       if (ExpConfigKt.a()) {
          this.n();
       }else {
          k1.o(new f(this));
       }
       return;
    }
    public final void n(){
       int i;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "25")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, objArray, i.class, "3") && !i.c) {
          i.c = true;
          i.f = (float)(SystemClock.elapsedRealtime() - c.b().c().h());
          d.e("[perfOpt]onKrnPreloadJsRuntimeStart="+i.f);
       }
       a a = a.a;
       Objects.requireNonNull(a);
       a uoa = a.class;
       String str = "2";
       if (!PatchProxy.applyVoid(objArray, a, uoa, str)) {
          JsFramework[] jsFrameworkA = JsFramework.values();
          int len = jsFrameworkA.length;
          i = 0;
          while (i < len) {
             object oobject = jsFrameworkA[i];
             a a1 = a.a;
             Objects.requireNonNull(a1);
             if (!PatchProxy.applyVoidOneRefs(oobject, a1, uoa, "1")) {
                a.p(oobject, "jsFramework");
                long l = SystemClock.elapsedRealtime();
                if (!ExpConfigKt.a()) {
                   k1.d();
                }
                try{
                   KrnInternalManager.c.b().h(Long.valueOf(l), oobject);
                }catch(java.lang.Exception e6){
                   c uoc = c.b();
                   a.o(uoc, "KrnManager.get\(\)");
                   if (uoc.j()) {
                      d.k("preload failed", e6);
                   }else {
                      throw e6;
                   }
                }
             }
             i = i + 1;
          }
       }
       List obj = PatchProxy.apply(objArray, objArray, KrnReactRootPreloadManager.class, str);
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          obj = c.b().g().L();
          if (!q.f(obj)) {
             objArray = new ArrayList();
             Iterator iterator = obj.iterator();
             while (iterator.hasNext()) {
                d uod = iterator.next();
                if (uod.preloadType != PreloadType.GENERATE_CODE_CACHE.ordinal()) {
                   objArray.add(uod);
                }
             }
          }
       }
       this.o(KrnReactRootPreloadManager$SceneType.OTHER.name(), objArray);
       return;
    }
    public void o(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "21")) {
          return;
       }
       d.e("preloadBusinessBundles: "+p1);
       UiThreadUtil.runOnUiThread(new a(p0, p1, new LoadingStateTrack(LoadingStateTrack$LoadType.PRE_BUSINESS_BUNDLE)));
       return;
    }
}
