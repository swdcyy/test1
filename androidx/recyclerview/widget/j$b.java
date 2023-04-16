package androidx.recyclerview.widget.j$b;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.RecyclerView;

public class j$b extends RecyclerView$r	// class@000915
{
    public final j a;

    public void j$b(j p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       this.a.x(p0.computeHorizontalScrollOffset(), p0.computeVerticalScrollOffset());
    }
}
