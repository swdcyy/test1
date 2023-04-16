package com.kwai.sdk.eve.internal.inference.EveInferenceManager;
import in7.f;
import vm7.a;
import java.util.List;
import wn7.a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import zn7.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import java.util.Map;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt;
import com.kwai.sdk.eve.internal.inference.a;
import qrd.l1;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import ml5.a;
import com.kwai.eve.typevalue.Type;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import in7.e;
import java.lang.Enum;
import com.kwai.sdk.eve.internal.statistics.EveLogger;
import com.kwai.sdk.eve.internal.common.models.InferenceStartFailed;
import java.lang.Throwable;
import msd.l;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$1;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$2;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$3;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$4;
import cn7.b;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$directInferAsync$5;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import java.lang.Runnable;
import nsd.u;
import cn7.b$a;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$startInference$1;
import trd.t;
import com.kwai.sdk.eve.internal.inference.EveInferenceManager$b;

public final class EveInferenceManager implements f	// class@00155f
{
    public final a a;
    public final List b;
    public final a c;
    public final EveInferenceManager$a d;

    public void EveInferenceManager(a p0,List p1,a p2,EveInferenceManager$a p3){
       a.p(p0, "context");
       a.p(p1, "singleThreadRunTasks");
       a.p(p2, "monitor");
       a.p(p3, "master");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public void a(a p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveInferenceManager.class, "13")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "id");
       EveLog.i$default("EveInferenceManager#cancel "+p0.n()+' '+p1, false, 2, null);
       Map map = EveInferenceManagerKt.c(p0);
       _monitor_enter(map);
       a uoa = EveInferenceManagerKt.c(p0).remove(p1);
       if (uoa != null) {
          uoa.e();
          EveLog.i$default("EveInferenceManager#cancel real cancel  "+p0.n()+' '+p1, false, 2, null);
       }
       _monitor_exit(map);
       return;
    }
    public void b(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveInferenceManager.class, "12")) {
          return;
       }
       a.p(p0, "task");
       EveLog.i$default("EveInferenceManager#cancelAll begin "+EveInferenceManagerKt.c(p0).size(), false, 2, null);
       Map map = EveInferenceManagerKt.c(p0);
       _monitor_enter(map);
       Iterator iterator = EveInferenceManagerKt.c(p0).entrySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().getValue().e();
          iterator.remove();
       }
       _monitor_exit(map);
       EveLog.i$default("EveInferenceManager#cancelAll finish", false, 2, null);
       return;
    }
    public void c(a p0,a p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EveInferenceManager.class, "4")) {
          return;
       }
       a.p(p0, "task");
       a.p(p1, "data");
       a.p(p2, "pipeline");
       EveLog.i$default("EveInferenceManager#inference begin "+p0.n()+' '+p1.i()+' '+p0.g()+' '+p0.k(), false, 2, null);
       switch (e.a[p0.g().ordinal()]){
           case 1:
           case 3:
           case 2:
             if (!p0.k()) {
                EveLogger.INSTANCE.logExceptionEvent(p0.n(), new InferenceStartFailed(p0.g(), "inference_infer"));
             }else {
                this.f(p0, p1, p2);
             }
             break;
           case 4:
             EveLogger.INSTANCE.logExceptionEvent(p0.n(), new InferenceStartFailed(p0.g(), "inference_infer"));
             break;
           case 5:
           case 6:
             this.f(p0, p1, p2);
             break;
           case 7:
           case 8:
             this.e(p0, p1, p2);
             break;
           default:
       }
       return;
    }
    public final void d(a p0,String p1,String p2,a p3,l p4){
       Object obj = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p2;
       object oobject3 = p3;
       EveInferenceManager uEveInferenc = EveInferenceManager.class;
       if (PatchProxy.isSupport(uEveInferenc)) {
          Object[] objArray = new Object[]{oobject,oobject1,oobject2,oobject3,p4};
          if (PatchProxy.applyVoid(objArray, obj, uEveInferenc, "6")) {
             return;
          }
       }
       EveLog.i$default("EveInferenceManager#directInfer "+p0.n()+' '+oobject2, 0, 2, null);
       EveInferenceManager$directInferAsync$1 uodirectInfe = new EveInferenceManager$directInferAsync$1(oobject);
       EveInferenceManager$directInferAsync$2 uodirectInfe1 = new EveInferenceManager$directInferAsync$2(obj, oobject, oobject2);
       EveInferenceManager$directInferAsync$3 uodirectInfe2 = new EveInferenceManager$directInferAsync$3(oobject2, oobject1, oobject3, oobject);
       EveInferenceManager$directInferAsync$4 uodirectInfe3 = new EveInferenceManager$directInferAsync$4(oobject2, oobject1, oobject3, oobject);
       b uob = obj.a.h();
       String str = p0.f();
       String str1 = (obj.b.contains(p0.n()))? p0.n(): null;
       LabeledRunnable labeledRunna = v4;
       EveInferenceManager$directInferAsync$5 uodirectInfe4 = new EveInferenceManager$directInferAsync$5(this, p0, uodirectInfe, p4, uodirectInfe2, uodirectInfe1, p2, p1, p3, uodirectInfe3);
       LabeledRunnable labeledRunna1 = new LabeledRunnable(str, null, str1, v20, 2, null);
       b$a.a(uob, labeledRunna, 0, 2, null);
       return;
    }
    public final void e(a p0,a p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EveInferenceManager.class, "8")) {
          return;
       }
       EveLog.i$default("EveInferenceManager#startInference begin "+p0.n(), false, 2, null);
       this.d(p0, p2, EveInferenceManagerKt.b(p0).invoke(p2), p1, new EveInferenceManager$startInference$1(p0));
       return;
    }
    public final void f(a p0,a p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, EveInferenceManager.class, "7")) {
          return;
       }
       EveLog.i$default("EveInferenceManager#waitForStart begin "+p0.n(), false, 2, null);
       p0.v(t.k(EveTaskLifecycle.ACTIVATED), new EveInferenceManager$b(this, p0, p1, p2));
       return;
    }
}
