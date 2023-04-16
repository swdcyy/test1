package lq9.a;
import lq9.a$a;
import java.lang.Object;
import com.kwai.feature.api.corona.util.CostReportWriterToDownload;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import vl5.c;
import vl5.e;
import kotlin.jvm.internal.a;
import vl5.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt;
import java.util.Objects;
import xf6.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import lq9.b;
import android.os.SystemClock;
import java.lang.System;
import java.lang.Long;
import lq9.c;
import com.yxcorp.gifshow.corona.common.monitor.CostDebugView;
import java.lang.StringBuilder;
import java.text.SimpleDateFormat;
import java.util.Locale;
import ql5.c;
import q87.c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils;
import com.kwai.feature.api.corona.monitor.CoronaMonitorUtils$a;
import lq9.d;

public final class a	// class@002e95
{
    public static CostReportWriterToDownload a;
    public static d b;
    public static final a c;

    static {
       a.c = new a();
       a.b = new a$a();
    }
    public void a(){
       super();
    }
    public static final void a(a p0,CostReportWriterToDownload p1){
       a.a = p1;
    }
    public static final void b(String p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, a.class, "6")) {
          return;
       }
       if (p2 != null && p0 != null) {
          c uoc = e.a(p0);
          if (uoc != null) {
             uoc.a(p1, p2);
          }
       }
       return;
    }
    public static final void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, a.class, "7")) {
          return;
       }
       a.p(p1, "key");
       if (p0 != null) {
          c uoc = e.a(p0);
          if (uoc != null) {
             if (uoc.g(p1) != null) {
                return;
             }else {
                uoc.b(new d(p1));
             }
          }
       }
       return;
    }
    public static final boolean d(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       CoronaExperimentUtilKt obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "eventId");
       obj = CoronaExperimentUtilKt.A;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, CoronaExperimentUtilKt.class, "39");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): b.a("ENABLE_LOG_WRITE_TO_FILE");
       boolean b1 = (b && TextUtils.n(p0, "switchToLandscape"))? true: false;
       return b1;
    }
    public static final void e(String p0,String p1){
       a c;
       boolean b;
       String str7;
       String str8;
       long l;
       d d;
       CostReportWriterToDownload a;
       c obj = p0;
       a obj1 = p1;
       b uob = b.class;
       d uod = d.class;
       Object[] objArray = null;
       String str = "5";
       if (PatchProxy.applyVoidTwoRefs(obj, obj1, objArray, a.class, str)) {
          return;
       }
       a.p(obj1, "key");
       if (obj != null) {
          c uoc = e.a(p0);
          if (uoc != null) {
             d uod1 = uoc.g(obj1);
             if (uod1 != null) {
                String str1 = "END";
                PatchProxyResult obj2 = 1;
                if (!uod1.c()) {
                   if (!PatchProxy.applyVoidOneRefs(objArray, uod1, uod, str) && !(a.g(uod1.a, "START") ^ obj2)) {
                      uod1.d = SystemClock.elapsedRealtime();
                      uod1.a = str1;
                   }
                   if (p1.hashCode() == -1520373587 && obj1.equals("switchScreenCost")) {
                      l = System.currentTimeMillis();
                      if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Long.valueOf(l), objArray, uob, "3")) {
                         CostDebugView uCostDebugVi1 = c.f.d();
                         if (uCostDebugVi1 != null) {
                            uCostDebugVi1.setT3Msg("switch end: "+new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Long.valueOf(l)));
                         }
                      }
                   }
                }
             label_00a3 :
                Object[] objArray1 = new Object[0];
                String str2 = "CoronaFullTimeCostUtil";
                c.C().w(str2, "---------tickEndEvent: "+obj1+' '+obj, objArray1);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                String str3 = "8";
                String str4 = "ALL_FINISH";
                if (!PatchProxy.applyVoidTwoRefs(obj, str4, objArray, a.class, str3)) {
                   a.p(obj, "sessionId");
                   a.p(str4, "finishType");
                   obj = e.a(p0);
                   if (obj != null && (!a.g(str4, str4) || obj.i())) {
                      e.c(obj.f());
                      c = a.c;
                      Objects.requireNonNull(c);
                      String str5 = "9";
                      Long longx = PatchProxy.applyOneRefs(obj, c, a.class, str5);
                      if (longx != patchProxyRe) {
                      }else {
                         d uod2 = obj.g("start");
                         longx = (uod2 != null)? Long.valueOf(uod2.b()): objArray;
                      }
                      if (longx != null && longx.longValue()) {
                         LinkedHashMap linkedHashMa = new LinkedHashMap();
                         Iterator iterator = obj.h().values().iterator();
                         while (iterator.hasNext()) {
                            obj1 = iterator.next();
                            Objects.requireNonNull(obj1);
                            obj2 = PatchProxy.apply(objArray, obj1, uod, str5);
                            b = (obj2 != patchProxyRe)? obj2.booleanValue(): a.g(obj1.e, "duration");
                            if (b) {
                               String str6 = obj1.a();
                               p0 = str5;
                               Object obj3 = PatchProxy.apply(null, obj1, uod, str3);
                               if (obj3 != patchProxyRe) {
                                  obj2 = patchProxyRe;
                                  str7 = str2;
                                  str8 = str3;
                                  l = obj3.longValue();
                               }else if(a.g(obj1.a, str1)){
                                  obj2 = patchProxyRe;
                                  d = obj1.d;
                                  str7 = str2;
                                  str8 = str3;
                                  d c1 = obj1.c;
                                  if (d - c1 >= 0) {
                                     l = d - c1;
                                  }
                               }else {
                                  obj2 = patchProxyRe;
                                  str8 = str3;
                                  str7 = str2;
                               }
                               l = 0;
                               linkedHashMa.put(str6, Long.valueOf(l));
                            }else {
                               obj2 = patchProxyRe;
                               str8 = str3;
                               str7 = str2;
                               p0 = str5;
                               int i = a.g(obj1.a(), "start") ^ 1;
                               if (i) {
                                  l = obj1.b() - longx.longValue();
                                  linkedHashMa.put(obj1.a(), Long.valueOf(l));
                               }
                            }
                            str5 = p0;
                            patchProxyRe = obj2;
                            str3 = str8;
                            str2 = str7;
                            objArray = null;
                            Object obj4 = 1;
                         }
                         str7 = str2;
                         linkedHashMa.put("totalCost", Long.valueOf((SystemClock.elapsedRealtime() - longx.longValue())));
                         obj1 = linkedHashMa.get("switchScreenCost");
                         String str9 = "null cannot be cast to non-null type kotlin.Long";
                         Objects.requireNonNull(obj1, str9);
                         long l1 = obj1.longValue();
                         Object obj5 = linkedHashMa.get("animationTime");
                         Objects.requireNonNull(obj5, str9);
                         l1 = l1 - obj5.longValue();
                         obj1 = linkedHashMa.get("animationTime");
                         Objects.requireNonNull(obj1, str9);
                         long l2 = obj1.longValue();
                         if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(Long.valueOf(l1), Long.valueOf(l2), null, uob, "4")) {
                            CostDebugView uCostDebugVi = c.f.d();
                            if (uCostDebugVi != null) {
                               uCostDebugVi.setT4Msg("click cost: "+' '+l1+", switch cost: "+l2);
                            }
                         }
                         if (a.d(obj.c())) {
                            obj1 = a.c;
                            String str10 = linkedHashMa.get("switchScreenCost")+", "+linkedHashMa.get("clickToSwitchBeginCost");
                            Objects.requireNonNull(obj1);
                            if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(str10, Boolean.TRUE, obj1, a.class, "10")) {
                               a = a.a;
                               if (a != null) {
                                  a.c(String.valueOf(str10), true);
                               }
                            }
                         }
                         linkedHashMa.putAll(obj.d());
                         CoronaMonitorUtils.c.c(obj.c(), obj.f, obj.g, "success", null, linkedHashMa, true);
                         Object[] objArray2 = new Object[0];
                         c.C().w(str7, "---------tryUploadFullTimeCost", objArray2);
                      }
                   }
                }
             }
          }
       }
    label_02d5 :
       return;
    }
    public static final void f(String p0,String p1){
       Object obj = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, a.class, "4")) {
          return;
       }
       a.p(p1, "key");
       if (p0 != null) {
          c uoc = e.a(p0);
          if (uoc != null) {
             d uod = uoc.g(p1);
             if (uod != null) {
                if (a.g(uod.a, "CREATED")) {
                   d.d(uod, obj, 1, obj);
                   int i = p1.hashCode();
                   if (i != -1520373587) {
                      if (i == 0x79118071 && p1.equals("animationTime")) {
                         b.b(System.currentTimeMillis());
                      }
                   }else if(p1.equals("switchScreenCost")){
                      b.a(System.currentTimeMillis());
                   }
                   Object[] objArray = new Object[0];
                   c.C().w("CoronaFullTimeCostUtil", "---------tickStartEvent: "+p1, objArray);
                }
                return;
             }else {
                uod = new d(p1);
                d.d(uod, obj, 1, obj);
                uoc.b(uod);
                int i1 = p1.hashCode();
                if (i1 != -1520373587) {
                   if (i1 == 0x79118071 && p1.equals("animationTime")) {
                      b.b(System.currentTimeMillis());
                   }
                }else if(p1.equals("switchScreenCost")){
                   b.a(System.currentTimeMillis());
                }
                Object[] objArray1 = new Object[0];
                c.C().w("CoronaFullTimeCostUtil", "---------tickStartEvent: "+p1+' '+p0, objArray1);
             }
          }
       }
       return;
    }
    public static final void g(String p0,String p1,String p2,String p3,String p4){
       if (PatchProxy.isSupport(a.class)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, a.class, "1")) {
             return;
          }
       }
       a.p(p1, "key");
       a.p(p2, "eventId");
       a.p(p3, "biz");
       a.p(p4, "subBiz");
       if (p0 != null) {
          e.b(p0, p1, p2, p3, p4);
          if (e.a(p0) != null) {
             if (!PatchProxy.applyVoidTwoRefs(p0, "start", null, a.class, "3")) {
                a.p("start", "key");
                c uoc = e.a(p0);
                if (uoc != null && uoc.g("start") == null) {
                   d uod = new d("start");
                   d.f(uod, null, 1, null);
                   uoc.b(uod);
                }
             }
             if (a.d(p2)) {
                a.b.onBegin();
             }
          }
       }
       return;
    }
}
