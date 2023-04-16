package com.kwai.nearby.local.HomeLocalFragment$2;
import com.kwai.component.homepage_interface.homeitemfragment.ui.HomeItemLayoutManager;
import com.kwai.nearby.local.HomeLocalFragment;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import qc7.e;
import com.kwai.nearby.local.delegate.HomeLocalDelegate;

public class HomeLocalFragment$2 extends HomeItemLayoutManager	// class@000f79
{
    public final HomeLocalFragment f;

    public void HomeLocalFragment$2(HomeLocalFragment p0,int p1,int p2){
       this.f = p0;
       super(p1, p2);
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeLocalFragment$2.class, "1")) {
          return;
       }
       super.onLayoutCompleted(p0);
       RxBus.f.b(new e(this.f.Y0 instanceof HomeLocalDelegate));
       return;
    }
}
