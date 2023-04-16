package dl9.u$b;
import androidx.recyclerview.widget.RecyclerView$r;
import dl9.u;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import android.view.View;

public final class u$b extends RecyclerView$r	// class@001fab
{
    public final u a;

    public void u$b(u p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       u$b uob = u$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p1) {
          u g = this.a.G;
          if (g != null) {
             g.n();
          }
          g = this.a.G;
          if (g != null) {
             g.o();
          }
          g.G = null;
       }else {
          u$b ta = this.a;
          u b = ta.B;
          a.m(b);
          ta.c9(b);
       }
       return;
    }
}
