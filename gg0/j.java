package gg0.j;
import hg0.a;
import gg0.j$a;
import nsd.u;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import hg0.b;
import wkd.b;
import fg0.k;
import com.kuaishou.growth.taskcenter.model.TaskReportResponse;
import crd.b;
import lnc.b9;
import java.lang.Float;
import ekd.y0;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import gg0.k;
import java.lang.Runnable;

public final class j extends a	// class@0024dc
{
    public int j;
    public y0 k;
    public boolean l;
    public b m;
    public boolean n;
    public static final j$a o;

    static {
       j.o = new j$a(null);
    }
    public void j(TaskCommonParams p0){
       a.p(p0, "param");
       super(p0);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, j.class, "5")) {
          return;
       }
       this.j = 0;
       this.q(this.h());
       return;
    }
    public float h(){
       Object obj = PatchProxy.apply(null, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)(this.f.getMCurrentProgress() + this.j);
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, j.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.f.getMCurrentProgress() + this.f.getMCheckValue());
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, j.class, "11")) {
          return;
       }
       this.j = 0;
       this.l = false;
       if ((this.f.getMCurrentProgress() + this.f.getMCheckValue()) < this.f.getMTargetProgress()) {
          b tf = this.f;
          tf.setMCurrentProgress((tf.getMCurrentProgress() + this.f.getMCheckValue()));
          b.a(0x5832311c).d(this.f);
       }
       return;
    }
    public void m(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "10")) {
          return;
       }
       a.p(p0, "response");
       this.j = 0;
       this.l = false;
       if (p0.getMTaskCompleted()) {
          this.r(p0);
          this.u();
       }
       return;
    }
    public void n(){
       PatchProxy.applyVoid(null, this, j.class, "6");
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, j.class, "7")) {
          return;
       }
       super.o();
       this.u();
       this.k = null;
       b9.a(this.m);
       return;
    }
    public void q(float p0){
       if (PatchProxy.isSupport(j.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, j.class, "8")) {
          return;
       }
       super.q(p0);
       if (this.j >= this.f.getMCheckValue() && (!PatchProxy.applyVoid(null, this, j.class, "9") && this.l == null)) {
          this.l = true;
          b9.a(this.m);
          this.m = this.e();
       }
    label_003f :
       return;
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       if (this.n == null) {
          return;
       }
       this.n = false;
       j tk = this.k;
       if (tk != null) {
          tk.e();
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowsePageTask", "pauseTimer", false, 4, null);
       return;
    }
    public final void v(){
       j oj = j.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oj, "1")) {
          return;
       }
       if (this.n != null) {
          return;
       }
       if (this.f.isTaskComplete()) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "BrowsePageTask", "startTimer failed, task is complete", false, 4, null);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, oj, "3") || this.k != null){
          this.k = new y0(1000, new k(this));
       }
       oj = this.k;
       if (oj != null) {
          oj.a();
       }
       this.n = true;
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowsePageTask", "startTimer", false, 4, null);
       return;
    }
}
