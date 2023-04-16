package com.kwai.sdk.eve.EveManager$init$5;
import msd.q;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.sdk.eve.internal.pack.EvePackageManager;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import tn7.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.lang.StringBuilder;
import tn7.b$b;
import tn7.b$b$a;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.concurrent.ConcurrentHashMap;
import tn7.c;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import com.kwai.sdk.eve.EveTaskPackageSource;

public final class EveManager$init$5 extends FunctionReferenceImpl implements q	// class@00143a
{

    public void EveManager$init$5(EvePackageManager p0){
       super(3, p0, EvePackageManager.class, "notifyTaskPackageStatusChanged", "notifyTaskPackageStatusChanged\(Ljava/lang/String;ILcom/kwai/sdk/eve/internal/pack/model/EveTaskPackage;\)V", 0);
    }
    public Object invoke(Object p0,Object p1,Object p2){
       this.invoke(p0, p1.intValue(), p2);
       return l1.a;
    }
    public final void invoke(String p0,int p1,b p2){
       l1 a;
       if (PatchProxy.isSupport(EveManager$init$5.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, EveManager$init$5.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.isSupport(EvePackageManager.class) || !PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, treceiver, EvePackageManager.class, "46")) {
          a.p(p0, "taskId");
          EveLog.i$default("EPM#notifyTaskPackageStatusChanged : taskId = "+p0+", status = "+b$b.J.a(p1)+", taskPackage = "+p2, false, 2, null);
          Integer integer = (p2 != null)? Integer.valueOf(p2.usingStatus): null;
          if (p1 != 2) {
             int i = 3;
             if (p1 != i) {
                i = 4;
                if (p1 == i) {
                   if (p2 != null) {
                      p2.j(i);
                   }
                   if (integer != null && p2.usingStatus != integer.intValue()) {
                      treceiver.u();
                   }
                   if (!PatchProxy.applyVoidTwoRefs(p0, p2, treceiver, EvePackageManager.class, "35")) {
                      EveLog.i$default("EPM#reloadTaskPackage : taskId = "+p0+", taskPackage = "+p2, false, 2, null);
                      EvePackageManager g = treceiver.g;
                      _monitor_enter(g);
                      p2 = treceiver.g.get(p0);
                      b uob = PatchProxy.applyOneRefs(p2, null, c.class, "3");
                      if (uob != PatchProxyResult.class) {
                      }else if(p2 != null){
                         uob = c.a(p2);
                         while (true) {
                            if (uob != null) {
                               if (!uob.e()) {
                                  uob = uob.d();
                               }
                            }
                         }
                      }
                      uob = null;
                      if (uob != null) {
                         treceiver.g.put(p0, uob);
                         treceiver.n(uob);
                      }
                      if (treceiver.j == EveTaskPackageSource.RecoServer) {
                         EveLog.i$default("EPM#reloadTaskPackage : requestServerPackage ===> Error Running taskId = "+p0, false, 2, null);
                         EvePackageManager.t(treceiver, false, 1, null);
                      }
                      _monitor_exit(g);
                   }
                }
             }else if(p2 != null){
                p2.j(i);
             }
             if (!PatchProxy.applyVoidOneRefs(p2, treceiver, EvePackageManager.class, "45")) {
                EveLog.i$default("EPM#releaseTaskPackage : taskPackage = "+p2, false, 2, null);
                if (p2 != null && treceiver.i(p2.taskId)) {
                   treceiver.f(p2.taskId);
                }
             }
          }else {
             EvePackageManager g1 = treceiver.g;
             _monitor_enter(g1);
             if (p2 != null) {
                p2.j(2);
             }
             if (p2 != null) {
                treceiver.g.put(p2.taskId, p2);
             }
             treceiver.u();
             if (p2 != null) {
                b uob1 = p2.d();
                if (uob1 != null) {
                   treceiver.x(uob1);
                   a = l1.a;
                }
             }
             _monitor_exit(g1);
          }
       }
    label_0175 :
       return;
    }
}
