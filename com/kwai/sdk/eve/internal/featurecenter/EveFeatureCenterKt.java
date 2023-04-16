package com.kwai.sdk.eve.internal.featurecenter.EveFeatureCenterKt;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import en7.s;
import msd.l;
import nsd.u;
import zn7.a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import en7.t;

public final class EveFeatureCenterKt	// class@0014e3
{
    public static final n[] $$delegatedProperties;
    public static final s featureAccessoryProvider$delegate;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(EveFeatureCenterKt.class, "featureAccessoryProvider", "getFeatureAccessoryProvider\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Lkotlin/jvm/functions/Function1;", 1))};
       EveFeatureCenterKt.$$delegatedProperties = onArray;
       EveFeatureCenterKt.featureAccessoryProvider$delegate = new s(0, null, 3, null);
    }
    public static final l getFeatureAccessoryProvider(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EveFeatureCenterKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$featureAccessoryProvider");
       return EveFeatureCenterKt.featureAccessoryProvider$delegate.c(p0, EveFeatureCenterKt.$$delegatedProperties[0]);
    }
    public static final void setFeatureAccessoryProvider(a p0,l p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EveFeatureCenterKt.class, "2")) {
          return;
       }
       a.p(p0, "$this$featureAccessoryProvider");
       EveFeatureCenterKt.featureAccessoryProvider$delegate.d(p0, EveFeatureCenterKt.$$delegatedProperties[0], p1);
       return;
    }
}
