package com.kuaishou.krn.bridges.page.KrnPageViewBridge;
import com.kuaishou.krn.base.KrnBridge;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.concurrent.ConcurrentHashMap;
import com.facebook.react.bridge.ReadableMap;
import lj0.c;
import fk0.l;
import java.lang.Double;
import java.util.HashMap;
import java.util.Map;
import zj0.x;
import zj0.u;
import com.kuaishou.krn.log.model.a;
import java.lang.Object;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yd.e;
import com.kuaishou.krn.experiment.ExpConfigKt;
import qrd.p;
import java.lang.Boolean;
import com.kuaishou.krn.model.LoadingStateTrack;
import com.kuaishou.krn.model.KrnBundleLoadInfo;
import com.kuaishou.krn.log.model.KrnPageRenderParams;
import com.kuaishou.krn.log.model.KrnDurationModel;
import java.lang.Long;
import bk0.j;
import bk0.i;
import java.lang.StringBuilder;
import ek0.d;
import com.kuaishou.krn.log.model.KrnLogCommonParams;
import java.lang.Integer;
import bk0.a;
import com.google.gson.internal.LinkedTreeMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Throwable;
import java.lang.System;
import com.kuaishou.krn.c;
import com.google.gson.Gson;
import java.util.List;
import com.facebook.react.a;
import hg.a;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactContext;
import lj0.d;
import kj0.l;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import ck0.e;
import cj0.a;
import java.lang.Runnable;
import cj0.c;
import bk0.p;
import cj0.b;
import cj0.d;
import ekd.k1;

public class KrnPageViewBridge extends KrnBridge	// class@00082e
{
    public Map mContextMap;

    public void KrnPageViewBridge(ReactApplicationContext p0){
       super(p0);
       this.mContextMap = new ConcurrentHashMap();
    }
    public static void a(KrnPageViewBridge p0,ReadableMap p1,long p2,long p3){
       p0.lambda$rootViewDidMount$0(p1, p2, p3);
    }
    public static void b(KrnPageViewBridge p0,int p1,ReadableMap p2,long p3,long p4){
       p0.lambda$rootViewDidMountWith$1(p1, p2, p3, p4);
    }
    public static void lambda$reportPageRenderTime$3(double p0,double p1,ReadableMap p2,c p3){
       l ol1;
       l a;
       int i;
       double d;
       KrnBundleLoadInfo d0;
       long l6;
       a uoa2;
       KrnPageRenderParams t3;
       String str7;
       ArrayList uArrayList;
       int i2;
       long l = Double.valueOf(p0).longValue();
       long l1 = Double.valueOf(p1).longValue();
       boolean b = false;
       HashMap hashMap = (p2 != null)? p2.toHashMap(): b;
       l ol = new l(l, l1, hashMap);
       p3.k().o(v7);
       a uoa = p3.h();
       Objects.requireNonNull(uoa);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "6";
       if (PatchProxy.applyVoidTwoRefs(p3, v7, uoa, a.class, str)) {
          ol1 = v7;
       }else {
          boolean o = e.O;
          long l2 = uoa.c();
          Boolean uBoolean = PatchProxy.apply(b, b, ExpConfigKt.class, "23");
          if (uBoolean == patchProxyRe) {
             uBoolean = ExpConfigKt.w.getValue();
          }
          if (!uBoolean.booleanValue() && !l2) {
             l2 = uoa.d();
          }
          long l3 = l2;
          if (ExpConfigKt.e()) {
             d0 = p3.o().c();
             uoa.k = d0.m - d0.k;
             uoa.l = d0.v - d0.u;
             uoa.m = d0.x - d0.w;
             uoa.n = d0.z - d0.y;
             uoa.o = d0.B - d0.A;
             uoa.p = d0.K0 - d0.J0;
             long l4 = d0.p - d0.o;
             uoa.q = l4;
             a uoa1 = uoa;
             long l5 = d0.r - d0.q;
             l6 = d0.t - d0.s;
             if (l4 <= 0) {
                uoa2 = uoa1;
             }else {
                uoa2 = uoa1;
                l5 = 0;
             }
             uoa2.r = l5;
             if (l5 > 0) {
                l6 = 0;
             }
             uoa2.s = l6;
             uoa2.t = d0.M0 - d0.L0;
             uoa2.u = d0.T - d0.R;
          }else {
             uoa2 = uoa;
          }
          KrnDurationModel krnDurationM = l6;
          KrnDurationModel krnDurationM1 = new KrnDurationModel(Long.valueOf(uoa2.h));
          KrnDurationModel krnDurationM2 = krnDurationM1;
          krnDurationM1 = new KrnDurationModel(Long.valueOf(uoa2.b()));
          KrnDurationModel krnDurationM3 = krnDurationM1;
          krnDurationM1 = new KrnDurationModel(Long.valueOf(l3));
          KrnDurationModel krnDurationM4 = krnDurationM1;
          krnDurationM1 = new KrnDurationModel(Long.valueOf(uoa2.d()));
          KrnDurationModel krnDurationM5 = krnDurationM1;
          krnDurationM1 = new KrnDurationModel(Long.valueOf(v7.a));
          KrnDurationModel krnDurationM6 = krnDurationM1;
          krnDurationM1 = new KrnDurationModel(Long.valueOf(v7.b));
          KrnPageRenderParams krnPageRende = new KrnPageRenderParams(p3, null, krnDurationM, krnDurationM2, krnDurationM3, krnDurationM4, krnDurationM5, krnDurationM6, v7.c, o, uoa2.k, uoa2.l, uoa2.m, uoa2.n, uoa2.o, uoa2.p, uoa2.q, uoa2.r, uoa2.s, uoa2.t, uoa2.u);
          uoa2.i = uoa;
          j.b.c("krn_page_load_time", uoa);
          String str1 = "open_in_1s";
          String str2 = "no_open_in_1s";
          if (PatchProxy.applyVoidOneRefs(uoa, null, i.class, "9")) {
          label_017d :
             ol1 = v7;
          }else {
             b = ExpConfigKt.e();
             d.e("reportKdsPageAggregation | 1. 进入数据记录，开关为 isKswitchOpen="+b);
             if (!b) {
                goto label_017d ;
             }else {
                String str3 = uoa.a();
                KrnLogCommonParams mComponentNa = uoa.mComponentName;
                Integer integer = PatchProxy.apply(null, uoa, KrnLogCommonParams.class, str);
                if (integer != patchProxyRe) {
                }else {
                   integer = Integer.valueOf(uoa.mBundleVersionCode);
                }
                Object obj = integer;
                t3 = uoa.t3;
                boolean i1 = (t3.a() == null)? 0: t3.a().longValue();
                if (i1 > 0 && (obj != null && (str3 == null || mComponentNa == null))) {
                   goto label_017d ;
                }else if(i1 - 1000 < 0){
                   i1 = true;
                }else {
                   i1 = false;
                }
                String str4 = i.E();
                a l7 = i.l;
                String str5 = "KDS_PAGE_REPORT_AGGREGATION";
                String str6 = "KRN_PAGE_LOAD_TIME_AGGREGATION";
                LinkedTreeMap linkedTreeMa = l7.b(str5, str6);
                if (linkedTreeMa != null) {
                   str7 = "p_date";
                   if (linkedTreeMa.get(str7) != null) {
                      LinkedTreeMap obj1 = linkedTreeMa.get(str7);
                      Objects.requireNonNull(obj1);
                      str7 = obj1.toString();
                   label_0204 :
                      if (linkedTreeMa != null) {
                         str = "info";
                         if (linkedTreeMa.get(str) != null) {
                            uArrayList = linkedTreeMa.get(str);
                         label_021a :
                            ol1 = v7;
                            String str8 = "，最新存储数据为：";
                            if (!str4.equals(str7)) {
                               if (str7.length() > 0) {
                                  i.I(linkedTreeMa);
                                  l7.a(str5, str6);
                               }
                               ArrayList uArrayList1 = new ArrayList();
                               uArrayList1.add(i.F(str3, mComponentNa, obj, Boolean.valueOf(i1)));
                               i.K(str4, uArrayList1);
                               d.e("reportKdsPageAggregation | 2. 日期不同，先上报数据再新建保存；currentDay："+str4+"，currentDayFromCache："+str7+str8+uArrayList1);
                            }else {
                               ArrayList uArrayList2 = new ArrayList();
                               Iterator iterator = uArrayList.iterator();
                               Object obj2 = null;
                               while (iterator.hasNext()) {
                                  obj1 = iterator.next();
                                  try{
                                     if (str3.equals(obj1.get("BundleId")) && mComponentNa.equals(obj1.get("ComponentName"))) {
                                        Object obj3 = obj1.get("BundleVersionCode");
                                        Objects.requireNonNull(obj3);
                                        if (obj.intValue() == obj3.intValue()) {
                                           try{
                                              if (i1) {
                                                 try{
                                                    obj2 = obj1.get(str1);
                                                    Objects.requireNonNull(obj2);
                                                    i2 = obj2.intValue() + 1;
                                                    obj1.put(str1, Integer.valueOf(i2));
                                                    str6 = 1;
                                                 }catch(java.lang.Exception e0){
                                                    obj2 = 1;
                                                 }
                                                 str6 = 1;
                                              }else {
                                                 try{
                                                    obj2 = obj1.get(str2);
                                                    Objects.requireNonNull(obj2);
                                                    i2 = obj2.intValue();
                                                    int i3 = 1;
                                                    i2 = i2 + i3;
                                                    obj1.put(str2, Integer.valueOf(i2));
                                                 }catch(java.lang.Exception e0){
                                                    str6 = 1;
                                                 }
                                                 obj2 = 1;
                                              }
                                              obj2 = 1;
                                              try{
                                              label_02e6 :
                                                 uArrayList2.add(obj1);
                                              }catch(java.lang.Exception e0){
                                              }
                                           }catch(java.lang.Exception e0){
                                              goto label_02e3 ;
                                           }
                                        }
                                     }
                                     str6 = 1;
                                     goto label_02e6 ;
                                  }catch(java.lang.Exception e0){
                                     goto label_02ed ;
                                  }
                               }
                               if (obj2 != null) {
                                  i.K(str4, uArrayList2);
                                  d.e("reportKdsPageAggregation | 3. 日期相同，存在相同页面数据，已累加记录；currentDay："+str4+str8+uArrayList2);
                               }else {
                                  obj1 = i.F(str3, mComponentNa, obj, Boolean.valueOf(i1));
                                  uArrayList2.add(obj1);
                                  i.K(str4, uArrayList2);
                                  d.e("reportKdsPageAggregation | 4. 日期相同，不存在相同页面数据，新增一条页面数据；currentDay："+str4+"，新页面数据为："+obj1+str8+uArrayList2);
                               }
                            }
                         }
                      }
                      uArrayList = new ArrayList();
                      goto label_021a ;
                   }
                }
                str7 = "";
                goto label_0204 ;
             }
          }
          uoa2.g = System.currentTimeMillis();
          d.e("reportKdsPageAggregation | T2T3数据上报: pageRenderParams:"+c.b().e().q(uoa));
          if (!ExpConfigKt.p().isEmpty() && p3.r().p()) {
             j.b.b("krn_group_page_load_time", uoa);
          }
       }
       if (p3.y()) {
          LoadingStateTrack loadingState = p3.o();
          ol = ol1;
          a = ol.a;
          l b1 = ol.b;
          Objects.requireNonNull(loadingState);
          KrnBundleLoadInfo krnBundleLoa = KrnBundleLoadInfo.class;
          LoadingStateTrack loadingState1 = LoadingStateTrack.class;
          if (!PatchProxy.isSupport(loadingState1) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(a), Long.valueOf(b1), loadingState, loadingState1, "34")) {
             loadingState1 = loadingState.k;
             Objects.requireNonNull(loadingState1);
             i = 0;
             d = 0x408f400000000000;
             if (!PatchProxy.isSupport(krnBundleLoa) || !PatchProxy.applyVoidOneRefs(Long.valueOf(a), loadingState1, krnBundleLoa, "3")) {
                loadingState1.u0 = loadingState1.C0 + a;
                if (loadingState1.c != null) {
                   KrnBundleLoadInfo d01 = loadingState1.D0;
                   loadingState1.v0 = ((double)a / d) + d01;
                   KrnBundleLoadInfo s0 = loadingState1.s0;
                   KrnBundleLoadInfo krnBundleLoa1 = (s0 - i > 0)? s0: d01;
                   a.b(0, "t2", krnBundleLoa1, 1);
                   a.d(0, "t2", loadingState1.v0, 1);
                }
             }
             loadingState = loadingState.k;
             Objects.requireNonNull(loadingState);
             if (!PatchProxy.isSupport(krnBundleLoa) || !PatchProxy.applyVoidOneRefs(Long.valueOf(b1), loadingState, krnBundleLoa, "4")) {
                loadingState.w0 = loadingState.C0 + b1;
                if (loadingState.c != null) {
                   d0 = loadingState.D0;
                   loadingState.x0 = ((double)b1 / d) + d0;
                   krnBundleLoa = loadingState.v0;
                   if (krnBundleLoa - i <= 0) {
                      krnBundleLoa = loadingState.s0;
                      if (krnBundleLoa - i <= 0) {
                      label_043c :
                         a.b(0, "t3", d0, 1);
                         a.d(0, "t3", loadingState.x0, 1);
                      }
                   }
                   d0 = krnBundleLoa;
                   goto label_043c ;
                }
             }
          }
       }
       return;
    }
    private void lambda$rootViewDidMount$0(ReadableMap p0,long p1,long p2){
       c uoc = d.a(this.getReactApplicationContext());
       d.e("rootViewDidMount, "+uoc);
       this.rootViewDidMountImpl(uoc, p0, p1, p2);
    }
    private void lambda$rootViewDidMountWith$1(int p0,ReadableMap p1,long p2,long p3){
       c uoc = d.b(p0);
       d.e("rootViewDidMountWith, "+uoc);
       this.rootViewDidMountImpl(uoc, p1, p2, p3);
    }
    public static void lambda$setCurrentPage$2(String p0){
       c.b().g().G(p0);
    }
    public void fetchContextOnRootTag(int p0,String p1,Callback p2){
       Object[] objArray1;
       if (PatchProxy.isSupport(KrnPageViewBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KrnPageViewBridge.class, "9")) {
          return;
       }
       Map map = this.mContextMap.get(Integer.valueOf(p0));
       if (map != null) {
          ReadableMap readableMap = map.get(p1);
          if (readableMap != null) {
             Object[] objArray = new Object[]{Arguments.makeNativeMap(readableMap.toHashMap())};
             p2.invoke(objArray);
          }else {
             objArray1 = new Object[0];
             p2.invoke(objArray1);
          }
       }else {
          objArray1 = new Object[0];
          p2.invoke(objArray1);
       }
       return;
    }
    public String getName(){
       return "RootViewPageBridge";
    }
    public final void handleLogEvent(int p0,String p1,ReadableMap p2){
       if (PatchProxy.isSupport(KrnPageViewBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KrnPageViewBridge.class, "6")) {
          return;
       }
       HashMap hashMap = null;
       if (p2 != null) {
          hashMap = p2.toHashMap();
       }
       if (hashMap == null) {
          hashMap = new HashMap();
       }
       this.reportOnTag(p0, p1, hashMap);
       return;
    }
    public void reportOnTag(int p0,String p1,ReadableMap p2){
       if (PatchProxy.isSupport(KrnPageViewBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KrnPageViewBridge.class, "5")) {
          return;
       }
       this.handleLogEvent(p0, p1, p2);
       return;
    }
    public final void reportOnTag(int p0,String p1,Map p2){
       HashMap hashMap;
       if (PatchProxy.isSupport(KrnPageViewBridge.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KrnPageViewBridge.class, "7")) {
          return;
       }
       if (p2 == null) {
          hashMap = new HashMap();
       }
       hashMap.putAll(d.d(p0));
       j.b.b(p1, hashMap);
       return;
    }
    public void reportPageRenderTime(int p0,double p1,double p2,ReadableMap p3){
       if (PatchProxy.isSupport(KrnPageViewBridge.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Double.valueOf(p1), Double.valueOf(p2), p3, this, KrnPageViewBridge.class, "11")) {
          return;
       }
       c uoc = d.b(p0);
       if (uoc != null) {
          a uoa = uoc.h();
          Objects.requireNonNull(uoa);
          a uoa1 = a.class;
          if (PatchProxy.isSupport(uoa1) && (!PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), uoc, uoa, uoa1, "7") && uoa.j == null)) {
             uoa.j = new e(p0, uoc);
          }
          uoa1 = new a(p1, p2, p3, uoc);
          this.getReactApplicationContext().runOnNativeModulesQueueThread(uoa);
       }
       return;
    }
    public void rootViewDidMount(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnPageViewBridge.class, "1")) {
          return;
       }
       long l = a.a();
       long l1 = System.currentTimeMillis();
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          c uoc = new c(this, p0, l, l1);
          reactApplica.runOnNativeModulesQueueThread(v8);
       }
       return;
    }
    public final void rootViewDidMountImpl(c p0,ReadableMap p1,long p2,long p3){
       if (PatchProxy.isSupport(KrnPageViewBridge.class) && PatchProxy.applyVoidFourRefs(p0, p1, Long.valueOf(p2), Long.valueOf(p3), this, KrnPageViewBridge.class, "3")) {
          return;
       }
       if (p0 != null) {
          p0.k().d(System.currentTimeMillis());
          a uoa = p0.h();
          Objects.requireNonNull(uoa);
          a uoa1 = a.class;
          int i = -1;
          if (!PatchProxy.isSupport(uoa1) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(p2), uoa, uoa1, "3") && !uoa.d - i)) {
             uoa.d = p2;
             uoa.f = System.currentTimeMillis();
          }
          p0.k().u(p0.h().c());
          if (p0.y()) {
             LoadingStateTrack loadingState = p0.o();
             Objects.requireNonNull(loadingState);
             LoadingStateTrack loadingState1 = LoadingStateTrack.class;
             if (!PatchProxy.isSupport(loadingState1) || !PatchProxy.applyVoidOneRefs(Long.valueOf(p3), loadingState, loadingState1, "32")) {
                loadingState = loadingState.k;
                Objects.requireNonNull(loadingState);
                KrnBundleLoadInfo krnBundleLoa = KrnBundleLoadInfo.class;
                if (!PatchProxy.isSupport(krnBundleLoa) || (!PatchProxy.applyVoidOneRefs(Long.valueOf(p3), loadingState, krnBundleLoa, "1") && !loadingState.r0 - i)) {
                   loadingState.r0 = p3;
                   if (loadingState.c != null) {
                      loadingState.s0 = a.e();
                      a.b(0, "t1", loadingState.D0, 1);
                      a.d(0, "t1", loadingState.s0, 1);
                   }
                }
             }
          }
       }
    label_00d7 :
       this.setCurrentPage(p1);
       return;
    }
    public void rootViewDidMountWith(int p0,ReadableMap p1){
       KrnPageViewBridge krnPageViewB = KrnPageViewBridge.class;
       if (PatchProxy.isSupport(krnPageViewB) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, krnPageViewB, "2")) {
          return;
       }
       long l = a.a();
       long l1 = System.currentTimeMillis();
       ReactApplicationContext reactApplica = this.getReactApplicationContextIfActiveOrWarn();
       if (reactApplica != null) {
          b uob = new b(this, p0, p1, l, l1);
          reactApplica.runOnNativeModulesQueueThread(v9);
       }
       return;
    }
    public void rootViewSignatureWith(int p0,Callback p1){
       KrnPageViewBridge krnPageViewB = KrnPageViewBridge.class;
       if (PatchProxy.isSupport(krnPageViewB) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, krnPageViewB, "8")) {
          return;
       }
       this.callbackToJS(p1, Arguments.makeNativeMap(d.d(p0)));
       return;
    }
    public void rootViewWillUnMount(ReadableMap p0){
    }
    public void rootViewWillUnMountWith(int p0,ReadableMap p1){
    }
    public void setContextOnRootTag(int p0,String p1,ReadableMap p2,Callback p3){
       if (PatchProxy.isSupport(KrnPageViewBridge.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, KrnPageViewBridge.class, "10")) {
          return;
       }
       KrnPageViewBridge tmContextMap = this.mContextMap;
       _monitor_enter(tmContextMap);
       Map map = this.mContextMap.get(Integer.valueOf(p0));
       if (map == null) {
          map = new HashMap();
          this.mContextMap.put(Integer.valueOf(p0), map);
       }
       map.put(p1, p2);
       Object[] objArray = new Object[0];
       p3.invoke(objArray);
       _monitor_exit(tmContextMap);
       return;
    }
    public final void setCurrentPage(ReadableMap p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnPageViewBridge.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String str = "pageShow";
       p0 = (p0.hasKey(str))? p0.getMap(str): null;
       if (p0 == null) {
          return;
       }else {
          HashMap hashMap = new HashMap();
          hashMap.put("type", "setCurrentPage");
          hashMap.put("data", p0.toHashMap());
          String str1 = this.convertBeanToJson(hashMap);
          k1.o(new d(str1));
          return;
       }
    }
}
