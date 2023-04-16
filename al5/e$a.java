package al5.e$a;
import androidx.recyclerview.widget.RecyclerView$n;
import al5.e;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import java.util.List;

public class e$a extends RecyclerView$n	// class@0000ce
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e$a.class, "1")) {
          return;
       }
       int childAdapter = p2.getChildAdapterPosition(p1);
       if (!childAdapter) {
          p0.left = a1.d(0x7f0703bf);
       }else {
          e z = this.a.z;
          if (z != null && childAdapter == (z.size() - 1)) {
             p0.right = a1.d(0x7f0703bf);
          }
       }
       return;
    }
}
