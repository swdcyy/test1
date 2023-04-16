package cv1.a;
import ks5.g;
import xu1.j;
import dv1.p;
import java.lang.Object;
import ks5.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ks5.m;
import ks5.b;

public class a implements g	// class@001e56
{
    public final j a;
    public final p b;

    public void a(j p0,p p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       if (p0.n() == 1) {
          this.a.c(p0);
       }else {
          this.b.c(p0);
       }
       return;
    }
    public void b(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       if (p0.n() == 1) {
          this.a.b(p0);
       }else {
          this.b.b(p0);
       }
       return;
    }
}
