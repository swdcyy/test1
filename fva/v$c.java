package fva.v$c;
import androidx.recyclerview.widget.RecyclerView$r;
import fva.v;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.component.homepage_interface.homeitemfragment.ui.HomeItemLayoutManager;
import java.util.Objects;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.List;
import com.yxcorp.gifshow.model.hotspot.HotSpotItem;
import fva.k;
import k2b.e0;

public final class v$c extends RecyclerView$r	// class@002a31
{
    public final v a;

    public void v$c(v p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(v$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, v$c.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (v.R8(this.a).mState != null && p0.getLayoutManager() instanceof HomeItemLayoutManager) {
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.kwai.component.homepage_interface.homeitemfragment.ui.HomeItemLayoutManager");
          p1 = 2;
          int[] ointArray = new int[p1];
          ointArray = layoutManage.findLastCompletelyVisibleItemPositions(ointArray)[1];
          if (ointArray >= (v.R8(this.a).mHotSpotItems.size() + 1)) {
             this.a.V8(false);
          }else if(ointArray >= 0){
             this.a.V8(1);
          }
          int[] ointArray1 = new int[p1];
          int i = layoutManage.findLastVisibleItemPositions(ointArray1)[1] - 1;
          if (i >= 0 && i < v.R8(this.a).mHotSpotItems.size()) {
             HotSpotItem hotSpotItem = v.R8(this.a).mHotSpotItems.get(i);
             if (hotSpotItem.isItemShowed == null) {
                a.o(hotSpotItem, "it");
                k.a.d(hotSpotItem, v.S8(this.a));
                hotSpotItem.isItemShowed = true;
             }
          }
       }
    label_00a3 :
       return;
    }
}
