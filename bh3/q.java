package bh3.q;
import erd.g;
import bh3.s;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.retrofit.model.ActionResponse;
import bh3.s$d;
import java.lang.Throwable;
import bh3.s$c;
import jh3.a;

public final class q implements g	// class@0003c9
{
    public final s b;
    public final String c;
    public final boolean d;

    public void q(s p0,String p1,boolean p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       q tb = this.b;
       q tc = this.c;
       q td = this.d;
       s f = tb.f;
       if (f != null) {
          f.e(tb.d.a, tc, tb.i, true, td, null);
       }
       tb.h.d(tb.d.a, tc, true, null);
       return;
    }
}
