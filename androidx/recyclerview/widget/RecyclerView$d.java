package androidx.recyclerview.widget.RecyclerView$d;
import androidx.recyclerview.widget.ViewInfoStore$a;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import androidx.recyclerview.widget.RecyclerView$l$c;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$l;

public class RecyclerView$d implements ViewInfoStore$a	// class@00088b
{
    public final RecyclerView a;

    public void RecyclerView$d(RecyclerView p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2){
       this.a.animateAppearance(p0, p1, p2);
    }
    public void b(RecyclerView$ViewHolder p0){
       RecyclerView$d ta = this.a;
       ta.mLayout.removeAndRecycleView(p0.itemView, ta.mRecycler);
    }
    public void c(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2){
       this.a.mRecycler.J(p0);
       this.a.animateDisappearance(p0, p1, p2);
    }
    public void d(RecyclerView$ViewHolder p0,RecyclerView$l$c p1,RecyclerView$l$c p2){
       p0.setIsRecyclable(false);
       RecyclerView$d ta = this.a;
       if (ta.mDataSetHasChangedAfterLayout != null) {
          if (ta.mItemAnimator.b(p0, p0, p1, p2)) {
             this.a.postAnimationRunner();
          }
       }else if(ta.mItemAnimator.d(p0, p1, p2)){
          this.a.postAnimationRunner();
       }
       return;
    }
}
