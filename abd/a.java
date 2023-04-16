package abd.a;
import androidx.recyclerview.widget.RecyclerView$n;
import abd.b;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import nfd.t0;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import lnc.a1;

public class a extends RecyclerView$n	// class@0000bd
{
    public final b a;

    public void a(b p0){
       this.a = p0;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "1")) {
          return;
       }
       p0.left = (p2.getChildLayoutPosition(p1) < this.a.G)? t0.t: t0.i / 2;
       p0.right = (p2.getChildLayoutPosition(p1) == (p2.getAdapter().getItemCount() - 1))? a1.d(0x7f070549): t0.i / 2;
       p0.top = t0.i;
       p0.bottom = 0;
       return;
    }
}
