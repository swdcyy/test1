package com.yxcorp.gifshow.nearby.common.view.NearbyCustomRecycleView$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.nearby.common.view.NearbyCustomRecycleView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class NearbyCustomRecycleView$b implements Runnable	// class@00213f
{
    public final NearbyCustomRecycleView b;
    public final RecyclerView$Adapter c;

    public void NearbyCustomRecycleView$b(NearbyCustomRecycleView p0,RecyclerView$Adapter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, NearbyCustomRecycleView$b.class, "1")) {
          return;
       }
       this.b.B(this.c);
       return;
    }
}
