package com.kuaishou.growth.pendant.realtime.price.speed.PrtpSpeedEveWrapper$registerFeatureAccessory$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.proto.CustomEvent;
import ze0.f;
import java.util.Objects;
import ye0.a$a;
import ye0.b;
import java.lang.StringBuilder;
import trd.t0;
import ze0.m;
import java.lang.reflect.Type;
import we0.m;
import java.util.LinkedHashMap;
import ml5.a;
import java.util.Set;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.util.Map$Entry;
import java.lang.CharSequence;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.lang.Throwable;

public final class PrtpSpeedEveWrapper$registerFeatureAccessory$1 extends Lambda implements l	// class@0006c2
{
    public static final PrtpSpeedEveWrapper$registerFeatureAccessory$1 INSTANCE;

    static {
       PrtpSpeedEveWrapper$registerFeatureAccessory$1.INSTANCE = new PrtpSpeedEveWrapper$registerFeatureAccessory$1();
    }
    public void PrtpSpeedEveWrapper$registerFeatureAccessory$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final Map invoke(GeneratedMessageLite p0){
       Map map;
       m obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj1 = PatchProxy.applyOneRefs(obj, this, PrtpSpeedEveWrapper$registerFeatureAccessory$1.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       a.p(obj, "it");
       if (obj instanceof CustomEvent) {
          obj1 = f.d;
          Objects.requireNonNull(obj1);
          map = PatchProxy.applyOneRefs(obj, obj1, f.class, "4");
          if (map != patchProxyRe) {
          }else {
             a$a.f(b.a(), "PrtpSpeedInfer#fillFeatureAccessory : "+obj, false, 2, null);
             if (a.g("prtpSpeedSave", obj.getCustomKey()) ^ 0x01) {
                a$a.f(b.a(), "PrtpSpeedInfer#fillFeatureAccessory : key\("+obj.getCustomKey()+"\) not match and return", false, 2, null);
                map = t0.z();
             }else {
                obj = m.a(obj.getCustomValue(), m.class, null, 4, null);
                if (obj != null) {
                   map = new LinkedHashMap();
                   map.put("session_id", new a(obj.sessionId));
                   map.put("server_duration_ms", new a(obj.serverDurationMs));
                   map.put("duration_realtime_ms", new a(obj.durationRealtimeMs));
                   map.put("start_timestamp", new a(obj.startTimestamp));
                   map.put("end_timestamp", new a(obj.endTimestamp));
                   map.put("end_date", new a(obj.endDate));
                   map.put("end_hour", new a(obj.endHour));
                   a$a uoa = b.a();
                   StringBuilder str = "PrtpSpeedInfer#fillFeatureAccessory : save ===> "+10;
                   Set set = map.entrySet();
                   ArrayList uArrayList = new ArrayList(u.Y(set, 10));
                   Iterator iterator = set.iterator();
                   while (iterator.hasNext()) {
                      Map$Entry uEntry = iterator.next();
                      uArrayList.add(uEntry.getKey()+" : "+uEntry.getValue());
                   }
                   a$a.f(uoa, str+CollectionsKt___CollectionsKt.V2(uArrayList, "\n", null, null, 0, null, null, 62, null), false, 2, null);
                }else {
                   map = t0.z();
                }
             }
          }
       }else {
          a$a.d(b.a(), "PrtpSpeedInfer#registerFeatureAccessory : not match event: "+p0.getClass(), null, false, 6, null);
          map = t0.z();
       }
       return map;
    }
}
