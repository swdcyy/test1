package c12.k$a;
import androidx.fragment.app.c$b;
import c12.k;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;

public class k$a extends c$b	// class@0004a4
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$a.class, "2")) {
          return;
       }
       Objects.requireNonNull(this.a);
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$a.class, "1")) {
          return;
       }
       Objects.requireNonNull(this.a);
       return;
    }
}
