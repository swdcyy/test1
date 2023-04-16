package androidx.recyclerview.widget.GridLayoutManager$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public class GridLayoutManager$LayoutParams extends RecyclerView$LayoutParams	// class@00086f
{
    public int a;
    public int b;

    public void GridLayoutManager$LayoutParams(int p0,int p1){
       super(p0, p1);
       this.a = -1;
       this.b = 0;
    }
    public void GridLayoutManager$LayoutParams(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = -1;
       this.b = 0;
    }
    public void GridLayoutManager$LayoutParams(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = -1;
       this.b = 0;
    }
    public void GridLayoutManager$LayoutParams(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.a = -1;
       this.b = 0;
    }
    public void GridLayoutManager$LayoutParams(RecyclerView$LayoutParams p0){
       super(p0);
       this.a = -1;
       this.b = 0;
    }
    public int a(){
       return this.a;
    }
    public int b(){
       return this.b;
    }
}
