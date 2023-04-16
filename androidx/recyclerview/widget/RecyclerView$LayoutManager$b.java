package androidx.recyclerview.widget.RecyclerView$LayoutManager$b;
import androidx.recyclerview.widget.b0$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class RecyclerView$LayoutManager$b implements b0$b	// class@000880
{
    public final RecyclerView$LayoutManager a;

    public void RecyclerView$LayoutManager$b(RecyclerView$LayoutManager p0){
       this.a = p0;
       super();
    }
    public int a(){
       return (this.a.getHeight() - this.a.getPaddingBottom());
    }
    public int b(View p0){
       return (this.a.getDecoratedTop(p0) - p0.getLayoutParams().topMargin);
    }
    public int c(){
       return this.a.getPaddingTop();
    }
    public int d(View p0){
       return (this.a.getDecoratedBottom(p0) + p0.getLayoutParams().bottomMargin);
    }
    public View getChildAt(int p0){
       return this.a.getChildAt(p0);
    }
}
