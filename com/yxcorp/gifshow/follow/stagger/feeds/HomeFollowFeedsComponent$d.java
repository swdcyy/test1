package com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$d;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import z0b.b;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.follow.stagger.feeds.HomeFollowFeedsComponent$d$a;
import android.view.ViewGroup;

public final class HomeFollowFeedsComponent$d implements Runnable	// class@001189
{
    public final HomeFollowFeedsComponent b;

    public void HomeFollowFeedsComponent$d(HomeFollowFeedsComponent p0){
       this.b = p0;
       super();
    }
    public final void run(){
       RecyclerView recyclerView;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeFollowFeedsComponent$d.class, "1")) {
          return;
       }
       b uob = HomeFollowFeedsComponent.N(this.b);
       if (!uob instanceof RecyclerFragment) {
          uob = objArray;
       }
       if (uob != null) {
          recyclerView = uob.h0();
          if (recyclerView != null) {
             RecyclerView$Adapter adapter = recyclerView.getAdapter();
             if (adapter != null) {
                adapter.k0();
             }
          }
       }
       uob = HomeFollowFeedsComponent.N(this.b);
       if (uob instanceof RecyclerFragment) {
          objArray = uob;
       }
       if (objArray != null) {
          recyclerView = objArray.h0();
          if (recyclerView != null) {
             recyclerView.post(HomeFollowFeedsComponent$d$a.b);
          }
       }
       return;
    }
}
