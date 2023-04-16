package androidx.recyclerview.widget.RecyclerView$a;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import android.view.ViewGroup;

public class RecyclerView$a implements Runnable	// class@000888
{
    public final RecyclerView b;

    public void RecyclerView$a(RecyclerView p0){
       this.b = p0;
       super();
    }
    public void run(){
       RecyclerView$a tb = this.b;
       if (tb.mFirstLayoutComplete != null && !tb.isLayoutRequested()) {
          tb = this.b;
          if (tb.mIsAttached == null) {
             tb.requestLayout();
             return;
          }else if(tb.mLayoutSuppressed != null){
             tb.mLayoutWasDefered = true;
             return;
          }else {
             tb.consumePendingUpdateOperations();
          }
       }
       return;
    }
}
