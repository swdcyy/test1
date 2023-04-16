package gg0.a;
import hg0.a;
import gg0.a$a;
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
import yt5.i;
import crd.b;
import lnc.b9;
import java.lang.Float;
import ekd.y0;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import gg0.b;
import java.lang.Runnable;

public final class a extends a	// class@0024cf
{
    public int j;
    public b k;
    public y0 l;
    public boolean m;
    public boolean n;
    public i o;
    public static final a$a p;

    static {
       a.p = new a$a(null);
    }
    public void a(TaskCommonParams p0){
       a.p(p0, "param");
       super(p0);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.j = 0;
       this.q(this.h());
       return;
    }
    public float h(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)(this.f.getMCurrentProgress() + this.j);
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int mTarProgress = (this.n != null)? this.f.getMTargetProgress(): this.f.getMCurrentProgress() + this.f.getMCheckValue();
       return mTarProgress;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       this.j = 0;
       this.m = false;
       this.n = false;
       if ((this.f.getMCurrentProgress() + this.f.getMCheckValue()) < this.f.getMTargetProgress()) {
          b tf = this.f;
          tf.setMCurrentProgress((tf.getMCurrentProgress() + this.f.getMCheckValue()));
          b.a(0x5832311c).d(this.f);
       }
       return;
    }
    public void m(TaskReportResponse p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "11")) {
          return;
       }
       a.p(p0, "response");
       this.j = 0;
       this.m = false;
       this.n = false;
       if (p0.getMTaskCompleted()) {
          this.r(p0);
          a to = this.o;
          if (to != null) {
             to.a();
          }
          this.u();
       }
       return;
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.w();
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       super.o();
       this.u();
       this.l = null;
       b9.a(this.k);
       return;
    }
    public void q(float p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "9")) {
          return;
       }
       super.q(p0);
       if (this.j >= this.f.getMCheckValue()) {
          this.v();
       }
       return;
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a tl = this.l;
       if (tl != null) {
          a.m(tl);
          tl.e();
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseBehindPageTask", "pauseTimer", false, 4, null);
       return;
    }
    public final void v(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       if (this.m != null) {
          return;
       }
       this.m = true;
       b9.a(this.k);
       this.k = this.e();
       return;
    }
    public final void w(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
          return;
       }
       if (this.f.isTaskComplete()) {
          TaskCenterLogUtil.e(TaskCenterLogUtil.b, "BrowseBehindPageTask", "start timer failed, task is complete", false, 4, null);
          return;
       }else if(PatchProxy.applyVoid(objArray, this, uoa, "3") || this.l != null){
          this.l = new y0((long)1000, new b(this));
       }
       uoa = this.l;
       a.m(uoa);
       uoa.a();
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseBehindPageTask", "startTimer", false, 4, null);
       return;
    }
}
