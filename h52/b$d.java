package h52.b$d;
import androidx.recyclerview.widget.RecyclerView$n;
import h52.b;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lnc.a1;

public class b$d extends RecyclerView$n	// class@002c4b
{
    public final b a;

    public void b$d(b p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, b$d.class, "1")) {
          return;
       }
       if (p2.getAdapter() != null) {
          p0.left = (p2.getChildAdapterPosition(p1) > 0)? - a1.e(8.00f): 0;
       }
    label_0029 :
       return;
    }
}
