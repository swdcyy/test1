package androidx.recyclerview.widget.StaggeredGridLayoutManager$a;
import java.lang.Runnable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.lang.Object;

public class StaggeredGridLayoutManager$a implements Runnable	// class@0008d6
{
    public final StaggeredGridLayoutManager b;

    public void StaggeredGridLayoutManager$a(StaggeredGridLayoutManager p0){
       this.b = p0;
       super();
    }
    public void run(){
       this.b.checkForGaps();
    }
}
