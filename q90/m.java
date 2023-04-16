package q90.m;
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

public final class m extends RecyclerView$n	// class@002997
{
    public final int a;
    public final int b;

    public void m(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, m.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       super.c(p0, p1, p2, p3);
       int childAdapter = p2.getChildAdapterPosition(p1);
       if (childAdapter < 0) {
          return;
       }
       m ta = this.a;
       p0.bottom = ta / 2;
       m tb = this.b;
       int i = (childAdapter >= tb)? ta / 2: ta;
       p0.top = i;
       m om = (!(childAdapter % tb))? ta: ta / 2;
       p0.left = om;
       tb--;
       if ((childAdapter % tb) != tb) {
          ta = ta / 2;
       }
       p0.right = ta;
       return;
    }
}
