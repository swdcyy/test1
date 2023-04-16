package a69.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.aggregate.feed.FeedAggregateFragment$a;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;

public final class b implements Runnable	// class@00004c
{
    public final FeedAggregateFragment$a b;

    public void b(FeedAggregateFragment$a p0){
       this.b = p0;
    }
    public final void run(){
       this.b.a.h0().invalidateItemDecorations();
    }
}
