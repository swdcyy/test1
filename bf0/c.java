package bf0.c;
import bf0.e;
import java.lang.String;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpManager;
import java.util.Objects;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpSwitchConfig;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.kwai.sdk.eve.proto.CustomEvent$Builder;
import com.kwai.sdk.eve.proto.CustomEvent;
import qrd.l1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import ye0.d;
import org.json.JSONObject;
import java.lang.Throwable;
import ye0.a;
import com.kuaishou.growth.pendant.realtime.price.core.PrtpReportSwitchConfig;
import java.util.ArrayList;
import ekd.k1;
import com.kuaishou.growth.pendant.realtime.price.feature.a;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import xe0.b;
import bf0.g;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.StringBuilder;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import com.kuaishou.growth.pendant.realtime.price.feature.PrtpFeatureManager$save$timesSession$1;
import java.lang.Long;
import com.yxcorp.utility.SystemUtil;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Integer;
import java.util.Map$Entry;
import ue0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public final class c extends e	// class@000366
{

    public void c(){
       super("Prtp-thread-feature");
    }
    public void b(Message p0){
       d d;
       float f;
       String id;
       ConcurrentHashMap c;
       ConcurrentHashMap this;
       b orDefault;
       long l;
       b a;
       Set obj4;
       String str5;
       String str6;
       Integer integer;
       Map$Entry obj6;
       String key;
       HashMap hashMap1;
       Object obj7;
       Message obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, c.class, "1")) {
          return;
       }
       a.p(obj, "msg");
       Message what = obj.what;
       String str = "";
       String str1 = 2;
       int i = 1;
       boolean b = false;
       StringBuilder obj1 = null;
       if (what != i) {
          if (what == str1) {
             obj = obj.obj;
             if (obj != null) {
                String str2 = obj.toString();
                if (str2 != null) {
                   str = str2;
                }
             }
             PrtpManager z = PrtpManager.z;
             Objects.requireNonNull(z);
             if (PrtpManager.l) {
                PrtpSwitchConfig prtpSwitchCo = z.k();
                if (prtpSwitchCo != null && prtpSwitchCo.enable == i) {
                   CustomEvent$Builder uBuilder = CustomEvent.newBuilder();
                   uBuilder.setCustomKey("GrowthRealtimePriceInfer");
                   uBuilder.setCustomValue(str);
                   GeneratedMessageLite generatedMes = uBuilder.build();
                   a.o(generatedMes, "CustomEvent.newBuilder\(\)¡­rom\n            }.build\(\)");
                   EveManagerWrapper.e.n(generatedMes);
                   d = d.d;
                   Objects.requireNonNull(d);
                   if (!PatchProxy.applyVoidOneRefs(str, d, d.class, "8")) {
                      a.p(str, "from");
                      JSONObject jSONObject = new JSONObject();
                      d.f(jSONObject);
                      jSONObject.put("inferFrom", str);
                      z = PrtpManager.z;
                      d.d(d, z.i().reportMergeKeys, z.i().reportMerge, "prtp_post_infer_event", jSONObject, null, 16, null);
                   }
                }else {
                   PrtpSwitchConfig prtpSwitchCo1 = z.k();
                   prtpSwitchCo1 = (prtpSwitchCo1 != null)? prtpSwitchCo1.samplingRate: 0;
                   if (k1.l(prtpSwitchCo1)) {
                      JSONObject jSONObject1 = a.c(a.e, null, null, null, null, 8, null);
                      if (jSONObject1 != null) {
                         d.d.h(jSONObject1);
                      }
                   }
                }
             }
          }
       }else {
          b uob = g.a(p0);
          if (uob != null) {
             a e = a.e;
             Objects.requireNonNull(e);
             String str3 = "actionMapSession";
             if (!PatchProxy.applyVoidOneRefs(uob, e, a.class, "2")) {
                a.p(uob, "feature");
                QCurrentUser mE = QCurrentUser.ME;
                if (mE != null) {
                   id = mE.getId();
                   if (id != null) {
                   label_00f1 :
                      a.f("PrtpFeatureManager#save : "+"uid = "+id+", "+"action = "+uob.a+", "+"value = "+uob.c+", "+"timestamp = "+uob.b, b, str1, obj1);
                      c = a.c;
                      this = c.get(id);
                      if (this == null) {
                         super();
                         obj7 = c.putIfAbsent(id, this);
                         if (obj7 != null) {
                            this = obj7;
                         }
                      }
                      try{
                         a.o(this, str3);
                         orDefault = this.getOrDefault(uob.a, PrtpFeatureManager$save$timesSession$1.INSTANCE);
                         if (!orDefault instanceof Long) {
                            obj7 = obj1;
                         }
                         l = (obj7 != null)? obj7.longValue(): 0;
                      }catch(java.lang.Exception e0){
                      }
                      a.o(this, str3);
                      this.put(e0.a, Long.valueOf((l + e0.c)));
                      c = a.a;
                      ConcurrentHashMap uConcurrentH = c.get(id);
                      if (uConcurrentH == null) {
                         uConcurrentH = new ConcurrentHashMap();
                         obj7 = c.putIfAbsent(id, uConcurrentH);
                         if (obj7 != null) {
                            uConcurrentH = obj7;
                         }
                      }
                      a.o(uConcurrentH, "actionMap");
                      orDefault = e0.a;
                      ArrayList uArrayList = uConcurrentH.get(orDefault);
                      if (uArrayList == null) {
                         uArrayList = new ArrayList();
                         obj7 = uConcurrentH.putIfAbsent(orDefault, uArrayList);
                         if (obj7 != null) {
                            uArrayList = obj7;
                         }
                      }
                      c = a.b;
                      Object obj2 = c.get(id);
                      if (obj2 == null) {
                         ConcurrentHashMap uConcurrentH1 = new ConcurrentHashMap();
                         obj2 = c.putIfAbsent(id, uConcurrentH1);
                         if (obj2 == null) {
                            obj2 = uConcurrentH1;
                         }
                      }
                      Long obj3 = obj2;
                      a.o(obj3, "actionValueMap");
                      a = e0.a;
                      obj2 = obj3.get(a);
                      if (obj2 != null) {
                         obj4 = obj2;
                      }else {
                         ArrayList uArrayList2 = new ArrayList();
                         obj4 = obj3.putIfAbsent(a, uArrayList2);
                         if (obj4 == null) {
                            obj4 = uArrayList2;
                         }
                      }
                      if (uArrayList.size() != obj4.size()) {
                         uArrayList.clear();
                         obj4.clear();
                         a.c("PrtpFeatureManager#save : clear uid = "+id+", action = "+e0.a, obj1, b, 6, obj1);
                      }
                      uArrayList.add(Long.valueOf(e0.b));
                      obj4.add(Long.valueOf(e0.c));
                      String str4 = " = ";
                      if (SystemUtil.I()) {
                         str1 = "";
                         obj4 = this.keySet();
                         a.o(obj4, "actionMapSession.keys");
                         Iterator iterator = obj4.iterator();
                         while (iterator.hasNext()) {
                            str5 = iterator.next();
                            str1 = str1+"\n "+str5+str4+this.get(str5);
                            boolean b1 = false;
                         }
                         str1 = str1;
                      }else {
                         str1 = str;
                      }
                      a.o(str1, "if \(SystemUtil.isDebug\(\)¡­ {\n      \"\"\n    } else \"\"");
                      if (SystemUtil.I()) {
                         obj1 = "";
                         obj4 = uConcurrentH.keySet();
                         a.o(obj4, "actionMap.keys");
                         Iterator iterator1 = obj4.iterator();
                         while (iterator1.hasNext()) {
                            str5 = iterator1.next();
                            Iterator iterator2 = iterator1;
                            str = "\n "+str5+str4;
                            Object obj5 = obj3;
                            obj3 = obj3.get(str5);
                            if (obj3 != null) {
                               str6 = str4;
                               a.o(obj3, "it");
                               i = obj3.isEmpty() ^ 0x01;
                               if (!i) {
                                  obj6 = null;
                               }
                               if (obj3 != null) {
                                  obj3 = Long.valueOf(CollectionsKt___CollectionsKt.p5(obj3));
                               }else {
                               label_02dc :
                                  ArrayList uArrayList1 = uConcurrentH.get(str5);
                                  if (uArrayList1 != null) {
                                     integer = Integer.valueOf(uArrayList1.size());
                                  }else {
                                     integer = null;
                                  }
                               }
                            }else {
                               str6 = str4;
                               int i1 = 1;
                               goto label_02dc ;
                            }
                            obj1 = obj1+str+obj3;
                            iterator1 = iterator2;
                            str4 = str6;
                            obj3 = obj5;
                         }
                         str = obj1;
                      }else {
                         str = str;
                      }
                      a.o(str, "if \(SystemUtil.isDebug\(\)¡­ {\n      \"\"\n    } else \"\"");
                      a.f("PrtpFeatureManager#save : "+"uid = "+id+", "+"action = "+e0.a+", "+"timesSession = "+this.get(e0.a)+"\n actionMapSession ==== "+str1+"\n actionMap ==== "+str, false, 2, null);
                      HashMap hashMap = new HashMap();
                      Iterator iterator3 = a.a.entrySet().iterator();
                      while (iterator3.hasNext()) {
                         obj6 = iterator3.next();
                         key = obj6.getKey();
                         hashMap1 = new HashMap();
                         hashMap1.putAll(obj6.getValue());
                         hashMap.put(key, hashMap1);
                      }
                      SharedPreferences$Editor uEditor = a.a.edit();
                      uEditor.putString("prtpUserFeatureMap", b.e(hashMap));
                      g.a(uEditor);
                      hashMap = new HashMap();
                      iterator3 = a.b.entrySet().iterator();
                      while (iterator3.hasNext()) {
                         obj6 = iterator3.next();
                         key = obj6.getKey();
                         hashMap1 = new HashMap();
                         hashMap1.putAll(obj6.getValue());
                         hashMap.put(key, hashMap1);
                      }
                      uEditor = a.a.edit();
                      uEditor.putString("prtpUserFeatureValueMap", b.e(hashMap));
                      g.a(uEditor);
                   }
                }
                id = str;
                goto label_00f1 ;
             }
          }
       }
    label_03e9 :
       return;
    }
}
