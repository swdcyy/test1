package com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import en7.s;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt$idGenerator$2;
import msd.l;
import nsd.u;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt$gather$2;
import com.kwai.sdk.eve.internal.common.utils.MapTagPropertyDelegate;
import zn7.a;
import msd.p;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import en7.t;
import java.util.Map;

public final class EveInferenceManagerKt	// class@001564
{
    public static final n[] a;
    public static final s b;
    public static final s c;
    public static final MapTagPropertyDelegate d;
    public static final MapTagPropertyDelegate e;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(EveInferenceManagerKt.class, "idGenerator", "getIdGenerator\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Lkotlin/jvm/functions/Function1;", 1)),m0.j(new MutablePropertyReference1Impl(EveInferenceManagerKt.class, "gather", "getGather\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Lkotlin/jvm/functions/Function2;", 1)),m0.r(new PropertyReference1Impl(EveInferenceManagerKt.class, "inferences", "getInferences\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Ljava/util/Map;", 1)),m0.r(new PropertyReference1Impl(EveInferenceManagerKt.class, "processors", "getProcessors\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Ljava/util/Map;", 1))};
       EveInferenceManagerKt.a = onArray;
       EveInferenceManagerKt.b = new s(0, EveInferenceManagerKt$idGenerator$2.INSTANCE, 1, null);
       EveInferenceManagerKt.c = new s(0, EveInferenceManagerKt$gather$2.INSTANCE, 1, null);
       EveInferenceManagerKt.d = new MapTagPropertyDelegate(0, 1, null);
       EveInferenceManagerKt.e = new MapTagPropertyDelegate(0, 1, null);
    }
    public static final p a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EveInferenceManagerKt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$gather");
       return EveInferenceManagerKt.c.c(p0, EveInferenceManagerKt.a[1]);
    }
    public static final l b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EveInferenceManagerKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$idGenerator");
       return EveInferenceManagerKt.b.c(p0, EveInferenceManagerKt.a[0]);
    }
    public static final Map c(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EveInferenceManagerKt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EveInferenceManagerKt.d.c(p0, EveInferenceManagerKt.a[2]);
    }
    public static final Map d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EveInferenceManagerKt.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EveInferenceManagerKt.e.c(p0, EveInferenceManagerKt.a[3]);
    }
    public static final void e(a p0,p p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EveInferenceManagerKt.class, "4")) {
          return;
       }
       a.p(p0, "$this$gather");
       a.p(p1, "<set-?>");
       EveInferenceManagerKt.c.d(p0, EveInferenceManagerKt.a[1], p1);
       return;
    }
    public static final void f(a p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EveInferenceManagerKt.class, "2")) {
          return;
       }
       a.p(p0, "$this$idGenerator");
       a.p(p1, "<set-?>");
       EveInferenceManagerKt.b.d(p0, EveInferenceManagerKt.a[0], p1);
       return;
    }
}
