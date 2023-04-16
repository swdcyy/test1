package a04.j;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.merchant.home2.main.predict.PredictStates;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import a04.l;
import java.util.Objects;
import ot3.u0;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;
import com.kuaishou.merchant.home2.main.predict.Predict$activeTaskAndSetup$1;
import com.kuaishou.merchant.home2.main.predict.Predict$activeTaskAndSetup$2;
import msd.l;
import sm7.p;
import com.kuaishou.merchant.home2.main.predict.Predict$registerDataProviders$1;
import com.kuaishou.merchant.home2.main.predict.Predict$registerDataProviders$2;
import a04.f;
import sm7.h;
import a04.b;
import com.kuaishou.merchant.home2.main.predict.FeatureConfig;
import java.util.List;
import nsd.u;
import java.lang.reflect.Type;
import a04.a;
import java.util.Collection;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import k2b.s1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import a04.e;
import java.lang.Enum;
import kotlin.NoWhenBranchMatchedException;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import kotlin.Pair;
import com.kwai.sdk.eve.proto.CustomEvent;
import java.lang.Number;
import o56.a;
import android.content.Context;
import android.net.NetworkInfo;
import ekd.p0;
import java.util.HashMap;
import zw3.b;
import lnc.i3;
import java.lang.System;
import o56.c;
import java.util.LinkedList;
import java.lang.Iterable;
import java.lang.CharSequence;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Map$Entry;
import nc5.i;
import com.kwai.sdk.eve.proto.CustomEvent$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class j	// class@000010
{
    public static b a;
    public static b b;
    public static PublishSubject c;
    public static PredictStates d;
    public static boolean e;
    public static boolean f;
    public static boolean g;
    public static long h;
    public static boolean i;
    public static long j;
    public static final j k;

    static {
       j oj = j.class;
       j oj1 = new j();
       j.k = oj1;
       j.c = PublishSubject.g();
       j.d = PredictStates.DEFAULT;
       String str = null;
       if (PatchProxy.applyVoid(null, oj1, oj, "4")) {
       }else if(!oj1.d(PredictStates.ON_INITIAL)){
          j.f = a.t().d("MerchantHomePredictionSwitch", str);
          j.g = a.t().d("MerchantHomePredictToPreload", str);
          j.j = a.t().b("MerchantHomePredictionPriority", 0);
          j.h = a.t().b("MerchantHomePredictionT3Threshold", 0);
          j.i = a.t().d("MerchantHomePredictionEnableLogger", str);
          if (!j.f) {
             oj1.d(PredictStates.DISABLED);
          }else {
             oj1.d(PredictStates.INITIALED);
          }
       }
       if (!PatchProxy.applyVoid(null, oj1, oj, "5") && oj1.d(PredictStates.ON_ACTIVE)) {
          l i = l.i;
          Objects.requireNonNull(i);
          String str1 = "1";
          if (!PatchProxy.applyVoid(null, i, l.class, str1)) {
             l.a = u0.b();
          }
          EveManagerWrapper e = EveManagerWrapper.e;
          e.b("MerchantPreload", Predict$activeTaskAndSetup$1.INSTANCE, Predict$activeTaskAndSetup$2.INSTANCE);
          p op = e.j("MerchantPreload");
          if (op != null) {
             op = op.b;
             if (op == null || !op.length()) {
                str = 1;
             }
             if (!str) {
                Objects.requireNonNull(oj1);
                if (!PatchProxy.applyVoid(null, oj1, oj, "7")) {
                   e.p("MerchantPreload", "HistoryTimeDataProvider", Predict$registerDataProviders$1.INSTANCE);
                   e.p("MerchantPreload", "HistoryLocationDataProvider", Predict$registerDataProviders$2.INSTANCE);
                }
                if (!PatchProxy.applyVoid(null, oj1, oj, "8")) {
                   e.r("MerchantPreload", "ProcessorInfer", new f());
                }
                oj1.d(PredictStates.ACTIVATED);
                b d = b.d;
                Objects.requireNonNull(d);
                b uob = b.class;
                if (!PatchProxy.applyVoid(null, d, uob, str1)) {
                   if (!PatchProxy.applyVoid(null, d, uob, "16")) {
                      List corePages = a.t().getValue("MerchantHomePredictionFeatureConfig", FeatureConfig.class, new FeatureConfig(null, 1, null)).getCorePages();
                      if (corePages != null) {
                         a.d.a().addAll(corePages);
                      }
                   }
                   b.a(0x4b316083).T0(b.c);
                }
                if (!PatchProxy.applyVoid(null, i, l.class, "2")) {
                   l.b = u0.b();
                }
             }else {
                oj1.d(PredictStates.NO_MODEL);
             }
          }else {
             oj1.d(PredictStates.NO_MODEL);
          }
       }
    }
    public void j(){
       super();
    }
    public final boolean a(){
       return j.f;
    }
    public final long b(){
       return j.j;
    }
    public final boolean c(){
       return j.g;
    }
    public final boolean d(PredictStates p0){
       boolean b;
       PredictStates obj = PatchProxy.applyOneRefs(p0, this, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       switch (e.a[p0.ordinal()]){
           case 1:
             obj = PredictStates.DEFAULT;
          label_0094 :
             j.d = obj;
             if (obj != p0 && (obj != PredictStates.DISABLED && j.d != PredictStates.NO_MODEL)) {
                a.d(MerchantHomeLogBiz.Predict, "MerchantHomePreloadPredict", "move state error, "+"from: "+j.d+" to: "+p0);
             }
          label_00c9 :
             b = (j.d == p0)? true: false;
             break;
           case 2:
             if (j.d == PredictStates.DEFAULT) {
             label_008d :
                obj = p0;
                goto label_0094 ;
             }else {
                obj = j.d;
                goto label_0094 ;
             }
             break;
           case 3:
             if (j.d == PredictStates.ON_INITIAL) {
                goto label_008d ;
             }else {
                obj = j.d;
                goto label_0094 ;
             }
             break;
           case 4:
             if (j.d == PredictStates.ON_INITIAL) {
                goto label_008d ;
             }else {
                obj = j.d;
                goto label_0094 ;
             }
             break;
           case 5:
             if (j.d == PredictStates.INITIALED) {
                goto label_008d ;
             }else {
                obj = j.d;
                goto label_0094 ;
             }
             break;
           case 6:
             if (j.d == PredictStates.ON_ACTIVE) {
                goto label_008d ;
             }else {
                obj = j.d;
                goto label_0094 ;
             }
             break;
           case 7:
             if (j.d == PredictStates.ON_ACTIVE) {
                goto label_008d ;
             }else {
                obj = j.d;
                goto label_0094 ;
             }
             break;
           case 8:
             if (j.d == PredictStates.ACTIVATED || j.d == PredictStates.RELEASED) {
                goto label_008d ;
             }else {
                obj = j.d;
                goto label_0094 ;
             }
             break;
           case 9:
             if (j.d == PredictStates.ON_START) {
                goto label_008d ;
             }else {
                obj = j.d;
                goto label_0094 ;
             }
             break;
           case 10:
             if (j.d == PredictStates.STARTED) {
                goto label_008d ;
             }else {
                obj = j.d;
                goto label_0094 ;
             }
             break;
           case 11:
             if (j.d == PredictStates.ON_RELEASE) {
                goto label_008d ;
             }else {
                obj = j.d;
                goto label_0094 ;
             }
             break;
           default:
             throw new NoWhenBranchMatchedException();
       }
       return b;
    }
    public final void e(Pair p0,boolean p1){
       GeneratedMessageLite generatedMes;
       String obj = p0;
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          if (PatchProxy.applyVoidTwoRefs(obj, Boolean.valueOf(p1), this, oj, "10")) {
             return;
          }
       }else {
          int i1 = this;
       }
       b d = b.d;
       Objects.requireNonNull(d);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(b.class)) {
          generatedMes = PatchProxy.applyTwoRefs(obj, Boolean.valueOf(p1), d, b.class, "7");
          if (generatedMes != patchProxyRe) {
          label_01a2 :
             EveManagerWrapper.e.n(generatedMes);
             return;
          }
       }
       long l = u0.b();
       obj = p0.getFirst()+':'+p0.getSecond();
       HashMap obj1 = PatchProxy.apply(null, d, b.class, "14");
       int i = 1;
       if (obj1 != patchProxyRe) {
          i = obj1.intValue();
       }else {
          NetworkInfo networkInfo = p0.e(a.B);
          int type = (networkInfo != null)? networkInfo.getType(): 1;
          if (type != i) {
             i = 0;
          }
       }
       obj1 = b.f(HashMap.class);
       if (obj1 == null) {
          obj1 = new HashMap();
       }
       i3 oi3 = i3.f();
       oi3.d("Timestamp", String.valueOf(l));
       oi3.d("Location", obj);
       oi3.d("HasRedDot", String.valueOf(p1));
       oi3.d("NetworkType", String.valueOf(i));
       oi3.d("VisitShopCount", String.valueOf(b.a));
       oi3.d("VisitMenuCount", String.valueOf(b.b));
       Iterator obj2 = PatchProxy.apply(null, d, b.class, "15");
       l = (obj2 != patchProxyRe)? obj2.longValue(): System.currentTimeMillis() - a.a().e();
       oi3.d("AppLiveDuration", String.valueOf(l));
       oi3.d("IsNebula", String.valueOf(false));
       obj = PatchProxy.apply(null, d, b.class, "6");
       if (obj != patchProxyRe) {
       }else {
          LinkedList linkedList = b.h(LinkedList.class);
          if (linkedList != null) {
             obj = CollectionsKt___CollectionsKt.V2(linkedList, ",", null, null, 0, null, null, 62, null);
             if (obj == null) {
             }
          }else {
          }
       }
       oi3.d("HistoryT3s", obj);
       Objects.requireNonNull(j.k);
       oi3.d("T3Threshold", String.valueOf(j.h));
       obj2 = obj1.keySet().iterator();
       while (obj2.hasNext()) {
          String str = obj2.next();
          oi3.d(str, obj1.get(str));
       }
       Objects.requireNonNull(a.d);
       obj2 = a.c.entrySet().iterator();
       while (obj2.hasNext()) {
          Map$Entry uEntry = obj2.next();
          String key = uEntry.getKey();
          oi3.d(key, String.valueOf(i.c(uEntry.getValue().intValue())));
       }
       CustomEvent$Builder uBuilder = CustomEvent.newBuilder();
       uBuilder.setCustomKey("MerchantEvent");
       uBuilder.setCustomValue(oi3.e());
       generatedMes = uBuilder.build();
       goto label_01a2 ;
    }
}
