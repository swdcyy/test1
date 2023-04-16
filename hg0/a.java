package hg0.a;
import hg0.b;
import hg0.a$a;
import nsd.u;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cg0.a;
import wkd.b;
import cg0.b;
import brd.t;
import hg0.a$b;
import erd.g;
import java.lang.Float;
import com.kuaishou.growth.taskcenter.debugtool.TaskCenterDTHelper;
import java.util.Objects;
import bg0.b;
import mrd.a;
import java.lang.Integer;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import java.lang.Boolean;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;

public abstract class a extends b	// class@002692
{
    public final a h;
    public static final a$a i;

    static {
       a.i = new a$a(null);
    }
    public void a(TaskCommonParams p0){
       a.p(p0, "mTaskParam");
       super(p0);
       a uoa = PatchProxy.apply(null, this, a.class, "10");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = b.a(0x40b3e3d1).create();
       }
       this.h = uoa;
       return;
    }
    public t c(){
       t obj = PatchProxy.apply(null, this, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.c().doOnNext(new a$b(this));
       a.o(obj, "super.buildReportRequest¡­ showTips\(response\)\n    }");
       return obj;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.h.d();
       return;
    }
    public void q(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.h.b(p0);
       TaskCenterDTHelper d = TaskCenterDTHelper.d;
       Objects.requireNonNull(d);
       TaskCenterDTHelper taskCenterDT = TaskCenterDTHelper.class;
       if (!PatchProxy.isSupport(taskCenterDT) || (!PatchProxy.applyVoidOneRefs(Float.valueOf(p0), d, taskCenterDT, "5") && !d.d())) {
          d.b().c = p0;
          d.c().onNext(Integer.valueOf(2));
       }
       return;
    }
    public void r(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "response");
       this.h.c(p0);
       return;
    }
    public final void s(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "6")) {
          return;
       }
       this.h.g(p0);
       return;
    }
    public final boolean t(RxFragmentActivity p0,int p1,String p2,String p3,boolean p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, this, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "activity");
       return this.h.f(p0, this, this.f, p1, p2, p3, p4);
    }
}
