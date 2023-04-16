package im1.e$b;
import androidx.transition.d;
import im1.e;
import androidx.transition.Transition;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Runnable;
import ekd.k1;

public class e$b extends d	// class@00294b
{
    public final e a;

    public void e$b(e p0){
       this.a = p0;
       super();
    }
    public void b(Transition p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$b.class, "1")) {
          return;
       }
       this.a.d9(4);
       e$b ta = this.a;
       if (ta.Q == 1) {
          k1.s(ta.Z, ta, 3000);
       }else {
          ta.a9();
       }
       return;
    }
}
