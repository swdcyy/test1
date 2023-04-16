package androidx.recyclerview.widget.RecyclerView$LayoutManager$a;
import androidx.recyclerview.widget.b0$b;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Object;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class RecyclerView$LayoutManager$a implements b0$b	// class@00087f
{
    public final RecyclerView$LayoutManager a;

    public void RecyclerView$LayoutManager$a(RecyclerView$LayoutManager p0){
       this.a = p0;
       super();
    }
    public int a(){
       return (this.a.getWidth() - this.a.getPaddingRight());
    }
    public int b(View p0){
       return (this.a.getDecoratedLeft(p0) - p0.getLayoutParams().leftMargin);
    }
    public int c(){
       return this.a.getPaddingLeft();
    }
    public int d(View p0){
       return (this.a.getDecoratedRight(p0) + p0.getLayoutParams().rightMargin);
    }
    public View getChildAt(int p0){
       return this.a.getChildAt(p0);
    }
}
