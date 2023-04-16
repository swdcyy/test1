package m59.k;
import erd.g;
import m59.o;
import java.lang.String;
import java.lang.Object;
import vq4.c;
import java.util.Objects;
import vq4.d;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import n49.s;

public final class k implements g	// class@002e06
{
    public final o b;
    public final String c;
    public final String d;

    public void k(o p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       Objects.requireNonNull(tb);
       p0.F.t2 = "auto_deeplink";
       if (!TextUtils.x(tc)) {
          c f = p0.F;
          f.t = tc;
          f.z2 = tc;
          f.t0 = s.j(tc);
       }
       p0.F.z3 = td.length();
       p0 = p0.F;
       p0.n = tb.q;
       p0.j = tb.o;
       return;
    }
}
