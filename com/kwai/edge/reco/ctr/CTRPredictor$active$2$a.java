package com.kwai.edge.reco.ctr.CTRPredictor$active$2$a;
import erd.g;
import java.lang.Object;
import sm7.l;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.edge.reco.ctr.CTRPredictor;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.yxcorp.utility.Log;
import com.kwai.sdk.eve.InferenceState;
import java.util.Map;
import java.lang.Throwable;
import java.lang.StringBuilder;
import ml5.a;
import java.lang.Long;
import zsd.t;
import trd.t0;
import com.kwai.sdk.eve.proto.CustomEvent;
import fg6.a;
import qj5.b;
import com.google.gson.Gson;
import com.kwai.edge.reco.ctr.model.CTRTriggerCustomValue;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import com.kwai.edge.reco.ctr.config.CtrPredictionRuntimeConfig;
import com.kwai.edge.reco.ctr.config.CTRPredictConfig;
import java.util.List;
import java.lang.Iterable;
import qj5.e;
import java.util.concurrent.ConcurrentHashMap;
import msd.l;
import java.lang.Number;
import java.lang.Boolean;
import qrd.l1;
import java.util.LinkedHashMap;
import qj5.c;
import wn7.j;
import com.kwai.sdk.eve.internal.statistics.inference.ProcessorInfo;
import qj5.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import com.kwai.edge.reco.ctr.CTRPredictor$handler$2$a;
import android.os.Handler;
import android.os.Message;

public final class CTRPredictor$active$2$a implements g	// class@000d31
{
    public static final CTRPredictor$active$2$a b;

    static {
       CTRPredictor$active$2$a.b = new CTRPredictor$active$2$a();
    }
    public void CTRPredictor$active$2$a(){
       super();
    }
    public void accept(Object p0){
       Map map;
       a uoa1;
       Map map1;
       Object obj1;
       Iterator iterator2;
       l1 ol1;
       l ol1;
       l1 a;
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, CTRPredictor$active$2$a.class, "1")) {
       }else {
          CTRPredictor v = CTRPredictor.v;
          a.o(obj, "it");
          Objects.requireNonNull(v);
          if (!PatchProxy.applyVoidOneRefs(obj, v, CTRPredictor.class, "22")) {
             String str = "CTRPredictor";
             Log.g(str, "onInferResult start run");
             if (obj.g() != InferenceState.SUCCESS) {
                CTRPredictor.b.remove(obj.b());
                CTRPredictor.c.remove(obj.b());
                CTRPredictor.d.remove(obj.b());
             }
             String str1 = " result:";
             String str2 = " state:";
             if (obj.a() != null) {
                Log.e(str, "onInferResult with error not null"+", id:"+obj.b()+str2+obj.g()+str1+obj.f(), obj.a());
             }else {
                a uoa = obj.f();
                String str3 = (uoa != null)? uoa.g(): null;
                str3 = (str3 == null || !str3.length())? 1: null;
                if (str3) {
                   Log.d(str, "onInferResult with empty result, id:"+obj.b()+str2+obj.g());
                }else if(t.Z0(obj.b()) == null){
                   Log.d(str, "onInferResult id:"+obj.b()+" not time type"+", state:"+obj.g()+str1+obj.f());
                }else {
                   try{
                      uoa = obj.f();
                      if (uoa != null) {
                         map = uoa.d();
                         if (map != null) {
                            map = map.get("result_map");
                         label_0126 :
                            if (!map instanceof Map) {
                               map = null;
                            }
                         }
                      }
                      map = null;
                      goto label_0126 ;
                   }catch(java.lang.Exception e0){
                      map = null;
                   }
                   if (map == null) {
                      map = t0.z();
                   }
                   try{
                      uoa1 = e0.f();
                      if (uoa1 != null) {
                         map1 = uoa1.d();
                         if (map1 != null) {
                            map1 = map1.get("result_with_extra_info_map");
                         label_014a :
                            if (!map1 instanceof Map) {
                               map1 = null;
                            }
                         }
                      }
                      map1 = null;
                      goto label_014a ;
                   }catch(java.lang.Exception e0){
                      map1 = null;
                   }
                   if (map1 == null) {
                      map1 = t0.z();
                   }
                   a uoa2 = e0.h();
                   if (uoa2 != null) {
                      Map map2 = uoa2.d();
                      if (map2 != null) {
                         obj1 = map2.get("protoData");
                      label_016e :
                         if (!obj1 instanceof CustomEvent) {
                            obj1 = null;
                         }
                         str2 = (obj1 != null)? obj1.getCustomValue(): null;
                         int i = (str2 != null)? a.a.h(str2, b.class).a().a(): 0;
                         Iterator iterator = map.entrySet().iterator();
                         while (iterator.hasNext()) {
                            Map$Entry uEntry = iterator.next();
                            Iterator iterator1 = CTRPredictor.v.l().d().c().iterator();
                            while (iterator1.hasNext()) {
                               e uoe = iterator1.next();
                               if (a.g(uoe.a(), uEntry.getKey())) {
                                  l ol = CTRPredictor.j.get(uoe.a());
                                  if (ol != null) {
                                     iterator2 = iterator;
                                     boolean b = (uEntry.getValue().doubleValue() - uoe.score > 0)? true: false;
                                     ol1 = ol.invoke(Boolean.valueOf(b));
                                  }else {
                                     iterator2 = iterator;
                                  }
                                  LinkedHashMap linkedHashMa = new LinkedHashMap();
                                  iterator = uoe.multiTargetScores.entrySet().iterator();
                                  while (iterator.hasNext()) {
                                     Map$Entry uEntry1 = iterator.next();
                                     Object key = uEntry1.getKey();
                                     boolean b1 = (uEntry.getValue().doubleValue() - uEntry1.getValue().doubleValue() > 0)? true: false;
                                     linkedHashMa.put(key, Boolean.valueOf(b1));
                                  }
                                  ol1 = CTRPredictor.l.get(uoe.a());
                                  if (ol1 != null) {
                                     ol1 = ol1.invoke(linkedHashMa);
                                  }
                                  double d = uEntry.getValue().doubleValue();
                                  map = map1.get(uEntry.getKey());
                                  if (!map instanceof Map) {
                                     map = null;
                                  }
                                  c uoc = new c(d, i, map);
                                  ol1 = CTRPredictor.k.get(uoe.a());
                                  if (ol1 != null) {
                                     ol1 = ol1.invoke(uoc);
                                  }
                                  iterator = iterator2;
                               }
                            }
                         }
                         String str4 = e0.b();
                         LinkedHashMap linkedHashMa1 = new LinkedHashMap();
                         map1 = e0.e();
                         if (map1 != null) {
                            Set set = map1.entrySet();
                            if (set != null) {
                               Iterator iterator3 = set.iterator();
                               while (iterator3.hasNext()) {
                                  Map$Entry uEntry2 = iterator3.next();
                                  Map obj2 = uEntry2.getValue().a();
                                  if (!obj2 instanceof a) {
                                     obj2 = null;
                                  }
                                  if (obj2 != null) {
                                     obj2 = obj2.d();
                                     if (obj2 != null) {
                                        linkedHashMa1.putAll(obj2);
                                     }
                                  }
                                  Log.d(str, "result of "+uEntry2.getKey()+" is not map"+", result:"+a.a.q(uEntry2.getValue().a()));
                                  a = l1.a;
                                  continue ;
                               }
                               uoa1 = new a(str4, i, linkedHashMa1);
                               Gson a1 = a.a;
                               uoa = e0.f();
                               map = (uoa != null)? uoa.d(): null;
                               Log.g(str, "onInferResult finish: "+a1.q(map));
                               if (!CTRPredictor.b.containsKey(e0.b())) {
                                  Log.d(str, e0.b()+" is not contained in pagesInterval\t pagesInterval.keys:   "+CTRPredictor.b.keySet()+"\t inferResult:  "+e0.b());
                               }else if(v.l().d().recordPagePath != null){
                                  if (!CTRPredictor.q) {
                                     CTRPredictor.q = true;
                                  }
                               }
                               if (v.l().d().d()) {
                                  g.a(CTRPredictor.o.edit().putString("ctrInferResult", a1.q(uoa1)));
                               }else {
                                  v.o().sendMessageDelayed(Message.obtain(v.o(), 917, uoa1), v.l().d().e());
                               }
                            }
                         }
                         Log.d(str, "processorResults is null");
                         goto label_0312 ;
                      }
                   }
                   obj1 = null;
                   goto label_016e ;
                }
             }
          }
       }
       return;
    }
}
