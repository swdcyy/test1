package cn3.i;
import cn3.b;
import xw1.b;
import uw1.m;
import om3.a;
import eo3.s;
import nm3.c;
import eo3.g;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import oh3.j;
import cn3.g;
import eo3.w;
import eo3.a;
import om3.d;
import sx1.c;

public class i extends b	// class@0005a8
{
    public c f;
    public b g;

    public void i(b p0,m p1,a p2,s p3,c p4){
       super(p0, p1, p2, p3, p4);
    }
    public void h(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       this.p(p0);
       j.a(this.g);
       super.h(p0);
       return;
    }
    public void l(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       super.l(p0);
       this.p(p0);
       this.f = new g(this, p0);
       p0.getContext().f().e().a().Q0(this.f);
       return;
    }
    public final void p(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       if (this.f != null) {
          p0.getContext().f().e().a().N0(this.f);
       }
       return;
    }
}
