package androidx.recyclerview.widget.RecyclerView$b;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$l;

public class RecyclerView$b implements Runnable	// class@000889
{
    public final RecyclerView b;

    public void RecyclerView$b(RecyclerView p0){
       this.b = p0;
       super();
    }
    public void run(){
       RecyclerView mItemAnimato = this.b.mItemAnimator;
       if (mItemAnimato != null) {
          mItemAnimato.v();
       }
       this.b.mPostedAnimatorRunner = false;
       return;
    }
}
