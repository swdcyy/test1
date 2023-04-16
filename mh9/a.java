package mh9.a;
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

public final class a extends RecyclerView$n	// class@00302a
{
    public boolean a;
    public final int b;
    public final int c;

    public void a(int p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
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
       int childAdapter = p2.getChildAdapterPosition(p1);
       if (childAdapter < 0) {
          return;
       }
       if (this.a != null && childAdapter >= 1) {
          childAdapter--;
       }
       a tb = this.b;
       p0.bottom = tb / 2;
       a tc = this.c;
       int i = (childAdapter >= tc)? tb / 2: tb;
       p0.top = i;
       a uoa = (!(childAdapter % tc))? tb: tb / 2;
       p0.left = uoa;
       if ((childAdapter % tc) != (tc - 1)) {
          tb = tb / 2;
       }
       p0.right = tb;
       return;
    }
    public final void f(boolean p0){
       this.a = p0;
    }
}
