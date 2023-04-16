package androidx.recyclerview.widget.x$a;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.x;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.s;
import android.view.View;
import androidx.recyclerview.widget.x$c;

public class x$a extends RecyclerView$r	// class@00093a
{
    public int a;
    public final x b;

    public void x$a(x p0){
       this.b = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       x$a tb = this.b;
       boolean b = false;
       boolean b1 = (p1 == 2)? true: false;
       tb.f = b1;
       if (!p1 && b1) {
          tb.f = b;
          if (tb.g == null) {
             return;
          }else {
             RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
             s os = (layoutManage.canScrollVertically())? this.b.r(layoutManage): this.b.q(layoutManage);
             if (os == null) {
                return;
             }else {
                View view = this.b.t(layoutManage, os);
                if (view != null && os.g(view) == os.n()) {
                   int childAdapter = p0.getChildAdapterPosition(view);
                   if (childAdapter < 0 || (childAdapter < layoutManage.getItemCount() && this.a != childAdapter)) {
                      this.a = childAdapter;
                      this.b.g.onSnap(childAdapter);
                   }
                }
             }
          }
       }
    label_005e :
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       x$a tb = this.b;
       boolean b = (p1 < 0)? true: false;
       tb.l = b;
       return;
    }
}
