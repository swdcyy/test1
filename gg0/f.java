package gg0.f;
import hg0.a;
import gg0.f$a;
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

public final class f extends a	// class@0024d6
{
    public int j;
    public y0 k;
    public boolean l;
    public b m;
    public boolean n;
    public static final f$a o;

    static {
       f.o = new f$a(null);
    }
    public void f(TaskCommonParams p0){
       a.p(p0, "param");
       super(p0);
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       this.j = 0;
       this.q(this.h());
       return;
    }
    public float h(){
       Object obj = PatchProxy.apply(null, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)(this.f.getMCurrentProgress() + this.j);
    }
    public int i(){
       Object obj = PatchProxy.apply(null, this, f.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (this.f.getMCurrentProgress() + this.f.getMCheckValue());
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, f.class, "11")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "10")) {
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
       PatchProxy.applyVoid(null, this, f.class, "6");
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       super.o();
       this.u();
       this.k = null;
       b9.a(this.m);
       return;
    }
    public void q(float p0){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, f.class, "8")) {
          return;
       }
       super.q(p0);
       if (this.j >= this.f.getMCheckValue() && (!PatchProxy.applyVoid(null, this, f.class, "9") && this.l == null)) {
          this.l = true;
          b9.a(this.m);
          this.m = this.e();
       }
    label_003f :
       return;
    }
    public final void u(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       if (this.n == null) {
          return;
       }
       this.n = false;
       f tk = this.k;
       if (tk != null) {
          tk.e();
       }
       TaskCenterLogUtil.d(TaskCenterLogUtil.b, "BrowseLiveChatTask", "pauseTimer", false, 4, null);
       return;
    }
}
