package ly9.k$b;
import java.lang.Runnable;
import ly9.k;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ly9.m;
import java.util.Objects;
import gr7.j;
import java.lang.Integer;
import pp7.b;
import android.os.Handler;

public class k$b implements Runnable	// class@002ebf
{
    public final k b;

    public void k$b(k p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, k$b.class, str)) {
          return;
       }
       if (!this.b.c.a()) {
          return;
       }
       k$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, k.class, "11")) {
          k e = tb.e;
          int i = 2;
          Objects.requireNonNull(e);
          if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), e, j.class, str)) {
             e.e.f(Integer.valueOf(i));
          }
       }
       tb = this.b;
       k a = tb.a;
       if (a != null) {
          tb.b.postDelayed(a, 5);
       }
       return;
    }
}
