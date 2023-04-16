package com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager;
import java.util.concurrent.ConcurrentHashMap;
import com.yxcorp.utility.SystemUtil;
import vqa.k;
import java.lang.Boolean;
import java.lang.CharSequence;
import zsd.u;
import java.lang.Class;
import java.lang.Object;
import vsd.d;
import nsd.m0;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences;
import pna.k;
import java.lang.String;
import java.lang.NullPointerException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Float;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$b;
import java.lang.reflect.Type;
import el.a;
import vma.a;
import km8.b;
import java.util.Map;
import fg6.a;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$c;
import com.google.gson.Gson;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Number;
import java.lang.StringBuilder;
import y76.b;
import java.lang.Throwable;
import qrd.l1;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$init$2;
import moa.a;
import msd.l;
import erd.g;
import crd.b;
import com.kwai.robust.PatchProxyResult;
import loa.b;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfig;
import java.lang.Iterable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpConfigItem;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$a;
import java.util.Comparator;
import android.os.Handler;
import tb7.b;
import java.util.Objects;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$checkToRequestDialog$2;
import moa.b;
import msd.a;
import java.lang.Runnable;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$checkToRequestDialog$3;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$checkToRequestDialog$4;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$checkToRequestDialog$5;
import java.lang.System;
import yb6.d;
import trd.u;
import java.util.Date;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$postTaskTomorrow$1;
import java.util.concurrent.ConcurrentMap;
import loa.h;
import wkd.b;
import yma.a;
import yma.b;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$d;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$e;
import java.text.SimpleDateFormat;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$onLogin$1;
import com.yxcorp.gifshow.growth.kgi.redpacket.cloud.KgiCloudRpManager$onLogin$2;

public final class KgiCloudRpManager	// class@0013f4
{
    public static boolean a = false;
    public static boolean b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;
    public static final ConcurrentHashMap e;
    public static int f;
    public static boolean g;
    public static long h;
    public static long i;
    public static final boolean j;
    public static final KgiCloudRpManager k;

    static {
       String str2;
       KgiCloudRpManager.k = new KgiCloudRpManager();
       KgiCloudRpManager.c = new ConcurrentHashMap();
       KgiCloudRpManager.d = new ConcurrentHashMap();
       KgiCloudRpManager.e = new ConcurrentHashMap();
       boolean b = true;
       if (SystemUtil.I()) {
          k b1 = k.b;
          String str = "KEY_KGI_CLOUD_RP_TIME";
          Boolean fALSE = Boolean.FALSE;
          if (!u.S1(str)) {
             try{
                d uod = m0.d(fALSE.getClass());
                if (a.g(uod, m0.d(Boolean.TYPE))) {
                   fALSE = Boolean.valueOf(b1.a().getBoolean(str, false));
                }else {
                   String str1 = null;
                   if (a.g(uod, m0.d(String.class))) {
                      if (fALSE instanceof String) {
                         str1 = fALSE;
                      }
                      if (str1 == null) {
                         str1 = "";
                      }
                      str2 = b1.a().getString(str, str1);
                      str = (str2 == null || !str2.length())? 1: null;
                      if (!str) {
                         if (str2 != null) {
                         }else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                         }
                      }
                   }else if(a.g(uod, m0.d(Integer.TYPE))){
                      if (fALSE instanceof Integer) {
                         str1 = fALSE;
                      }
                      int i = (str1 != null)? str1.intValue(): Integer.MIN_VALUE;
                      int intx = b1.a().getInt(str, i);
                      if (intx != Integer.MIN_VALUE) {
                         str2 = Integer.valueOf(intx);
                      }
                   }else if(a.g(uod, m0.d(Long.TYPE))){
                      if (fALSE instanceof Long) {
                         str1 = fALSE;
                      }
                      long l = (str1 != null)? str1.longValue(): Long.MIN_VALUE;
                      l = b1.a().getLong(str, l);
                      if (l - Long.MIN_VALUE) {
                         str2 = Long.valueOf(l);
                      }
                   }else if(a.g(uod, m0.d(Float.TYPE))){
                      if (fALSE instanceof Float) {
                         str1 = fALSE;
                      }
                      float f = (str1 != null)? str1.floatValue(): Float.MIN_VALUE;
                      float floatx = b1.a().getFloat(str, f);
                      if (floatx - 1) {
                         str2 = Float.valueOf(floatx);
                      }
                   }
                   fALSE = str2;
                }
             }catch(java.lang.Exception e0){
             }
          }
       }
       b = false;
    label_012e :
       KgiCloudRpManager.j = b;
    }
    public void KgiCloudRpManager(){
       super();
    }
    public static final ConcurrentHashMap a(KgiCloudRpManager p0){
       return KgiCloudRpManager.d;
    }
    public static final void b(KgiCloudRpManager p0,boolean p1){
       KgiCloudRpManager.g = p1;
    }
    public static final void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, KgiCloudRpManager.class, "3")) {
          return;
       }
       if (KgiCloudRpManager.a) {
          return;
       }
       KgiCloudRpManager k = KgiCloudRpManager.k;
       _monitor_enter(k);
       if (KgiCloudRpManager.a) {
          _monitor_exit(k);
          return;
       }else {
          int i = 2;
          boolean b = false;
          Type type = new KgiCloudRpManager$b().getType();
          SharedPreferences a = a.a;
          String str = a.getString("kgiCloudRpConfigMap", "null");
          Object[] objArray1 = (str == null || str == "")? objArray: b.a(str, type);
          ConcurrentHashMap uConcurrentH = (objArray1 == null || objArray1.isEmpty())? 1: null;
          if (!uConcurrentH) {
             KgiCloudRpManager.c.putAll(objArray1);
          }
          k.h(KgiCloudRpManager.c, "initConfigMap");
          Map map = a.a.i(a.getString("kgiCloudRpShowMap", ""), new KgiCloudRpManager$c().getType());
          ConcurrentHashMap uConcurrentH1 = (map == null || map.isEmpty())? 1: null;
          if (!uConcurrentH1) {
             KgiCloudRpManager.d.putAll(map);
          }
          ConcurrentHashMap d = KgiCloudRpManager.d;
          k.h(d, "initShowMap");
          long l = k.d(k.e()) - 0x240c8400;
          Iterator iterator = d.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             ArrayList value = uEntry.getValue();
             int i1 = value.size();
             Iterator iterator1 = value.iterator();
             while (iterator1.hasNext()) {
                boolean b1 = (iterator1.next().longValue() - l < 0)? true: false;
                if (b1) {
                   iterator1.remove();
                }
             }
             b.e("KgiCloudRp#init: remove ... uid = "+key+", "+i1+" ==> "+value.size(), b, i, objArray);
          }
          _monitor_exit(k);
          k = KgiCloudRpManager.k;
          k.i();
          k.h(KgiCloudRpManager.c, "initConfigMapFinal");
          if (KgiCloudRpManager.b) {
             k.c();
          }
          RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new a(new KgiCloudRpManager$init$2(k)));
          return;
       }
    }
    public final void c(){
       String id;
       List list;
       String obj1;
       KgiCloudRpConfigItem start;
       Long longx1;
       List list2;
       KgiCloudRpManager obj3;
       boolean b2;
       List list3;
       KgiCloudRpConfigItem obj6;
       List list4;
       Object obj7;
       long l3;
       int i2;
       KgiCloudRpManager kgiCloudRpMa1;
       long l4;
       PatchProxyResult patchProxyRe1;
       Iterator obj8;
       ArrayList obj9;
       long l7;
       KgiCloudRpConfigItem end;
       KgiCloudRpConfigItem obj10;
       Object obj = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       KgiCloudRpManager kgiCloudRpMa = KgiCloudRpManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, kgiCloudRpMa, "10")) {
          return;
       }
       boolean b = false;
       int i = 2;
       b.e("KgiCloudRp#checkToRequestDialog : ===>", b, i, objArray);
       if (b.c()) {
          b.e("KgiCloudRp#checkToRequestDialog : DO NOTHING is collect data !!! ===>", b, i, objArray);
          return;
       }else {
          KgiCloudRpManager.b = b;
          QCurrentUser mE = QCurrentUser.ME;
          if (mE != null) {
             id = mE.getId();
             if (id != null) {
             label_0032 :
                KgiCloudRpConfig kgiCloudRpCo = KgiCloudRpManager.c.get(id);
                if (kgiCloudRpCo == null) {
                   b.e("KgiCloudRp#checkToRequestDialog : NO!! config is null", b, i, objArray);
                }
                if (kgiCloudRpCo != null) {
                   a.o(kgiCloudRpCo, "mConfigMap[uid].also {\n \x20\x02is null\"\)\n    } ?: return\x00");
                   String str = " >= ";
                   if (KgiCloudRpManager.f >= kgiCloudRpCo.launchPopupMaxTimes) {
                      b.e("KgiCloudRp#checkToRequestDialog : NO!! showTimesLaunch "+KgiCloudRpManager.f+str+kgiCloudRpCo.launchPopupMaxTimes, b, i, objArray);
                      return;
                   }else {
                      ArrayList uArrayList = KgiCloudRpManager.d.get(id);
                      if (uArrayList != null) {
                         list = CollectionsKt___CollectionsKt.b5(uArrayList);
                         if (list != null) {
                         label_0084 :
                            obj.g(list, "showTimeList");
                            long l = this.e();
                            long l1 = obj.d(l);
                            Iterator iterator = list.iterator();
                            boolean b1 = false;
                            while (true) {
                               if (iterator.hasNext()) {
                                  long l2 = (iterator.next().longValue() - l1 > 0)? 1: 0;
                                  if (l2) {
                                  label_00b8 :
                                     int i1 = (b1 < 0)? 0: list.size() - b1;
                                     KgiCloudRpConfig popupItems = kgiCloudRpCo.popupItems;
                                     if (popupItems != null) {
                                        List list1 = CollectionsKt___CollectionsKt.d2(popupItems);
                                        if (list1 != null) {
                                           ArrayList uArrayList1 = new ArrayList();
                                           Iterator iterator1 = list1.iterator();
                                           while (iterator1.hasNext()) {
                                              obj1 = iterator1.next();
                                              KgiCloudRpConfigItem obj2 = obj1;
                                              start = obj2.start;
                                              if (start != null) {
                                                 KgiCloudRpManager k = KgiCloudRpManager.k;
                                                 Long longx = k.m(start, l);
                                                 if (longx != null) {
                                                    l2 = longx.longValue();
                                                    obj2 = obj2.end;
                                                    if (obj2 != null) {
                                                       longx1 = k.m(obj2, l);
                                                       if (longx1 != null && longx1.longValue() - l2 > 0) {
                                                          longx1 = 1;
                                                       label_0106 :
                                                          if (longx1) {
                                                             uArrayList1.add(obj1);
                                                          }
                                                          k = 2;
                                                       }
                                                    }
                                                 }
                                              }
                                              longx1 = 0;
                                              goto label_0106 ;
                                           }
                                           if (!(uArrayList1.isEmpty() ^ 0x01)) {
                                              uArrayList1 = null;
                                           }
                                           if (uArrayList1 != null) {
                                              list2 = CollectionsKt___CollectionsKt.f5(uArrayList1, new KgiCloudRpManager$a(l));
                                           label_0126 :
                                              String str1 = (list2 == null || list2.isEmpty())? 1: null;
                                              if (str1) {
                                                 i = 2;
                                                 obj3 = null;
                                                 b2 = false;
                                                 b.e("KgiCloudRp#checkToRequestDialog : NO!! popupItems is empty", b2, i, obj3);
                                              }else {
                                                 i = 2;
                                                 obj3 = null;
                                                 b2 = false;
                                              }
                                              if (list2 != null) {
                                                 b.e("KgiCloudRp#popupItems : ===> ", b2, i, obj3);
                                                 Iterator iterator2 = list2.iterator();
                                                 while (iterator2.hasNext()) {
                                                    b.e("KgiCloudRp# : == "+KgiCloudRpManager.k.l(iterator2.next()), false, 2, null);
                                                 }
                                                 Handler handler = b.d();
                                                 if (i1 >= kgiCloudRpCo.dayPopupMaxTimes) {
                                                    b.e("KgiCloudRp#checkToRequestDialog : NO!! showTimesToday "+i1+str+kgiCloudRpCo.dayPopupMaxTimes, false, 2, null);
                                                    obj.j(list2, l, handler);
                                                    return;
                                                 }else {
                                                    ArrayList uArrayList2 = KgiCloudRpManager.e.get(id);
                                                    if (uArrayList2 != null) {
                                                       list3 = CollectionsKt___CollectionsKt.b5(uArrayList2);
                                                       if (list3 != null) {
                                                       label_01b5 :
                                                          obj.g(list3, "requestTimeList");
                                                          i1 = 2;
                                                          Object obj4 = null;
                                                          boolean b3 = false;
                                                          b.e("KgiCloudRp#checkToRequestDialog : showList size ===> "+list.size(), b3, i1, obj4);
                                                          b.e("KgiCloudRp#checkToRequestDialog : requestList size ===> "+list3.size(), b3, i1, obj4);
                                                          Iterator iterator3 = list2.iterator();
                                                          while (true) {
                                                             if (iterator3.hasNext()) {
                                                                String obj5 = iterator3.next();
                                                                obj4 = obj5;
                                                                obj3 = KgiCloudRpManager.k;
                                                                Objects.requireNonNull(obj3);
                                                                obj1 = ", end = ";
                                                                Iterator iterator4 = iterator3;
                                                                if (PatchProxy.isSupport(kgiCloudRpMa)) {
                                                                   obj6 = PatchProxy.applyTwoRefs(obj4, Long.valueOf(l), obj3, kgiCloudRpMa, "15");
                                                                   if (obj6 != patchProxyRe) {
                                                                      i = obj6.booleanValue();
                                                                      list4 = list2;
                                                                      obj7 = obj5;
                                                                   }else if(obj4 != null){
                                                                      obj6 = obj4.start;
                                                                      obj10 = obj4.end;
                                                                      if (PatchProxy.isSupport(kgiCloudRpMa)) {
                                                                         obj7 = obj5;
                                                                         Object obj15 = PatchProxy.applyThreeRefs(obj6, obj10, Long.valueOf(l), obj3, KgiCloudRpManager.class, "16");
                                                                         if (obj15 != patchProxyRe) {
                                                                            i = obj15.booleanValue();
                                                                            list4 = list2;
                                                                         }else if(obj6 != null){
                                                                            list4 = list2;
                                                                            longx1 = 5;
                                                                            if (obj6.length() == longx1 && (obj10 != null && obj10.length() == longx1)) {
                                                                               longx1 = obj3.m(obj6, l);
                                                                               if (longx1 != null) {
                                                                                  l2 = longx1.longValue();
                                                                                  longx1 = obj3.m(obj10, l);
                                                                                  if (longx1 != null) {
                                                                                     l1 = longx1.longValue();
                                                                                     if (l2 - l <= 0 && l1 - l >= 0) {
                                                                                        i = true;
                                                                                     }
                                                                                  }
                                                                               }
                                                                            }
                                                                         }else {
                                                                            list4 = list2;
                                                                         }
                                                                         i = false;
                                                                      }else {
                                                                         obj7 = obj5;
                                                                         goto label_0252 ;
                                                                      }
                                                                      b.e("KgiCloudRp#isHit : = "+i+", start = "+obj4.start+obj1+obj4.end, false, 2, null);
                                                                   }else {
                                                                      list4 = list2;
                                                                      obj7 = obj5;
                                                                      i = false;
                                                                   }
                                                                }else {
                                                                   goto label_0225 ;
                                                                }
                                                                if (i) {
                                                                   KgiCloudRpManager k1 = KgiCloudRpManager.k;
                                                                   Objects.requireNonNull(k1);
                                                                   if (PatchProxy.isSupport(kgiCloudRpMa)) {
                                                                      obj5 = obj1;
                                                                      l3 = l;
                                                                      obj6 = PatchProxy.applyFourRefs(obj4, list, list3, Long.valueOf(l), k1, KgiCloudRpManager.class, "13");
                                                                      if (obj6 != patchProxyRe) {
                                                                         i2 = obj6.intValue();
                                                                      label_0312 :
                                                                         kgiCloudRpMa1 = kgiCloudRpMa;
                                                                         l4 = l3;
                                                                         patchProxyRe1 = patchProxyRe;
                                                                      }else if(obj4 != null){
                                                                         obj6 = obj4.start;
                                                                         end = obj4.end;
                                                                         if (PatchProxy.isSupport(kgiCloudRpMa)) {
                                                                            Object[] objArray1 = new Object[]{obj6,end,list,list3,Long.valueOf(l3)};
                                                                            obj10 = PatchProxy.apply(objArray1, k1, kgiCloudRpMa, "14");
                                                                            if (obj10 != patchProxyRe) {
                                                                               i2 = obj10.intValue();
                                                                               goto label_0312 ;
                                                                            }
                                                                         }
                                                                         if (obj6 != null) {
                                                                            obj1 = 5;
                                                                            if (obj6.length() == obj1 && (end != null && end.length() == obj1)) {
                                                                               l4 = l3;
                                                                               Long longx4 = k1.m(obj6, l4);
                                                                               if (longx4 != null) {
                                                                                  l = longx4.longValue();
                                                                                  longx1 = k1.m(end, l4);
                                                                                  if (longx1 != null) {
                                                                                     l2 = longx1.longValue();
                                                                                     obj9 = new ArrayList();
                                                                                     Iterator iterator5 = list.iterator();
                                                                                     while (iterator5.hasNext()) {
                                                                                        patchProxyRe1 = patchProxyRe;
                                                                                        Object obj11 = iterator5.next();
                                                                                        long l8 = obj11.longValue();
                                                                                        Object obj12 = (l - l8 <= 0 && l2 - l8 >= 0)? 1: null;
                                                                                        if (obj12) {
                                                                                           obj9.add(obj11);
                                                                                        }
                                                                                        patchProxyRe = patchProxyRe1;
                                                                                     }
                                                                                     patchProxyRe1 = patchProxyRe;
                                                                                     int i3 = obj9.size();
                                                                                     obj9 = new ArrayList();
                                                                                     iterator5 = list3.iterator();
                                                                                     while (iterator5.hasNext()) {
                                                                                        kgiCloudRpMa1 = kgiCloudRpMa;
                                                                                        Object obj13 = iterator5.next();
                                                                                        long l9 = obj13.longValue();
                                                                                        Object obj14 = (l - l9 <= 0 && l2 - l9 >= 0)? 1: null;
                                                                                        if (obj14) {
                                                                                           obj9.add(obj13);
                                                                                        }
                                                                                        kgiCloudRpMa = kgiCloudRpMa1;
                                                                                     }
                                                                                     kgiCloudRpMa1 = kgiCloudRpMa;
                                                                                     int i4 = obj9.size();
                                                                                     i2 = i3 + i4;
                                                                                     b.e("KgiCloudRp#dealCount : = "+i2+"\(show="+i3+",request="+i4+"\), start = "+obj6+obj5+end, false, 2, null);
                                                                                  }
                                                                               }
                                                                               patchProxyRe1 = patchProxyRe;
                                                                               kgiCloudRpMa1 = kgiCloudRpMa;
                                                                            label_03f6 :
                                                                               i2 = 0;
                                                                            }
                                                                         }
                                                                      }
                                                                   label_03f0 :
                                                                      kgiCloudRpMa1 = kgiCloudRpMa;
                                                                      l4 = l3;
                                                                      patchProxyRe1 = patchProxyRe;
                                                                      goto label_03f6 ;
                                                                   }else {
                                                                      obj5 = obj1;
                                                                      l3 = l;
                                                                      goto label_02e3 ;
                                                                   }
                                                                   if (i2 < obj4.times) {
                                                                      obj8 = 1;
                                                                   label_0403 :
                                                                      if (obj8) {
                                                                      label_0416 :
                                                                         obj8 = obj7;
                                                                         handler.removeCallbacks(new b(new KgiCloudRpManager$checkToRequestDialog$2(obj)));
                                                                         handler.removeCallbacks(new b(new KgiCloudRpManager$checkToRequestDialog$3(obj)));
                                                                         char c = '}';
                                                                         if (obj8 != null) {
                                                                            b.e("KgiCloudRp#checkToRequestDialog : hit Now = "+obj.l(obj8), false, 2, null);
                                                                            long l5 = kgiCloudRpCo.requestDelaySeconds * 1000;
                                                                            b.e("KgiCloudRp#checkToRequestDialog : request === > delay time = "+l5+c, false, 2, null);
                                                                            handler.postDelayed(new b(new KgiCloudRpManager$checkToRequestDialog$4(obj)), l5);
                                                                            break ;
                                                                         }else {
                                                                            obj8 = list4.iterator();
                                                                            while (true) {
                                                                               long l6 = -1;
                                                                               if (obj8.hasNext()) {
                                                                                  obj9 = obj8.next();
                                                                                  KgiCloudRpConfigItem start1 = obj9.start;
                                                                                  if (start1 != null) {
                                                                                     Long longx2 = KgiCloudRpManager.k.m(start1, l4);
                                                                                     if (longx2 != null) {
                                                                                        l7 = longx2.longValue();
                                                                                     label_04a4 :
                                                                                        id = (l7 - l4 > 0)? 1: null;
                                                                                        if (!id) {
                                                                                           continue ;
                                                                                        }
                                                                                     }
                                                                                  }
                                                                                  l7 = l6;
                                                                                  goto label_04a4 ;
                                                                               }else {
                                                                                  obj9 = null;
                                                                               }
                                                                               if (obj9 != null) {
                                                                                  b.e("KgiCloudRp#checkToRequestDialog : hit Next = "+obj.l(obj9), false, 2, null);
                                                                                  KgiCloudRpConfigItem start2 = obj9.start;
                                                                                  if (start2 != null) {
                                                                                     Long longx3 = obj.m(start2, l4);
                                                                                     if (longx3 != null) {
                                                                                        l6 = longx3.longValue();
                                                                                     }
                                                                                  }
                                                                                  if (l6 - l4 > 0) {
                                                                                     l6 = l6 - l4;
                                                                                     b.e("KgiCloudRp#checkToRequestDialog : check === > delay time = "+l6+c, false, 2, null);
                                                                                     handler.postDelayed(new b(new KgiCloudRpManager$checkToRequestDialog$5(obj)), l6);
                                                                                     break ;
                                                                                  }
                                                                               }else {
                                                                                  obj.j(list4, l4, handler);
                                                                                  break ;
                                                                               }
                                                                            }
                                                                         }
                                                                      }else {
                                                                         l = l4;
                                                                         list2 = list4;
                                                                         patchProxyRe = patchProxyRe1;
                                                                         kgiCloudRpMa = kgiCloudRpMa1;
                                                                         iterator3 = iterator4;
                                                                      }
                                                                   }
                                                                }else {
                                                                   patchProxyRe1 = patchProxyRe;
                                                                   kgiCloudRpMa1 = kgiCloudRpMa;
                                                                   l4 = l;
                                                                }
                                                                obj8 = null;
                                                                goto label_0403 ;
                                                             }else {
                                                                list4 = list2;
                                                                l4 = l;
                                                                obj7 = 0;
                                                                goto label_0416 ;
                                                             }
                                                          }
                                                       }
                                                    }
                                                    list3 = CollectionsKt__CollectionsKt.E();
                                                    goto label_01b5 ;
                                                 }
                                              }
                                           }
                                        }
                                     }
                                     list2 = null;
                                     goto label_0126 ;
                                  }else {
                                     b1 = b1 + 1;
                                  }
                               }else {
                                  b1 = -1;
                                  goto label_00b8 ;
                               }
                            }
                         }
                      }
                      list = CollectionsKt__CollectionsKt.E();
                      goto label_0084 ;
                   }
                }
                return;
             }
          }
          id = "";
          goto label_0032 ;
       }
    }
    public final long d(long p0){
       return ((((p0 + 0x1b77400) / 0x5265c00) * 0x5265c00) - 0x1b77400);
    }
    public final long e(){
       Object obj = PatchProxy.apply(null, this, KgiCloudRpManager.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       long l = (KgiCloudRpManager.j)? System.currentTimeMillis(): d.a();
       return l;
    }
    public final void g(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KgiCloudRpManager.class, "7")) {
          return;
       }
       if (!SystemUtil.K()) {
          return;
       }
       b.e("KgiCloudRp#"+p1+" : ===>", false, 2, null);
       ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(new Date(iterator.next().longValue()).toString());
       }
       iterator = uArrayList.iterator();
       while (iterator.hasNext()) {
          b.e("KgiCloudRp# : == "+iterator.next(), false, 2, null);
       }
       return;
    }
    public final void h(Map p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KgiCloudRpManager.class, "6")) {
          return;
       }
       if (!SystemUtil.K()) {
          return;
       }
       b.e("KgiCloudRp#"+p1+" : ===>", false, 2, null);
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          String key = uEntry.getKey();
          StringBuilder str = "KgiCloudRp# : == "+key;
          b.e(str+" = "+KgiCloudRpManager.k.l(uEntry.getValue()), false, 2, null);
       }
       return;
    }
    public final void i(){
       String id;
       Object[] objArray1;
       int b1;
       long longx;
       Object[] objArray2;
       String str3;
       Boolean uBoolean;
       String str = String.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KgiCloudRpManager.class, "8")) {
          return;
       }
       if (SystemUtil.K()) {
          QCurrentUser mE = QCurrentUser.ME;
          String str1 = "";
          if (mE != null) {
             id = mE.getId();
             if (id != null) {
             label_0024 :
                k b = k.b;
                String str2 = "KEY_KGI_CLOUD_RP_TEST";
                Boolean fALSE = Boolean.FALSE;
                long l = Integer.MIN_VALUE;
                int i = 0;
                if (!u.S1(str2)) {
                   try{
                      d uod1 = m0.d(fALSE.getClass());
                      if (a.g(uod1, m0.d(Boolean.TYPE))) {
                         fALSE = Boolean.valueOf(b.a().getBoolean(str2, i));
                      }else if(a.g(uod1, m0.d(str))){
                         objArray2 = (!fALSE instanceof String)? objArray: fALSE;
                         if (objArray2 == null) {
                            objArray2 = str1;
                         }
                         str3 = b.a().getString(str2, objArray2);
                         KgiCloudRpConfig$a uoa = (str3 == null || !str3.length())? 1: null;
                         if (!uoa) {
                            if (str3 != null) {
                            }else {
                               throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                         }
                      }else if(a.g(uod1, m0.d(Integer.TYPE))){
                         objArray2 = (!fALSE instanceof Integer)? objArray: fALSE;
                         int i1 = (objArray2 != null)? objArray2.intValue(): Integer.MIN_VALUE;
                         int intx1 = b.a().getInt(str2, i1);
                         if (intx1 != l) {
                            str3 = Integer.valueOf(intx1);
                         }
                      }else if(a.g(uod1, m0.d(Long.TYPE))){
                         objArray2 = (!fALSE instanceof Long)? objArray: fALSE;
                         l = (objArray2 != null)? objArray2.longValue(): Long.MIN_VALUE;
                         longx = b.a().getLong(str2, l);
                         if (longx - Long.MIN_VALUE) {
                            str3 = Long.valueOf(longx);
                         }
                      }else if(a.g(uod1, m0.d(Float.TYPE))){
                         objArray2 = (!fALSE instanceof Float)? objArray: fALSE;
                         float f = (objArray2 != null)? objArray2.floatValue(): Float.MIN_VALUE;
                         float floatx1 = b.a().getFloat(str2, f);
                         if (floatx1 - Float.MIN_VALUE) {
                            str3 = Float.valueOf(floatx1);
                         }
                      }
                      fALSE = str3;
                   }catch(java.lang.Exception e0){
                   }
                   if (!objArray1.length()) {
                      b1 = true;
                   }else {
                      b1 = false;
                   }
                }
             label_0127 :
                if (fALSE.booleanValue()) {
                   Objects.requireNonNull(KgiCloudRpConfig.Companion);
                   KgiCloudRpManager.c.put(id, KgiCloudRpConfig.TEST);
                }
                try{
                   b = k.b;
                   if (!u.S1("KEY_KGI_CLOUD_RP_MOCK")) {
                      d uod = m0.d(str);
                      if (a.g(uod, m0.d(Boolean.TYPE))) {
                         if (b.a().getBoolean("KEY_KGI_CLOUD_RP_MOCK", i)) {
                            objArray1 = Boolean.TRUE;
                         }
                      }else if(a.g(uod, m0.d(str))){
                         objArray1 = b.a().getString("KEY_KGI_CLOUD_RP_MOCK", str1);
                         b1 = (objArray1 == null || !objArray1.length())? true: false;
                         if (!b1) {
                            if (objArray1 != null) {
                            }else {
                               throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                         }
                      }else if(a.g(uod, m0.d(Integer.TYPE))){
                         b1 = Integer.MIN_VALUE;
                         int intx = b.a().getInt("KEY_KGI_CLOUD_RP_MOCK", b1);
                         if (intx != b1) {
                            objArray1 = Integer.valueOf(intx);
                         }
                      }else if(a.g(uod, m0.d(Long.TYPE))){
                         longx = b.a().getLong("KEY_KGI_CLOUD_RP_MOCK", Long.MIN_VALUE);
                         if (longx - Long.MIN_VALUE) {
                            objArray1 = Long.valueOf(longx);
                         }
                      }else if(a.g(uod, m0.d(Float.TYPE))){
                         float floatx = b.a().getFloat("KEY_KGI_CLOUD_RP_MOCK", Float.MIN_VALUE);
                         if (floatx - Float.MIN_VALUE) {
                            objArray1 = Float.valueOf(floatx);
                         }
                      }
                   }
                   objArray1 = objArray;
                }catch(java.lang.Exception e0){
                }
                if (objArray1 == null || u.S1(objArray1)) {
                   i = 1;
                }
                if (!(1 ^ i)) {
                   objArray1 = objArray;
                }
                if (objArray1 != null) {
                   KgiCloudRpConfig kgiCloudRpCo = a.a.h(objArray1, KgiCloudRpConfig.class);
                   if (kgiCloudRpCo != null) {
                      KgiCloudRpManager.c.put(id, kgiCloudRpCo);
                   }
                }
             }
          }
          id = str1;
          goto label_0024 ;
       }
    label_0213 :
       return;
    }
    public final void j(List p0,long p1,Handler p2){
       if (PatchProxy.isSupport(KgiCloudRpManager.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), p2, this, KgiCloudRpManager.class, "11")) {
          return;
       }
       KgiCloudRpConfigItem kgiCloudRpCo = CollectionsKt___CollectionsKt.p2(p0);
       if (kgiCloudRpCo != null) {
          KgiCloudRpConfigItem start = kgiCloudRpCo.start;
          if (start != null) {
             Long longx = this.m(start, p1);
             if (longx != null) {
                long l = longx.longValue() + 0x5265c00;
                b.e("KgiCloudRp#checkToRequestDialog : hit Next = "+this.l(kgiCloudRpCo), false, 2, null);
                if (l - p1 > 0) {
                   l = l - p1;
                   b.e("KgiCloudRp#checkToRequestDialog : check === > delay time = "+l+'}', false, 2, null);
                   p2.postDelayed(new b(new KgiCloudRpManager$postTaskTomorrow$1(this)), l);
                }
             }
          }
       }
       return;
    }
    public final void k(){
       String id;
       int i1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, KgiCloudRpManager.class, "18")) {
          return;
       }
       boolean b = false;
       int i = 2;
       b.e("KgiCloudRp#requestDialog : ===>", b, i, objArray);
       if (b.c()) {
          b.e("KgiCloudRp#requestDialog : DO NOTHING is collect data !!! ===>", b, i, objArray);
          return;
       }else {
          long l = this.e();
          QCurrentUser mE = QCurrentUser.ME;
          if (mE != null) {
             id = mE.getId();
             if (id != null) {
             label_0030 :
                ConcurrentHashMap e = KgiCloudRpManager.e;
                ArrayList uArrayList = e.get(id);
                if (uArrayList == null) {
                   uArrayList = new ArrayList();
                   Object obj1 = e.putIfAbsent(id, uArrayList);
                   if (obj1 != null) {
                      uArrayList = obj1;
                   }
                }
                uArrayList.add(Long.valueOf(l));
                b.e("KgiCloudRp#requestDialog : requestList size ===> "+uArrayList.size(), b, i, objArray);
                KgiCloudRpConfig kgiCloudRpCo = KgiCloudRpManager.c.get(id);
                if (kgiCloudRpCo != null) {
                   Integer integer = Integer.valueOf(kgiCloudRpCo.apiEventType);
                   if (integer.intValue() > 0) {
                      b = true;
                   }
                   if (b) {
                      objArray = integer;
                   }
                   if (objArray != null) {
                      i1 = objArray.intValue();
                   label_0088 :
                      h.d(l, i1);
                      Object obj = b.a(-1257347683);
                      a.o(obj, "Singleton.get\(GrowthApi::class.java\)");
                      obj.b().i(i1).subscribe(new KgiCloudRpManager$d(l, i1), KgiCloudRpManager$e.b);
                      return;
                   }
                }
                i1 = 5;
                goto label_0088 ;
             }
          }
          id = "";
          goto label_0030 ;
       }
    }
    public final String l(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, KgiCloudRpManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = a.a.q(p0);
       return p0;
    }
    public final Long m(String p0,long p1){
       Date obj;
       KgiCloudRpManager kgiCloudRpMa = KgiCloudRpManager.class;
       if (PatchProxy.isSupport(kgiCloudRpMa)) {
          obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, kgiCloudRpMa, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0.length() == 5) {
          obj = new Date(p1);
          Date uDate = new SimpleDateFormat("HH:mm").parse(p0);
          if (uDate != null) {
             uDate.setYear(obj.getYear());
             uDate.setMonth(obj.getMonth());
             uDate.setDate(obj.getDate());
             return Long.valueOf(uDate.getTime());
          }
       }
       return null;
    }
    public final void onLogin(l p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KgiCloudRpManager.class, "4")) {
          return;
       }
       b.e("KgiCloudRp#onLogin : ===>", false, 2, null);
       Handler handler = b.d();
       handler.removeCallbacks(new b(new KgiCloudRpManager$onLogin$1(this)));
       handler.removeCallbacks(new b(new KgiCloudRpManager$onLogin$2(this)));
       b.e("KgiCloudRp#onLogin : ===> clear task and check again !!!", false, 2, null);
       this.c();
       return;
    }
}
