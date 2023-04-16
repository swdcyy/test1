package f1b.d;
import java.lang.Object;
import z2b.a;
import z2b.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y0b.j;
import java.util.Objects;
import f1b.a;
import s2b.a;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView;
import z0b.b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx;
import w0b.g;
import java.lang.Comparable;
import java.lang.Integer;
import java.lang.Math;

public class d	// class@00286c
{
    public b a;
    public b b;
    public j c;
    public int d;
    public a e;
    public static final boolean f;

    public void d(){
       super();
       this.d = -1;
       this.a = new a();
    }
    public void d(b p0){
       super();
       this.d = -1;
       this.a = p0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       int i = 0;
       while (i <= this.d) {
          Object obj = this.c.u(i);
          d te = this.e;
          if (te != null && obj != null) {
             Objects.requireNonNull(te);
             if (!PatchProxy.applyVoidOneRefs(obj, te, a.class, "2") && te.a.b(obj)) {
                te.b.add(obj);
             }
          }
          i = i + 1;
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       d tb = this.b;
       if (tb != null && this.e != null) {
          RecyclerView$LayoutManager layoutManage = tb.h0().getLayoutManager();
          int i = layoutManage.c();
          if (this.c.C(i)) {
             return;
          }else {
             i = i - this.c.y().d().intValue();
             this.d = Math.max(i, this.d);
             if (!this.a.b(layoutManage, i)) {
                this.d = this.d - 1;
             }
             this.d = Math.min(this.d, (this.c.t() - 1));
          }
       }
       return;
    }
}
