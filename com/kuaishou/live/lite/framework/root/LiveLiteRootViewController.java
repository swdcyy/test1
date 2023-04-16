package com.kuaishou.live.lite.framework.root.LiveLiteRootViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.live.lite.LiveLiteParam;
import k2b.e0;
import mrd.a;
import na3.b;
import android.widget.FrameLayout;
import nc3.d;
import na3.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ma3.b;
import com.kuaishou.live.lite.framework.root.BasicPresenterLoader;
import com.kuaishou.live.lite.framework.root.BizPresenterScatterLoader;
import hb3.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import io7.c;
import o56.a;
import ec3.f;
import w51.a;
import java.lang.Number;
import xf6.l;
import java.lang.StringBuilder;
import yj3.a;
import qrd.l1;
import java.lang.CharSequence;
import e17.i;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import rc3.d;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$bizPresenterLoader$1;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$bizPresenterLoader$2;
import msd.a;
import hb3.c;
import bb3.e;
import androidx.lifecycle.LifecycleOwner;
import ib3.a;
import o56.c;
import android.os.Looper;
import android.util.Printer;
import com.kuaishou.live.lite.framework.utils.JankMessageMonitor$installOnTestChannel$1;
import u63.a;
import android.os.Trace;
import java.lang.reflect.Method;
import java.lang.Throwable;
import java.lang.System;
import ma3.d;
import android.app.Activity;
import com.kwai.video.waynelive.LivePlayerController;
import ga1.e;
import com.kuaishou.live.lite.framework.root.LiveLiteJsBridgeServiceFactoryImpl;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$1;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import hb3.d;
import brd.t;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import com.yxcorp.utility.SystemUtil;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import eq3.d;
import lc3.b;
import android.view.View;
import vb3.k;
import sj3.l;
import rc3.c;
import d93.c;
import hb3.f;
import tkd.b;
import tkd.d;
import v33.a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin;
import b93.e;
import gb3.a;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2;
import com.kuaishou.live.lite.framework.utils.LivecycleUtilsKt;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$3;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$logLifecycle$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import ga1.d;
import tj3.e;
import com.kuaishou.live.lite.performance.a;
import tj3.k;
import ec3.t;
import java.lang.Runnable;
import ekd.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.Map;
import com.kuaishou.live.lite.performance.LiveViewPerformanceModel;
import ec3.v;
import java.util.Random;
import fg6.a;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import java.util.HashMap;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import com.stage.LiveLoadingStage;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$flushAllTasks$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$flushAllTasks$2;
import en8.c;
import crd.b;

public class LiveLiteRootViewController extends ViewController	// class@000976
{
    public final d A;
    public final a B;
    public final f C;
    public LiveLiteModelManager j;
    public c k;
    public LiveLiteLayoutManager l;
    public final b m;
    public final BasicPresenterLoader n;
    public final BizPresenterScatterLoader o;
    public boolean p;
    public final c q;
    public final e r;
    public a s;
    public final BaseFragment t;
    public final LiveLiteParam u;
    public final e0 v;
    public final a w;
    public final a x;
    public final b y;
    public final FrameLayout z;

    public void LiveLiteRootViewController(BaseFragment p0,LiveLiteParam p1,e0 p2,a p3,a p4,b p5,FrameLayout p6,d p7,a p8,f p9){
       a.p(p0, "hostFragment");
       a.p(p1, "liveLiteParam");
       a.p(p2, "logPage");
       a.p(p5, "liveLiteCoverService");
       a.p(p6, "extensionContainer");
       a.p(p7, "playerServiceProvider");
       a.p(p8, "stageLayoutState");
       a.p(p9, "preRenderVideoFrameService");
       super();
       this.t = p0;
       this.u = p1;
       this.v = p2;
       this.w = p3;
       this.x = p4;
       this.y = p5;
       this.z = p6;
       this.A = p7;
       this.B = p8;
       this.C = p9;
       this.m = new b();
       this.n = new BasicPresenterLoader();
       b c = b.c;
       boolean i = r1.y1(p1.getLiveStreamFeed());
       Objects.requireNonNull(c);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          p5 = PatchProxy.applyOneRefs(Integer.valueOf(i), c, uob, "4");
          if (p5 != patchProxyRe) {
             i = p5.booleanValue();
          label_0143 :
             Objects.requireNonNull(c);
             b.b = true;
             this.o = new BizPresenterScatterLoader(i, p7.l1(), new LiveLiteRootViewController$bizPresenterLoader$1(this), new LiveLiteRootViewController$bizPresenterLoader$2(this));
             this.q = new c();
             this.r = new e(this);
             a uoa = a.g();
             a.o(uoa, "BehaviorSubject.create\(\)");
             this.s = uoa;
             return;
          }
       }
       String str = null;
       String str1 = (!i && !b.b)? 1: null;
       Object[] objArray = null;
       if (str1) {
          str1 = PatchProxy.apply(objArray, c, uob, "3");
          i = (str1 != patchProxyRe)? str1.booleanValue(): b.a.d("enableLiteFirstPosScatter", true);
       }else {
          str1 = PatchProxy.apply(objArray, c, uob, "2");
          i = (str1 != patchProxyRe)? str1.booleanValue(): b.a.d("enableLiveLiteScarlettLoad", str);
       }
    label_00b7 :
       if (a.d() && !f.b()) {
          uob = PatchProxy.apply(objArray, objArray, a.class, "114");
          int i1 = (uob != patchProxyRe)? uob.intValue(): l.e("enableLiteScatterLoad", str);
          if (i1 == 1) {
             str = 1;
          }else if(i1 == 2){
             str = i;
          }
          i = 0x7f11066a;
          StringBuilder str2 = "";
          String str3 = (!i1)? "KSwitch ": "Debug开关强制 ";
          str2 = str2+str3;
          str3 = (str)? "打开": "关闭";
          str3 = str2+str3+" Lite打散加载: "+a.a()+"ms";
          a.o(str3, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
          i.d(i, str3);
          i = str;
       }
       b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, "lite scatter load enabled="+i);
       goto label_0143 ;
    }
    public void F2(){
       l1 a;
       float f;
       Object[] objArray1;
       String str6;
       String str7;
       Object[] objArray2;
       LiveLiteRootViewController l1;
       LiveLiteRootViewController objArray2;
       String str8;
       LiveLiteModelManager liveLiteMode = this;
       String str = "playerServiceProvider.ge…ce\(\).livePlayerController";
       LiveLiteRootViewController liveLiteRoot = LiveLiteRootViewController.class;
       String str1 = "java.lang.String.format\(format, *args\)";
       String str2 = "%s - %.3fms";
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, liveLiteMode, liveLiteRoot, "7")) {
          return;
       }
       a b = a.b;
       Objects.requireNonNull(b);
       LiveLiteJsBridgeServiceFactoryImpl liveLiteJsBr = 1;
       if (!PatchProxy.applyVoidOneRefs(liveLiteMode, b, a.class, "3")) {
          a.p(liveLiteMode, "lifecycle");
          c uoc1 = a.a();
          a.o(uoc1, "AppEnv.get\(\)");
          if (uoc1.c() && !f.b()) {
             Looper.getMainLooper().setMessageLogging(b);
             a.a(liveLiteMode, JankMessageMonitor$installOnTestChannel$1.INSTANCE);
             Class[] uClassArray = new Class[liveLiteJsBr];
             uClassArray[0] = Boolean.TYPE;
             Method declaredMeth = Trace.class.getDeclaredMethod("setAppTracingAllowed", uClassArray);
             a.o(declaredMeth, "it");
             declaredMeth.setAccessible(liveLiteJsBr);
             Object[] objArray3 = new Object[liveLiteJsBr];
             objArray3[0] = Boolean.TRUE;
             declaredMeth.invoke(objArray, objArray3);
          }
       }
       long l = System.nanoTime();
       Trace.beginSection("RootVc::create");
       String str3 = "RootVc::ServiceManager";
       Trace.beginSection(str3);
       LivePlayerController livePlayerCo = liveLiteMode.A.l1().Vc();
       a.o(livePlayerCo, str);
       LiveLiteRootViewController liveLiteRoot1 = liveLiteMode.q;
       LiveLiteRootViewController liveLiteRoot2 = liveLiteMode.q;
       LiveLiteRootViewController liveLiteRoot3 = liveLiteRoot;
       int i = 2;
       String str4 = str2;
       String str5 = str1;
       liveLiteMode.j = d.a.a(this.B2(), liveLiteMode.t, this, liveLiteMode.u, liveLiteMode.o.A, liveLiteMode.v, livePlayerCo, new LiveLiteJsBridgeServiceFactoryImpl(new LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$1(liveLiteMode)), liveLiteMode.s, liveLiteMode.w, liveLiteMode.x);
       a = l1.a;
       Trace.endSection();
       f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray1 = new Object[i];
             objArray1[0] = str3;
             objArray1[1] = Float.valueOf(f);
             str2 = str4;
             str6 = String.format(str2, Arrays.copyOf(objArray1, i));
             str7 = str5;
             a.o(str6, str7);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str6);
          }else {
             str2 = str4;
             str7 = str5;
          }
       }else {
          str2 = str4;
          str7 = str5;
          objArray1 = new Object[i];
          objArray1[0] = str3;
          objArray1[1] = Float.valueOf(f);
          str6 = String.format(str2, Arrays.copyOf(objArray1, i));
          a.o(str6, str7);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str6);
       }
       liveLiteRoot2.b = r0.a(Long.valueOf((long)f), a).getFirst().longValue();
       liveLiteRoot2 = liveLiteMode.q;
       Trace.beginSection("RootVc::LayoutManager");
       LivePlayerController livePlayerCo1 = liveLiteMode.A.l1().Vc();
       a.o(livePlayerCo1, str);
       LiveLiteLayoutManager liveLiteLayo = liveLiteJsBr;
       LiveLiteLayoutManager liveLiteLayo1 = liveLiteJsBr;
       l1 ol1 = a;
       str1 = str7;
       str = str2;
       liveLiteLayo = new LiveLiteLayoutManager(liveLiteMode.u, this.B2(), this.E2(), livePlayerCo1, liveLiteMode.r.b(), liveLiteMode.r.a(), liveLiteMode.z, this, liveLiteMode.A.j0(), liveLiteMode.B);
       liveLiteMode.l = liveLiteLayo1;
       liveLiteMode.R2(liveLiteLayo1.d());
       Trace.endSection();
       f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray2 = new Object[]{"RootVc::LayoutManager",Float.valueOf(f)};
             str6 = String.format(str, Arrays.copyOf(objArray2, 2));
             a.o(str6, str1);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str6);
          }
       }else {
          objArray2 = new Object[]{"RootVc::LayoutManager",Float.valueOf(f)};
          str6 = String.format(str, Arrays.copyOf(objArray2, 2));
          a.o(str6, str1);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str6);
       }
       l1 ol11 = ol1;
       liveLiteRoot2.d = r0.a(Long.valueOf((long)f), ol11).getFirst().longValue();
       Activity uActivity = this.B2();
       liveLiteRoot2 = liveLiteMode.t;
       LiveLiteRootViewController u = liveLiteMode.u;
       l1 = liveLiteMode.l;
       str6 = "layoutManager";
       if (l1 == null) {
          a.S(str6);
       }
       c uoc = f.a(uActivity, liveLiteRoot2, u, l1, liveLiteMode.A.l1(), liveLiteMode.y, liveLiteMode.A.X(), liveLiteMode.A.t0(), liveLiteMode.A.r0(), liveLiteMode.s);
       a.o(uoc, "ServiceManagerInitLogic.…rDetailObservable\n      \)");
       liveLiteMode.k = uoc;
       liveLiteRoot2 = liveLiteMode.r;
       u = liveLiteMode.l;
       if (u == null) {
          a.S(str6);
       }
       l1 = liveLiteMode.k;
       str6 = "serviceManager";
       if (l1 == null) {
          a.S(str6);
       }
       liveLiteRoot2.c(u, l1);
       e uoe = d.a(0x342530d1).getLiveLiteAdapterPlugin().KG();
       a.o(uoe, "adapterModulePresenterRegistry");
       liveLiteMode.m.c(uoe);
       u = liveLiteMode.n;
       Activity uActivity1 = this.B2();
       objArray2 = liveLiteMode.m;
       LiveLiteRootViewController j = liveLiteMode.j;
       if (j == null) {
          a.S("modelManager");
       }
       LiveLiteRootViewController k = liveLiteMode.k;
       if (k == null) {
          a.S(str6);
       }
       u.o(uActivity1, this, objArray2, j, k);
       LivecycleUtilsKt.a(liveLiteMode, Lifecycle$State.STARTED, new LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2(liveLiteMode));
       LivecycleUtilsKt.a(liveLiteMode, Lifecycle$State.RESUMED, new LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$3(liveLiteMode));
       if (!PatchProxy.applyVoid(null, liveLiteMode, liveLiteRoot3, "12")) {
          this.getLifecycle().addObserver(new LiveLiteRootViewController$logLifecycle$1(liveLiteMode));
       }
       Trace.endSection();
       float f1 = (float)(System.nanoTime() - l) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray1 = new Object[]{"RootVc::create",Float.valueOf(f1)};
             str8 = String.format(str, Arrays.copyOf(objArray1, 2));
             a.o(str8, str1);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str8);
          }
       }else {
          objArray1 = new Object[]{"RootVc::create",Float.valueOf(f1)};
          str8 = String.format(str, Arrays.copyOf(objArray1, 2));
          a.o(str8, str1);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str8);
       }
       liveLiteRoot1.a = r0.a(Long.valueOf((long)f1), ol11).getFirst().longValue();
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, LiveLiteRootViewController.class, "10")) {
          return;
       }
       if (this.p != null) {
          this.o.b();
       }
       this.n.b();
       LiveLiteRootViewController tj = this.j;
       if (tj == null) {
          a.S("modelManager");
       }
       tj.b();
       tj = this.l;
       if (tj == null) {
          a.S("layoutManager");
       }
       tj.b();
       return;
    }
    public void K2(){
       LiveLiteLayoutManager d;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveLiteRootViewController.class, "8")) {
          return;
       }
       LiveLiteRootViewController tl = this.l;
       if (tl == null) {
          a.S("layoutManager");
       }
       LiveLiteRootViewController tk = this.k;
       if (tk == null) {
          a.S("serviceManager");
       }
       e uoe = tk.a(d.class).a();
       Objects.requireNonNull(tl);
       if (!PatchProxy.applyVoidOneRefs(uoe, tl, LiveLiteLayoutManager.class, "34")) {
          a.p(uoe, "logReporter");
          if (a.d) {
             d = tl.D;
             k ok = uoe.x();
             Objects.requireNonNull(d);
             t ot = t.class;
             a uoa = a.class;
             if (!PatchProxy.applyVoidOneRefs(ok, d, uoa, "3")) {
                k1.m(d.c);
                d.a = false;
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = d.b.iterator();
                while (iterator.hasNext()) {
                   t ot1 = iterator.next();
                   Objects.requireNonNull(ot1);
                   ArrayList uArrayList1 = PatchProxy.apply(objArray, ot1, ot, "11");
                   if (uArrayList1 != PatchProxyResult.class) {
                   }else {
                      Iterator iterator1 = ot1.b.values().iterator();
                      while (iterator1.hasNext()) {
                         iterator1.next().calculateAvgDuration();
                      }
                      uArrayList1 = new ArrayList(ot1.b.values());
                   }
                   uArrayList.addAll(uArrayList1);
                   if (PatchProxy.applyVoid(objArray, ot1, ot, "9")) {
                      continue ;
                   }
                   ot1.a = false;
                   ot1.c = objArray;
                   ot1.d = new v();
                   ot1.e = new v();
                   ot1.f = new v();
                   ot1.b.clear();
                }
                if (uArrayList.size()) {
                   LiveViewPerformanceModel liveViewPerf = uArrayList.get(new Random().nextInt(uArrayList.size()));
                   if (!PatchProxy.applyVoidTwoRefs(ok, liveViewPerf, d, uoa, "4")) {
                      JsonElement jsonElement = a.a.x(liveViewPerf);
                      Objects.requireNonNull(ok);
                      if (!PatchProxy.applyVoidOneRefs(jsonElement, ok, k.class, "7")) {
                         ok.G0.put("view_performance", jsonElement);
                      }
                   }
                   d.b.clear();
                }
             }
          }
       }
       return;
    }
    public void N2(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, LiveLiteRootViewController.class, "9")) {
          return;
       }
       LiveLiteRootViewController to = this.o;
       Activity uActivity = this.B2();
       LiveLiteRootViewController tm = this.m;
       LiveLiteRootViewController tj = this.j;
       if (tj == null) {
          a.S("modelManager");
       }
       LiveLiteRootViewController tk = this.k;
       if (tk == null) {
          a.S("serviceManager");
       }
       Objects.requireNonNull(to);
       if (!PatchProxy.applyVoidFourRefs(uActivity, tm, tj, tk, to, LiveLitePresenterScatterLoader.class, "7")) {
          a.p(uActivity, "activity");
          a.p(tm, "presenterRegistry");
          a.p(tj, "modelManager");
          a.p(tk, "serviceManager");
          LiveLiteLogTag lITE_FRAMEWO = LiveLiteLogTag.LITE_FRAMEWORK_LOADER;
          b.Z(lITE_FRAMEWO, to.h+" flushAllTasks");
          b = true;
          if (to.r() && to.x == null) {
             to.v(uActivity, tm, tj, tk);
             if (to.t != null) {
                b.Z(lITE_FRAMEWO, to.h+" flushAllTasks startLoad");
                to.s = b;
                to.o.h(LiveLoadingStage.Entered, new LiveLitePresenterScatterLoader$flushAllTasks$1(to), new LiveLitePresenterScatterLoader$flushAllTasks$2(to));
             }
             to.x = b;
          }
          k1.n(to.k);
          LiveLitePresenterScatterLoader n = to.n;
          if (n != null) {
             n.dispose();
          }
          to.v = b;
          to.o.flush();
          if (to.t != null) {
             b.Z(lITE_FRAMEWO, to.h+" flushAllTasks flush again");
             to.o.flush();
          }
          to.o.l();
       }
       return;
    }
    public final LiveLiteLayoutManager V2(){
       LiveLiteRootViewController obj = PatchProxy.apply(null, this, LiveLiteRootViewController.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.l;
       if (obj == null) {
          a.S("layoutManager");
       }
       return obj;
    }
    public final e W2(){
       return this.r;
    }
    public final b X2(){
       return this.m;
    }
    public final LiveLiteModelManager Y2(){
       LiveLiteRootViewController obj = PatchProxy.apply(null, this, LiveLiteRootViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.j;
       if (obj == null) {
          a.S("modelManager");
       }
       return obj;
    }
    public final c Z2(){
       LiveLiteRootViewController obj = PatchProxy.apply(null, this, LiveLiteRootViewController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("serviceManager");
       }
       return obj;
    }
}
