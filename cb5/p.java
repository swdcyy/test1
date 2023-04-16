package cb5.p;
import java.lang.Runnable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Object;

public final class p implements Runnable	// class@000453
{
    public final StaggeredGridLayoutManager b;
    public final int c;
    public final int d;

    public void p(StaggeredGridLayoutManager p0,int p1,int p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       this.b.scrollToPositionWithOffset(this.c, this.d);
    }
}
