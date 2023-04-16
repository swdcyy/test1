package c42.h;
import android.view.View$OnClickListener;
import c42.m;
import java.lang.Object;
import android.view.View;
import kp3.e;
import t02.a0;
import hb2.g$b;

public final class h implements View$OnClickListener	// class@0004b8
{
    public final m b;

    public void h(m p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       h tb = this.b;
       if (tb.w.s()) {
          tb.w.m();
          a0 l1 = tb.t.l1;
          if (l1 != null) {
             l1.g(true);
          }
       }
       return;
    }
}
