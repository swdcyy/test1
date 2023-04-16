package cwb.a;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import lnc.a1;

public final class a extends RecyclerView$n	// class@002084
{
    public final int a;
    public final float b;

    public void a(int p0,float p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       ViewGroup$LayoutParams layoutParams = p1.getLayoutParams();
       Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
       int i = layoutParams.a();
       if (layoutParams.b()) {
          p0.left = a1.e(19.00f);
          p0.right = a1.e(19.00f);
       }else {
          float f = 4.00f;
          if (!i) {
             p0.left = a1.e(19.00f);
             p0.right = a1.e(f);
          }else if(i == (this.a - 1)){
             p0.left = a1.e(f);
             p0.right = a1.e(19.00f);
          }else {
             p0.left = a1.e(f);
             p0.right = a1.e(f);
          }
       }
       p0.top = a1.e(this.b);
       return;
    }
}
