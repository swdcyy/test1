package androidx.recyclerview.widget.m$d;
import java.lang.Runnable;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.m$g;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$l$a;
import androidx.recyclerview.widget.m$e;
import android.view.ViewGroup;

public class m$d implements Runnable	// class@000921
{
    public final m$g b;
    public final int c;
    public final m d;

    public void m$d(m p0,m$g p1,int p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void run(){
       m s = this.d.s;
       if (s != null && s.isAttachedToWindow()) {
          m$d tb = this.b;
          if (tb.l == null && tb.e.getAbsoluteAdapterPosition() != -1) {
             RecyclerView$l itemAnimator = this.d.s.getItemAnimator();
             if (itemAnimator == null || (!itemAnimator.q(null) && !this.d.q())) {
                this.d.n.A(this.b.e, this.c);
             }else {
                this.d.s.post(this);
             }
          }
       }
       return;
    }
}
