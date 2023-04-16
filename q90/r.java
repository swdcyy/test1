package q90.r;
import v36.a$a;
import q90.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class r implements a$a	// class@00299e
{
    public final q a;

    public void r(q p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       this.a.l(false);
       this.a.s = null;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, r.class, "2")) {
          return;
       }
       this.a.l(false);
       this.a.s = null;
       return;
    }
    public void c(boolean p0){
       r or = r.class;
       if (PatchProxy.isSupport(or) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, or, "1")) {
          return;
       }
       if (!p0) {
          this.a.l(false);
          p0.s = null;
       }
       return;
    }
    public void onAnimationStart(){
    }
}
