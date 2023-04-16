package androidx.recyclerview.widget.m$c;
import androidx.recyclerview.widget.m$g;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m$e;
import java.lang.Object;
import java.util.List;
import android.view.View;

public class m$c extends m$g	// class@000920
{
    public final int o;
    public final RecyclerView$ViewHolder p;
    public final m q;

    public void m$c(m p0,RecyclerView$ViewHolder p1,int p2,int p3,float p4,float p5,float p6,float p7,int p8,RecyclerView$ViewHolder p9){
       int i = this;
       i.q = p0;
       i.o = p8;
       i.p = p9;
       super(p1, p2, p3, p4, p5, p6, p7);
    }
    public void onAnimationEnd(Animator p0){
       m$c tq;
       super.onAnimationEnd(p0);
       if (this.l != null) {
          return;
       }
       if (this.o <= null) {
          tq = this.q;
          tq.n.c(tq.s, this.p);
       }else {
          this.q.b.add(this.p.itemView);
          this.i = true;
          tq = this.o;
          if (tq > null) {
             this.q.u(this, tq);
          }
       }
       tq = this.q;
       RecyclerView$ViewHolder itemView = this.p.itemView;
       if (tq.y == itemView) {
          tq.w(itemView);
       }
       return;
    }
}
