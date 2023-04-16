package ccd.a;
import androidx.recyclerview.widget.RecyclerView$n;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iy5.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.GridLayoutManager;
import rkd.b;
import lnc.a1;

public class a extends RecyclerView$n	// class@000526
{
    public final boolean a;
    public final int b;

    public void a(boolean p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "1")) {
          return;
       }
       int b = a.b;
       p0.top = b;
       int childAdapter = p2.getChildAdapterPosition(p1);
       int i = 2;
       if (p2.getLayoutManager() instanceof GridLayoutManager) {
          i = p2.getLayoutManager().getSpanCount();
       }
       int i1 = (b.g())? b: a.e;
       int i2 = childAdapter % i;
       if (!i2) {
          p0.right = i1;
       }else if(i2 == (i - 1)){
          p0.left = i1;
       }else {
          p0.right = i1;
          p0.left = i1;
       }
       p0.bottom = ((childAdapter / i) == (this.b - 1) && this.a == null)? a1.e(23.00f): b;
       return;
    }
}
