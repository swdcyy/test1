package id9.n;
import erd.g;
import id9.t;
import java.lang.Object;
import vf9.f0;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.model.Lyrics;
import java.util.Collection;
import ekd.q;
import android.view.ViewGroup;
import pi9.j;
import android.view.View;

public final class n implements g	// class@0027f4
{
    public final t b;

    public void n(t p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       f0 b = p0.b;
       boolean b1 = (b != tb.q)? true: false;
       tb.u = b1;
       if (b1) {
          tb.q = b;
          tb.r = p0.g;
          if (!PatchProxy.applyVoid(null, tb, t.class, "22")) {
             p0 = tb.r;
             if (p0 != null && (q.f(p0.mLines) || tb.q == null)) {
                tb.t.a().setVisibility(8);
                p0 = tb.o;
                if (p0 != null) {
                   p0.setVisibility(8);
                }
             }
          }
       }
       return;
    }
}
