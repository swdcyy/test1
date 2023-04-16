package hg0.b;
import hg0.b$a;
import nsd.u;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.HashMap;
import java.util.UUID;
import eg0.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import k2b.u1;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import java.lang.System;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import wkd.b;
import zf0.c;
import cjd.e;
import erd.o;
import zf0.a;
import hg0.b$b;
import erd.g;
import hg0.b$c;
import brd.z;
import io.reactivex.android.schedulers.a;
import crd.b;
import hg0.b$d;
import hg0.b$e;
import java.lang.Integer;
import java.lang.Boolean;
import fg0.k;
import java.lang.Number;
import ig0.e;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;

public abstract class b	// class@002698
{
    public boolean a;
    public final HashMap b;
    public final String c;
    public int d;
    public boolean e;
    public final TaskCommonParams f;
    public static final b$a g;

    static {
       b.g = new b$a(null);
    }
    public void b(TaskCommonParams p0){
       a a;
       a.p(p0, "mParam");
       super();
       this.f = p0;
       this.b = new HashMap();
       String str = UUID.randomUUID().toString();
       a.o(str, "UUID.randomUUID\(\).toString\(\)");
       this.c = str;
       this.e = true;
       a = a.a;
       Objects.requireNonNull(a);
       if (PatchProxy.applyVoidOneRefs(this, a, a.class, "1")) {
       }else {
          a.p(this, "task");
          u1.R("NBS_ACTIVITY_TASK_START", a.a(this).e(), 9);
       }
       return;
    }
    public t c(){
       a a;
       t obj = PatchProxy.apply(null, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.i();
       String str = String.valueOf(System.currentTimeMillis());
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "Task", "taskReport: taskToken = "+this.f.getMTaskToken()+", taskType = "+this.f.getMTaskTypeId()+", reportValue = "+i+", target= "+this.f.getMTargetProgress(), false, 4, null);
       if (this.e != null) {
          this.e = false;
          a = a.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoidOneRefs(this, a, a.class, "2")) {
             a.p(this, "task");
             u1.R("NBS_ACTIVITY_TASK_FIRST_REPORT", a.a(this).e(), 9);
          }
       }
       obj = b.a(-449945749).a(this.f.getMBizId(), this.f.getMTaskToken(), this.f.getMTaskTypeId(), (long)i, str).map(new e()).retryWhen(new a(0x4e8d)).doOnNext(new b$b(this, i)).doOnError(new b$c(this)).observeOn(a.c());
       a.o(obj, "Singleton.get\(TaskCenter¡­dSchedulers.mainThread\(\)\)");
       return obj;
    }
    public abstract void d();
    public final b e(){
       b obj = PatchProxy.apply(null, this, b.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       int i = this.i();
       obj = this.c().subscribe(new b$d(this, i), new b$e(this, i));
       a.o(obj, "buildReportRequest\(\)\n   ¡­ailed\(\)\n        }\n      }");
       return obj;
    }
    public final void f(int p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, uob, "12")) {
          return;
       }
       this.f.setMCurrentProgress(p0);
       p0 = 0x5832311c;
       if (p1) {
          b.a(p0).b(this.f);
       }else {
          b.a(p0).d(this.f);
       }
       return;
    }
    public final TaskCommonParams g(){
       return this.f;
    }
    public float h(){
       Object obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.f.getMCurrentProgress();
    }
    public abstract int i();
    public final boolean j(){
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.f.isTaskComplete();
    }
    public final boolean k(){
       Object obj = PatchProxy.apply(null, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return e.a(this.f);
    }
    public void l(){
    }
    public void m(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "13")) {
          return;
       }
       a.p(p0, "response");
       return;
    }
    public void n(){
    }
    public void o(){
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       if (this.a == null) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "Task", "stop failed, task not execute", false, 4, null);
          return;
       }else {
          TaskCenterLogUtil.d(TaskCenterLogUtil.b, "Task", "task: "+this.f.getMTaskTypeId()+" | "+this.f.getMTaskToken()+" stopped", false, 4, null);
          this.a = false;
          this.o();
          return;
       }
    }
}
