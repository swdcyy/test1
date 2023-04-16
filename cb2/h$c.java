package cb2.h$c;
import androidx.fragment.app.c$b;
import cb2.h;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cb2.i;
import java.lang.Runnable;
import ekd.k1;

public class h$c extends c$b	// class@000509
{
    public boolean a;
    public final h b;

    public void h$c(h p0){
       this.b = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$c.class, "2")) {
          return;
       }
       this.a = true;
       this.b.a9();
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h$c.class, "1")) {
          return;
       }
       if (this.a != null) {
          this.a = false;
          h$c tb = this.b;
          k1.s(new i(tb), tb, 5000);
       }
       return;
    }
}
