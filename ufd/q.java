package ufd.q;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import g9c.d;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public abstract class q extends RecyclerView$n	// class@002714
{

    public void q(){
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       RecyclerView$Adapter this;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, q.class, "1")) {
          return;
       }
       this = p2.getAdapter();
       int childAdapter = p2.getChildAdapterPosition(p1);
       if (!this.g1(childAdapter) && !this.e1(childAdapter)) {
          if (this.getItemCount() <= 0) {
             return;
          }else {
             StaggeredGridLayoutManager$LayoutParams layoutParams = p1.getLayoutParams();
             if (layoutParams.b()) {
                return;
             }else {
                this.g(p0, p2, p1, this, childAdapter, layoutParams.a(), p2.getLayoutManager().getSpanCount());
             }
          }
       }
       return;
    }
    public abstract int f(int p0);
    public abstract void g(Rect p0,RecyclerView p1,View p2,d p3,int p4,int p5,int p6);
}
