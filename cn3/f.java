package cn3.f;
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
import cn3.e;
import eo3.w;
import eo3.a;
import om3.d;
import ft5.e;

public class f extends b	// class@0005a5
{
    public e f;

    public void f(b p0,m p1,a p2,s p3,c p4){
       super(p0, p1, p2, p3, p4);
    }
    public void h(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       this.p(p0);
       super.h(p0);
       return;
    }
    public void l(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.l(p0);
       this.p(p0);
       this.f = new e(p0);
       p0.getContext().f().e().a().O0(this.f);
       return;
    }
    public final void p(g p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       if (this.f != null) {
          p0.getContext().f().e().a().M0(this.f);
       }
       return;
    }
}
