package n7a.i;
import androidx.recyclerview.widget.RecyclerView$r;
import n7a.f;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import n7a.a;
import o7a.d;

public class i extends RecyclerView$r	// class@0030fc
{
    public final f a;

    public void i(f p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(i.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, i.class, "1")) {
          return;
       }
       i ta = this.a;
       if (ta.r != null) {
          a u = ta.u;
          if (u != null) {
             u.h((- p2));
          }
       }
       return;
    }
}
