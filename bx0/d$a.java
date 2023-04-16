package bx0.d$a;
import androidx.fragment.app.c$b;
import bx0.d;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tf1.b;

public class d$a extends c$b	// class@000426
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "1")) {
          return;
       }
       this.a.P8();
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$a.class, "2")) {
          return;
       }
       if (this.a.R8() && this.a.A.isLoading()) {
          this.a.S8();
       }
       return;
    }
}
