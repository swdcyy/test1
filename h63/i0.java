package h63.i0;
import oq5.c;
import h63.k0;
import java.lang.Object;
import android.content.res.Configuration;
import java.util.Objects;
import android.view.ViewGroup;
import c77.s;

public final class i0 implements c	// class@002c80
{
    public final k0 b;

    public void i0(k0 p0){
       this.b = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
       k0 r;
       i0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.orientation == 2) {
          tb.B.setVisibility(8);
          r = tb.r;
          if (r != null) {
             r.d(false, 3);
          }
       }else {
          tb.B.setVisibility(false);
          r = tb.r;
          if (r != null) {
             r.d(true, 3);
          }
       }
       return;
    }
}
