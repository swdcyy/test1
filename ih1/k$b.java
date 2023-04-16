package ih1.k$b;
import yg1.a;
import ih1.k;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class k$b implements a	// class@0028e9
{
    public final k a;
    public final a b;

    public void k$b(k p0,a p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$b.class, "1")) {
       }else {
          a.p(p0, "source");
          a.p(p1, "result");
          if (p1.e()) {
             this.a.c = p1;
          }
          this.b.a(p0, p1);
       }
       return;
    }
}
