package bh9.e;
import java.lang.Runnable;
import bh9.r;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.base.d;
import tg9.b;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import hd9.n;
import ug9.c;
import hf9.b;
import hf9.b$a;
import android.widget.TextView;

public final class e implements Runnable	// class@00049a
{
    public final r b;

    public void e(r p0){
       this.b = p0;
    }
    public final void run(){
       e tb = this.b;
       tb.m2();
       tb.d.j().addView(tb.o);
       n on = tb.d.d(n.j);
       if (tb.d.d(c.c).a != null || (on.a != null && (on.h != null || (tb.d.d(b.c.a()).a() && (tb.r - 0x3f800000 || tb.u != null))))) {
          tb.u = false;
          r o = tb.o;
          if (o != null) {
             o.callOnClick();
          }
       }
       return;
    }
}
