package c42.b;
import android.view.View$OnClickListener;
import c42.d;
import java.lang.Object;
import android.view.View;
import kp3.e;
import t02.a0;
import hb2.g$b;

public final class b implements View$OnClickListener	// class@0004af
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b tb = this.b;
       if (tb.v.s()) {
          tb.v.m();
          a0 l1 = tb.u.l1;
          if (l1 != null) {
             l1.g(true);
          }
       }
       return;
    }
}
