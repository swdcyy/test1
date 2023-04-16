package androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$c;

public class StaggeredGridLayoutManager$LayoutParams extends RecyclerView$LayoutParams	// class@0008d0
{
    public StaggeredGridLayoutManager$c a;
    public boolean b;

    public void StaggeredGridLayoutManager$LayoutParams(int p0,int p1){
       super(p0, p1);
    }
    public void StaggeredGridLayoutManager$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void StaggeredGridLayoutManager$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
    }
    public void StaggeredGridLayoutManager$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
    }
    public void StaggeredGridLayoutManager$LayoutParams(RecyclerView$LayoutParams p0){
       super(p0);
    }
    public final int a(){
       StaggeredGridLayoutManager$LayoutParams ta = this.a;
       if (ta == null) {
          return -1;
       }
       return ta.e;
    }
    public boolean b(){
       return this.b;
    }
    public void c(boolean p0){
       this.b = p0;
    }
}
