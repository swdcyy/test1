package n7a.k;
import erd.g;
import n7a.o;
import java.lang.Object;
import java.lang.Boolean;
import n7a.a;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.component.photo.detail.slide.widget.SlideLongAtlasRecyclerView;
import n7a.l;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import n7a.n;
import androidx.recyclerview.widget.RecyclerView$o;
import o7a.d;

public final class k implements g	// class@0030fe
{
    public final o b;

    public void k(o p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       k tb = this.b;
       if (tb.r != null && tb.S8() != null) {
          tb.y = p0.booleanValue();
          SlideLongAtlasRecyclerView slideLongAtl = tb.S8().findViewWithTag(tb.A);
          tb.x = slideLongAtl;
          if (slideLongAtl != null) {
             if (tb.B == null) {
                l ol = new l(tb);
                tb.B = ol;
                slideLongAtl.addOnScrollListener(ol);
             }
             if (tb.C == null) {
                n on = new n(tb);
                tb.C = on;
                tb.x.addOnChildAttachStateChangeListener(on);
             }
             a u = tb.u;
             if (u != null) {
                u.setEnabled(p0.booleanValue());
                tb.u.d(0);
             }
          }
       }
       return;
    }
}
