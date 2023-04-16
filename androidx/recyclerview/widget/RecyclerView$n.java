package androidx.recyclerview.widget.RecyclerView$n;
import java.lang.Object;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$y;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import android.graphics.Canvas;

public abstract class RecyclerView$n	// class@000898
{

    public void RecyclerView$n(){
       super();
    }
    public void b(Rect p0,int p1,RecyclerView p2){
       p0.set(0, 0, 0, 0);
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       this.b(p0, p1.getLayoutParams().getViewLayoutPosition(), p2);
    }
    public void d(Canvas p0,RecyclerView p1,RecyclerView$y p2){
    }
    public void e(Canvas p0,RecyclerView p1,RecyclerView$y p2){
    }
}
