package bg3.a;
import android.view.View$OnClickListener;
import bg3.e;
import java.lang.Object;
import android.view.View;
import kp3.e;
import t02.a0;
import hb2.g$b;

public final class a implements View$OnClickListener	// class@00039c
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       e s = tb.s;
       if (s != null && s.s()) {
          tb.s.m();
          a0 l1 = tb.p.l1;
          if (l1 != null) {
             l1.g(true);
          }
       }
       return;
    }
}
