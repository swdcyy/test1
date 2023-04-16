package cad.a$a;
import androidx.recyclerview.widget.RecyclerView$r;
import cad.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import nfd.q;

public class a$a extends RecyclerView$r	// class@00050e
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (p1) {
          return;
       }
       a$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, a.class, "9") && ta.z != null) {
          a w = ta.w;
          if (w != null && w instanceof LinearLayoutManager) {
             w = w.i0();
             View view = ta.w.findViewByPosition(w);
             if (view != null) {
                ta.z.c(view.getLeft());
             }
             ta.z.d(w);
          }
       }
       return;
    }
}
