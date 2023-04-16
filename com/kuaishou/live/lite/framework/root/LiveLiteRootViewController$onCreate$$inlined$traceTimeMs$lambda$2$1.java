package com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2;
import java.lang.Object;
import java.lang.Boolean;
import qrd.l1;
import tj3.k;
import ga1.d;
import com.kuaishou.live.lite.framework.root.LiveLiteRootViewController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle$State;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.os.SystemClock;
import hb3.c;
import java.util.Objects;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterLoaderBase;
import kotlin.jvm.internal.a;
import d93.c;
import tj3.e;
import com.kuaishou.live.lite.framework.loader.LiveLitePresenterScatterLoader;
import ec3.f;
import java.util.Collection;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kwai.robust.PatchProxyResult;
import ec3.j$b;
import java.lang.Long;
import java.util.HashMap;
import ec3.j;
import com.google.gson.JsonObject;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import usd.q;
import ec3.i;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.lang.StringBuilder;
import com.google.gson.JsonElement;
import com.kwai.video.waynelive.debug.DebugLog;
import tj3.r;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ec3.k;
import ec3.l;
import ec3.m;
import ec3.n;
import ssd.e;
import bb3.e;
import com.kuaishou.live.lite.framework.layoutmanager.LiveLiteLayoutManager;
import com.kuaishou.live.lite.sidebar.e;
import bb3.d;
import z1.a;
import com.kuaishou.live.lite.framework.layoutmanager.LayoutManagerLateInitLogic$setupSideBarFoldLogic$1;
import androidx.lifecycle.LifecycleOwner;
import msd.a;
import u63.a;
import cb3.g;
import bb3.c;
import vb3.l;
import tj3.q;
import na3.f;

public final class LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2$1 extends Lambda implements l	// class@000973
{
    public final LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2 this$0;

    public void LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2$1(LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2 p0){
       this.this$0 = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0.booleanValue());
       return l1.a;
    }
    public final void invoke(boolean p0){
       k ok1;
       d uod1;
       LiveLiteRootViewController liveLiteRoot1;
       String str2;
       String str3;
       c uoc;
       String str4;
       LiveLiteRootViewController k;
       k ok2;
       boolean b;
       j$b uob1;
       PatchProxyResult patchProxyRe1;
       c e;
       List list1;
       List list2;
       c f;
       k ok4;
       int i2;
       Iterator obj1;
       int i4;
       Object obj2;
       k ok5;
       Object obj = this;
       k ok = k.class;
       d uod = d.class;
       LiveLiteRootViewController liveLiteRoot = LiveLiteRootViewController.class;
       if (PatchProxy.isSupport2(LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2$1.class, "1") && PatchProxy.applyVoidOneRefsWithListener(Boolean.valueOf(p0), obj, LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2$1.class, "1")) {
          return;
       }
       LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2 this$0 = obj.this$0.this$0;
       this$0.p = true;
       if (this$0.getLifecycle().getCurrentState() == Lifecycle$State.DESTROYED) {
          b.Z(LiveLiteLogTag.LITE_FRAMEWORK_LOADER, "loadCompleteCallback in RootVC after onDestroy!");
          PatchProxy.onMethodExit(LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2$1.class, "1");
          return;
       }else {
          obj.this$0.this$0.q.i = SystemClock.elapsedRealtime();
          this$0 = obj.this$0.this$0;
          Objects.requireNonNull(this$0);
          String str = "3";
          String str1 = "serviceManager";
          if (PatchProxy.applyVoid(null, this$0, liveLiteRoot, "11")) {
             ok1 = ok;
             uod1 = uod;
          label_00d3 :
             liveLiteRoot1 = liveLiteRoot;
             str2 = str;
             str3 = str1;
          }else {
             LiveLiteRootViewController q = this$0.q;
             LiveLiteRootViewController o = this$0.o;
             q.g = o.e;
             q.h = o.f;
             o = this$0.k;
             if (o == null) {
                a.S(str1);
             }
             k ok3 = o.a(uod).a().x();
             a.o(ok3, "serviceManager.get\(LiveP¡­orter\(\).qualityStatistics");
             b = this$0.o.o();
             boolean b1 = f.h();
             List list = CollectionsKt___CollectionsKt.m4(this$0.n.e(), this$0.o.e());
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             j$b uob = j$b.class;
             if (PatchProxy.isSupport(c.class)) {
                uob1 = uob;
                patchProxyRe1 = patchProxyRe;
                uod1 = uod;
                ok2 = ok3;
                if (PatchProxy.applyVoidFourRefs(ok3, Boolean.valueOf(b), Boolean.valueOf(b1), list, q, c.class, "1")) {
                   ok1 = ok;
                   goto label_00d3 ;
                }
             }else {
                uod1 = uod;
                uob1 = uob;
                patchProxyRe1 = patchProxyRe;
                ok2 = ok3;
             }
             a.p(ok2, "stat");
             a.p(list, "timeData");
             e = q.e;
             Long longx = null;
             liveLiteRoot1 = liveLiteRoot;
             if (e - longx) {
                list1 = list;
                uoc = q.i;
                if (uoc - longx) {
                   ok2.h0((uoc - e));
                }
             }else {
                list1 = list;
             }
             uoc = q.g;
             e = q.h;
             Objects.requireNonNull(ok2);
             if (PatchProxy.isSupport(ok)) {
                list2 = list1;
                if (PatchProxy.applyVoidTwoRefs(Long.valueOf(uoc), Long.valueOf(e), ok2, ok, "8")) {
                label_0139 :
                   uoc = q.i;
                   boolean b2 = false;
                   if (uoc - b2) {
                      f = q.f;
                      if (f - b2) {
                         long l = (uoc - f > 0)? uoc - f: 0;
                         if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), ok2, ok, "9")) {
                            ok2.G0.put("component_load_after_resume_time", Long.valueOf(l));
                         }
                      }
                   }
                   if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), ok2, ok, "2")) {
                      ok2.G0.put("lite_enable_scatter_load", Boolean.valueOf(b));
                   }
                   if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), ok2, ok, str)) {
                      ok2.G0.put("lite_enable_scatter_load_two_phase", Boolean.valueOf(b1));
                   }
                   uoc = q.a;
                   if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Long.valueOf(uoc), ok2, ok, "1")) {
                      ok2.G0.put("root_view_controller_create_time", String.valueOf(uoc));
                   }
                   uoc = q.b;
                   String str5 = "4";
                   if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Long.valueOf(uoc), ok2, ok, str5)) {
                      ok2.G0.put("root_service_manager_create_time", String.valueOf(uoc));
                   }
                   uoc = q.d;
                   if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Long.valueOf(uoc), ok2, ok, "5")) {
                      ok2.G0.put("root_layout_manager_create_time", String.valueOf(uoc));
                   }
                   j$b j = j.j;
                   Objects.requireNonNull(j);
                   list = list2;
                   JsonObject jsonObject = PatchProxy.applyOneRefs(list, j, uob1, str);
                   String str6 = "loadTimes";
                   int b3 = 10;
                   if (jsonObject != patchProxyRe1) {
                      ok1 = ok;
                      str2 = str;
                      str3 = str1;
                   }else {
                      a.p(list, str6);
                      jsonObject = new JsonObject();
                      Object obj3 = PatchProxy.apply(null, j, uob1, "1");
                      i4 = (obj3 != patchProxyRe1)? obj3.intValue(): a.t().u("SOURCE_LIVE").a("liveLiteComponentStepTimeReportCount", b3);
                      i2 = 0;
                      i4 = q.n(i4, i2);
                      List list3 = CollectionsKt___CollectionsKt.f5(list, new i());
                      ok1 = ok;
                      if (list3.size() > i4) {
                         list3 = list3.subList(i2, i4);
                      }
                      Iterator iterator3 = list3.iterator();
                      b3 = 0;
                      while (iterator3.hasNext()) {
                         Iterator obj4 = iterator3.next();
                         i2 = b3 + 1;
                         if (b3 < 0) {
                            CollectionsKt__CollectionsKt.W();
                         }
                         Object obj5 = obj4;
                         obj4 = iterator3;
                         String str8 = "Top"+i2;
                         Objects.requireNonNull(obj5);
                         int i5 = i2;
                         str2 = str;
                         JsonObject jsonObject3 = PatchProxy.apply(null, obj5, j.class, "1");
                         if (jsonObject3 != patchProxyRe1) {
                            str3 = str1;
                            ok5 = null;
                         }else {
                            jsonObject3 = new JsonObject();
                            str3 = str1;
                            jsonObject3.c0("Name", obj5.a);
                            j b4 = obj5.b;
                            ok5 = null;
                            if (b4 - ok5 > 0) {
                               jsonObject3.a0("Init", Long.valueOf(b4));
                            }
                            b4 = obj5.c;
                            if (b4 - ok5 > 0) {
                               jsonObject3.a0("Register", Long.valueOf(b4));
                            }
                            b4 = obj5.d;
                            if (b4 - ok5 > 0) {
                               jsonObject3.a0("Inject", Long.valueOf(b4));
                            }
                            b4 = obj5.e;
                            if (b4 - ok5 > 0) {
                               jsonObject3.a0("Create", Long.valueOf(b4));
                            }
                            if (obj5.f() - ok5 > 0) {
                               jsonObject3.a0("Total", Long.valueOf(obj5.f()));
                            }
                         }
                         jsonObject.G(str8, jsonObject3);
                         iterator3 = obj4;
                         b3 = i5;
                         str = str2;
                         str1 = str3;
                         i2 = 0;
                      }
                      str2 = str;
                      str3 = str1;
                      DebugLog.i("LiteComponentLoad", "TopN:"+i4+" Json:\n"+j.j);
                   }
                   j$b j1 = j.j;
                   String str7 = ok2.i();
                   Objects.requireNonNull(j1);
                   JsonObject jsonObject1 = PatchProxy.applyTwoRefs(str7, list, j1, uob1, str5);
                   if (jsonObject1 != patchProxyRe1) {
                      ok4 = ok2;
                   }else {
                      a.p(list, str6);
                      if (TextUtils.n(str7, j.h)) {
                         int i = j.i;
                         if (i <= 10) {
                            j.i = i + 1;
                         label_036e :
                            jsonObject1 = new JsonObject();
                            Iterator iterator = CollectionsKt___CollectionsKt.u5(CollectionsKt___CollectionsKt.f5(list, new k()), j1.a()).iterator();
                            int i1 = 0;
                            i2 = 4;
                            while (iterator.hasNext()) {
                               obj1 = iterator.next();
                               int i3 = i1 + 1;
                               if (i1 < 0) {
                                  CollectionsKt__CollectionsKt.W();
                               }
                               ok4 = ok2;
                               Iterator iterator1 = iterator;
                               if (obj1.b() - (long)i2 > 0) {
                                  j.j.c(jsonObject1, j.g, "Top"+i3+"-init", String.valueOf(obj1.d()), "init:"+obj1.d(), obj1.b());
                               }
                               iterator = iterator1;
                               ok2 = ok4;
                               i1 = i3;
                               i3 = 1;
                            }
                            ok4 = ok2;
                            Iterator iterator2 = CollectionsKt___CollectionsKt.u5(CollectionsKt___CollectionsKt.f5(list, new l()), j1.a()).iterator();
                            i4 = 0;
                            while (iterator2.hasNext()) {
                               obj2 = iterator2.next();
                               i1 = i4 + 1;
                               if (i4 < 0) {
                                  CollectionsKt__CollectionsKt.W();
                               }
                               obj1 = iterator2;
                               if (obj2.e() - (long)i2 > 0) {
                                  j.j.c(jsonObject1, j.g, "Top"+i1+"-register", String.valueOf(obj2.d()), "register:"+obj2.d(), obj2.e());
                               }
                               i4 = i1;
                               iterator2 = obj1;
                            }
                            iterator2 = CollectionsKt___CollectionsKt.u5(CollectionsKt___CollectionsKt.f5(list, new m()), j1.a()).iterator();
                            i4 = 0;
                            while (iterator2.hasNext()) {
                               obj2 = iterator2.next();
                               i1 = i4 + 1;
                               if (i4 < 0) {
                                  CollectionsKt__CollectionsKt.W();
                               }
                               obj1 = iterator2;
                               if (obj2.c() - (long)i2 > 0) {
                                  j.j.c(jsonObject1, j.g, "Top"+i1+"-inject", String.valueOf(obj2.d()), "inject:"+obj2.d(), obj2.c());
                               }
                               i4 = i1;
                               iterator2 = obj1;
                            }
                            iterator2 = CollectionsKt___CollectionsKt.u5(CollectionsKt___CollectionsKt.f5(list, new n()), j1.a()).iterator();
                            i4 = 0;
                            while (iterator2.hasNext()) {
                               obj2 = iterator2.next();
                               i1 = i4 + 1;
                               if (i4 < 0) {
                                  CollectionsKt__CollectionsKt.W();
                               }
                               obj1 = iterator2;
                               if (obj2.a() - (long)i2 > 0) {
                                  j.j.c(jsonObject1, j.g, "Top"+i1+"-create", String.valueOf(obj2.d()), "create:"+obj2.d(), obj2.a());
                               }
                               i4 = i1;
                               iterator2 = obj1;
                            }
                            HashMap g = j.g;
                            i4 = (j.i == 10)? true: false;
                            j1.b(jsonObject1, g, i4);
                         }
                      }
                      j.g.clear();
                      j.h = str7;
                      j.i = 1;
                      goto label_036e ;
                   }
                   j1 = j.j;
                   Objects.requireNonNull(j1);
                   JsonObject jsonObject2 = PatchProxy.applyOneRefs(list, j1, uob1, "7");
                   if (jsonObject2 != patchProxyRe1) {
                   }else {
                      a.p(list, str6);
                      jsonObject2 = new JsonObject();
                      j oj = CollectionsKt___CollectionsKt.t4(list, e.b);
                      jsonObject2.c0("name", oj.d());
                      jsonObject2.a0("create_duration", Long.valueOf(oj.a()));
                      jsonObject2.a0("init_duration", Long.valueOf(oj.b()));
                      jsonObject2.a0("inject_duration", Long.valueOf(oj.c()));
                      jsonObject2.a0("register_duration", Long.valueOf(oj.e()));
                   }
                   if (!PatchProxy.applyVoidThreeRefs(jsonObject, jsonObject1, jsonObject2, ok4, k.class, "6")) {
                      ok2 = ok4;
                      ok2.G0.put("component_init_step_time_map", jsonObject);
                      ok2.G0.put("component_one_step_time_map", jsonObject1);
                      ok2.G0.put("component_random_time_map", jsonObject2);
                   }
                }
             }else {
                list2 = list1;
             }
             ok2.G0.put("component_slide_phase_time", Long.valueOf(uoc));
             ok2.G0.put("component_didappear_phase_time", Long.valueOf(e));
             goto label_0139 ;
          }
          e uoe = obj.this$0.this$0.W2();
          LiveLiteLayoutManager liveLiteLayo = obj.this$0.this$0.V2();
          uoc = obj.this$0.this$0.Z2();
          Objects.requireNonNull(uoe);
          e uoe1 = e.class;
          if (PatchProxy.applyVoidTwoRefs(liveLiteLayo, uoc, uoe, uoe1, "1")) {
             str4 = str3;
          }else {
             a.p(liveLiteLayo, "layoutManager");
             str4 = str3;
             a.p(uoc, str4);
             e uoe2 = uoc.a(e.class);
             if (!PatchProxy.applyVoidTwoRefs(liveLiteLayo, uoe2, uoe, uoe1, str2)) {
                d uod2 = new d(uoe);
                uoe2.e(uod2);
                a.a(uoe.c, new LayoutManagerLateInitLogic$setupSideBarFoldLogic$1(uoe2, uod2));
                liveLiteLayo.e().b(new c(uoe2));
             }
          }
          LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2 this$01 = obj.this$0.this$0;
          Objects.requireNonNull(this$01);
          if (!PatchProxy.applyVoid(null, this$01, liveLiteRoot1, "13")) {
             k = this$01.k;
             if (k == null) {
                a.S(str4);
             }
             ok2 = k.a(uod1).a().x();
             q oq = this$01.C.a();
             Objects.requireNonNull(ok2);
             if (!PatchProxy.applyVoidOneRefs(oq, ok2, ok1, "46")) {
                ok2.G0.put("pre_render_video_frame_source", oq.a);
                ok2.G0.put("pre_render_video_frame_duration", String.valueOf(oq.b));
                ok2.G0.put("pre_render_video_frame_network_consumption", String.valueOf(oq.c));
                ok2.G0.put("number_of_pre_render_video_frame", String.valueOf(oq.d));
             }
          }
          PatchProxy.onMethodExit(LiveLiteRootViewController$onCreate$$inlined$traceTimeMs$lambda$2$1.class, "1");
          return;
       }
    }
}
