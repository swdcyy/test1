package com.kuaishou.live.core.basic.preload.LiveViewPreLoader;
import r12.e;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader$a;
import nsd.u;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader$Companion$ax2cLoader$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader$Companion$asyncLoader$2;
import r12.f;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.WeakHashMap;
import ftd.j2;
import ftd.z0;
import ftd.z1;
import ftd.w;
import ftd.c2;
import kotlin.coroutines.CoroutineContext;
import asd.a;
import ftd.k0;
import ftd.l0;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.core.basic.preload.LiveLoadViewAsyncStrategy;
import com.kuaishou.live.core.basic.preload.LiveLoadViewAsyncStrategy$a;
import r12.f$a;
import android.content.Context;
import java.lang.StringBuilder;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader$b;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.concurrent.CancellationException;
import ftd.z1$a;
import r12.e$a;
import android.view.ViewGroup;
import java.lang.Boolean;
import o56.c;
import o56.a;
import android.view.View;
import java.util.Map;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader$getViewAsync$1;
import asd.c;
import kotlinx.coroutines.CoroutineStart;
import msd.p;
import kotlinx.coroutines.a;
import java.lang.IllegalStateException;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader$handleAutoClear$1;
import androidx.lifecycle.LifecycleObserver;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.basic.preload.LiveViewPreLoader$doPreloadView$1;
import i2b.a;
import wsd.m;
import androidx.core.view.ViewGroupKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import java.util.Collection;
import trd.y;

public final class LiveViewPreLoader implements e	// class@0008cc
{
    public final HashMap a;
    public final WeakHashMap b;
    public final k0 c;
    public final f d;
    public static final p e;
    public static final p f;
    public static final LiveViewPreLoader$a g;

    static {
       LiveViewPreLoader.g = new LiveViewPreLoader$a(null);
       LiveViewPreLoader.e = s.c(LiveViewPreLoader$Companion$ax2cLoader$2.INSTANCE);
       LiveViewPreLoader.f = s.c(LiveViewPreLoader$Companion$asyncLoader$2.INSTANCE);
    }
    public void LiveViewPreLoader(f p0){
       a.p(p0, "viewLoader");
       super();
       this.d = p0;
       this.a = new HashMap();
       this.b = new WeakHashMap();
       this.c = l0.a(z0.g().plus(c2.d(null, 1, null)));
    }
    public static final e g(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       LiveViewPreLoader$a obj = PatchProxy.apply(objArray, objArray, LiveViewPreLoader.class, "16");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = LiveViewPreLoader.g;
       Objects.requireNonNull(obj);
       e uoe = PatchProxy.apply(objArray, obj, LiveViewPreLoader$a.class, "4");
       if (uoe != patchProxyRe) {
       }else {
          uoe = obj.a(LiveLoadViewAsyncStrategy.Companion.a());
       }
       return uoe;
    }
    public void a(f$a p0,Context p1){
       CancellationException uCancellatio;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveViewPreLoader.class, "11")) {
          return;
       }
       a.p(p0, "taskId");
       this.e("clear: "+p0.b());
       LiveViewPreLoader$b uob = this.a.remove(p0);
       if (uob == null) {
          ArrayList uArrayList = this.b.get(p1);
          if (uArrayList != null) {
             Iterator iterator = uArrayList.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   uCancellatio = iterator.next();
                   if (!a.g(uCancellatio.c(), p0)) {
                      continue ;
                   }
                }else {
                   uCancellatio = null;
                }
                uob = uCancellatio;
             }
          }else {
             uob = null;
          }
          if (uob != null) {
             ArrayList uArrayList1 = this.b.get(p1);
             if (uArrayList1 != null) {
                uArrayList1.remove(uob);
             }
          }else {
             uob = null;
          }
       }
       if (uob != null) {
          a.o(uob, "loadingTasks.remove\(task\x20\x02else null\n    } ?: return\x00");
          z1 oz1 = uob.b();
          if (oz1 != null && oz1.E() == true) {
             this.e("clear: cancel job "+p0.b());
             oz1 = uob.b();
             if (oz1 != null) {
                z1$a.b(oz1, null, 1, null);
             }
          }
          this.e("clear: task cleared "+p0.b());
       }
       return;
    }
    public void b(f$a p0,e$a p1,boolean p2,ViewGroup p3,boolean p4){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       boolean b = p2;
       object oobject2 = p3;
       boolean b1 = p4;
       LiveViewPreLoader liveViewPreL = LiveViewPreLoader.class;
       if (PatchProxy.isSupport(liveViewPreL)) {
          Object[] objArray = new Object[]{oobject,oobject1,Boolean.valueOf(p2),oobject2,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, obj, liveViewPreL, "4")) {
             return;
          }
       }
       a.p(oobject, "taskId");
       a.p(oobject1, "l");
       obj.e("getViewAsync: "+p0.b()+" attach:"+b+' '+"merge:"+b1+' '+oobject2);
       c uoc = a.a();
       a.o(uoc, "AppEnv.get\(\)");
       Context uContext = uoc.f();
       LiveViewPreLoader$b uob = obj.a.remove(oobject);
       if (uob == null) {
          obj.e("getViewAsync: no task found "+p0.b()+", preload it");
          a.o(uContext, "currentContext");
          uob = obj.f(uContext, oobject, oobject2);
       }
       a.o(uob, "loadingTasks.remove\(task¡­ taskId, container\)\n    }");
       if (oobject2 != null) {
          uob.e(oobject2);
       }
       z1 oz1 = uob.b();
       if (oz1 != null) {
          if (oz1.isCancelled()) {
             obj.e("getViewAsync: job has been canceled "+p0.b());
             return;
          }else if(oz1.c()){
             obj.e("getViewAsync: job has been done "+p0.b()+" return view:"+uob.d());
             obj.h(uob, b, b1, oobject1);
             return;
          }else {
             ArrayList uArrayList = obj.b.get(uContext);
             if (uArrayList == null) {
                uArrayList = new ArrayList();
                obj.b.put(uContext, uArrayList);
             }
             ArrayList uArrayList1 = uArrayList;
             a.o(uArrayList1, "waitingTasks[currentCont¡­urrentContext] = it\n    }");
             uArrayList1.add(uob);
             obj.e("getViewAsync: waiting job "+p0.b());
             LiveViewPreLoader$getViewAsync$1 ogetViewAsyn = new LiveViewPreLoader$getViewAsync$1(this, uob, p0, uArrayList1, oz1, p2, p4, p1, null);
             a.f(obj.c, null, null, v15, 3, null);
             obj.e("leave getViewAsync: "+p0.b());
             return;
          }
       }else {
          throw new IllegalStateException("getViewAsync: no job found "+p0.b().toString());
       }
    }
    public void c(Context p0,f$a p1,ViewGroup p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveViewPreLoader.class, "1")) {
          return;
       }
       a.p(p0, "context");
       a.p(p1, "taskId");
       this.e("call preloadView: "+p1.b());
       if (this.a.containsKey(p1)) {
          this.e("preloadView: ignore repeated task: "+p1.b());
          return;
       }else {
          this.a.put(p1, this.f(p0, p1, p2));
          if (!PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveViewPreLoader.class, "2") && p0 instanceof ComponentActivity) {
             p0.getLifecycle().addObserver(new LiveViewPreLoader$handleAutoClear$1(this, p1, p0));
          }
          return;
       }
    }
    public View d(f$a p0,boolean p1,ViewGroup p2,boolean p3){
       LiveViewPreLoader$b obj;
       if (PatchProxy.isSupport(LiveViewPreLoader.class)) {
          obj = PatchProxy.applyFourRefs(p0, Boolean.valueOf(p1), p2, Boolean.valueOf(p3), this, LiveViewPreLoader.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "taskId");
       obj = this.a.remove(p0);
       if (obj == null) {
          this.e("getViewSync: no task found "+p0.b());
          LiveViewPreLoader$b uob = new LiveViewPreLoader$b(p0, p2, null, null, 12, null);
       }
       a.o(obj, "loadingTasks.remove\(task¡­\(taskId, container\)\n    }");
       if (p2 != null) {
          obj.e(p2);
       }
       this.h(obj, p1, p3, null);
       this.e("getViewSync: "+p0.b()+" return view:"+obj.d());
       return obj.d();
    }
    public final void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveViewPreLoader.class, "9")) {
          return;
       }
       b.Z(LiveLogTag.LIVE_PRELOAD, "LiveViewPreLoader: "+p0);
       return;
    }
    public final LiveViewPreLoader$b f(Context p0,f$a p1,ViewGroup p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveViewPreLoader.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveViewPreLoader$b uob = new LiveViewPreLoader$b(p1, p2, null, null, 12, null);
       LiveViewPreLoader$doPreloadView$1 uodoPreloadV = new LiveViewPreLoader$doPreloadView$1(this, p1, obj, p0, p2, 0);
       obj.c = a.f(this.c, 0, 0, v13, 3, null);
       return obj;
    }
    public final void h(LiveViewPreLoader$b p0,boolean p1,boolean p2,e$a p3){
       LiveViewPreLoader liveViewPreL = LiveViewPreLoader.class;
       if (PatchProxy.isSupport(liveViewPreL) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), p3, this, LiveViewPreLoader.class, "6")) {
          return;
       }
       this.e("handleFinishedTask: "+p0.c().b());
       if (p0.d() == null) {
          this.e("fallback inflate: "+p0.c().b());
          View view = PatchProxy.applyOneRefs(p0, this, liveViewPreL, "10");
          if (view != PatchProxyResult.class) {
          }else if(p0.a() != null){
             view = a.k(p0.a(), p0.c().a(), false);
          }else {
             c uoc = a.a();
             a.o(uoc, "AppEnv.get\(\)");
             view = a.d(uoc.f(), p0.c().a(), p0.a(), false);
          }
          p0.f(view);
       }
       if (!p1 || (p0.a() != null && (!PatchProxy.isSupport(liveViewPreL) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p2), this, liveViewPreL, "7")))) {
          View view1 = p0.d();
          if (view1 != null) {
             ViewGroup viewGroup = p0.a();
             if (viewGroup != null) {
                if (p2 && view1 instanceof ViewGroup) {
                   if (!PatchProxy.applyVoidTwoRefs(view1, viewGroup, this, liveViewPreL, "8")) {
                      if (SequencesKt___SequencesKt.Y(ViewGroupKt.b(viewGroup), view1)) {
                         viewGroup.removeViewInLayout(view1);
                         this.e("mergeChildrenIntoContainer: inflatedView ÒÑ¾­ attach ÁË£¬ÒÆ³ý¸¸ View");
                      }
                      ArrayList uArrayList = new ArrayList();
                      y.r0(uArrayList, ViewGroupKt.b(view1));
                      view1.removeAllViewsInLayout();
                      Iterator iterator = uArrayList.iterator();
                      while (iterator.hasNext()) {
                         viewGroup.addView(iterator.next());
                      }
                   }
                }else if(!SequencesKt___SequencesKt.Y(ViewGroupKt.b(viewGroup), p0.d())){
                   ViewGroup viewGroup1 = p0.a();
                   if (viewGroup1 != null) {
                      viewGroup1.addView(p0.d());
                   }
                }
             }
          }
       }
       this.e("call onViewLoaded: "+p0.c().b()+' '+p0.d());
       if (p3 != null) {
          p3.a(p0.d(), p0.c().a(), p0.a());
       }
       return;
    }
    public void release(){
       if (PatchProxy.applyVoid(null, this, LiveViewPreLoader.class, "12")) {
          return;
       }
       String str = "release";
       try{
          this.e(str);
          this.a.clear();
          this.b.clear();
          if (l0.k(this.c)) {
             l0.f(this.c, null, 1, null);
          }
          return;
       }catch(java.lang.IllegalStateException e0){
       }
    }
}
