package fw2.d;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.WeakHashMap;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$q;
import fw2.d$a;
import java.util.Map;

public final class d	// class@0029f3
{
    public final WeakHashMap a;
    public final a b;

    public void d(a p0){
       a.p(p0, "onInterceptTouchEvent");
       super();
       this.b = p0;
       this.a = new WeakHashMap();
    }
    public final void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "view");
       if (!p0 instanceof RecyclerView) {
          if (p0 instanceof ViewGroup) {
             p0 = p0.getChildAt(0);
             if (p0 != null) {
                this.a(p0);
             }
          }
       }else {
          RecyclerView$q oq = this.a.get(p0);
          if (oq != null) {
             this.a.remove(p0);
             p0.removeOnItemTouchListener(oq);
          }
          d$a uoa = new d$a(this);
          this.a.put(p0, uoa);
          p0.addOnItemTouchListener(uoa);
       }
       return;
    }
    public final void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "2")) {
          return;
       }
       a.p(p0, "view");
       if (!p0 instanceof RecyclerView) {
          if (p0 instanceof ViewGroup) {
             p0 = p0.getChildAt(0);
             if (p0 != null) {
                this.b(p0);
             }
          }
       }else {
          RecyclerView$q oq = this.a.get(p0);
          if (oq != null) {
             this.a.remove(p0);
             p0.removeOnItemTouchListener(oq);
          }
       }
       return;
    }
}
