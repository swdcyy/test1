package aa3.a;
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

public final class a extends RecyclerView$n	// class@00004d
{
    public int a;

    public void a(){
       super();
       this.a = 1000;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "1")) {
          return;
       }
       a.p(p0, "outRect");
       a.p(p1, "view");
       a.p(p2, "parent");
       a.p(p3, "state");
       super.c(p0, p1, p2, p3);
       p0.top = (!p2.getChildAdapterPosition(p1))? this.a: 0;
       return;
    }
    public final boolean f(int p0){
       a ta = this.a;
       boolean b = false;
       int i = (p0 < 0)? 0: p0;
       this.a = i;
       if (ta != p0) {
          b = true;
       }
       return b;
    }
}
