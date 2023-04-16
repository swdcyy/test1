package d99.b$a;
import androidx.recyclerview.widget.RecyclerView$r;
import d99.b;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Set;
import java.util.Iterator;
import uw9.y;
import im8.f;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;

public class b$a extends RecyclerView$r	// class@002097
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (!this.a.p.isEmpty() && !p1) {
          Iterator iterator = this.a.p.iterator();
          while (iterator.hasNext()) {
             iterator.next().a();
          }
          if (!p1) {
             LinearLayoutManager layoutManage = this.a.r.get().getLayoutManager();
             if (!layoutManage.i0()) {
                View view = layoutManage.findViewByPosition(0);
                if (view != null && (- view.getTop()) != this.a.q.get().intValue()) {
                   this.a.q.set(Integer.valueOf((- view.getTop())));
                   Iterator iterator1 = this.a.p.iterator();
                   while (iterator1.hasNext()) {
                      iterator1.next().e(p0, 0, 0);
                   }
                }
             }
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$a.class, "1")) {
          return;
       }
       b q = this.a.q;
       q.set(Integer.valueOf((q.get().intValue() + p2)));
       if (this.a.p.isEmpty()) {
          return;
       }
       Iterator iterator = this.a.p.iterator();
       while (iterator.hasNext()) {
          iterator.next().e(p0, p1, p2);
       }
       return;
    }
}
