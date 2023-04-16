package bq7.a;
import com.kwai.slide.play.detail.dispatcher.slide.DispatchBaseElement;
import rp7.a;
import jh5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.IllegalArgumentException;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;
import java.lang.Long;
import qp7.b;
import qp7.g;
import bq7.b;
import bq7.g;
import bq7.a$a;
import bq7.a$b;

public abstract class a extends DispatchBaseElement	// class@000441
{
    public Runnable t;
    public Runnable u;

    public void a(a p0,a p1){
       a.p(p0, "bizType");
       super(p0, p1);
       if (!p0.d()) {
          return;
       }
       throw new IllegalArgumentException("BaseBottomPanelElement positionInGroup must be 0");
    }
    public final void n0(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a tt = this.t;
       if (tt != null) {
          k1.m(tt);
          this.t = null;
       }
       tt = this.u;
       if (tt != null) {
          k1.m(tt);
          this.u = null;
       }
       return;
    }
    public final void o0(Object p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uoa, "3")) {
          return;
       }
       this.n0();
       if (this.m != null) {
          this.D().a(p0);
       }
       p0 = new a$a(this);
       this.u = p0;
       k1.r(p0, p1);
       return;
    }
    public final void p0(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.n0();
       if (this.m != null) {
          this.D().a(p0);
       }
       this.b0();
       return;
    }
    public final void q0(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       this.n0();
       this.c0();
       if (this.m != null) {
          this.D().a(p0);
       }else {
          a$b uob = new a$b(this, p0);
          this.t = uob;
          k1.r(uob, 0);
       }
       return;
    }
}
