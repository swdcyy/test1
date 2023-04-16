package com.kwai.sdk.eve.internal.task.EveTaskManagerKt;
import vsd.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.MutablePropertyReference1;
import vsd.l;
import nsd.m0;
import en7.s;
import com.kwai.sdk.eve.internal.task.EveTaskManagerKt$activateSuccess$2;
import msd.l;
import nsd.u;
import zn7.a;
import msd.a;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import en7.t;

public final class EveTaskManagerKt	// class@0015cf
{
    public static final n[] a;
    public static final s b;

    static {
       n[] onArray = new n[]{m0.j(new MutablePropertyReference1Impl(EveTaskManagerKt.class, "activateSuccess", "getActivateSuccess\(Lcom/kwai/sdk/eve/internal/task/EveTask;\)Lkotlin/jvm/functions/Function0;", 1))};
       EveTaskManagerKt.a = onArray;
       EveTaskManagerKt.b = new s(0, EveTaskManagerKt$activateSuccess$2.INSTANCE, 1, null);
    }
    public static final a a(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, EveTaskManagerKt.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return EveTaskManagerKt.b.c(p0, EveTaskManagerKt.a[0]);
    }
    public static final void b(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EveTaskManagerKt.class, "2")) {
          return;
       }
       EveTaskManagerKt.b.d(p0, EveTaskManagerKt.a[0], p1);
       return;
    }
}
