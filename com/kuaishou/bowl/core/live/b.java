package com.kuaishou.bowl.core.live.b;
import vu.i;
import java.lang.Object;
import gv.o;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;
import java.util.Iterator;
import hv.a;
import com.kuaishou.bowl.data.center.data.model.live.agreement.AgreementArea;
import java.util.List;
import com.kuaishou.bowl.data.center.data.model.live.agreement.AgreementPendant;
import com.kuaishou.bowl.data.center.data.model.live.Pendant;
import com.kuaishou.bowl.data.center.data.model.RegionDecorativeInfo;
import com.google.gson.JsonObject;
import ekd.k0;
import vu.c;
import com.kuaishou.bowl.core.live.a;
import com.kuaishou.bowl.core.live.a$a;
import java.lang.StringBuilder;
import nv.c;
import su.g;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalData;
import yz7.e;
import com.kuaishou.bowl.data.center.data.model.live.agreement.PersonalAgreementData;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import com.google.gson.Gson;
import com.kuaishou.bowl.data.center.data.model.MaterialMap;
import com.kuaishou.bowl.data.center.data.model.MaterialMapItem;
import ov.b;
import com.kuaishou.bowl.core.live.ComponentDataSource;
import vu.h;
import java.util.ArrayList;
import java.lang.Long;
import java.lang.Boolean;
import com.kuaishou.bowl.data.center.data.model.ResourceItem;
import com.kuaishou.bowl.data.center.data.model.MaterialDataItem;
import com.kuaishou.bowl.core.live.a$b;
import vu.d;
import com.kuaishou.bowl.data.center.data.model.live.agreement.ComponentInfo;
import java.lang.Math;
import cv.f;
import vu.k;
import java.lang.Runnable;
import ekd.s1;
import com.kwai.sdk.switchconfig.a;
import vu.g;
import tu.h;
import com.kuaishou.bowl.core.live.b$c;
import cv.c;
import cv.k;
import java.lang.Integer;
import dv.a;
import com.kuaishou.bowl.core.live.b$d;
import tu.g;
import com.kuaishou.bowl.core.live.BusinessDataSource;
import java.lang.Exception;
import pv.a;
import vu.a;
import cv.a;
import com.kuaishou.bowl.core.live.b$e;
import com.kwaishou.merchant.troubleshooting.core.model.KeyNode;
import com.kwaishou.merchant.troubleshooting.core.model.Node;
import java.util.Set;
import java.util.Map$Entry;
import xu.a;
import xu.h;
import fv.g;
import xu.d;
import fv.h;
import xu.s;
import com.kuaishou.bowl.core.live.b$b;
import xu.t;
import su.b;
import xu.b;
import yu.a;
import su.o;
import uu.g;
import uu.f;
import java.lang.reflect.Type;
import wu.a;
import com.kuaishou.bowl.core.live.b$a;

public class b implements i	// class@0011ae
{
    public o a;
    public Map b;
    public Map c;
    public Map d;
    public final Map e;
    public final Map f;
    public final Map g;
    public final Map h;
    public final Map i;
    public final Map j;

    public void b(){
       super();
       this.a = new o();
       this.b = new HashMap();
       this.c = new HashMap();
       this.d = new HashMap();
       this.e = new HashMap();
       this.f = new HashMap();
       this.g = new HashMap();
       this.h = new HashMap();
       this.i = new HashMap();
       this.j = new ConcurrentHashMap();
    }
    public int M0(String p0){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o obj = PatchProxy.applyOneRefs(p0, this, b.class, "36");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.s();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, o.class, "6");
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else if(!TextUtils.isEmpty(p0)){
          o a = obj.a;
          if (a != null && a.values().size()) {
             Iterator iterator = obj.a.values().iterator();
             while (true) {
                if (iterator.hasNext()) {
                   a e = iterator.next().e;
                   if (e != null) {
                      Iterator iterator1 = e.values().iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            AgreementArea uAgreementAr = iterator1.next();
                            if (uAgreementAr != null) {
                               Iterator iterator2 = uAgreementAr.pendantDatas.iterator();
                               while (true) {
                                  if (iterator2.hasNext()) {
                                     AgreementPendant uAgreementPe = iterator2.next();
                                     if (uAgreementPe != null && p0.equals(uAgreementPe.pendantCode)) {
                                        uAgreementPe = uAgreementPe.decorativeInfo;
                                        if (uAgreementPe != null) {
                                           RegionDecorativeInfo androidMount = uAgreementPe.androidMountInfo;
                                           if (androidMount != null) {
                                              try{
                                                 i = k0.f(androidMount, "priority", -1);
                                                 break ;
                                              }catch(java.lang.Exception e0){
                                              }
                                           }else {
                                              continue ;
                                           }
                                        }else {
                                           continue ;
                                        }
                                     }else {
                                        continue ;
                                     }
                                  }else {
                                     continue ;
                                  }
                               }
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
       i = -1;
    }
    public void a(String p0,c p1){
       a$a uoa1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "10")) {
          return;
       }
       if (!TextUtils.isEmpty(p0) && p1 != null) {
          a uoa = this.b.get(p0);
          if (uoa == null) {
             return;
          }else if(PatchProxy.applyVoidOneRefs(p1, uoa, a.class, "4")){
             Iterator iterator = uoa.b.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   uoa1 = iterator.next();
                   if (uoa1 == null || uoa1.c != p1) {
                      continue ;
                   }
                }else {
                   uoa1 = null;
                }
                if (uoa1 != null) {
                   c.f("CallbackInfo removeComponentDataCallback: "+uoa1.a);
                   uoa.b.remove(uoa1);
                   uoa1.c = null;
                }
             }
          }
          c.f("LiveApi-remove component listener  liveId: "+p0);
       }
       return;
    }
    public void b(g p0,SignalData p1){
       g c;
       String str3;
       boolean b;
       PatchProxyResult patchProxyRe1;
       b uob1;
       SignalData pendantInfoL;
       ArrayList uArrayList1;
       Iterator iterator;
       SignalPendant signalPendan;
       PatchProxyResult patchProxyRe2;
       boolean b1;
       HashMap hashMap1;
       b d3;
       String str5;
       Iterator iterator4;
       Iterator iterator5;
       boolean b2;
       a obj4;
       int i;
       Object obj = this;
       Object obj1 = p0;
       List list = p1;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(obj1, list, obj, uob, "24")) {
          return;
       }
       String str = "LiveApi-onSignalingData data";
       c.f(str);
       if (obj1 == null || (!TextUtils.isEmpty(obj1.d) && list != null)) {
          c.f(str+e.f(p1));
          HashMap hashMap = new HashMap();
          String str1 = "data";
          hashMap.put(str1, list);
          String str2 = "收到信令";
          obj.q(obj1.d, str2, "onSignalingData data", hashMap);
          a uoa1 = obj.a.a(obj1.d);
          PersonalAgreementData personalAgre = null;
          if (uoa1 == null) {
             uoa1 = new a(new HashMap(), new HashMap(), new HashMap(), personalAgre);
          }
          uoa1.g = list;
          g d = obj1.d;
          c = obj1.c;
          g og = c;
          g og1 = c;
          if (!PatchProxy.applyVoidThreeRefs(d, og, p1, this, b.class, "25") && !TextUtils.isEmpty(d)) {
             pendantInfoL = list.pendantInfoList;
             if (pendantInfoL != null) {
                iterator4 = pendantInfoL.iterator();
                while (iterator4.hasNext()) {
                   SignalPendant signalPendan2 = iterator4.next();
                   if (TextUtils.isEmpty(signalPendan2.eventData)) {
                      continue ;
                   }else {
                      try{
                         MaterialMap materialMap = new Gson().h(signalPendan2.eventData, MaterialMap.class);
                         if (materialMap != null) {
                            materialMap = materialMap.datas;
                            if (materialMap != null) {
                               iterator = materialMap.iterator();
                               while (iterator.hasNext()) {
                                  MaterialMapItem materialMapI = iterator.next();
                                  if (materialMapI == null) {
                                     continue ;
                                  }else {
                                     b uob3 = b.o();
                                     try{
                                        c = d;
                                        uob3.a(c, og1, String.valueOf(signalPendan2.pendantResourceId), signalPendan2.pendantCode, materialMapI.uniqueId);
                                        str3 = null;
                                     }catch(java.lang.Exception e0){
                                        c.f("LiveApi-createComponentNode error");
                                        d = i;
                                        SignalPendant signalPendan3 = null;
                                        goto label_009c ;
                                     }
                                  }
                               }
                            }
                         }
                      }catch(java.lang.Exception e0){
                         i = d;
                         goto label_00f8 ;
                      }
                   }
                }
             }
          }
          obj.y(obj1, ComponentDataSource.SIGNAL, null, str2);
          g d1 = obj1.d;
          str3 = "收到信令";
          b = false;
          if (PatchProxy.applyVoidThreeRefs(d1, p1, str3, this, b.class, "28")) {
          label_011c :
             patchProxyRe1 = patchProxyRe;
             uob1 = uob;
          }else if(list.pendantInfoList == null || TextUtils.isEmpty(d1)){
             patchProxyRe1 = patchProxyRe;
             uob1 = uob;
             c.f("LiveApi-on signal receiver pendantInfoList is null dispatchDySignal failed");
             obj.p(d1, str3, "on signal receiver pendantInfoList is null dispatchDySignal failed", null);
          }else {
             d3 = obj.c;
             str5 = "on signal receiver dy signal callback not register";
             if (d3 == null || !d3.containsKey(d1)) {
                patchProxyRe1 = patchProxyRe;
                uob1 = uob;
                obj.p(d1, str3, str5, null);
             }else {
                h oh = obj.c.get(d1);
                if (oh == null) {
                   obj.p(d1, str3, str5, null);
                   goto label_011c ;
                }else {
                   uArrayList1 = new ArrayList();
                   iterator = list.pendantInfoList.iterator();
                   while (iterator.hasNext()) {
                      signalPendan = iterator.next();
                      if (signalPendan != null) {
                         SignalPendant pendantResou1 = signalPendan.pendantResourceId;
                         if (PatchProxy.isSupport(uob)) {
                            iterator5 = iterator;
                            a obj3 = PatchProxy.applyTwoRefs(Long.valueOf(pendantResou1), d1, obj, uob, "38");
                            if (obj3 != patchProxyRe) {
                               b2 = obj3.booleanValue();
                               patchProxyRe1 = patchProxyRe;
                               uob1 = uob;
                            }else if(TextUtils.isEmpty(d1) || obj.a.a(d1) == null){
                               patchProxyRe1 = patchProxyRe;
                               uob1 = uob;
                            }else {
                               obj3 = obj.a.a(d1);
                               Objects.requireNonNull(obj3);
                               if (PatchProxy.isSupport(uoa)) {
                                  uob1 = uob;
                                  obj4 = PatchProxy.applyOneRefs(Long.valueOf(pendantResou1), obj3, uoa, "3");
                                  if (obj4 != patchProxyRe) {
                                     b2 = obj4.booleanValue();
                                     patchProxyRe1 = patchProxyRe;
                                  }
                               }else {
                                  uob1 = uob;
                               }
                               obj4 = obj3.b;
                               if (obj4 != null && obj4.values().size()) {
                                  iterator = obj3.b.values().iterator();
                                  while (true) {
                                     if (iterator.hasNext()) {
                                        ResourceItem resourceItem = iterator.next();
                                        if (resourceItem == null) {
                                           continue ;
                                        }else {
                                           Iterator iterator6 = resourceItem.materialDatas.iterator();
                                           while (true) {
                                              if (iterator6.hasNext()) {
                                                 MaterialDataItem materialData = iterator6.next();
                                                 if (materialData != null) {
                                                    patchProxyRe1 = patchProxyRe;
                                                    Iterator iterator7 = iterator6;
                                                    if (!materialData.materialId - pendantResou1) {
                                                       b2 = true;
                                                    }else {
                                                       patchProxyRe = patchProxyRe1;
                                                       iterator6 = iterator7;
                                                    }
                                                 }else {
                                                    continue ;
                                                 }
                                              }else {
                                                 continue ;
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                               patchProxyRe1 = patchProxyRe;
                            }
                            b2 = false;
                         }else {
                            iterator5 = iterator;
                            goto label_0188 ;
                         }
                         if (b2) {
                            uArrayList1.add(signalPendan);
                         }
                         iterator = iterator5;
                         uob = uob1;
                         patchProxyRe = patchProxyRe1;
                      }
                   }
                   patchProxyRe1 = patchProxyRe;
                   uob1 = uob;
                   if (uArrayList1.size() > 0) {
                      String str6 = "onSignalingData data dispatchDySignal success";
                      c.f(str6);
                      HashMap hashMap2 = new HashMap();
                      hashMap2.put(str1, uArrayList1);
                      obj.q(d1, str3, str6, hashMap2);
                      list.pendantInfoList = uArrayList1;
                      oh.a(list);
                   }else {
                      c.f("onSignalingData data dispatchDySignal failed no dy signal data");
                   }
                }
             }
          }
          g d2 = obj1.d;
          String str4 = "收到信令";
          if (!PatchProxy.applyVoidThreeRefs(d2, p1, str4, this, b.class, "29")) {
             c.f("LiveApi-on signal receiver dispatchComponentSingle");
             if (list.pendantInfoList == null || TextUtils.isEmpty(d2)) {
                c.f("LiveApi-on signal receiver pendantInfoList is null dispatchComponentSingle failed");
                obj.p(d2, str4, "on signal receiver pendantInfoList is null dispatchComponentSingle failed", null);
             }else {
                d3 = obj.d;
                str5 = "on signal receiver component signal callback not register";
                if (d3 == null || !d3.containsKey(d2)) {
                   obj.p(d2, str4, str5, null);
                }else {
                   List list1 = obj.d.get(d2);
                   if (list1 == null || !list1.size()) {
                      obj.p(d2, str4, str5, null);
                   }else {
                      iterator4 = list1.iterator();
                      while (iterator4.hasNext()) {
                         a$b uob2 = iterator4.next();
                         if (uob2 != null) {
                            iterator = list.pendantInfoList.iterator();
                            while (iterator.hasNext()) {
                               signalPendan = iterator.next();
                               if (!signalPendan.pendantResourceId - uob2.a) {
                                  hashMap1 = new HashMap();
                                  hashMap1.put("pendant", signalPendan);
                                  obj.q(d2, str4, "onSignalingData data dispatchComponentSignal success", hashMap1);
                                  uob2.b.a(signalPendan);
                               }else {
                                  continue ;
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
          if (!PatchProxy.applyVoidTwoRefs(list, obj1, obj, uob1, "26")) {
             pendantInfoL = list.pendantInfoList;
             if (pendantInfoL == null || (pendantInfoL.size() && !TextUtils.isEmpty(obj1.d))) {
                a uoa2 = obj.a.a(obj1.d);
                ArrayList uArrayList = new ArrayList();
                uArrayList1 = new ArrayList();
                iterator = list.pendantInfoList.iterator();
                while (iterator.hasNext()) {
                   signalPendan = iterator.next();
                   if (uoa2 != null && signalPendan != null) {
                      SignalPendant pendantResou = signalPendan.pendantResourceId;
                      if (PatchProxy.isSupport(uoa)) {
                         a obj2 = PatchProxy.applyOneRefs(Long.valueOf(pendantResou), uoa2, uoa, "5");
                         patchProxyRe2 = patchProxyRe1;
                         if (obj2 != patchProxyRe2) {
                            b1 = obj2.booleanValue();
                         }else {
                         label_0361 :
                            obj2 = uoa2.e;
                            if (obj2 != null) {
                               Iterator iterator1 = obj2.values().iterator();
                               while (true) {
                                  if (iterator1.hasNext()) {
                                     AgreementArea uAgreementAr = iterator1.next();
                                     if (uAgreementAr != null) {
                                        uAgreementAr = uAgreementAr.pendantDatas;
                                        if (uAgreementAr != null) {
                                           Iterator iterator2 = uAgreementAr.iterator();
                                           while (true) {
                                              if (iterator2.hasNext()) {
                                                 AgreementPendant uAgreementPe = iterator2.next();
                                                 if (uAgreementPe != null && !uAgreementPe.pendantResourceId - pendantResou) {
                                                    AgreementPendant componentInf = uAgreementPe.componentInfo;
                                                    if (componentInf != null && (componentInf.componentType == 10 && (!("OriginalNative").equals(componentInf.renderType) && ("coverKit").equals(uAgreementPe.popManager)))) {
                                                       b1 = true;
                                                    }
                                                 }else {
                                                    continue ;
                                                 }
                                              }else {
                                                 continue ;
                                              }
                                           }
                                        }else {
                                           continue ;
                                        }
                                     }else {
                                        continue ;
                                     }
                                  }
                               }
                            }
                            b1 = false;
                         }
                      }else {
                         patchProxyRe2 = patchProxyRe1;
                         goto label_0361 ;
                      }
                      if (b1) {
                         uArrayList.add(signalPendan);
                         uArrayList1.add(Long.valueOf(signalPendan.pendantResourceId));
                      }
                      patchProxyRe1 = patchProxyRe2;
                   }
                }
                if (!uArrayList.size()) {
                   c.f("LiveApi-handleCover no cover signal data");
                }else {
                   c.f("LiveApi-receiver signal handleCover");
                   hashMap1 = new HashMap();
                   hashMap1.put("idList", uArrayList1);
                   long l = 0;
                   Iterator iterator3 = uArrayList.iterator();
                   while (iterator3.hasNext()) {
                      SignalPendant signalPendan1 = iterator3.next();
                      if (signalPendan1 != null && signalPendan1.needRandomCall != null) {
                         l = Math.max(l, signalPendan1.randomRangeMillis);
                         b = true;
                      }
                   }
                   hashMap1.put("needRandomCall", Boolean.valueOf(b));
                   hashMap1.put("randomRangeMillis", Long.valueOf(l));
                   k ok = new k(this, new f(uoa2.a, uArrayList), p0, hashMap1, uoa2);
                   s1.d(list);
                }
             }
          }
       }
    label_042c :
       return;
    }
    public void c(String p0){
       o a;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "44")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          c.g("LiveApi-clearCallbacks liveId is null");
          return;
       }else {
          c.f("LiveApi-clearCallbacks liveId: "+p0);
          a uoa = this.b.get(p0);
          if (uoa != null && !PatchProxy.applyVoid(null, uoa, a.class, "6")) {
             uoa.b.clear();
          }
          this.b.remove(p0);
          this.c.remove(p0);
          this.d.remove(p0);
          Boolean fALSE = Boolean.FALSE;
          this.g.put(p0, fALSE);
          this.e.put(p0, fALSE);
          this.f.put(p0, fALSE);
          this.h.put(p0, fALSE);
          this.i.put(p0, fALSE);
          if (a.t().d("spbLiveClearData", false)) {
             c.f("LiveApi-clearCallbacks clear live data: "+p0);
             b ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoidOneRefs(p0, ta, o.class, "7") && !TextUtils.isEmpty(p0)) {
                a = ta.a;
                if (a != null) {
                   a.remove(p0);
                }
             }
          }
          b.o().s(p0);
          this.j.remove(p0);
          return;
       }
    }
    public void d(String p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "6")) {
          return;
       }
       c.f("LiveApi-registerAgreementCallback");
       if (!TextUtils.isEmpty(p0) && p1 != null) {
          a uoa = this.b.get(p0);
          if (uoa == null) {
             uoa = new a();
             this.b.put(p0, uoa);
          }
          if (!PatchProxy.applyVoidOneRefs(p1, uoa, a.class, "3")) {
             uoa.c.add(p1);
          }
       }
    label_003d :
       return;
    }
    public void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "37")) {
          return;
       }
       c.f("LiveApi-removeLiveCallback");
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       a uoa = this.b.get(p0);
       if (uoa == null) {
          return;
       }
       if (!PatchProxy.applyVoid(null, uoa, a.class, "5")) {
          uoa.a.clear();
          uoa.c.clear();
       }
       return;
    }
    public void f(String p0,String p1,boolean p2,c p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, b.class, "9")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          c.a("LiveApi-registerLiveCallback failed liveId is null, invoke onAgreement");
          p3.c(1, null, ComponentDataSource.PAGE_INIT_MATERIAL);
          return;
       }else {
          c.f("LiveApi-register component listener, liveId: "+p0);
          HashMap hashMap = new HashMap();
          hashMap.put("pendantCode", p1);
          hashMap.put("needRequest", Boolean.valueOf(p2));
          this.q(p0, "注册单个组件监听", "register component listener", hashMap);
          a uoa = this.b.get(p0);
          if (uoa == null) {
             uoa = new a();
             this.b.put(p0, uoa);
          }
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidThreeRefs(p1, Boolean.valueOf(p2), p3, uoa, a.class, "2")) {
             uoa.b.add(new a$a(p1, p2, p3));
          }
          return;
       }
    }
    public void g(g p0,List p1,List p2,Map p3,String p4,h p5){
       boolean b;
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       object oobject4 = p4;
       object oobject5 = p5;
       b uob = b.class;
       int i = 1;
       int i1 = 0;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,oobject4,oobject5};
          if (PatchProxy.applyVoid(objArray, obj, uob, "22")) {
             return;
          }
       }
       if (oobject5 != null && (oobject == null || oobject.a == null)) {
          if (oobject5 != null) {
             oobject5.onFailed("LiveApi-pageContext is null");
          }
          return;
       }else {
          g obj1 = PatchProxy.applyTwoRefs(oobject1, oobject, obj, uob, "27");
          if (obj1 != PatchProxyResult.class) {
             b = obj1.booleanValue();
          }else if(oobject1 != null && (!p1.size() || TextUtils.isEmpty(oobject.d))){
             long l1 = oobject1.get(i1).longValue();
             a uoa1 = obj.a.a(oobject.d);
             if (uoa1 != null) {
                uoa1 = uoa1.e;
                if (uoa1 != null) {
                   Iterator iterator1 = uoa1.values().iterator();
                   while (true) {
                      if (iterator1.hasNext()) {
                         AgreementArea uAgreementAr = iterator1.next();
                         if (uAgreementAr != null) {
                            uAgreementAr = uAgreementAr.pendantDatas;
                            if (uAgreementAr != null) {
                               Iterator iterator2 = uAgreementAr.iterator();
                               while (true) {
                                  if (iterator2.hasNext()) {
                                     AgreementPendant uAgreementPe = iterator2.next();
                                     if (uAgreementPe != null && !uAgreementPe.pendantResourceId - l1) {
                                        b = true;
                                        break ;
                                     }else {
                                        continue ;
                                     }
                                  }else {
                                     continue ;
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
          b = false;
          String str = "idList";
          if (b) {
             obj1 = oobject.d;
             if (obj1 == null) {
                return;
             }else {
                obj1 = obj.j.get(obj1);
                if (obj1 == null) {
                   object oobject6 = oobject;
                }
                HashMap hashMap = new HashMap();
                hashMap.put(str, oobject1);
                hashMap.put("throughMap", oobject3);
                hashMap.put("triggerType", oobject4);
                obj.q(obj1.d, "请求组件数据", "requestComponentData use new api", hashMap);
                c.f("LiveApi- materialId: "+oobject1.get(i1)+" requestComponentData use new api");
                HashMap hashMap1 = new HashMap();
                hashMap1.put(str, oobject1);
                a uoa = obj.a.a(obj1.d);
                if (uoa == null) {
                   oobject5.onFailed("requestComponentData trigger failed no livepagedata");
                   return;
                }else {
                   HashMap hashMap2 = new HashMap();
                   if (oobject2 != null && p2.size() > 0) {
                      long l = 0;
                      Iterator iterator = p2.iterator();
                      while (iterator.hasNext()) {
                         SignalPendant signalPendan = iterator.next();
                         if (signalPendan != null) {
                            if (signalPendan.needRandomCall != null) {
                               i1 = true;
                            }
                            SignalPendant randomRangeM = signalPendan.randomRangeMillis;
                            if (randomRangeM - l > 0) {
                               l = randomRangeM;
                            }
                            hashMap2.put(signalPendan.pendantCode, signalPendan.throughInfo);
                         }
                      }
                      hashMap1.put("needRandomCall", Boolean.valueOf(i1));
                      hashMap1.put("randomRangeMillis", Long.valueOf(l));
                   }
                   b$c uoc = new b$c(this, p1, obj1, uoa, hashMap2, p5);
                   new f(uoa.a, oobject2).e(obj1.a, hashMap1, new ArrayList(), v13, "LiveWatchDy");
                }
             }
          }else {
             c.f("LiveApi-requestComponentData use old api");
             if (oobject4.equals("signaling")) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put(str, oobject1);
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(Integer.valueOf(30));
                uArrayList.add(Integer.valueOf(10));
                uArrayList.add(Integer.valueOf(60));
                a.b().a("signaling", oobject.a, hashMap3, uArrayList, new b$d(obj, oobject, oobject3, oobject5), "LiveWatchDy");
             }
          }
          return;
       }
    }
    public void h(g p0,g p1){
       b uob = b.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uob, "8")) {
          return;
       }
       if (TextUtils.isEmpty(p0.d)) {
          if (p1 != null) {
             c.a("LiveApi-register agreement callback failed liveId is null, invoke onAgreement");
             p1.a(new HashMap());
          }
          return;
       }else {
          this.q(p0.d, "注册DAC监听（回调onAgreement和onBusiness）", "register agreement callback", null);
          c.f("LiveApi-register agreement callback: "+p0.d);
          a uoa = this.b.get(p0.d);
          if (uoa == null) {
             uoa = new a();
             this.b.put(p0.d, uoa);
          }
          if (!PatchProxy.applyVoidOneRefs(p1, uoa, a.class, "1")) {
             uoa.a.add(p1);
          }
          this.e.put(p0.d, Boolean.TRUE);
          this.w(p0.a, p0.d, "register agreement callback: "+p0.d, "注册DAC监听（回调onAgreement和onBusiness）");
          g d = p0.d;
          HashMap hashMap = PatchProxy.applyOneRefs(p0, this, uob, "5");
          if (hashMap != PatchProxyResult.class) {
          }else {
             a uoa1 = this.a.a(p0.d);
             hashMap = (uoa1 != null && uoa1.h != null)? new HashMap(uoa1.h): new HashMap();
          }
          Object obj = hashMap;
          this.x(d, "register agreement callback", "注册DAC监听（回调onAgreement和onBusiness）", obj, BusinessDataSource.PAGE_INIT_MATERIAL);
          return;
       }
    }
    public void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "31")) {
          return;
       }
       c.f("LiveApi-removeDynamicPendantSignal");
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       this.c.remove(p0);
       return;
    }
    public String j(String p0,long p1){
       String obj;
       AgreementPendant obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uob, "34");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       a uoa = this.a.a(p0);
       obj = "";
       if (uoa != null) {
          try{
             a uoa1 = a.class;
             if (PatchProxy.isSupport(uoa1)) {
                obj1 = PatchProxy.applyOneRefs(Long.valueOf(p1), uoa, uoa1, "8");
                if (obj1 != patchProxyRe) {
                   obj = obj1;
                }
             }
             uoa = uoa.e;
             if (uoa == null) {
                c.f("getPendantCodeFromMaterialId area data is null");
             }else {
                Iterator iterator = uoa.values().iterator();
                while (iterator.hasNext()) {
                   AgreementArea uAgreementAr = iterator.next();
                   if (uAgreementAr != null) {
                      uAgreementAr = uAgreementAr.pendantDatas;
                      if (uAgreementAr != null) {
                         Iterator iterator1 = uAgreementAr.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               obj1 = iterator1.next();
                               if (obj1 != null && !obj1.pendantResourceId - p1) {
                                  Pendant pendantCode = obj1.pendantCode;
                                  break ;
                               }else {
                                  continue ;
                               }
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                }
             }
          }catch(java.lang.Exception e7){
             String[] stringArray = new String[]{"msg"};
             String[] stringArray1 = new String[]{e7.getMessage()};
             c.d("getPendantCodeFromMaterialId error", a.a(stringArray, stringArray1));
          }
       }
    }
    public long k(String p0,String p1){
       String[] stringArray;
       String[] stringArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "35");
       if (obj != patchProxyRe) {
          return obj.longValue();
       }
       a uoa = this.a.a(p0);
       long l = -1;
       if (uoa != null) {
          AgreementPendant obj1 = PatchProxy.applyOneRefs(p1, uoa, a.class, "9");
          if (obj1 != patchProxyRe) {
             l = obj1.longValue();
          }else if(uoa.e == null || TextUtils.isEmpty(p1)){
             c.f("getMaterialIdFromPendantCode area data is null");
          }else {
             Iterator iterator = uoa.e.values().iterator();
             while (iterator.hasNext()) {
                AgreementArea uAgreementAr = iterator.next();
                if (uAgreementAr != null) {
                   uAgreementAr = uAgreementAr.pendantDatas;
                   if (uAgreementAr != null) {
                      Iterator iterator1 = uAgreementAr.iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            obj1 = iterator1.next();
                            if (obj1 != null && p1.equals(obj1.pendantCode)) {
                               l = obj1.pendantResourceId;
                               break ;
                            }else {
                               continue ;
                            }
                         }else {
                            continue ;
                         }
                      }
                   }
                }
             }
          }
       }
    }
    public void l(g p0,String p1,String p2,Map p3,a p4){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "23")) {
             return;
          }
       }
       c.f("LiveApi-onBackToPage");
       if (p0 != null) {
          g d = p0.d;
          if (d != null) {
             a uoa = this.a.a(d);
             if (uoa == null) {
                return;
             }else {
                b$e uoe = new b$e(this, p3, p0, uoa, p4);
                new a(uoa.a, p1, p2).e(p0.a, new HashMap(), new ArrayList(), v8, "Link");
             }
          }
       }
       return;
    }
    public void m(String p0,h p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "30")) {
          return;
       }
       c.f("LiveApi-registerDynamicPendantSignal");
       if (!TextUtils.isEmpty(p0) && p1 != null) {
          this.c.put(p0, p1);
       }
       return;
    }
    public void n(g p0){
    }
    public void o(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "11")) {
          return;
       }
       if (p0 == null || TextUtils.isEmpty(p0.d)) {
          c.a("LiveApi-onCallbackRegisterComplete liveId is null");
          return;
       }else {
          c.f("LiveApi-onCallbackRegisterComplete");
          Map map = null;
          this.q(p0.d, "组件监听注册完毕（onBind完毕，开始分发原始协议和组件监听）", "onCallbackRegisterComplete", map);
          Boolean tRUE = Boolean.TRUE;
          this.f.put(p0.d, tRUE);
          this.g.put(p0.d, tRUE);
          a uoa = this.a.a(p0.d);
          if (uoa != null) {
             map = uoa.f;
          }
          this.z(p0.d, "注册原生协议数据监听");
          this.y(p0, ComponentDataSource.PAGE_INIT_MATERIAL, map, "组件监听注册完毕（onBind完毕，开始分发原始协议和组件监听）");
          return;
       }
    }
    public void p(String p0,String p1,String p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "40")) {
          return;
       }
       b.o().d(p0, b.o().p(p0, p1), p2, p3);
       return;
    }
    public void q(String p0,String p1,String p2,Map p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "39")) {
          return;
       }
       b.o().b(p0, b.o().p(p0, p1), p2, p3);
       return;
    }
    public final List r(String p0,boolean p1){
       boolean b;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "14");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       b = false;
       if (PatchProxy.isSupport(uob)) {
          Boolean obj1 = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uob, "13");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(TextUtils.isEmpty(p0)){
             obj1 = Boolean.TRUE;
             b uob1 = (this.e.get(p0) == obj1)? 1: null;
             if (!p1) {
                if (this.h.get(p0) == obj1) {
                label_005b :
                   i = 1;
                label_005e :
                   if (!uob1) {
                      c.f("LiveApi-agreement not register ready: "+p0);
                   }
                   if (!i) {
                      c.f("LiveApi-request agreement data not ready: "+p0);
                   }
                   if (uob1 && i) {
                      b = true;
                   }
                }
             }else if(this.i.get(p0) == obj1){
                goto label_005b ;
             }
             i = 0;
             goto label_005e ;
          }
       }else {
          goto label_0033 ;
       }
       if (!b) {
          return null;
       }else {
          a uoa = this.b.get(p0);
          if (uoa == null) {
             c.f("LiveApi-checkAndGetRegister "+p0+" has not register any agreement or component callback");
             return null;
          }else {
             return uoa.a;
          }
       }
    }
    public o s(){
       return this.a;
    }
    public String t(String p0){
       Map$Entry uEntry;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, b.class, "42");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.isEmpty(p0)) {
          return "";
       }
       obj = this.j.entrySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return "";
          }
          uEntry = obj.next();
          if (uEntry != null && (uEntry.getValue() != null && p0.equals(uEntry.getValue().c))) {
             break ;
          }
       }
       return uEntry.getKey();
    }
    public Map u(){
       return this.j;
    }
    public void v(g p0,List p1,Map p2,Map p3,g p4,a p5,h p6){
       d uod;
       object oobject = p0;
       object oobject1 = p5;
       object oobject2 = p6;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{oobject,p1,p2,p3,null,oobject1,oobject2};
          if (PatchProxy.applyVoid(objArray, this, uob, "20")) {
             return;
          }
       }
       c.f("LiveApi-startLiveMatch invoke");
       s obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, b.class, "19");
       if (obj != PatchProxyResult.class) {
          uod = obj;
       }else if(g.c(oobject.a)){
          d uod1 = new d(p1, p2, p3, p0, h.d(p0));
       }else {
          h oh = new h(p1, p2, p3, p0, h.d(p0));
       }
       obj = s.b();
       String str = (oobject == null)? "": oobject.d;
       b$b uob1 = new b$b(this, null, oobject1, oobject2);
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoidFourRefs(uod, "LiveWatchDy", str, uob1, obj, s.class, "3")) {
          t ot = new t(obj, uob1);
          if (uod instanceof d) {
             obj.c.b(uod, 0, "LiveWatchDy", str, ot);
          }else {
             obj.b.b(uod, 0, "LiveWatchDy", str, ot);
          }
       }
       return;
    }
    public final void w(String p0,String p1,String p2,String p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "15")) {
          return;
       }
       c.f("LiveApi- "+p2+" tryDispatchAgreementCallback: "+p1);
       this.q(p1, p3, "tryDispatchAgreementCallback", null);
       List list = this.r(p1, false);
       if (list != null && list.size() > 0) {
          g og = o.c().d.a(p0);
          if (og == null) {
             og = new g();
          }
          a uoa = this.a.a(p1);
          if (uoa != null) {
             uoa = uoa.b;
             if (uoa != null) {
                og.a(uoa);
             }
          }
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             g og1 = iterator.next();
             if (og1 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("componentMap", og.b());
                this.q(p1, p3, "tryDispatchAgreementCallback onAgreement invoke", hashMap);
                c.f("LiveApi-"+p1+" tryDispatchAgreementCallback onAgreement invoke");
                og1.a(og.b());
             }
          }
       }
       return;
    }
    public void x(String p0,String p1,String p2,Map p3,BusinessDataSource p4){
       b uob = b.class;
       int i = 1;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "16")) {
             return;
          }
       }
       c.f("LiveApi-"+p1+" tryDispatchBusinessCallback");
       this.q(p0, p2, "tryDispatchBusinessCallback", null);
       List list = this.r(p0, i);
       if (list != null && list.size() > 0) {
          Iterator iterator = list.iterator();
          while (iterator.hasNext()) {
             g og = iterator.next();
             if (og != null) {
                ConcurrentHashMap uConcurrentH = new ConcurrentHashMap();
                uConcurrentH.put("businessSource", p4);
                if (p3 != null) {
                   og.b(p3, uConcurrentH);
                   c.f("LiveApi-tryDispatchBusinessCallback，size: "+p3.size());
                   HashMap hashMap = new HashMap();
                   hashMap.put("businessData", p3);
                   this.q(p0, p2, "tryDispatchBusinessCallback success: ", hashMap);
                }else {
                   og.b(new HashMap(), uConcurrentH);
                   c.f("LiveApi-tryDispatchBusinessCallback no data");
                   this.q(p0, p2, "tryDispatchBusinessCallback no data", null);
                }
             }
          }
       }else {
          this.q(p0, p2, "tryDispatchBusinessCallback not register callback", null);
       }
       return;
    }
    public void y(g p0,ComponentDataSource p1,Map p2,String p3){
       boolean b;
       a this;
       Boolean obj1;
       long l;
       g og2;
       ArrayList uArrayList1;
       SignalPendant signalPendan1;
       long l1;
       Object obj2;
       ComponentDataSource obj3;
       boolean b1;
       ArrayList uArrayList2;
       b$a uoa2;
       SignalPendant signalPendan2;
       a$a c;
       b uob = this;
       g og = p0;
       ComponentDataSource uComponentDa = p1;
       Map map = p2;
       String str = p3;
       String str1 = String.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob1 = b.class;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b.class, "17")) {
          return;
       }
       c.f("LiveApi-tryDispatchComponentCallback");
       String str2 = "component not register ready";
       if (og) {
          g d = og.d;
          Object obj = PatchProxy.applyTwoRefs(d, str, uob, uob1, "12");
          Map map1 = null;
          int i = 1;
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(TextUtils.isEmpty(d)){
             b = false;
          }else {
             obj1 = Boolean.TRUE;
             l = (uob.g.get(d) == obj1)? 1: 0;
             StringBuilder str4 = (uob.h.get(d) == obj1)? 1: null;
             if (!l) {
                c.f("LiveApi-component not register ready: "+d);
                uob.q(d, str, str2, map1);
             }
             if (!str4) {
                c.f("LiveApi-request agreement data not ready: "+d);
                uob.q(d, str, "request agreement data not ready", map1);
             }
             boolean b2 = (l && str4)? true: false;
             c.f("LiveApi-isComponentComplete: "+b2);
             uob.q(d, str, "isComponentComplete: "+b2, map1);
             b = b2;
          }
          if (b) {
             g d1 = og.d;
             a uoa = uob.b.get(d1);
             if (uoa == null) {
                c.f("LiveApi- tryDispatchComponentCallback has not register callback");
                uob.p(og.d, str, " tryDispatchComponentCallback has not register callback", map1);
                return;
             }else {
                this = uob.a.a(d1);
                if (this == null) {
                   c.f("LiveApi- tryDispatchComponentCallback page data is null");
                   uob.p(og.d, str, "tryDispatchComponentCallback page data is null", map1);
                   return;
                }else {
                   List list = uoa.a();
                   if (list != null && list.size() > 0) {
                      Iterator iterator = list.iterator();
                      while (iterator.hasNext()) {
                         obj1 = iterator.next();
                         if (obj1 != null && obj1.c != null) {
                            l = this.c(obj1.a);
                            c.f("LiveApi-tryDispatchComponentCallback target pendantResourceId: "+l+" pendantCode: "+obj1.a);
                            if (uComponentDa == ComponentDataSource.PAGE_INIT_MATERIAL) {
                               if (map && map.containsKey(Long.valueOf(l))) {
                                  obj1.c.c(i, map.get(Long.valueOf(l)), uComponentDa);
                                  c.f("LiveApi- tryDispatchComponentCallback success from agreement");
                                  HashMap hashMap1 = new HashMap();
                                  hashMap1.put("materialId", Long.valueOf(l));
                                  uob.q(d1, str, "tryDispatchComponentCallback success from agreement", hashMap1);
                               }
                            }else if(uComponentDa == ComponentDataSource.SIGNAL){
                               SignalPendant signalPendan = this.b(l);
                               if (signalPendan == null) {
                                  c.f("LiveApi-tryDispatchComponentCallback materialId: "+l+" do not find signalData");
                               }else {
                                  c.f("LiveApi-tryDispatchComponentCallback find pendant, materialId: "+l);
                                  ArrayList uArrayList = new ArrayList();
                                  uArrayList.add(Long.valueOf(signalPendan.pendantResourceId));
                                  HashMap hashMap2 = new HashMap();
                                  if (signalPendan.throughInfo != null) {
                                     og2 = d1;
                                     uArrayList1 = uArrayList;
                                     try{
                                        hashMap2.put(Long.valueOf(signalPendan.pendantResourceId), e.e(signalPendan.throughInfo, str1, str1));
                                     }catch(java.lang.Exception e0){
                                        e0.printStackTrace();
                                     }
                                  }else {
                                     og2 = d1;
                                     uArrayList1 = uArrayList;
                                  }
                               }
                            }
                         }
                         a uoa1 = this;
                         g og1 = d1;
                         PatchProxyResult patchProxyRe1 = patchProxyRe;
                         b uob2 = uob1;
                         String str3 = str1;
                         int i2 = 1;
                      label_0287 :
                         uob = this;
                         map = p2;
                         str = p3;
                         this = uoa1;
                         patchProxyRe = patchProxyRe1;
                         uob1 = uob2;
                         str1 = str3;
                         d1 = og1;
                         i = 1;
                         uComponentDa = p1;
                      }
                   }
                   return;
                }
             }
          }
       }
       c.f("LiveApi- tryDispatchComponentCallback has not complete");
       if (og != null) {
          HashMap hashMap = new HashMap();
          hashMap.put("source", p1);
          this.q(og.d, p3, str2, hashMap);
       }else {
          int i1 = this;
       }
       return;
    }
    public final void z(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       c.f("LiveApi-tryDispatchPersonalAgreementCallback: "+p0);
       Map map = null;
       this.q(p0, p1, "tryDispatchPersonalAgreementCallback", map);
       Boolean tRUE = Boolean.TRUE;
       a uoa = null;
       b uob = (this.f.get(p0) == tRUE)? 1: null;
       if (this.h.get(p0) == tRUE) {
          uoa = 1;
       }
       if (uob && uoa) {
          a uoa1 = this.b.get(p0);
          if (uoa1 != null && uoa1.b() != null) {
             a uoa2 = this.a.a(p0);
             if (uoa2 != null && uoa2.d != null) {
                this.q(p0, p1, "tryDispatchPersonalAgreementCallback invoke", map);
                Iterator iterator = uoa1.b().iterator();
                while (iterator.hasNext()) {
                   iterator.next().a(uoa2.d);
                }
             }
          }
       }
       return;
    }
}
