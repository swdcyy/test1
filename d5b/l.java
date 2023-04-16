package d5b.l;
import androidx.recyclerview.widget.RecyclerView$n;
import lnc.a1;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class l extends RecyclerView$n	// class@002449
{
    public final int a;
    public final int b;

    public void l(){
       super();
       this.a = a1.e(10.00f);
       this.b = a1.e(12.00f);
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, l.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       p0.right = this.a;
       p0.bottom = this.b;
       return;
    }
}
