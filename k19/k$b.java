package k19.k$b;
import androidx.fragment.app.c$b;
import k19.k;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import k19.b;

public class k$b extends c$b	// class@002a85
{
    public final k a;

    public void k$b(k p0){
       this.a = p0;
       super();
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       j0.a("AdDetailECommercePresenter", "onFragmentPaused", objArray);
       k a = this.a.A;
       if (a != null) {
          a.d();
       }
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$b.class, "1")) {
          return;
       }
       k a = this.a.A;
       if (a != null) {
          a.b();
       }
       return;
    }
}
