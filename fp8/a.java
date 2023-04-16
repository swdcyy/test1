package fp8.a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import androidx.recyclerview.widget.s;

public class a	// class@002341
{
    public final RecyclerView a;
    public final RecyclerView$LayoutManager b;

    public void a(RecyclerView p0){
       super();
       this.a = p0;
       this.b = p0.getLayoutManager();
    }
    public final View a(int p0,int p1,boolean p2,boolean p3){
       s obj;
       View childAt;
       if (PatchProxy.isSupport(a.class)) {
          obj = PatchProxy.applyFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), this, a.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = (this.b.canScrollVertically())? s.c(this.b): s.a(this.b);
       int i = obj.n();
       int i1 = obj.i();
       int i2 = (p1 > p0)? 1: -1;
       View view = null;
       while (true) {
          if (p0 == p1) {
             return view;
          }
          childAt = this.b.getChildAt(p0);
          int i3 = obj.g(childAt);
          int i4 = obj.d(childAt);
          if (i3 < i1 && i4 > i) {
             if (p2) {
                if (i3 >= i && i4 <= i1) {
                   break ;
                }else if(p3 && view == null){
                   view = childAt;
                }
             }else {
                return childAt;
             }
          }
          p0 = p0 + i2;
       }
       return childAt;
    }
}
