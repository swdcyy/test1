package com.kwai.sdk.eve.internal.task.EveTaskManager;
import zn7.g;
import vm7.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.task.EveTaskManager$onPackageStatusChanged$1;
import com.kwai.sdk.eve.internal.task.EveTaskManager$onTaskActived$1;
import java.util.HashMap;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import zn7.a;
import java.lang.StringBuilder;
import com.kwai.sdk.eve.internal.common.utils.EveLog;
import com.kwai.sdk.eve.internal.task.EveTaskLifecycle;
import zn7.e;
import java.lang.Runnable;
import fn7.b;
import ao7.a;
import kotlin.collections.CollectionsKt__CollectionsKt;
import msd.l;
import com.yxcorp.download.DownloadManager;
import msd.a;
import com.kwai.sdk.eve.internal.task.EveTaskManagerKt;
import com.kwai.sdk.eve.internal.task.EveTaskManager$deactivate$1;
import com.kwai.sdk.eve.internal.inference.EveInferenceManagerKt;
import com.kwai.sdk.eve.internal.task.EveTaskManager$deactivate$2;
import msd.p;
import com.kwai.sdk.eve.internal.task.EveTaskManager$deactivate$3;
import com.kwai.sdk.eve.internal.task.EveTaskManager$a;
import nsd.u;
import java.util.Map;
import tn7.b;
import java.lang.Integer;
import msd.q;
import java.lang.Throwable;
import java.io.File;
import com.kwai.sdk.eve.internal.task.EveTaskManager$b;
import qrd.l1;
import trd.t;
import com.kwai.sdk.eve.internal.task.EveTaskManager$c;
import cn7.b;
import com.kwai.sdk.eve.internal.common.scheduler.LabeledRunnable;
import com.kuaishou.eve.packageinfo.model.ResourceType;
import cn7.b$a;
import java.lang.Boolean;
import en7.t;
import en7.t$b;
import io.reactivex.subjects.PublishSubject;
import java.util.Objects;
import en7.b;
import com.kwai.sdk.eve.internal.task.EveTaskManager$d;

public final class EveTaskManager implements g	// class@0015cc
{
    public q a;
    public l b;
    public final HashMap c;
    public final a d;

    public void EveTaskManager(a p0){
       a.p(p0, "context");
       super();
       this.d = p0;
       this.a = EveTaskManager$onPackageStatusChanged$1.INSTANCE;
       this.b = EveTaskManager$onTaskActived$1.INSTANCE;
       this.c = new HashMap();
    }
    public List a(){
       EveTaskManager obj = PatchProxy.apply(null, this, EveTaskManager.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       _monitor_enter(obj);
       Collection uCollection = this.c.values();
       a.o(uCollection, "tasks.values");
       _monitor_exit(obj);
       return CollectionsKt___CollectionsKt.G5(uCollection);
    }
    public a b(String p0){
       EveTaskManager obj = PatchProxy.applyOneRefs(p0, this, EveTaskManager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "name");
       obj = this.c;
       _monitor_enter(obj);
       _monitor_exit(obj);
       return this.c.get(p0);
    }
    public final void c(a p0){
       EveTaskManager uEveTaskMana = EveTaskManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uEveTaskMana, "16")) {
          return;
       }
       EveLog.i$default("EveTaskManager#activateTask "+p0.n(), false, 2, null);
       if (p0.g() == EveTaskLifecycle.INSTALLED) {
          if (!PatchProxy.applyVoidOneRefs(p0, this, uEveTaskMana, "17")) {
             p0.o(new e(this, p0));
          }
          b uob = this.d.d();
          List list = PatchProxy.apply(null, p0, a.class, "9");
          if (list != PatchProxyResult.class) {
          }else {
             a h = p0.h;
             if (h != null) {
                list = h.K3();
                if (list == null) {
                }
             }else {
             }
          }
          uob.b(p0, list);
       }
       p0.t(false);
       this.b.invoke(p0.n());
       DownloadManager.C("feed_eve_task_file", null);
       EveTaskManagerKt.a(p0).invoke();
       EveLog.i$default("EveTaskManager#activateTask end", false, 2, null);
       return;
    }
    public final void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveTaskManager.class, "4")) {
          return;
       }
       a.p(p0, "taskId");
       EveLog.i$default("EveTaskManager#deactivate begin "+p0, false, 2, null);
       a uoa = this.b(p0);
       if (uoa != null) {
          EveInferenceManagerKt.f(uoa, EveTaskManager$deactivate$1.INSTANCE);
          EveInferenceManagerKt.e(uoa, EveTaskManager$deactivate$2.INSTANCE);
          EveTaskManagerKt.b(uoa, EveTaskManager$deactivate$3.INSTANCE);
          this.j(uoa, new EveTaskManager$a(this, uoa, p0));
          EveLog.i$default("EveTaskManager#deactivate finish", false, 2, null);
       }
       return;
    }
    public final a e(String p0){
       EveTaskManager obj = PatchProxy.applyOneRefs(p0, this, EveTaskManager.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "taskId");
       obj = this.c;
       _monitor_enter(obj);
       a uoa = this.c.get(p0);
       if (uoa == null) {
          EveLog.i$default("EveTaskManager#ensureTaskExist create task "+p0, false, 2, null);
          a uoa1 = new a(p0, EveTaskLifecycle.NONE, this.d, false, 8, null);
          this.c.put(p0, uoa);
       }
       _monitor_exit(obj);
       return uoa;
    }
    public final a f(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EveTaskManager.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "name");
       return this.e(p0);
    }
    public final void g(b p0,a p1){
       File uFile;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveTaskManager.class, "14")) {
          return;
       }
       EveLog.i$default("EveTaskManager#loadFromNone "+p1.n(), false, 2, null);
       this.a.invoke(p0.taskId, Integer.valueOf(2), p0);
       p1.s(EveTaskLifecycle.UPDATING);
       p1.p(p0);
       p1.s(EveTaskLifecycle.INSTALLED);
       StringBuilder str = "EveTaskManager#loadFromNone finish ";
       p1 = p1.h();
       if (p1 != null) {
          b uob = p1.R3();
          if (uob != null) {
             uFile = uob.a();
          label_0071 :
             EveLog.i$default(str+uFile, false, 2, null);
             return;
          }
       }
       uFile = null;
       goto label_0071 ;
    }
    public final void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveTaskManager.class, "9")) {
          return;
       }
       a.p(p0, "packageInfo");
       EveLog.i$default("EveTaskManager#onNewPackage begin "+p0.taskId+' '+p0.version, false, 2, null);
       EveTaskManager tc = this.c;
       _monitor_enter(tc);
       a uoa = this.e(p0.taskId);
       this.j(uoa, new EveTaskManager$b(uoa, this, p0));
       _monitor_exit(tc);
       return;
    }
    public final void i(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveTaskManager.class, "10")) {
          return;
       }
       EveLog.i$default("EveTaskManager#pendActive "+p0.n(), false, 2, null);
       p0.v(t.k(EveTaskLifecycle.INSTALLED), new EveTaskManager$c(this, p0));
       return;
    }
    public final void j(a p0,Runnable p1){
       String str;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EveTaskManager.class, "20")) {
          return;
       }
       b uob = this.d.h();
       p0 = p0.h();
       if (p0 != null) {
          str = p0.m();
          if (str != null) {
          label_0022 :
             LabeledRunnable labeledRunna = new LabeledRunnable(str, null, "task", p1, 2, null);
             b$a.a(uob, v8, false, 2, null);
             return;
          }
       }
       str = "";
       goto label_0022 ;
    }
    public final void k(a p0,boolean p1){
       a uoa = a.class;
       EveTaskManager uEveTaskMana = EveTaskManager.class;
       if (PatchProxy.isSupport(uEveTaskMana) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uEveTaskMana, "15")) {
          return;
       }
       EveLog.i$default("EveTaskManager#unload begin "+p0.n()+' '+p0.g(), false, 2, null);
       b uob = PatchProxy.apply(null, p0, uoa, "16");
       if (uob != PatchProxyResult.class) {
       }else {
          EveLog.i$default("EveTask#unload begin "+p0.k, false, 2, null);
          a h = p0.h;
          uob = (h != null)? h.R3(): null;
          p0.h = null;
          if (!PatchProxy.applyVoid(null, p0, uoa, "23")) {
             t$b.b(p0);
          }
          EveLog.i$default("EveTask#unload finish", false, 2, null);
       }
       EveTaskLifecycle nONE = EveTaskLifecycle.NONE;
       p0.s(nONE);
       if (p1 && !PatchProxy.applyVoid(null, p0, uoa, "17")) {
          p0.b.onComplete();
          PublishSubject publishSubje = PublishSubject.g();
          a.o(publishSubje, "PublishSubject.create\(\)");
          p0.b = publishSubje;
          a g = p0.g;
          Objects.requireNonNull(g);
          if (!PatchProxy.applyVoid(null, g, b.class, "5")) {
             g.d = null;
             g.b.clear();
             g.c.clear();
          }
          p0.g.a(nONE);
       }
       if (uob != null) {
          this.a.invoke(uob.taskId, Integer.valueOf(3), uob);
       }
       EveLog.i$default("EveTaskManager#unload finish", false, 2, null);
       return;
    }
    public void remove(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EveTaskManager.class, "5")) {
          return;
       }
       a.p(p0, "taskId");
       EveLog.i$default("EveTaskManager#remove "+p0, false, 2, null);
       a uoa = this.b(p0);
       if (uoa != null) {
          uoa.v(t.k(EveTaskLifecycle.TERMINATED), new EveTaskManager$d(this, p0));
          this.d(p0);
          EveLog.i$default("EveTaskManager#remove finish "+p0, false, 2, null);
       }
       return;
    }
}
