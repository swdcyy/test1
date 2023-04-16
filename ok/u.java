package ok.u;
import ok.s$e;
import ok.e;
import java.lang.Object;
import ok.s;
import java.lang.CharSequence;
import java.util.Iterator;
import ok.d;
import ok.t;

public final class u implements s$e	// class@002801
{
    public final e a;

    public void u(e p0){
       this.a = p0;
       super();
    }
    public Iterator a(s p0,CharSequence p1){
       return new t(this, p0, p1, this.a.matcher(p1));
    }
}
