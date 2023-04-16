package com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import java.lang.String;
import rc3.d;
import msd.a;
import java.lang.Object;
import kotlin.jvm.internal.a;
import io.reactivex.subjects.PublishSubject;
import en8.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$c;
import ec3.f;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$VsyncStrategy;
import com.kuaishou.live.presenterscatter.taskdispatcher.LiveMainThreadTaskDispatcher$b;
import qrd.l1;
import java.util.ArrayList;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.video.waynelive.LivePlayerController;
import ga1.e;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$a;
import com.kwai.video.waynelive.listeners.LivePlayerRenderListener;
import com.kwai.video.waynelive.ILivePlayerStatusMonitor;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$b;
import brd.w;
import erd.c;
import brd.t;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$c;
import erd.g;
import crd.b;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$d;
import mrd.a;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import b93.e;
import com.kuaishou.live.lite.basic.model.LiveLiteModelManager;
import d93.c;
import java.lang.Boolean;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$2;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$3;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$4;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$5;
import wkd.b;
import com.kwai.framework.perf.phonelevel.d;
import java.lang.StringBuilder;
import msd.l;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager$ScatterLoadStatus;
import com.stage.LiveLoadingStage;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleDeferredLoadTasks$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleDeferredLoadTasks$2;
import kotlin.jvm.internal.Ref$LongRef;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$2;
import xj3.d;
import gb3.c;
import java.lang.Runnable;
import java.util.Collection;
import java.lang.System;
import android.os.Trace;
import com.yxcorp.utility.SystemUtil;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import java.lang.Long;
import kotlin.Pair;
import qrd.r0;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$startScatterLoad$onLoadedBlock$1;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$startScatterLoad$2;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$startScatterLoad$3;
import com.kuaishou.live.lite.framework.utils.LivecycleUtilsKt;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader$e;
import ekd.k1;

public abstract class LiveLitePresenterScatterLoader extends LiveLitePresenterLoaderBase	// class@000949
{
    public final String h;
    public final PublishSubject i;
    public final PublishSubject j;
    public final Object k;
    public Activity l;
    public c m;
    public b n;
    public final c o;
    public final List p;
    public boolean q;
    public final List r;
    public boolean s;
    public final boolean t;
    public final a u;
    public boolean v;
    public l w;
    public boolean x;
    public final boolean y;

    public void LiveLitePresenterScatterLoader(String p0,boolean p1,long p2,d p3,a p4,a p5){
       a.p(p0, "name");
       a.p(p3, "playerService");
       a.p(p4, "presenterRegistry");
       a.p(p5, "modelManager");
       super(p0);
       this.y = p1;
       this.h = "LiveLitePresenterScatterLoader";
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<Unit>\(\)");
       this.i = publishSubje;
       PublishSubject publishSubje1 = PublishSubject.g();
       a.o(publishSubje1, "PublishSubject.create<Unit>\(\)");
       this.j = publishSubje1;
       this.k = new Object();
       c uoc = new c(p2, 0);
       LiveMainThreadTaskDispatcher$VsyncStrategy vsyncStrateg = PatchProxy.apply(null, this, LiveLitePresenterScatterLoader.class, "1");
       if (vsyncStrateg != PatchProxyResult.class) {
       }else if(f.k()){
          vsyncStrateg = new LiveMainThreadTaskDispatcher$VsyncStrategy();
       }else {
          vsyncStrateg = new LiveMainThreadTaskDispatcher$b();
       }
       uoc.a(vsyncStrateg);
       this.o = uoc;
       this.p = new ArrayList();
       this.r = new ArrayList();
       this.t = a.t().u("SOURCE_LIVE").d("preventLiteMemoryLeakDueToScatterLoad", true);
       if (this.r()) {
          if (this.s()) {
             b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, "LiveLitePresenterScatterLoader addRenderListener");
             p3.Vc().addRenderListener(new LiveLitePresenterScatterLoader$a(this));
             this.n = t.zip(publishSubje1, publishSubje, LiveLitePresenterScatterLoader$b.a).subscribe(new LiveLitePresenterScatterLoader$c(this, p4, p5));
          }else {
             b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, "LiveLitePresenterScatterLoader only observe resume");
             this.n = publishSubje1.subscribe(new LiveLitePresenterScatterLoader$d(this, p4, p5));
          }
       }else {
          b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, "LiveLitePresenterScatterLoader isEnableScatterTwoPhase false");
       }
       a uoa = a.g();
       a.o(uoa, "BehaviorSubject.create<L¡­ager.ScatterLoadStatus>\(\)");
       this.u = uoa;
       return;
    }
    public boolean j(Activity p0,LifecycleOwner p1,e p2,LiveLiteModelManager p3,c p4){
       Object[] objArray;
       e uoe;
       LiveLiteModelManager liveLiteMode;
       c uoc;
       LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$2 oscheduleSli;
       LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$3 oscheduleSli1;
       LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$4 oscheduleSli2;
       LiveLitePresenterScatterLoader$scheduleSlidingLoadTasks$5 oscheduleSli3;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       LiveLitePresenterScatterLoader liveLitePres = LiveLitePresenterScatterLoader.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       int i3 = 5;
       int i4 = 1;
       int i5 = 0;
       if (PatchProxy.isSupport(liveLitePres)) {
          objArray = new Object[i3];
          objArray[i5] = oobject;
          objArray[i4] = oobject1;
          objArray[i2] = oobject2;
          objArray[i1] = oobject3;
          objArray[i] = oobject4;
          Activity obj = PatchProxy.apply(objArray, this, liveLitePres, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(oobject, "activity");
       a.p(oobject1, "parentLifecycle");
       a.p(oobject2, "presenterRegistry");
       a.p(oobject3, "modelManager");
       a.p(oobject4, "serviceManager");
       if (this.r()) {
          if (PatchProxy.isSupport(liveLitePres)) {
             objArray = new Object[i3];
             objArray[i5] = oobject;
             objArray[i4] = oobject1;
             objArray[i2] = oobject2;
             objArray[i1] = oobject3;
             objArray[i] = oobject4;
             if (!PatchProxy.applyVoid(objArray, this, liveLitePres, "12")) {
             }
          }else {
          }
       }else {
          i4 = false;
       }
       return i4;
    }
    public void n(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePresenterScatterLoader.class, "2")) {
          return;
       }
       a.p(p0, "name");
       a.p(p1, "task");
       this.x(p0, p1);
       return;
    }
    public final boolean o(){
       return this.y;
    }
    public final c p(){
       return this.o;
    }
    public final a q(){
       return this.u;
    }
    public final boolean r(){
       Object obj = PatchProxy.apply(null, this, LiveLitePresenterScatterLoader.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (f.h() && this.y != null)? true: false;
       return b;
    }
    public final boolean s(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, LiveLitePresenterScatterLoader.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = b.a(-404437045);
       a.o(obj, "Singleton.get\(PhoneLevelUtils::class.java\)");
       b = obj.g();
       b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, "isLoadDeferredTasksAfterRenderStartedAndLiteResumedEnabled:"+" timeout: "+this.f()+", isLowPhone: "+b);
       b = (this.f() > 0 && b)? true: false;
       return b;
    }
    public final void t(boolean p0){
       LiveLiteScatterLoadManager$ScatterLoadStatus fORCE_FLUSH;
       LiveLitePresenterScatterLoader liveLitePres = LiveLitePresenterScatterLoader.class;
       if (PatchProxy.isSupport(liveLitePres) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveLitePres, "9")) {
          return;
       }
       LiveLiteLogTag lITE_FRAMEWO = LiveLiteLogTag.LITE_FRAMEWORK_LOADER;
       b.Z(lITE_FRAMEWO, this.h+" notifyComplete");
       LiveLitePresenterScatterLoader tw = this.w;
       if (tw != null) {
          l1 ol1 = tw.invoke(Boolean.valueOf(this.v));
       }
       tw = this.u;
       if (p0) {
          b.Z(lITE_FRAMEWO, this.h+" notifyComplete FORCE_FLUSH");
          fORCE_FLUSH = LiveLiteScatterLoadManager$ScatterLoadStatus.FORCE_FLUSH;
       }else {
          b.Z(lITE_FRAMEWO, this.h+" notifyComplete NORMAL");
          fORCE_FLUSH = LiveLiteScatterLoadManager$ScatterLoadStatus.NORMAL;
       }
       tw.onNext(fORCE_FLUSH);
       return;
    }
    public final void u(e p0,LiveLiteModelManager p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePresenterScatterLoader.class, "6")) {
          return;
       }
       if (this.r() && this.x == null) {
          b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, this.h+" scheduleDeferredLoadTasks");
          LiveLitePresenterScatterLoader tl = this.l;
          if (tl == null) {
             a.S("activity");
          }
          LiveLitePresenterScatterLoader tm = this.m;
          if (tm == null) {
             a.S("serviceManager");
          }
          this.v(tl, p0, p1, tm);
          this.s = true;
          this.o.h(LiveLoadingStage.Entered, new LiveLitePresenterScatterLoader$scheduleDeferredLoadTasks$1(this), new LiveLitePresenterScatterLoader$scheduleDeferredLoadTasks$2(this));
          this.x = true;
       }
       return;
    }
    public final void v(Activity p0,e p1,LiveLiteModelManager p2,c p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, LiveLitePresenterScatterLoader.class, "13")) {
          return;
       }
       LiveLiteLogTag lITE_FRAMEWO = LiveLiteLogTag.LITE_FRAMEWORK_LOADER;
       b.Z(lITE_FRAMEWO, this.h+" scheduleEnteredLoadTasks");
       if (!this.r()) {
          b.Z(lITE_FRAMEWO, this.h+" scheduleEnteredLoadTasks abort");
          return;
       }else {
          Ref$LongRef longRef = new Ref$LongRef();
          longRef.element = 0;
          LiveLitePresenterScatterLoader liveLitePres = this;
          LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$1 oscheduleEnt = new LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$1(liveLitePres, longRef, p0, p1, p2, p3);
          this.w("addInjectTaskSecondPhase", v8);
          LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$2 oscheduleEnt1 = new LiveLitePresenterScatterLoader$scheduleEnteredLoadTasks$2(liveLitePres, p0, p1, p2, p3, longRef);
          this.w("addCreateTaskSecondPhase", v8);
          return;
       }
    }
    public final void w(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePresenterScatterLoader.class, "4")) {
          return;
       }
       if (this.s != null) {
          this.o.f(new d(0, p0, null, new c(p1)));
       }else {
          this.r.add(new d(0, p0, null, new c(p1)));
       }
       return;
    }
    public final void x(String p0,a p1){
       LiveLitePresenterScatterLoader to;
       c uoc;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveLitePresenterScatterLoader.class, "3")) {
          return;
       }
       if (this.q != null) {
          to = this.o;
          if (p1 != null) {
             uoc = new c(p1);
          }
          to.f(new d(0, p0, null, uoc));
       }else {
          to = this.p;
          if (p1 != null) {
             uoc = new c(p1);
          }
          to.add(new d(0, p0, null, uoc));
       }
       return;
    }
    public void y(Activity p0,LifecycleOwner p1,e p2,LiveLiteModelManager p3,c p4,l p5){
       Object[] objArray;
       l1 a;
       l ol = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       LiveLitePresenterScatterLoader liveLitePres = LiveLitePresenterScatterLoader.class;
       String str = "java.lang.String.format\(format, *args\)";
       if (PatchProxy.isSupport(liveLitePres)) {
          objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,oobject5};
          if (PatchProxy.applyVoid(objArray, ol, liveLitePres, "5")) {
             return;
          }
       }
       a.p(oobject, "activity");
       a.p(oobject1, "parentLifecycle");
       a.p(oobject2, "presenterRegistry");
       a.p(oobject3, "modelManager");
       a.p(oobject4, "serviceManager");
       ol.w = oobject5;
       String str1 = "bizPresenterLoader.scheduleLoadTasks";
       Trace.beginSection(str1);
       this.m(p0, p1, p2, p3, p4);
       a = l1.a;
       Trace.endSection();
       float f = (float)(System.nanoTime() - System.nanoTime()) / 1000000.00f;
       if (f.b()) {
          if (SystemUtil.K()) {
             objArray = new Object[]{str1,Float.valueOf(f)};
             str1 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
             a.o(str1, str);
             b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
          }
       }else {
          objArray = new Object[]{str1,Float.valueOf(f)};
          str1 = String.format("%s - %.3fms", Arrays.copyOf(objArray, 2));
          a.o(str1, str);
          b.Z(LiveLiteLogTag.PERFORMANCE_TRACE, str1);
       }
       r0.a(Long.valueOf((long)f), a).getSecond();
       LiveLiteLogTag lITE_FRAMEWO = LiveLiteLogTag.LITE_FRAMEWORK_LOADER;
       b.Z(lITE_FRAMEWO, "ScatterLoader enableScatter="+ol.y);
       ol.q = true;
       a uoa = (this.r())? null: new LiveLitePresenterScatterLoader$startScatterLoad$onLoadedBlock$1(ol);
       ol.o.h(LiveLoadingStage.Sliding, new LiveLitePresenterScatterLoader$startScatterLoad$2(ol), uoa);
       if (ol.y == null) {
          ol.o.flush();
       }
       ol.l = oobject;
       ol.m = oobject4;
       LivecycleUtilsKt.a(oobject1, Lifecycle$State.RESUMED, new LiveLitePresenterScatterLoader$startScatterLoad$3(ol));
       if (this.r() && this.s()) {
          b.Z(lITE_FRAMEWO, ol.h+" render timer set");
          k1.s(new LiveLitePresenterScatterLoader$e(ol), ol.k, this.f());
       }
       return;
    }
    public final void z(boolean p0){
       LiveLitePresenterScatterLoader liveLitePres = LiveLitePresenterScatterLoader.class;
       if (PatchProxy.isSupport(liveLitePres) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveLitePres, "8")) {
          return;
       }
       LiveLiteLogTag lITE_FRAMEWO = LiveLiteLogTag.LITE_FRAMEWORK_LOADER;
       b.Z(lITE_FRAMEWO, this.h+" tryNotifyComplete");
       if (this.r()) {
          b.Z(lITE_FRAMEWO, this.h+" tryNotifyComplete scatter");
          if (this.x != null) {
             this.t(p0);
          }
       }else {
          this.t(p0);
       }
       return;
    }
}
