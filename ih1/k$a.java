package ih1.k$a;
import yg1.a;
import ih1.k;
import java.lang.Object;
import java.lang.String;
import yg1.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class k$a implements a	// class@0028e8
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void a(String p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$a.class, "1")) {
       }else {
          a.p(p0, "source");
          a.p(p1, "result");
          if (p1.e()) {
             p0.c = p1;
          }
       }
       return;
    }
}
