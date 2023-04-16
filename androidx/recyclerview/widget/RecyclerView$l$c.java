package androidx.recyclerview.widget.RecyclerView$l$c;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;

public class RecyclerView$l$c	// class@000895
{
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public void RecyclerView$l$c(){
       super();
    }
    public RecyclerView$l$c a(RecyclerView$ViewHolder p0){
       this.b(p0, 0);
       return this;
    }
    public RecyclerView$l$c b(RecyclerView$ViewHolder p0,int p1){
       p0 = p0.itemView;
       this.a = p0.getLeft();
       this.b = p0.getTop();
       this.c = p0.getRight();
       this.d = p0.getBottom();
       return this;
    }
}
