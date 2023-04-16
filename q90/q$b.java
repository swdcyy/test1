package q90.q$b;
import android.view.View$OnClickListener;
import q90.q;
import androidx.viewpager.widget.ViewPager;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class q$b implements View$OnClickListener	// class@00299c
{
    public final q b;
    public final ViewPager c;
    public final int d;

    public void q$b(q p0,ViewPager p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q$b.class, "1")) {
          return;
       }
       q m = this.b.m;
       if (m != null) {
          if (m != null) {
             m.onClick(p0);
          }
          if (this.b.l != null) {
             return;
          }
       }
       q$b tb = this.b;
       if (tb.j == null) {
          if (tb.k != null) {
             tb = this.c;
             a.m(tb);
             tb.setCurrentItem(this.d);
          }else {
             tb = this.c;
             a.m(tb);
             tb.setCurrentItem(this.d, false);
          }
       }
       return;
    }
}
