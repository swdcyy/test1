package ex2.d;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;

public class d extends RecyclerView$n	// class@00280d
{
    public int a;
    public int b;
    public int c;

    public void d(int p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       p0.left = this.b;
       p0.right = this.c;
       p0.top = 0;
       p0.bottom = this.a;
    }
}
