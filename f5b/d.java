package f5b.d;
import v36.a$a;
import f5b.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;

public final class d implements a$a	// class@0028a7
{
    public final c a;

    public void d(c p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       this.a.n(false);
       this.a.x = null;
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.a.n(false);
       this.a.x = null;
       return;
    }
    public void c(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "1")) {
          return;
       }
       if (!p0) {
          this.a.n(false);
          p0.x = null;
       }
       return;
    }
    public void onAnimationStart(){
    }
}
