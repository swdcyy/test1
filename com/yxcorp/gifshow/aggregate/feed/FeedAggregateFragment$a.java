package com.yxcorp.gifshow.aggregate.feed.FeedAggregateFragment$a;
import androidx.recyclerview.widget.RecyclerView$i;
import com.yxcorp.gifshow.aggregate.feed.FeedAggregateFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import a69.b;
import java.lang.Runnable;
import android.view.ViewGroup;

public class FeedAggregateFragment$a extends RecyclerView$i	// class@00192a
{
    public final FeedAggregateFragment a;

    public void FeedAggregateFragment$a(FeedAggregateFragment p0){
       this.a = p0;
       super();
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, FeedAggregateFragment$a.class, "1")) {
          return;
       }
       this.a.h0().postDelayed(new b(this), 250);
       return;
    }
}
