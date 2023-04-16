package n7a.d;
import erd.g;
import n7a.f;
import java.lang.Object;
import java.lang.Boolean;
import n7a.a;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import n7a.h;
import androidx.recyclerview.widget.RecyclerView$o;
import n7a.i;
import androidx.recyclerview.widget.RecyclerView$r;
import o7a.d;

public final class d implements g	// class@0030f4
{
    public final f b;

    public void d(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       if (tb.r == null) {
       }else {
          tb.E = p0.booleanValue();
          if (p0.booleanValue() && (tb.V8() != null && tb.G != null)) {
             RecyclerView recyclerView = tb.V8().findViewWithTag(tb.G);
             if (recyclerView != null) {
                if (tb.I == null) {
                   h oh = new h(tb);
                   tb.I = oh;
                   recyclerView.addOnChildAttachStateChangeListener(oh);
                }
                if (tb.H == null) {
                   i oi = new i(tb);
                   tb.H = oi;
                   recyclerView.addOnScrollListener(oi);
                }
                tb.F = recyclerView;
             }
          }
          a u = tb.u;
          if (u != null) {
             u.setEnabled(p0.booleanValue());
             tb.u.d(0);
          }
       }
       return;
    }
}
