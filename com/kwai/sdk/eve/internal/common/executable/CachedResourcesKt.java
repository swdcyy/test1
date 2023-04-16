package com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import com.kwai.sdk.eve.internal.common.utils.MapTagPropertyDelegate;
import nsd.u;
import com.kwai.sdk.eve.internal.inference.a;
import java.util.Map;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import en7.t;
import en7.s;
import zn7.a;
import ym7.g;
import en7.a;
import com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt$getSoVm$1;
import msd.a;
import com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt$a;
import java.lang.Runnable;
import qrd.l1;
import en7.o;
import java.util.Set;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map$Entry;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import java.util.List;
import trd.t;
import com.kwai.sdk.eve.internal.common.executable.CachedResourcesKt$b;

public final class CachedResourcesKt	// class@001478
{
    public static final n[] a;
    public static final MapTagPropertyDelegate b;
    public static final MapTagPropertyDelegate c;
    public static final MapTagPropertyDelegate d;
    public static final MapTagPropertyDelegate e;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(CachedResourcesKt.class, "interpreters", "getInterpreters\(Lcom/kwai/sdk/eve/internal/inference/EveInference;\)Ljava/util/Map;", 1)),m0.r(new PropertyReference1Impl(CachedResourcesKt.class, "interpreters", "getInterpreters\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Ljava/util/Map;", 1)),m0.r(new PropertyReference1Impl(CachedResourcesKt.class, "sos", "getSos\(Lcom/kwai/sdk/eve/internal/inference/EveInference;\)Ljava/util/Map;", 1)),m0.r(new PropertyReference1Impl(CachedResourcesKt.class, "sos", "getSos\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Ljava/util/Map;", 1))};
       CachedResourcesKt.a = onArray;
       CachedResourcesKt.b = new MapTagPropertyDelegate(0, 1, null);
       CachedResourcesKt.c = new MapTagPropertyDelegate(0, 1, null);
       CachedResourcesKt.d = new MapTagPropertyDelegate(0, 1, null);
       CachedResourcesKt.e = new MapTagPropertyDelegate(0, 1, null);
    }
    public static final Map a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CachedResourcesKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$interpreters");
       return CachedResourcesKt.b.c(p0, CachedResourcesKt.a[0]);
    }
    public static final Map b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CachedResourcesKt.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$interpreters");
       return CachedResourcesKt.c.c(p0, CachedResourcesKt.a[1]);
    }
    public static final g c(a p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, CachedResourcesKt.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$getSoVm");
       a.p(p1, "id");
       if (!CachedResourcesKt.e(p0).containsKey(p1)) {
          a uoa = new a(1, new CachedResourcesKt$getSoVm$1(p0, p1));
          CachedResourcesKt.g(uoa, p0, new CachedResourcesKt$a(p0, p1));
          CachedResourcesKt.e(p0).put(p1, uoa);
       }
       p0 = CachedResourcesKt.e(p0).get(p1);
       a.m(p0);
       return p0.a();
    }
    public static final Map d(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CachedResourcesKt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$sos");
       return CachedResourcesKt.d.c(p0, CachedResourcesKt.a[2]);
    }
    public static final Map e(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, CachedResourcesKt.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$sos");
       return CachedResourcesKt.e.c(p0, CachedResourcesKt.a[3]);
    }
    public static final void f(a p0){
       Map$Entry uEntry;
       a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, null, CachedResourcesKt.class, "8")) {
          return;
       }
       Iterator iterator = CachedResourcesKt.a(p0).entrySet().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          uoa = CachedResourcesKt.b(p0.k()).get(uEntry.getKey());
          if (uoa != null) {
             uoa.b(uEntry.getValue());
          }
       }
       iterator = CachedResourcesKt.d(p0).entrySet().iterator();
       while (iterator.hasNext()) {
          uEntry = iterator.next();
          uoa = CachedResourcesKt.e(p0.k()).get(uEntry.getKey());
          if (uoa != null) {
             uoa.b(uEntry.getValue());
          }
       }
       return;
    }
    public static final void g(a p0,a p1,Runnable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, CachedResourcesKt.class, "9")) {
          return;
       }
       p1.v(t.k(EveTaskLifecycle.NONE), new CachedResourcesKt$b(p0, p2));
       return;
    }
}
