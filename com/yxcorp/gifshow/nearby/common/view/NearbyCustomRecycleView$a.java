package com.yxcorp.gifshow.nearby.common.view.NearbyCustomRecycleView$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.nearby.common.view.NearbyCustomRecycleView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mrb.a;
import q87.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.StringBuilder;
import java.lang.Integer;
import trb.b;

public final class NearbyCustomRecycleView$a implements Runnable	// class@00213e
{
    public final NearbyCustomRecycleView b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public void NearbyCustomRecycleView$a(NearbyCustomRecycleView p0,boolean p1,int p2,int p3,int p4,int p5){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NearbyCustomRecycleView$a.class, "1")) {
          return;
       }
       try{
          this.b.onLayout(this.c, this.d, this.e, this.f, this.g);
       }catch(java.lang.Exception e0){
          Object[] objArray1 = new Object[0];
          a.C().t(e0, "tryCatch fail", objArray1);
       }
       RecyclerView$Adapter adapter = this.b.getAdapter();
       if (adapter != null) {
          this.b.B(adapter);
       }
       StringBuilder str = "count:";
       if (adapter != null) {
          objArray = Integer.valueOf(adapter.getItemCount());
       }
       b.a(e0, str+objArray);
       return;
    }
}
