package fva.v$d;
import android.view.View$OnClickListener;
import fva.v;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yua.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.component.homepage_interface.homeitemfragment.ui.HomeItemLayoutManager;
import java.util.Objects;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yxcorp.gifshow.model.hotspot.HotSpotModel;
import java.util.List;
import fva.k;
import k2b.e0;

public final class v$d implements View$OnClickListener	// class@002a32
{
    public final v b;

    public void v$d(v p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, v$d.class, "1")) {
          return;
       }
       boolean b = true;
       v.P8(this.b).S0(b);
       if (this.b.v.getLayoutManager() instanceof HomeItemLayoutManager) {
          RecyclerView$LayoutManager layoutManage = this.b.v.getLayoutManager();
          Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.kwai.component.homepage_interface.homeitemfragment.ui.HomeItemLayoutManager");
          int[] ointArray = new int[2];
          int i = layoutManage.findLastCompletelyVisibleItemPositions(ointArray)[b];
          if (i > 3 && i < (v.R8(this.b).mHotSpotItems.size() + b)) {
             this.b.V8(b);
          }
       }
       k.a.a("UNFOLD", v.S8(this.b));
       this.b.W8(3);
       return;
    }
}
