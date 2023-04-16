package jc9.k;
import android.view.View$OnClickListener;
import jc9.b0;
import lc9.b;
import java.lang.Object;
import java.lang.Runnable;
import android.view.View;
import java.util.Objects;
import lnc.s6;
import hc9.e;
import ad9.i;

public final class k implements View$OnClickListener	// class@002943
{
    public final b0 b;
    public final b c;
    public final Object d;
    public final int e;
    public final Runnable f;

    public void k(b0 p0,b p1,Object p2,int p3,Runnable p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void onClick(View p0){
       k tb = this.b;
       k td = this.d;
       k te = this.e;
       k tf = this.f;
       Objects.requireNonNull(tb);
       this.c.b(td, te);
       int i = 1;
       if (te == 4) {
          b0 e = tb.e;
          if (!s6.H()) {
             i = 3;
          }
          e.d(i, td);
       }else {
          tb.e.c(null, 0);
          tb.d.c(i);
          tb.e();
       }
       if (tf != null) {
          tf.run();
       }
       return;
    }
}
