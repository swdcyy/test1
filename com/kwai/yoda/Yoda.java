package com.kwai.yoda.Yoda;
import java.lang.Object;
import com.kwai.yoda.session.logger.webviewload.SdkInitInfo;
import l97.b;
import com.kwai.yoda.Yoda$d;
import java.util.List;
import java.lang.String;
import java.util.Objects;
import com.kwai.middleware.azeroth.Azeroth2;
import android.content.Context;
import yb7.n;
import android.content.BroadcastReceiver;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import yz7.r;
import gz7.i;
import rx7.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.yoda.bridge.YodaBridgeHandler;
import kotlin.jvm.internal.a;
import java.util.concurrent.CopyOnWriteArrayList;
import com.kwai.yoda.Yoda$b;
import com.kuaishou.webkit.extension.KsCorePerformanceListener;
import com.kuaishou.webkit.extension.KsWebExtensionStatics;
import java.util.Map;
import gy7.d;
import gz7.j;
import java.util.concurrent.Callable;
import brd.t;
import brd.z;
import gz7.k;
import gz7.l;
import erd.g;
import crd.b;
import com.kwai.yoda.kernel.loading.YodaLoading;
import tx7.a;
import tx7.d;
import brd.a0;
import tx7.e;
import tx7.f;
import com.kwai.yoda.cache.YodaXCache;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.lang.Iterable;
import wz7.a;
import vy7.a;
import vy7.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import o97.a;
import o97.a$a;
import java.io.File;
import gz7.i$a;
import tb7.c;
import sx7.x;
import sx7.x$b;
import kotlin.collections.ArraysKt___ArraysKt;
import java.util.ArrayList;
import java.lang.StringBuilder;
import com.kwai.yoda.hybrid.AppConfigHandler;
import com.kwai.yoda.YodaInitConfig;
import ny7.h;
import android.net.Uri;
import my7.g;
import com.kwai.yoda.Yoda$c;
import com.kwai.yoda.util.Supplier;
import java.lang.CharSequence;
import yb7.o;
import com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModel;
import com.kwai.yoda.model.LaunchModelInternal;
import gz7.b;
import px7.h;
import ub7.f;
import gz7.l0;
import java.util.Collections;
import java.util.HashMap;
import com.kwai.yoda.api.YodaApi;
import uz7.a;
import java.lang.System;
import java.lang.Long;
import com.kwai.yoda.e$a;
import com.kwai.yoda.e;
import vz7.a;
import iy7.d;
import com.kwai.yoda.store.db.YodaDatabase;
import iy7.b;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import px7.i;
import com.kwai.yoda.a;
import android.app.Application;
import hy7.n;
import ky7.b;
import ly7.f;
import ky7.a;
import ly7.c;
import ly7.b;
import ly7.d;
import com.kwai.yoda.kernel.YodaV2;
import oy7.a;
import ny7.g;
import oy7.b;
import px7.f;
import px7.g;
import com.kwai.yoda.Yoda$a;
import com.kwai.yoda.kernel.cookie.YodaCookie;
import ry7.d;
import px7.l;
import com.kwai.yoda.store.sp.YodaSharedPreferences;
import java.lang.Number;
import xb7.a;
import java.lang.Integer;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import oe6.g;
import gy7.n;
import android.app.Activity;
import android.content.Intent;
import android.content.ComponentName;
import jz7.e;
import jz7.e$a;
import jz7.d;
import java.lang.Runnable;
import f97.a;
import px7.j;
import ny7.a;
import android.content.IntentFilter;
import com.kwai.yoda.hybrid.NetworkConnectChangedReceiver;
import android.os.SystemClock;
import hy7.c;
import hy7.b;

public class Yoda	// class@001162
{
    public boolean coldStart;
    public AppConfigHandler mAppConfigHandler;
    public boolean mHasInit;
    public YodaInitConfig mInitConfig;
    public g mKsWebViewInitListener;
    public long mLastRequestTimestamp;
    public Supplier mLocaleSupplier;
    public Object mLock;
    public NetworkConnectChangedReceiver mNetworkConnectChangedReceiver;
    public i mOfflinePackageHandler;
    public final SdkInitInfo mSdkInitInfo;
    public d mSubBizActivityJumpHooker;
    public YodaApi mYodaApi;
    public YodaBridgeHandler mYodaBridgeHandler;
    public a mYodaStorage;
    public boolean minimumInited;
    public static final String SDK_NAME = "Yoda";

    public void Yoda(){
       super();
       this.mSdkInitInfo = new SdkInitInfo();
       this.mLastRequestTimestamp = 0;
       this.coldStart = true;
       this.mHasInit = false;
       this.mLock = new Object();
    }
    public static void a(Yoda p0){
       p0.lambda$nextRunnerTask$0();
    }
    public static void b(Yoda p0,b p1){
       p0.lambda$initAppLife$1(p1);
    }
    public static Yoda get(){
       return Yoda$d.a;
    }
    public static List lambda$getOfflineFileByUrl$2(List p0){
       return p0;
    }
    private void lambda$initAppLife$1(b p0){
       String str = p0.a();
       Objects.requireNonNull(str);
       if (!str.equals("ON_DESTROY")) {
          if (str.equals("ON_START") && n.c(Azeroth2.B.d())) {
             this.requestConfig();
          }
       }else if(this.mNetworkConnectChangedReceiver != null){
          UniversalReceiver.f(Azeroth2.B.d(), this.mNetworkConnectChangedReceiver);
          this.mNetworkConnectChangedReceiver = null;
       }
       return;
    }
    private void lambda$nextRunnerTask$0(){
       r.g("Yoda lazy init");
       this.getOfflinePackageHandler();
    }
    public void addCustomFunctionRegistry(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Yoda.class, "28")) {
          return;
       }
       YodaBridgeHandler yodaBridgeHa = this.getYodaBridgeHandler();
       Objects.requireNonNull(yodaBridgeHa);
       if (!PatchProxy.applyVoidOneRefs(p0, yodaBridgeHa, YodaBridgeHandler.class, "2")) {
          a.q(p0, "registry");
          yodaBridgeHa.a.add(p0);
       }
       return;
    }
    public final void addKsCorePerformanceListener(){
       if (PatchProxy.applyVoid(null, this, Yoda.class, "37")) {
          return;
       }
       r.b("addKsCorePerformanceListener", "start");
       KsWebExtensionStatics.addKsCorePerformanceListener(new Yoda$b(this));
       return;
    }
    public void addSubBizMap(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Yoda.class, "8")) {
          return;
       }
       d subBizActivi = this.getSubBizActivityHooker();
       Objects.requireNonNull(subBizActivi);
       if (!PatchProxy.applyVoidOneRefs(p0, subBizActivi, d.class, "1")) {
          a.q(p0, "subBizList");
          subBizActivi.a.putAll(p0);
       }
       return;
    }
    public void clearCache(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, Yoda.class, "32")) {
          return;
       }
       i offlinePacka = this.getOfflinePackageHandler();
       if (offlinePacka != null) {
          Objects.requireNonNull(offlinePacka);
          if (!PatchProxy.applyVoid(objArray, offlinePacka, i.class, "8")) {
             offlinePacka.a(t.fromCallable(new j(offlinePacka)).subscribeOn(offlinePacka.e).subscribe(k.b, l.b));
          }
       }
       YodaLoading.g.e();
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, "2")) {
          r.h("YodaCodeCache", "clear\(\) called");
          a0.y(d.b).T(a.a).R(e.b, f.b);
       }
       YodaXCache.n.b();
       return;
    }
    public void clearOnLowDiskMode(){
       a i;
       a$a obj;
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, Yoda.class, "33")) {
          return;
       }
       i offlinePacka = this.getOfflinePackageHandler();
       if (offlinePacka != null) {
          Objects.requireNonNull(offlinePacka);
          if (!PatchProxy.applyVoid(objArray, offlinePacka, i.class, "9")) {
             Collection uCollection = offlinePacka.d.values();
             a.h(uCollection, "cachedMatchInfo.values");
             Iterator iterator1 = uCollection.iterator();
             while (iterator1.hasNext()) {
                a uoa = iterator1.next();
                obj = a.a;
                Objects.requireNonNull(obj);
                i$a obj2 = PatchProxy.apply(objArray, obj, a$a.class, "8");
                if (obj2 != PatchProxyResult.class) {
                   b = obj2.booleanValue();
                }else {
                   a uoa1 = Azeroth2.B.q();
                   b = (uoa1 != null)? a$a.b(uoa1, null, "yoda_low_disk_not_clean_preload", false, 1, null): false;
                }
                if (b && (uoa.loadType == 3 && uoa.isImportant == null)) {
                   offlinePacka.n(uoa.hyId);
                   obj2 = i.j;
                   c.a(obj2.b(uoa.hyId));
                   c.a(obj2.c(uoa.hyId));
                }
             }
          }
       }
       YodaLoading.g.e();
       if (!PatchProxy.applyVoid(objArray, objArray, a.class, "4")) {
          String str = "YodaCodeCache";
          r.h(str, "clearOnLowDiskMode\(\) called");
          i = a.i;
          if (!i.n()) {
             r.h(str, "clearOnLowDiskMode\(\) tag is null");
          }else {
             String[] stringArray = x.h.d();
             File[] uFileArray = i.k().listFiles();
             if (uFileArray != null) {
                List list = ArraysKt___ArraysKt.uy(uFileArray);
                if (list != null) {
                   ArrayList uArrayList = new ArrayList();
                   Iterator iterator = list.iterator();
                   String str1 = "it";
                   while (iterator.hasNext()) {
                      obj = iterator.next();
                      Object obj1 = obj;
                      a.h(obj1, str1);
                      int i1 = ArraysKt___ArraysKt.P7(stringArray, obj1.getName()) ^ 0x01;
                      if (i1) {
                         uArrayList.add(obj);
                      }
                   }
                   iterator = uArrayList.iterator();
                   while (iterator.hasNext()) {
                      File uFile = iterator.next();
                      a.h(uFile, str1);
                      r.b(str, "clearOnLowDiskMode: clear hyId = "+uFile.getName());
                      c.a(uFile);
                   }
                }
             }
          }
       }
       YodaXCache.n.b();
       return;
    }
    public void cookieListenToConfigUpdate(){
    }
    public AppConfigHandler getAppConfigHandler(){
       return this.mAppConfigHandler;
    }
    public YodaInitConfig getConfig(){
       return this.mInitConfig;
    }
    public Map getCustomFunctionMap(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       YodaBridgeHandler obj = PatchProxy.apply(objArray, this, Yoda.class, "26");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getYodaBridgeHandler();
       Objects.requireNonNull(obj);
       ConcurrentHashMap uConcurrentH = PatchProxy.apply(objArray, obj, YodaBridgeHandler.class, "8");
       if (uConcurrentH != patchProxyRe) {
       }else {
          uConcurrentH = obj.e().d();
       }
       return uConcurrentH;
    }
    public List getCustomFunctionRegistries(){
       Object obj = PatchProxy.apply(null, this, Yoda.class, "29");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getYodaBridgeHandler().c();
    }
    public YodaInitConfig getInitConfig(){
       return this.mInitConfig;
    }
    public SdkInitInfo getInitSDKInfo(){
       return this.mSdkInitInfo;
    }
    public Class getJumpActivity(Uri p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Yoda.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getSubBizActivityHooker().a(p0, p1);
    }
    public Class getJumpActivity(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Yoda.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getSubBizActivityHooker().b(p0, p1);
    }
    public g getKsWebViewInitListener(){
       Object obj = PatchProxy.apply(null, this, Yoda.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mKsWebViewInitListener == null) {
          this.mKsWebViewInitListener = new Yoda$c(this);
       }
       return this.mKsWebViewInitListener;
    }
    public long getLastRequestTimestamp(){
       return this.mLastRequestTimestamp;
    }
    public Supplier getLocaleSupplier(){
       return this.mLocaleSupplier;
    }
    public File getOfflineFileByUrl(String p0,String p1){
       b obj = PatchProxy.applyTwoRefs(p0, p1, this, Yoda.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!o.c(p0) && !o.c(p1)) {
          List hyIds = new LaunchModel$a(p0).a().getHyIds();
          if (hyIds.isEmpty()) {
             return null;
          }else {
             obj = new b(new h(hyIds));
             Iterator iterator = hyIds.iterator();
             while (iterator.hasNext()) {
                File uFile = obj.i(iterator.next(), Uri.parse(p1));
                if (uFile != null) {
                   return uFile;
                }
             }
          }
       }
       return null;
    }
    public File getOfflinePackageFile(String p0,Uri p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, Yoda.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (o.c(p0) || p1 == null) {
          return null;
       }
       return new b(p0).i(p0, p1);
    }
    public i getOfflinePackageHandler(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Yoda obj = PatchProxy.apply(objArray, this, Yoda.class, "23");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.mInitConfig == null) {
          return objArray;
       }
       obj = this.mLock;
       _monitor_enter(obj);
       if (this.mOfflinePackageHandler == null) {
          this.registerNetworkConnectChangeReceiver();
          Yoda tmInitConfig = this.mInitConfig;
          i oi = PatchProxy.applyOneRefs(tmInitConfig, new l0(), l0.class, "1");
          if (oi != patchProxyRe) {
          }else {
             a.q(tmInitConfig, "config");
             oi = new i(tmInitConfig);
          }
          this.mOfflinePackageHandler = oi;
       }
       _monitor_exit(obj);
       return this.mOfflinePackageHandler;
    }
    public Map getPreloadJsContentMap(){
       Yoda obj = PatchProxy.apply(null, this, Yoda.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mAppConfigHandler;
       if (obj != null) {
          return obj.d();
       }
       r.j("Yoda", "getPreloadJsContentMap but Yoda not init.");
       return Collections.emptyMap();
    }
    public final d getSubBizActivityHooker(){
       Object obj = PatchProxy.apply(null, this, Yoda.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mSubBizActivityJumpHooker == null) {
          this.mSubBizActivityJumpHooker = new d();
       }
       return this.mSubBizActivityJumpHooker;
    }
    public YodaApi getYodaApi(){
       return this.mYodaApi;
    }
    public YodaBridgeHandler getYodaBridgeHandler(){
       Object obj = PatchProxy.apply(null, this, Yoda.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mYodaBridgeHandler == null) {
          this.mYodaBridgeHandler = new YodaBridgeHandler();
       }
       return this.mYodaBridgeHandler;
    }
    public Map getYodaFunctionMap(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       YodaBridgeHandler obj = PatchProxy.apply(objArray, this, Yoda.class, "25");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.getYodaBridgeHandler();
       Objects.requireNonNull(obj);
       ConcurrentHashMap uConcurrentH = PatchProxy.apply(objArray, obj, YodaBridgeHandler.class, "7");
       if (uConcurrentH != patchProxyRe) {
       }else {
          uConcurrentH = obj.e().i();
       }
       return uConcurrentH;
    }
    public a getYodaStorage(){
       Object obj = PatchProxy.apply(null, this, Yoda.class, "34");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mYodaStorage == null) {
          this.initStorage();
       }
       return this.mYodaStorage;
    }
    public boolean hasInit(){
       return this.mHasInit;
    }
    public void init(YodaInitConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Yoda.class, "2")) {
          return;
       }
       if (this.mHasInit != null) {
          return;
       }
       this.getInitSDKInfo().b(Long.valueOf(System.currentTimeMillis()));
       this.mInitConfig = p0;
       if (this.minimumInited == null) {
          e$a uoa = new e$a();
          e uoe = PatchProxy.apply(null, uoa, e$a.class, "1");
          if (uoe != PatchProxyResult.class) {
          }else {
             uoe = new e(uoa);
          }
          this.minimumInit(uoe);
       }
       this.newInit(p0);
       this.mHasInit = true;
       this.getInitSDKInfo().a(Long.valueOf(System.currentTimeMillis()));
       this.requestConfig();
       return;
    }
    public void initAppConfig(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.applyVoid(null, this, Yoda.class, "17")) {
          return;
       }
       a uoa1 = this.getYodaStorage().j();
       Objects.requireNonNull(uoa1);
       d uod = PatchProxy.apply(null, uoa1, uoa, "1");
       if (uod != patchProxyRe) {
       }else {
          uod = uoa1.a.J();
       }
       uoa1 = this.getYodaStorage().j();
       Objects.requireNonNull(uoa1);
       b uob = PatchProxy.apply(null, uoa1, uoa, "2");
       if (uob != patchProxyRe) {
       }else {
          uob = uoa1.a.E();
       }
       this.mAppConfigHandler = new AppConfigHandler(uod, uob);
       return;
    }
    public final void initAppLife(){
       if (PatchProxy.applyVoid(null, this, Yoda.class, "18")) {
          return;
       }
       Azeroth2.B.x().subscribeOn(AzerothSchedulers.a()).subscribe(new i(this), a.b);
       return;
    }
    public void initConfig(Application p0,YodaInitConfig p1){
       this.init(p1);
    }
    public void initConfigInterceptor(){
       if (PatchProxy.applyVoid(null, this, Yoda.class, "15")) {
          return;
       }
       if (!PatchProxy.applyVoid(null, null, n.class, "1")) {
          n.a = new b();
       }
       n.a(new f());
       n.a(new c());
       n.a(new b());
       n.a(new d());
       return;
    }
    public void initStorage(){
       if (PatchProxy.applyVoid(null, this, Yoda.class, "16")) {
          return;
       }
       a uoa = new a();
       this.mYodaStorage = uoa;
       Objects.requireNonNull(YodaV2.f);
       YodaV2.e = uoa;
       return;
    }
    public final void initV2(YodaInitConfig p0){
       f uof;
       a b;
       c uoc;
       a uoa = a.class;
       g og = g.class;
       b uob = b.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, Yoda.class, "6")) {
          return;
       }
       b uob1 = new b();
       f globalCookie = p0.getGlobalCookieHosts();
       Object obj = PatchProxy.applyOneRefs(globalCookie, uob1, uob, "1");
       if (obj != patchProxyRe) {
          uob1 = obj;
       }else {
          a.q(globalCookie, "hosts");
          uob1.a = globalCookie;
       }
       List degradeCooki = p0.getDegradeCookieHosts();
       Objects.requireNonNull(uob1);
       g obj1 = PatchProxy.applyOneRefs(degradeCooki, uob1, uob, "2");
       if (obj1 != patchProxyRe) {
          uob1 = obj1;
       }else {
          a.q(degradeCooki, "hosts");
          uob1.b = degradeCooki;
       }
       uob1.d = new f(p0);
       uob1.c = new g(p0);
       uob1.e = new Yoda$a(this, p0);
       obj1 = new g();
       globalCookie = p0.getGlobalJsBridgeApiMap();
       obj = PatchProxy.applyOneRefs(globalCookie, obj1, og, "1");
       if (obj != patchProxyRe) {
          obj1 = obj;
       }else {
          a.q(globalCookie, "rules");
          obj1.a = globalCookie;
       }
       Map degradeJsBri = p0.getDegradeJsBridgeApiMap();
       Objects.requireNonNull(obj1);
       YodaV2 obj2 = PatchProxy.applyOneRefs(degradeJsBri, obj1, og, "2");
       if (obj2 != patchProxyRe) {
          uof = obj2;
       }else {
          a.q(degradeJsBri, "rules");
          obj1.b = degradeJsBri;
       }
       a uoa1 = new a();
       obj2 = PatchProxy.applyOneRefs(uob1, uoa1, uoa, "1");
       if (obj2 != patchProxyRe) {
          uoa1 = obj2;
       }else {
          a.q(uob1, "config");
          uoa1.b = uob1;
       }
       Objects.requireNonNull(uoa1);
       YodaV2 obj3 = PatchProxy.applyOneRefs(uof, uoa1, uoa, "2");
       if (obj3 != patchProxyRe) {
          uoa1 = obj3;
       }else {
          a.q(uof, "config");
          uoa1.c = uof;
       }
       obj3 = YodaV2.f;
       obj2 = YodaV2.class;
       _monitor_enter(obj3);
       if (PatchProxy.applyVoidOneRefs(uoa1, obj3, obj2, "3")) {
          _monitor_exit(obj3);
       }else {
          a.q(uoa1, "config");
          if (YodaV2.d) {
             _monitor_exit(obj3);
          }else {
             _monitor_enter(obj3);
             if (YodaV2.c) {
                _monitor_exit(obj3);
             }else {
                YodaV2.c = true;
                _monitor_exit(obj3);
             }
             if (!PatchProxy.applyVoidOneRefs(uoa1, obj3, obj2, "4")) {
                YodaCookie f = YodaCookie.f;
                b = uoa1.b;
                Objects.requireNonNull(f);
                if (!PatchProxy.applyVoidOneRefs(b, f, YodaCookie.class, "5")) {
                   YodaCookie.a = b;
                   d d = YodaCookie.d;
                   uob1 = (b != null)? b.e: null;
                   d.a = uob1;
                }
             }
             if (!PatchProxy.applyVoidOneRefs(uoa1, obj3, obj2, "5")) {
                obj3.a().i = uoa1.c;
             }
             YodaV2.d = true;
             _monitor_exit(obj3);
          }
       }
       return;
    }
    public final void initYodaApi(){
       if (PatchProxy.applyVoid(null, this, Yoda.class, "13")) {
          return;
       }
       this.mYodaApi = new YodaApi();
       return;
    }
    public final void initYodaBridge(){
       if (PatchProxy.applyVoid(null, this, Yoda.class, "14")) {
          return;
       }
       if (this.mYodaBridgeHandler == null) {
          this.mYodaBridgeHandler = new YodaBridgeHandler();
       }
       return;
    }
    public final void initYodaMigrate(){
       int i;
       a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, Yoda.class, "12")) {
          return;
       }
       l ol = new l(this.mYodaStorage);
       YodaSharedPreferences yodaSharedPr = YodaSharedPreferences.class;
       a uoa = a.class;
       String str = "1";
       if (!PatchProxy.applyVoid(objArray, ol, l.class, str)) {
          l b = ol.b;
          Objects.requireNonNull(b);
          Object obj = PatchProxy.apply(objArray, b, uoa, str);
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          }else {
             a a1 = b.a;
             Objects.requireNonNull(a1);
             Object obj1 = PatchProxy.apply(objArray, a1, yodaSharedPr, "3");
             i = (obj1 != PatchProxyResult.class)? obj1.intValue(): a1.a().getInt("migrate_version", 0);
          }
          ol.a = i;
          ol.a();
          l b1 = ol.b;
          ol = ol.a;
          Objects.requireNonNull(b1);
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(ol), b1, uoa, "2")) {
             a = b1.a;
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(yodaSharedPr) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(ol), a, yodaSharedPr, "4")) {
                a = a.a();
                Objects.requireNonNull(a);
                a.q("migrate_version", "key");
                g.a(a.a().edit().putInt("migrate_version", ol));
             }
          }
       }
    label_00a8 :
       return;
    }
    public boolean isColdStart(){
       Yoda tcoldStart = this.coldStart;
       if (tcoldStart != null) {
          this.coldStart = false;
       }
       return tcoldStart;
    }
    public boolean isColdStartWebView(){
       return this.coldStart;
    }
    public boolean isDebugMode(){
       Object obj = PatchProxy.apply(null, this, Yoda.class, "35");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return Azeroth2.B.u();
    }
    public boolean isDebugToolEnable(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Yoda obj = PatchProxy.apply(null, this, Yoda.class, "36");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.isDebugMode()) {
          obj = this.mInitConfig;
          if (obj == null || !obj.isDebugToolEnable()) {
             Object obj1 = PatchProxy.apply(null, null, n.class, "2");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                a uoa = Azeroth2.B.q();
                b1 = (uoa != null)? a$a.b(uoa, null, "yoda_web_enable_debugger", false, 1, null): false;
             }
             if (!b1) {
             label_004f :
                return b;
             }
          }
       }
       b = true;
       goto label_004f ;
    }
    public boolean jumpSubBizActivity(Activity p0,String p1,Intent p2){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, Yoda.class, "9");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       d subBizActivi = this.getSubBizActivityHooker();
       Objects.requireNonNull(subBizActivi);
       obj = PatchProxy.applyThreeRefs(p0, p1, p2, subBizActivi, d.class, "2");
       boolean b = true;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(p0 != null && p2 != null){
          ComponentName uComponentNa = (p1 == null || !p1.length())? 1: null;
          if (!uComponentNa) {
             uComponentNa = p0.getComponentName();
             String className = (uComponentNa != null)? uComponentNa.getClassName(): null;
             Class uClass = subBizActivi.b(p1, className);
             if (uClass != null) {
                r.h("SubBizActivityJumpHooker", "jumpSubBizActivity clazz: "+uClass.getName());
                p2.setClass(p0, uClass);
                p0.startActivity(p2);
             }
          }
       }
    label_007b :
       b = false;
       return b;
    }
    public void minimumInit(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Yoda.class, "4")) {
          return;
       }
       if (this.minimumInited != null) {
          return;
       }
       this.getInitSDKInfo().miniPreInitTimeStamp = Long.valueOf(System.currentTimeMillis());
       this.newMinimumInit(p0);
       this.minimumInited = true;
       p0.miniInitedTimeStamp = Long.valueOf(System.currentTimeMillis());
       return;
    }
    public final void newInit(YodaInitConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Yoda.class, "3")) {
          return;
       }
       this.initV2(p0);
       this.initYodaBridge();
       this.initAppLife();
       if (!PatchProxy.applyVoid(null, null, e.class, "10")) {
          e$a f = e.f;
          Objects.requireNonNull(f);
          if (!PatchProxy.applyVoid(null, f, e$a.class, "3")) {
             a.a(d.b);
          }
       }
       this.nextRunnerTask();
       this.addKsCorePerformanceListener();
       return;
    }
    public final void newMinimumInit(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, Yoda.class, "5")) {
          return;
       }
       this.initStorage();
       this.initYodaMigrate();
       this.initYodaApi();
       this.initConfigInterceptor();
       this.initAppConfig();
       return;
    }
    public final void nextRunnerTask(){
       if (PatchProxy.applyVoid(null, this, Yoda.class, "7")) {
          return;
       }
       a.a(new j(this));
       return;
    }
    public void registerFunction(String p0,String p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, Yoda.class, "27")) {
          return;
       }
       this.getYodaBridgeHandler().f(p0, p1, p2);
       return;
    }
    public final void registerNetworkConnectChangeReceiver(){
       if (PatchProxy.applyVoid(null, this, Yoda.class, "20")) {
          return;
       }
       if (this.mNetworkConnectChangedReceiver == null) {
          IntentFilter intentFilter = new IntentFilter();
          intentFilter.addAction("android.net.wifi.STATE_CHANGE");
          intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
          this.mNetworkConnectChangedReceiver = new NetworkConnectChangedReceiver();
          UniversalReceiver.e(Azeroth2.B.d(), this.mNetworkConnectChangedReceiver, intentFilter);
       }
       return;
    }
    public void requestConfig(){
       Yoda tmAppConfigH;
       AppConfigHandler uAppConfigHa = AppConfigHandler.class;
       if (PatchProxy.applyVoid(null, this, Yoda.class, "21")) {
          return;
       }
       if (this.mAppConfigHandler == null) {
          return;
       }
       if (this.shouldRequestConfig()) {
          this.mLastRequestTimestamp = SystemClock.elapsedRealtime();
          tmAppConfigH = this.mAppConfigHandler;
          Objects.requireNonNull(tmAppConfigH);
          if (!PatchProxy.applyVoid(null, tmAppConfigH, uAppConfigHa, "9")) {
             if (tmAppConfigH.a()) {
                tmAppConfigH.b();
             }else {
                a.a(new c(tmAppConfigH));
             }
          }
       }else {
          tmAppConfigH = this.mAppConfigHandler;
          Objects.requireNonNull(tmAppConfigH);
          if (!PatchProxy.applyVoid(null, tmAppConfigH, uAppConfigHa, "8") && !tmAppConfigH.a()) {
             a.a(new b(tmAppConfigH));
          }
       }
       return;
    }
    public void setColdStart(boolean p0){
       this.coldStart = p0;
    }
    public void setLocaleSupplier(Supplier p0){
       this.mLocaleSupplier = p0;
    }
    public final boolean shouldRequestConfig(){
       Object obj = PatchProxy.apply(null, this, Yoda.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = ((SystemClock.elapsedRealtime() - this.mLastRequestTimestamp) - this.mInitConfig.getRequestConfigTimeInterval() > 0)? true: false;
       return b;
    }
}
