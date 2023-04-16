package m5a.a;
import java.lang.Runnable;
import m5a.b;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import joc.q;

public final class a implements Runnable	// class@002f37
{
    public final b b;

    public void a(b p0){
       this.b = p0;
    }
    public final void run(){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "4")) {
       }else {
          b q = tb.q;
          if (q != null) {
             q.f(false);
          }
       }
       return;
    }
}
