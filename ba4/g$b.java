package ba4.g$b;
import androidx.recyclerview.widget.RecyclerView$r;
import ba4.g;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import android.view.ViewGroup;
import android.view.View;
import ca4.a;
import com.kuaishou.merchant.marketing.base.widget.LiveMerchantScaleRecyclerView;
import java.lang.Math;

public class g$b extends RecyclerView$r	// class@000354
{
    public final g a;

    public void g$b(g p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       g$b uob = g$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (!p1) {
          g$b ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, g.class, "4")) {
             p1 = 0;
             while (p1 < ta.t.getChildCount()) {
                View childAt = ta.t.getChildAt(p1);
                if (childAt.getLeft() > ta.y || childAt.getRight() < ta.y) {
                   p1++;
                }else {
                   ta.w.r0(ta.t.getChildAdapterPosition(childAt));
                   break ;
                }
             }
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(g$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, g$b.class, "2")) {
          return;
       }
       g$b ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, g.class, "6") && !ta.u.getVisibility()) {
          if (Math.abs(ta.t.getCurrentScrollX()) >= ta.z) {
             ta.u.setAlpha(0);
          }else {
             float f = 0x3f800000 - Math.abs((((float)ta.t.getCurrentScrollX() * 0x3f800000) / (float)ta.z));
             if (f - ta.u.getAlpha() <= 0) {
                ta.u.setAlpha(f);
             }
          }
       }
       return;
    }
}
