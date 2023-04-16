package e63.c1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.gzone.v2.profile.e;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gzone.v2.profile.j;

public class c1 extends RecyclerView$n	// class@002643
{
    public final int a;
    public final e b;

    public void c1(e p0,int p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, c1.class, "1")) {
          return;
       }
       int i = p2.getChildAdapterPosition(p1) - this.b.Z.u1();
       if (i < 0) {
          return;
       }
       c1 ta = this.a;
       p0.bottom = ta / 4;
       p0.top = ta / 4;
       i = i % 3;
       p0.left = (!i)? 0: ta / 4;
       p0.right = (i == 2)? 0: ta / 4;
       return;
    }
}
