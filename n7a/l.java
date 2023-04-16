package n7a.l;
import androidx.recyclerview.widget.RecyclerView$r;
import n7a.o;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import n7a.a;
import o7a.d;

public class l extends RecyclerView$r	// class@0030ff
{
    public final o a;

    public void l(o p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(l.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, l.class, "1")) {
          return;
       }
       l ta = this.a;
       if (ta.r != null) {
          a u = ta.u;
          if (u != null) {
             u.h((ta.z - p2));
          }
       }
       return;
    }
}
