package c77.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import c77.b;
import vq5.b;
import vq5.d;
import c77.c;
import c77.r;
import c77.s;
import fq5.b;
import c77.p;
import oq5.b;

public class d extends PresenterV2	// class@0004f9
{
    public b p;
    public p q;
    public d r;
    public s s;
    public b t;
    public r u;
    public Uri v;

    public void d(){
       super();
    }
    public void E8(){
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "4")) {
          this.r.t5("gzonegametab", new b(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, uod, "3")) {
          if (this.u == null) {
             this.u = new c(this);
          }
          uod = this.s;
          if (uod != null) {
             uod.a(this.u, true);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       this.r.Z4("gzonegametab");
       this.v = null;
       d ts = this.s;
       if (ts != null) {
          ts.c(this.u);
       }
       this.u = null;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.r8("LIVE_BASIC_CONTEXT");
       this.q = this.q8(p.class);
       this.r = this.r8("LIVE_ROUTER_SERVICE");
       this.s = this.s8(s.class);
       this.t = this.q8(b.class);
       return;
    }
}
