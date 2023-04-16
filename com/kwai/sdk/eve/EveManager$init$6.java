package com.kwai.sdk.eve.EveManager$init$6;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.concurrent.ConcurrentHashMap;
import tn7.b;
import java.lang.System;

public final class EveManager$init$6 extends FunctionReferenceImpl implements l	// class@00143b
{

    public void EveManager$init$6(EvePackageManager p0){
       super(1, p0, EvePackageManager.class, "onTaskActive", "onTaskActive\(Ljava/lang/String;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(String p0){
       l1 a;
       if (PatchProxy.applyVoidOneRefs(p0, this, EveManager$init$6.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, EvePackageManager.class, "21")) {
          a.p(p0, "taskId");
          EveLog.i$default("EPM#onTaskActive "+p0, false, 2, null);
          b uob = treceiver.g.get(p0);
          if (uob != null) {
             uob.lastVisitTime = System.currentTimeMillis();
             EveLog.i$default("EPM#onTaskActive "+p0+" update pack last visit time "+uob.lastVisitTime, false, 2, null);
             treceiver.u();
          }else {
             EveLog.i$default("EPM#onTaskActive "+p0+" can not find task", false, 2, null);
             a = l1.a;
          }
       }
       return;
    }
}
