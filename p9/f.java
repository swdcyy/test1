package p9.f;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;

public class f extends RecyclerView$n	// class@0028ed
{
    public int a;
    public int b;

    public void f(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       f ta = this.a;
       p0.left = ta / 2;
       p0.right = ta / 2;
       ta = this.b;
       p0.top = ta / 2;
       p0.bottom = ta / 2;
    }
}
