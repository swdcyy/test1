package com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a;
import tm7.a;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2;
import java.lang.Object;
import java.lang.String;
import erd.g;
import erd.a;
import crd.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import tm7.d;
import com.kwai.sdk.eve.internal.api.EveApi;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import brd.t;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$e;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$f;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$g;
import tm7.b;
import com.kwai.middleware.leia.degrade.ApiRequestTiming;
import java.util.Objects;
import qrd.p;
import tm7.c;
import cjd.e;
import erd.o;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$a;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$b;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$c;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$d;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$k;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$l;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$m;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$h;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$i;
import com.kwai.sdk.eve.internal.api.EveApi$apiMocker$2$a$j;

public final class EveApi$apiMocker$2$a implements a	// class@00145e
{
    public final EveApi$apiMocker$2 a;

    public void EveApi$apiMocker$2$a(EveApi$apiMocker$2 p0){
       this.a = p0;
       super();
    }
    public b a(String p0,g p1,g p2,a p3){
       b uob;
       d obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, EveApi$apiMocker$2$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "packageInfoList");
       a.p(p1, "onNext");
       a.p(p2, "onError");
       a.p(p3, "onComplete");
       obj = this.a.this$0.f();
       if (obj != null) {
          EveLog.w$default("EPM#requestServerPackage: Mocker ===> packageInfoList = "+p0, false, 2, null);
          EveLog.w$default("EPM#requestServerPackage: Mocker ===> api = "+obj, false, 2, null);
          uob = obj.c(p0).subscribe(new EveApi$apiMocker$2$a$e(p1), new EveApi$apiMocker$2$a$f(p2), new EveApi$apiMocker$2$a$g(p3));
          a.o(uob, "rApi\n            .also {¡­lete.run\(\)\n            }\)");
          return uob;
       }else {
          uob = this.a.this$0.c().c(p0).subscribe(p1, p2, p3);
          a.o(uob, "api.requestServerPackage¡­ext, onError, onComplete\)");
          return uob;
       }
    }
    public b b(String p0,ApiRequestTiming p1,g p2,g p3,a p4){
       EveApi$apiMocker$2 obj;
       b uob;
       EveApi uEveApi = EveApi.class;
       EveApi$apiMocker$2$a uoapiMocker$ = EveApi$apiMocker$2$a.class;
       String str = "4";
       if (PatchProxy.isSupport(uoapiMocker$)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, this, uoapiMocker$, str);
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "uid");
       a.p(p1, "requestTiming");
       a.p(p2, "onNext");
       a.p(p3, "onError");
       a.p(p4, "onComplete");
       obj = this.a.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, uEveApi, str);
       if (obj1 != PatchProxyResult.class) {
       }else {
          obj1 = obj.e.getValue();
       }
       if (obj1 != null) {
          EveLog.w$default("EveGlobalFeatureCalculator#featureCalculateConfig: Mocker", 0, 2, null);
          EveLog.w$default("EveGlobalFeatureCalculator#featureCalculateConfig: Mocker ===> api = "+obj1, 0, 2, null);
          uob = obj1.d(p0, p1).doOnNext(new c()).map(new e()).subscribe(new EveApi$apiMocker$2$a$a(p2), new EveApi$apiMocker$2$a$b(p3), new EveApi$apiMocker$2$a$c(p4));
          a.o(uob, "rApi\n            .also {¡­lete.run\(\)\n            }\)");
          return uob;
       }else {
          obj = this.a.this$0;
          Objects.requireNonNull(obj);
          b uob1 = PatchProxy.apply(null, obj, uEveApi, "3");
          if (uob1 == PatchProxyResult.class) {
             uob1 = obj.d.getValue();
          }
          uob = uob1.d(p0, p1).map(EveApi$apiMocker$2$a$d.b).subscribe(p2, p3, p4);
          a.o(uob, "kinsightApi.featureCalcu¡­ext, onError, onComplete\)");
          return uob;
       }
    }
    public b c(g p0,g p1,a p2){
       b uob;
       d obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, EveApi$apiMocker$2$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "onNext");
       a.p(p1, "onError");
       a.p(p2, "onComplete");
       obj = this.a.this$0.f();
       if (obj != null) {
          EveLog.w$default("UserFeatureProvider#userFeature: Mocker", false, 2, null);
          EveLog.w$default("UserFeatureProvider#userFeature: Mocker ===> api = "+obj, false, 2, null);
          uob = obj.b().subscribe(new EveApi$apiMocker$2$a$k(p0), new EveApi$apiMocker$2$a$l(p1), new EveApi$apiMocker$2$a$m(p2));
          a.o(uob, "rApi\n            .also {¡­lete.run\(\)\n            }\)");
          return uob;
       }else {
          uob = this.a.this$0.c().b().subscribe(p0, p1, p2);
          a.o(uob, "api.userFeature\(\).subscr¡­ext, onError, onComplete\)");
          return uob;
       }
    }
    public b d(String p0,g p1,g p2,a p3){
       b uob;
       EveApi uEveApi = EveApi.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       EveApi$apiMocker$2 obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, this, EveApi$apiMocker$2$a.class, "3");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "localPackageInfo");
       a.p(p1, "onNext");
       a.p(p2, "onError");
       a.p(p3, "onComplete");
       obj = this.a.this$0;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, uEveApi, "6");
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.g.getValue();
       }
       if (obj1 != null) {
          EveLog.w$default("EPM#requestServerPackageFromKeep: Mocker ===> api = "+obj1, false, 2, null);
          uob = obj1.a(p0).subscribe(new EveApi$apiMocker$2$a$h(p1), new EveApi$apiMocker$2$a$i(p2), new EveApi$apiMocker$2$a$j(p3));
          a.o(uob, "rApi\n            .also {¡­lete.run\(\)\n            }\)");
          return uob;
       }else {
          obj = this.a.this$0;
          Objects.requireNonNull(obj);
          b uob1 = PatchProxy.apply(null, obj, uEveApi, "5");
          if (uob1 == patchProxyRe) {
             uob1 = obj.f.getValue();
          }
          uob = uob1.a(p0).subscribe(p1, p2, p3);
          a.o(uob, "ztApi.requestServerPacka¡­ext, onError, onComplete\)");
          return uob;
       }
    }
}
