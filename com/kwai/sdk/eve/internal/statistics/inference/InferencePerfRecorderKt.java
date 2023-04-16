package com.kwai.sdk.eve.internal.statistics.inference.InferencePerfRecorderKt;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import en7.s;
import com.kwai.sdk.eve.internal.statistics.inference.InferencePerfRecorderKt$processorRecords$2;
import msd.l;
import nsd.u;
import com.kwai.sdk.eve.internal.statistics.inference.InferencePerfRecorderKt$luaPipeRecords$2;
import com.kwai.sdk.eve.internal.inference.a;
import wn7.h;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import en7.t;
import wn7.g;

public final class InferencePerfRecorderKt	// class@0015b8
{
    public static final n[] a;
    public static final s b;
    public static final s c;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(InferencePerfRecorderKt.class, "processorRecords", "getProcessorRecords\(Lcom/kwai/sdk/eve/internal/inference/EveInference;\)Lcom/kwai/sdk/eve/internal/statistics/inference/Intermediate;", 1)),m0.j(new MutablePropertyReference1Impl(InferencePerfRecorderKt.class, "luaPipeRecords", "getLuaPipeRecords\(Lcom/kwai/sdk/eve/internal/inference/EveInference;\)Lcom/kwai/sdk/eve/internal/statistics/inference/LuaPipeRecords;", 1))};
       InferencePerfRecorderKt.a = onArray;
       InferencePerfRecorderKt.b = new s(0, InferencePerfRecorderKt$processorRecords$2.INSTANCE, 1, null);
       InferencePerfRecorderKt.c = new s(0, InferencePerfRecorderKt$luaPipeRecords$2.INSTANCE, 1, null);
    }
    public static final h a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, InferencePerfRecorderKt.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$luaPipeRecords");
       return InferencePerfRecorderKt.c.c(p0, InferencePerfRecorderKt.a[1]);
    }
    public static final g b(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, InferencePerfRecorderKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "$this$processorRecords");
       return InferencePerfRecorderKt.b.c(p0, InferencePerfRecorderKt.a[0]);
    }
}
