package androidx.recyclerview.widget.y;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$l$c;
import android.view.View;

public abstract class y extends RecyclerView$l	// class@00093e
{
    public boolean g;

    public void y(){
       super();
       this.g = true;
    }
    public abstract boolean B(RecyclerView$ViewHolder p0);
    public abstract boolean C(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,int p2,int p3,int p4,int p5);
    public abstract boolean D(RecyclerView$ViewHolder p0,int p1,int p2,int p3,int p4);
    public abstract boolean E(RecyclerView$ViewHolder p0);
    public final void F(RecyclerView$ViewHolder p0){
       this.h(p0);
    }
    public final void G(RecyclerView$ViewHolder p0,boolean p1){
       this.h(p0);
    }
    public final void H(RecyclerView$ViewHolder p0){
       this.h(p0);
    }
    public final void I(RecyclerView$ViewHolder p0){
       this.J(p0);
       this.h(p0);
    }
    public void J(RecyclerView$ViewHolder p0){
    }
    public void K(boolean p0){
       this.g = p0;
    }
    public boolean a(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2){
       if (p1 != null) {
          RecyclerView$l$c a = p1.a;
          RecyclerView$l$c a1 = p2.a;
          if (a != a1 || p1.b != p2.b) {
             return this.D(p0, a, p1.b, a1, p2.b);
          }
       }
       return this.B(p0);
    }
    public boolean b(RecyclerView$ViewHolder p0,RecyclerView$ViewHolder p1,RecyclerView$l$c p2,RecyclerView$l$c p3){
       RecyclerView$l$c ol$c;
       RecyclerView$l$c ol$c1;
       RecyclerView$l$c a = p2.a;
       RecyclerView$l$c b = p2.b;
       if (p1.shouldIgnore()) {
          ol$c = p2.b;
          ol$c1 = p2.a;
       }else {
          ol$c1 = p3.a;
          ol$c = p3.b;
       }
       return this.C(p0, p1, a, b, ol$c1, ol$c);
    }
    public boolean c(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2){
       RecyclerView$l$c a = p1.a;
       RecyclerView$l$c b = p1.b;
       RecyclerView$ViewHolder itemView = p0.itemView;
       int left = (p2 == null)? itemView.getLeft(): p2.a;
       int i = left;
       int top = (p2 == null)? itemView.getTop(): p2.b;
       int i1 = top;
       if (!p0.isRemoved() && (a != i || b != i1)) {
          itemView.layout(i, i1, (itemView.getWidth() + i), (itemView.getHeight() + i1));
          return this.D(p0, a, b, i, i1);
       }else {
          return this.E(p0);
       }
    }
    public boolean d(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2){
       RecyclerView$l$c a = p1.a;
       RecyclerView$l$c a1 = p2.a;
       if (a != a1 || p1.b != p2.b) {
          return this.D(p0, a, p1.b, a1, p2.b);
       }
       this.H(p0);
       return false;
    }
    public boolean f(RecyclerView$ViewHolder p0){
       boolean b = (this.g == null || p0.isInvalid())? true: false;
       return b;
    }
}
