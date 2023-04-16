package fva.b$b;
import androidx.recyclerview.widget.RecyclerView$r;
import fva.b;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kwai.component.homepage_interface.homeitemfragment.ui.HomeItemLayoutManager;
import java.util.Objects;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import android.view.ViewGroup;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.graphics.Rect;

public final class b$b extends RecyclerView$r	// class@002a03
{
    public final b a;

    public void b$b(b p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, b$b.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       boolean b = false;
       p1.B = b;
       if (p0.getLayoutManager() instanceof HomeItemLayoutManager) {
          RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
          Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type com.kwai.component.homepage_interface.homeitemfragment.ui.HomeItemLayoutManager");
          int[] ointArray = new int[2];
          boolean i = layoutManage.findFirstVisibleItemPositions(ointArray)[b];
          if (i) {
             return;
          }else {
             View childAt = this.a.E.h0().getChildAt(i);
             if (a.g(childAt, this.a.x) ^ 1) {
                this.a.S8(b);
                return;
             }else {
                b$b ta = this.a;
                Objects.requireNonNull(ta);
                Rect obj = PatchProxy.applyOneRefs(childAt, ta, b.class, "13");
                if (obj != PatchProxyResult.class) {
                   i = obj.booleanValue();
                }else if(childAt != null && (childAt.getVisibility() || !childAt.getHeight())){
                   obj = new Rect();
                   obj.height();
                   childAt.getHeight();
                   if (childAt.getLocalVisibleRect(obj) && (((float)obj.height() * 0x3f800000) / (float)childAt.getHeight()) - 0x3f19999a >= 0) {
                      b = 1;
                   }
                }
             label_00b4 :
                i = b;
                ta.B = i;
                this.a.R8();
             }
          }
       }
       return;
    }
}
