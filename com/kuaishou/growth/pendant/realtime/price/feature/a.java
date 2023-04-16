package com.kuaishou.growth.pendant.realtime.price.feature.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.Object;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xe0.a;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.Throwable;
import ye0.a;
import org.json.JSONArray;
import java.lang.Long;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Integer;
import we0.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.CommonMeta;
import java.lang.Iterable;
import com.kuaishou.android.model.mix.SortFeature;
import java.lang.CharSequence;
import zsd.u;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.Float;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.collections.CollectionsKt___CollectionsKt;
import xe0.f;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import zsd.t;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpActivityConfig;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpRatioRangeConfig;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedManager;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig;
import com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedSwitchConfig;
import xe0.b;
import nsd.r0;
import java.util.Arrays;

public final class a	// class@0006be
{
    public static ConcurrentHashMap a;
    public static ConcurrentHashMap b;
    public static ConcurrentHashMap c;
    public static final CopyOnWriteArrayList d;
    public static final a e;

    static {
       a.e = new a();
       a.a = new ConcurrentHashMap();
       a.b = new ConcurrentHashMap();
       a.c = new ConcurrentHashMap();
       a.d = new CopyOnWriteArrayList();
    }
    public void a(){
       super();
    }
    public static JSONObject c(a p0,Map p1,HashMap p2,List p3,JSONObject p4,int p5,Object p6){
       JSONObject jSONObject;
       Map map = p1;
       Objects.requireNonNull(p0);
       JSONObject obj = PatchProxy.applyFourRefs(p1, p2, p3, null, p0, a.class, "3");
       if (obj != PatchProxyResult.class) {
          jSONObject = obj;
       }else {
          JSONObject jSONObject1 = new JSONObject();
          obj = jSONObject1.optJSONObject("state");
          if (obj == null) {
             obj = new JSONObject();
          }
          JSONObject jSONObject2 = obj;
          a uoa = new a();
          HashMap hashMap = (p2 != null)? p2: new HashMap();
          if (map) {
             hashMap.putAll(map);
          }
          HashMap hashMap1 = uoa.a(hashMap);
          hashMap1.putAll(a.e.b());
          hashMap.putAll(hashMap1);
          Iterator iterator = hashMap1.entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             String key = uEntry.getKey();
             jSONObject2.put(key, uEntry.getValue());
          }
          jSONObject1.put("state", jSONObject2);
          jSONObject1.put("flow", p0.d(uoa.a, uoa.b, p1, hashMap, p3));
          jSONObject = jSONObject1;
       }
       return jSONObject;
    }
    public final long a(String p0,String p1,long p2){
       ConcurrentHashMap obj;
       int this;
       ArrayList uArrayList1;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Long.valueOf(p2), this, a.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       obj = a.a.get(p0);
       long l = 0;
       if (obj != null) {
          a.o(obj, "mUserFeatureMap[uid] ?: return 0");
          ConcurrentHashMap uConcurrentH = a.b.get(p0);
          ArrayList uArrayList = obj.get(p1);
          if (uArrayList != null) {
             a.o(uArrayList, "actionMap[action] ?: return 0");
             long l1 = 0;
             this = 0;
             int i = 1;
             if (uConcurrentH != null) {
                uArrayList1 = uConcurrentH.get(p1);
                if (uArrayList1 != null) {
                   Iterator iterator = (uArrayList1.size() == uArrayList.size())? 1: null;
                   if (iterator) {
                   label_0066 :
                      iterator = uArrayList.iterator();
                      int i1 = 0;
                      while (true) {
                         if (iterator.hasNext()) {
                            boolean b = (iterator.next().longValue() - p2 >= 0)? true: false;
                            if (b) {
                            label_0089 :
                               Integer integer = Integer.valueOf(i1);
                               int i2 = (integer.intValue() >= 0)? 1: 0;
                               if (!i2) {
                                  integer = l1;
                               }
                               if (integer) {
                                  int i3 = integer.intValue();
                                  if (uArrayList1) {
                                     i2 = uArrayList1.size();
                                     for (; i3 < i2; i3++) {
                                        Object obj1 = uArrayList1.get(i3);
                                        a.o(obj1, "valueArray[i]");
                                        l = l + obj1.longValue();
                                     }
                                     return l;
                                  }else {
                                     Integer integer1 = Integer.valueOf((uArrayList.size() - i3));
                                     if (integer1.intValue() < 0) {
                                        i = 0;
                                     }
                                     if (i) {
                                        l1 = integer1;
                                     }
                                     if (l1 != null) {
                                        this = l1.intValue();
                                        break ;
                                     }
                                     break ;
                                  }
                               }
                            }else {
                               i1 = i1 + 1;
                            }
                         }else {
                            i1 = -1;
                            goto label_0089 ;
                         }
                      }
                      return (long)this;
                   }
                }
             }
             uArrayList1 = l1;
             goto label_0066 ;
          }
       }
       return l;
    }
    public final HashMap b(){
       Object[] objArray1;
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       QPhoto qPhoto = q.b.a();
       if (qPhoto != null) {
          CommonMeta commonMeta = qPhoto.getCommonMeta();
          if (commonMeta != null) {
             commonMeta = commonMeta.mSortFeatures;
             if (commonMeta != null) {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = commonMeta.iterator();
                while (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   SortFeature obj2 = obj1;
                   obj2 = (obj2 != null)? obj2.mName: objArray;
                   int i = (obj2 == null || u.S1(obj2))? 1: 0;
                   i = i ^ 1;
                   if (i) {
                      uArrayList.add(obj1);
                   }
                }
                Iterator iterator1 = uArrayList.iterator();
                while (iterator1.hasNext()) {
                   SortFeature sortFeature = iterator1.next();
                   obj.put("growth_p_"+sortFeature.mName, Float.valueOf(sortFeature.mValue));
                }
             }
          }
          String str = r1.M0(qPhoto.mEntity);
          if (str == null) {
             str = "";
          }
          a.o(str, "FeedExt.getExpTag\(curPhoto.mEntity\) ?: \"\"");
          obj.put("growth_p_exp_tag", str);
          obj.put("growth_p_index", Integer.valueOf(qPhoto.getPositionInPage()));
       }
       return obj;
    }
    public final JSONArray d(long p0,long p1,Map p2,HashMap p3,List p4){
       QCurrentUser obj1;
       String id;
       int i5;
       Iterator iterator;
       long l4;
       String str6;
       String str7;
       Long longx;
       long l7;
       Integer f;
       String str8;
       int i8;
       float f1;
       int i9;
       String id1;
       PrtpActivityConfig prtpActivity;
       PrtpRatioRangeConfig minRatio;
       String obj8;
       Object obj9;
       Object obj10;
       long l9;
       String obj = this;
       object oobject = p2;
       object oobject1 = p3;
       object oobject2 = p4;
       String str = "PrtpFeatureManager#obtainUserFeatures : ";
       PrtpManager prtpManager = PrtpManager.class;
       a uoa = a.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       int i = 2;
       int i1 = 4;
       int i2 = 1;
       int i3 = 0;
       String str1 = "4";
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Long.valueOf(p0),Long.valueOf(p1),oobject,oobject1,oobject2};
          obj1 = PatchProxy.apply(objArray, obj, uoa, str1);
          if (obj1 != patchProxyRe) {
             return obj1;
          }
       }
       obj1 = QCurrentUser.ME;
       String str2 = "";
       if (obj1 != null) {
          id = obj1.getId();
          if (id != null) {
          label_0049 :
             CopyOnWriteArrayList d = a.d;
             HashMap hashMap = CollectionsKt___CollectionsKt.e3(d);
             String str3 = "u_id";
             if (hashMap == null || (a.g(hashMap.get(str3), id) ^ i2)) {
                hashMap = new HashMap();
                d.add(hashMap);
             }
             hashMap.clear();
             long l = 0x1b77400;
             long l1 = 0x5265c00;
             long l2 = (((p1 + l) / l1) * l1) - l;
             if (oobject != null) {
                oobject1.putAll(oobject);
             }
             f uof = new f();
             f uof1 = f.class;
             String str4 = str2;
             HashMap hashMap1 = PatchProxy.applyOneRefs(oobject1, uof, uof1, "15");
             String str5 = str;
             str = "6";
             int i4 = -1;
             long l3 = l2;
             if (hashMap1 != patchProxyRe) {
             }else {
                hashMap1 = new HashMap();
                String str9 = "u_age_segment";
                String str10 = "USER_PROFILE";
                Object obj3 = oobject1.get(str9);
                if (obj3 == null) {
                   Object obj11 = PatchProxy.apply(null, uof, uof1, "1");
                   obj3 = (obj11 != patchProxyRe)? obj11: String.valueOf(EveManagerWrapper.e.g(str10, str9));
                }
             label_00c7 :
                hashMap1.put(str9, obj3);
                long l8 = -1;
                obj = "u_register_age";
                Long longx2 = oobject1.get(obj);
                if (longx2 == null) {
                   obj10 = PatchProxy.apply(null, uof, uof1, "2");
                   if (obj10 != patchProxyRe) {
                      l9 = obj10.longValue();
                   }else {
                      longx2 = t.Z0(String.valueOf(EveManagerWrapper.e.g(str10, obj)));
                      l9 = (longx2 != null)? longx2.longValue(): l8;
                   }
                   longx2 = Long.valueOf(l9);
                }
                hashMap1.put(obj, longx2);
                obj = "u_photo_play_duration_7d";
                longx2 = oobject1.get(obj);
                if (longx2 == null) {
                   obj10 = PatchProxy.apply(null, uof, uof1, "3");
                   if (obj10 != patchProxyRe) {
                      l9 = obj10.longValue();
                   }else {
                      longx2 = t.Z0(String.valueOf(EveManagerWrapper.e.g(str10, obj)));
                      l9 = (longx2 != null)? longx2.longValue(): l8;
                   }
                   longx2 = Long.valueOf(l9);
                }
                hashMap1.put(obj, longx2);
                obj = "u_online_timeslot_prefer";
                QCurrentUser obj4 = oobject1.get(obj);
                if (obj4 == null) {
                   obj9 = PatchProxy.apply(null, uof, uof1, str1);
                   obj8 = (obj9 != patchProxyRe)? obj9: String.valueOf(EveManagerWrapper.e.g(str10, obj));
                }
             label_015a :
                hashMap1.put(obj, obj4);
                obj = "u_live_timeslot_prefer";
                obj4 = oobject1.get(obj);
                if (obj4 == null) {
                   str8 = PatchProxy.apply(null, uof, uof1, "5");
                   if (str8 != patchProxyRe) {
                   }else {
                      str8 = String.valueOf(EveManagerWrapper.e.g(str10, obj));
                   }
                }
                hashMap1.put(obj, obj4);
                obj = "u_photo_timeslot_prefer";
                obj4 = oobject1.get(obj);
                if (obj4 == null) {
                   obj9 = PatchProxy.apply(null, uof, uof1, str);
                   str8 = (obj9 != patchProxyRe)? obj9: String.valueOf(EveManagerWrapper.e.g(str10, obj));
                }
             label_019d :
                hashMap1.put(obj, obj4);
                obj = "u_category_level_1_pay_order_cnt_map_30d";
                obj4 = oobject1.get(obj);
                if (obj4 == null) {
                   str8 = PatchProxy.apply(null, uof, uof1, "7");
                   if (str8 != patchProxyRe) {
                   }else {
                      str8 = String.valueOf(EveManagerWrapper.e.g(str10, obj));
                   }
                }
                hashMap1.put(obj, obj4);
                obj = "u_last_pay_order_time";
                longx2 = oobject1.get(obj);
                if (longx2 == null) {
                   obj8 = PatchProxy.apply(null, uof, uof1, "8");
                   if (obj8 != patchProxyRe) {
                      l8 = obj8.longValue();
                   }else {
                      longx2 = t.Z0(String.valueOf(EveManagerWrapper.e.g(str10, obj)));
                      if (longx2 != null) {
                         l8 = longx2.longValue();
                      }
                   }
                   longx2 = Long.valueOf(l8);
                }
                hashMap1.put(obj, longx2);
                Map$Entry obj5 = PatchProxy.apply(null, uof, uof1, "9");
                if (obj5 != patchProxyRe) {
                   i8 = obj5.intValue();
                }else {
                   Integer integer = PrtpManager.z.d();
                   i8 = (integer != null)? integer.intValue(): -1;
                }
                hashMap1.put("u_k", Integer.valueOf(i8));
                obj = "10";
                PrtpRatioRangeConfig obj6 = PatchProxy.apply(null, uof, uof1, obj);
                if (obj6 != patchProxyRe) {
                   f1 = obj6.floatValue();
                }else {
                   obj4 = QCurrentUser.ME;
                   if (obj4 != null) {
                      str8 = obj4.getId();
                      if (str8 != null) {
                      label_023a :
                         f1 = PrtpManager.e(str8);
                      }
                   }
                   str8 = str4;
                   goto label_023a ;
                }
                hashMap1.put("u_pid", Float.valueOf(f1));
                obj4 = PatchProxy.apply(null, uof, uof1, "11");
                str10 = 0xbf800000;
                if (obj4 != patchProxyRe) {
                   f1 = obj4.floatValue();
                }else {
                   prtpActivity = PrtpManager.z.c();
                   if (prtpActivity != null) {
                      prtpActivity = prtpActivity.prtpRatioRangeConfig;
                      if (prtpActivity != null) {
                         minRatio = prtpActivity.minRatio;
                      }
                   }
                   minRatio = 0xbf800000;
                }
                hashMap1.put("m_low", Float.valueOf(f1));
                obj4 = PatchProxy.apply(null, uof, uof1, "12");
                if (obj4 != patchProxyRe) {
                   f1 = obj4.floatValue();
                }else {
                   prtpActivity = PrtpManager.z.c();
                   if (prtpActivity != null) {
                      prtpActivity = prtpActivity.prtpRatioRangeConfig;
                      if (prtpActivity != null) {
                         obj6 = prtpActivity.maxRatio;
                      }
                   }
                   str8 = obj6;
                }
                hashMap1.put("m_high", Float.valueOf(f1));
                obj4 = PatchProxy.apply(null, uof, uof1, "13");
                if (obj4 != patchProxyRe) {
                   i9 = obj4.intValue();
                }else {
                   obj4 = QCurrentUser.ME;
                   if (obj4 != null) {
                      str8 = obj4.getId();
                      if (str8 != null) {
                      label_02b8 :
                         i9 = PrtpManager.j(str8);
                      }
                   }
                   str8 = str4;
                   goto label_02b8 ;
                }
                hashMap1.put("A_start", Integer.valueOf(i9));
                PrtpSpeedManager obj7 = PatchProxy.apply(null, uof, uof1, "14");
                if (obj7 != patchProxyRe) {
                   i5 = obj7.intValue();
                }else {
                   QCurrentUser mE = QCurrentUser.ME;
                   if (mE != null) {
                      id1 = mE.getId();
                      if (id1 != null) {
                      label_02e2 :
                         i5 = PrtpManager.f(id1);
                      }
                   }
                   id1 = str4;
                   goto label_02e2 ;
                }
                hashMap1.put("A_old", Integer.valueOf(i5));
                f = PrtpManager.z.d();
                i5 = (f != null)? f.intValue(): -1;
                hashMap1.put("u_cur_coin_circle", Integer.valueOf(i5));
                obj7 = PrtpSpeedManager.s;
                Objects.requireNonNull(obj7);
                hashMap1.put("u_cur_coin_progress", Float.valueOf(PrtpSpeedManager.m));
                hashMap1.put("u_cur_coin_server_duration_ms", Long.valueOf(((long)PrtpManager.k * 1000)));
                obj5 = PatchProxy.apply(null, obj7, PrtpSpeedManager.class, obj);
                if (obj5 != patchProxyRe) {
                   l7 = obj5.longValue();
                }else {
                   Long longx3 = Long.valueOf(obj7.j((PrtpSpeedManager.n.getFirst().floatValue() - PrtpSpeedManager.o.getFirst().floatValue())));
                   obj = (longx3.longValue() >= 0)? 1: null;
                   if (!obj) {
                      longx3 = null;
                   }
                   if (longx3 != null) {
                      l7 = longx3.longValue();
                   }else {
                      l7 = 0;
                   }
                }
                hashMap1.put("u_cur_coin_progress_realtime_ms", Long.valueOf(l7));
                hashMap1.put("u_last_coin_speed_ratio", Float.valueOf(PrtpSpeedManager.c));
                iterator = p3.entrySet().iterator();
                while (iterator.hasNext()) {
                   obj5 = iterator.next();
                   if (!hashMap1.containsKey(obj5.getKey()) && u.q2(obj5.getKey(), "u_", false, 2, null)) {
                      hashMap1.put(obj5.getKey(), obj5.getValue());
                   }
                }
             }
             hashMap.putAll(hashMap1);
             hashMap.put(str3, id);
             hashMap.put("u_current_timestamp", Long.valueOf(p0));
             hashMap.put("u_server_timestamp", Long.valueOf(p1));
             hashMap.put("u_coin_amount_last", Integer.valueOf(PrtpManager.f(id)));
             PrtpSwitchConfig obj2 = PatchProxy.applyOneRefs(id, null, prtpManager, "21");
             obj = "uid";
             if (obj2 != patchProxyRe) {
                i5 = obj2.intValue();
             }else {
                a.p(id, obj);
                f = Integer.valueOf(PrtpManager.e);
                str8 = (f.intValue() > 0)? 1: null;
                if (!str8) {
                   f = null;
                }
                if (f != null) {
                   i5 = f.intValue();
                }else {
                   i5 = PrtpManager.j(id);
                }
             }
             hashMap.put("u_coin_amount_last_finish", Integer.valueOf(i5));
             obj2 = PatchProxy.applyOneRefs(id, null, prtpManager, "18");
             if (obj2 != patchProxyRe) {
                i5 = obj2.intValue();
             }else {
                a.p(id, obj);
                f = PrtpManager.h;
                i5 = (f != null)? f.intValue(): -1;
             }
             hashMap.put("u_coin_amount_last_flag", Integer.valueOf(i5));
             obj2 = PatchProxy.applyOneRefs(id, null, prtpManager, "20");
             if (obj2 != patchProxyRe) {
                i5 = obj2.intValue();
             }else {
                a.p(id, obj);
                f = PrtpManager.f;
                if (f != null) {
                   i4 = f.intValue();
                }
                i5 = i4;
             }
             hashMap.put("u_coin_amount_last_finish_flag", Integer.valueOf(i5));
             hashMap.put("u_coin_amount_start", Integer.valueOf(PrtpManager.j(id)));
             obj2 = p4;
             ArrayList uArrayList = PatchProxy.applyOneRefs(obj2, this, uoa, str);
             if (uArrayList != patchProxyRe) {
             }else {
                uArrayList = new ArrayList();
                if (obj2 != null) {
                   iterator = p4.iterator();
                   while (iterator.hasNext()) {
                      str = iterator.next();
                      if (new Regex("u_\\w+_cnt_\\d+min").matches(str)) {
                         String[] stringArray = new String[]{"_"};
                         str = CollectionsKt___CollectionsKt.e3(StringsKt__StringsKt.H4(str, stringArray, false, 0, 6, null));
                         if (str != null) {
                            int i7 = str.length() - 3;
                            str = str.substring(0, i7);
                            a.o(str, "\(this as java.lang.Strin¡­ing\(startIndex, endIndex\)");
                            Long longx1 = t.Z0(str);
                            if (longx1 != null) {
                               l4 = longx1.longValue();
                               if (!uArrayList.contains(Long.valueOf(l4))) {
                                  uArrayList.add(Long.valueOf(l4));
                               }
                            }
                         }
                      }
                   }
                }
             }
             obj2 = PrtpManager.z.k();
             if (obj2 != null) {
                obj2 = obj2.featuresTimeLevels;
                if (obj2 != null) {
                   iterator = obj2.iterator();
                   while (iterator.hasNext()) {
                      l4 = iterator.next().longValue();
                      if (!uArrayList.contains(Long.valueOf(l4))) {
                         uArrayList.add(Long.valueOf(l4));
                      }
                   }
                }
             }
             PrtpSpeedSwitchConfig prtpSpeedSwi = PrtpSpeedManager.s.c();
             if (prtpSpeedSwi != null) {
                prtpSpeedSwi = prtpSpeedSwi.featuresTimeLevels;
                if (prtpSpeedSwi != null) {
                   iterator = prtpSpeedSwi.iterator();
                   while (iterator.hasNext()) {
                      l4 = iterator.next().longValue();
                      if (!uArrayList.contains(Long.valueOf(l4))) {
                         uArrayList.add(Long.valueOf(l4));
                      }
                   }
                }
             }
             Objects.requireNonNull(b.e);
             iterator = b.d.iterator();
             while (iterator.hasNext()) {
                str = iterator.next();
                Object[] objArray1 = new Object[1];
                int i6 = 0;
                objArray1[i6] = str;
                str6 = String.format("u_%s_cnt_today", Arrays.copyOf(objArray1, 1));
                a.o(str6, "java.lang.String.format\(format, *args\)");
                long l5 = l3;
                hashMap.put(str6, Long.valueOf(a.e.a(id, str, l5)));
                objArray1 = new Object[1];
                objArray1[i6] = str;
                str7 = String.format("u_%s_cnt_current_session", Arrays.copyOf(objArray1, 1));
                a.o(str7, "java.lang.String.format\(format, *args\)");
                ConcurrentHashMap uConcurrentH = a.c.get(id);
                if (uConcurrentH != null) {
                   longx = uConcurrentH.get(str);
                   if (longx != null) {
                   label_05ba :
                      a.o(longx, "mUserFeatureMapSession[u\x20\x02t\(action\)\n          ?: 0L\x00");
                      hashMap.put(str7, longx);
                      Iterator iterator1 = uArrayList.iterator();
                      while (iterator1.hasNext()) {
                         long l6 = iterator1.next().longValue();
                         l = 0xea60 * l6;
                         l7 = p1 - l;
                         i2 = 2;
                         Object[] objArray2 = new Object[i2];
                         objArray2[0] = str;
                         objArray2[1] = Long.valueOf(l6);
                         str6 = String.format("u_%s_cnt_%smin", Arrays.copyOf(objArray2, i2));
                         a.o(str6, "java.lang.String.format\(format, *args\)");
                         hashMap.put(str6, Long.valueOf(a.e.a(id, str, l7)));
                         iterator = iterator;
                      }
                      l3 = l5;
                   }
                }
                longx = Long.valueOf(0);
                goto label_05ba ;
             }
             oobject1.putAll(hashMap);
             super();
             Iterator iterator2 = a.d.iterator();
             while (iterator2.hasNext()) {
                HashMap hashMap2 = iterator2.next();
                try{
                   JSONObject jSONObject = new JSONObject();
                   Set set = hashMap2.entrySet();
                   a.o(set, "featureMap.entries");
                   Iterator iterator3 = set.iterator();
                   while (iterator3.hasNext()) {
                      Map$Entry uEntry = iterator3.next();
                      str7 = uEntry.getKey();
                      jSONObject.put(str7, uEntry.getValue());
                      str6 = str5;
                      str5 = str6;
                   }
                   str6 = str5;
                   this.put(jSONObject);
                   str7 = null;
                }catch(java.lang.Exception e0){
                   str6 = str5;
                   a.c(str6, e0, false, 4, null);
                }
                str5 = str6;
             }
             return this;
          }
       }
       id = str2;
       goto label_0049 ;
    }
}
