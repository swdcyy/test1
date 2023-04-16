package e1b.p;
import e1b.s;
import e1b.p$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import qvb.i;
import qvb.q;
import qvb.j;

public abstract class p extends s	// class@0025fb
{
    public q v;

    public void p(){
       super();
       this.v = new p$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       this.d9();
       super.E8();
       return;
    }
    public void a9(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p.class, "3")) {
          return;
       }
       if (this.q() != null) {
          this.q().a();
       }
       return;
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       if (this.q() != null) {
          this.q().h(this.v);
       }
       return;
    }
    public abstract i q();
}
