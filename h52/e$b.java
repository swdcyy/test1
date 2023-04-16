package h52.e$b;
import androidx.recyclerview.widget.RecyclerView$n;
import h52.e;
import lnc.a1;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.GridLayoutManager$LayoutParams;

public class e$b extends RecyclerView$n	// class@002c52
{
    public final int a;
    public final e b;

    public void e$b(e p0){
       this.b = p0;
       super();
       this.a = a1.e(2.00f);
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e$b.class, "1")) {
          return;
       }
       p0.right = (!(p1.getLayoutParams().a() % 2))? this.a / 2: this.a / 2;
       p0.top = 0;
       p0.bottom = this.a;
       return;
    }
}
