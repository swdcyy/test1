package androidx.recyclerview.widget.LinearLayoutManager$c;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.RecyclerView$t;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class LinearLayoutManager$c	// class@000878
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public List l;
    public boolean m;

    public void LinearLayoutManager$c(){
       super();
       this.a = true;
       this.h = 0;
       this.i = 0;
       this.j = false;
       this.l = null;
    }
    public void a(){
       this.b(null);
    }
    public void b(View p0){
       p0 = this.f(p0);
       this.d = (p0 == null)? -1: p0.getLayoutParams().getViewLayoutPosition();
       return;
    }
    public boolean c(RecyclerView$y p0){
       LinearLayoutManager$c td = this.d;
       boolean b = (td >= null && td < p0.c())? true: false;
       return b;
    }
    public View d(RecyclerView$t p0){
       if (this.l != null) {
          return this.e();
       }
       this.d = this.d + this.e;
       return p0.o(this.d);
    }
    public final View e(){
       RecyclerView$ViewHolder itemView;
       int i = this.l.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          itemView = this.l.get(i1).itemView;
          RecyclerView$LayoutParams layoutParams = itemView.getLayoutParams();
          if (!layoutParams.isItemRemoved() && this.d == layoutParams.getViewLayoutPosition()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       this.b(itemView);
       return itemView;
    }
    public View f(View p0){
       int i = this.l.size();
       View view = null;
       int i1 = Integer.MAX_VALUE;
       int i2 = 0;
       while (i2 < i) {
          RecyclerView$ViewHolder itemView = this.l.get(i2).itemView;
          RecyclerView$LayoutParams layoutParams = itemView.getLayoutParams();
          if (itemView != p0 && !layoutParams.isItemRemoved()) {
             int i3 = layoutParams.getViewLayoutPosition() - this.d;
             i3 = i3 * this.e;
             if (i3 >= 0 && i3 < i1) {
                view = itemView;
                if (!i3) {
                   break ;
                }else {
                   i1 = i3;
                }
             }
          }
          i2 = i2 + 1;
       }
       return view;
    }
}
