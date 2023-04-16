package m5a.b$a;
import uw9.y;
import m5a.b;
import java.lang.Object;
import uw9.x;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.view.ViewGroup;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;
import joc.q;

public class b$a implements y	// class@002f38
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(){
       x.a(this);
    }
    public void e(RecyclerView p0,int p1,int p2){
       b$a ta;
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$a.class, "1")) {
          return;
       }
       if (!p0.canScrollVertically(-1)) {
          ta = this.a;
          if (ta.s != null) {
             k1.r(ta.t, 500);
          }
          ta.s = false;
       }else {
          ta = this.a;
          ta.s = true;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, b.class, "5")) {
             b q = ta.q;
             if (q != null) {
                q.f(true);
             }
          }
          k1.m(this.a.t);
       }
       return;
    }
}
