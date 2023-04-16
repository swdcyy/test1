package bg3.e$d;
import androidx.recyclerview.widget.RecyclerView$n;
import bg3.e;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.a1;

public class e$d extends RecyclerView$n	// class@0003a3
{
    public final e a;

    public void e$d(e p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, e$d.class, "1")) {
          return;
       }
       super.c(p0, p1, p2, p3);
       p0.bottom = a1.e(4.00f);
       return;
    }
}
