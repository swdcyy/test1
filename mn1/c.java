package mn1.c;
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
import lnc.a1;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class c extends RecyclerView$n	// class@0031cf
{

    public void c(){
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       int b;
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       int i = a1.d(R.dimen.arg_RES_7f07034b);
       RecyclerView$Adapter obj = PatchProxy.applyTwoRefs(p2, p1, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = p2.getAdapter();
          b = (obj != null)? obj.getItemCount(): 0;
          int i2 = p2.getChildLayoutPosition(p1) + 1;
          int i3 = b % 3;
          if (!i3) {
             i3 = 3;
          }
          if (i2 > (b - i3)) {
             b = true;
          }else {
             b = false;
          }
       }
       b = (b)? 0: i;
       int i1 = (p2.getChildAdapterPosition(p1) % 3) + 1;
       p0.set((((i1 - 1) * i) / 3), 0, (((i1 - 3) * i) / 3), b);
       return;
    }
}
