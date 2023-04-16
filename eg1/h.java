package eg1.h;
import lnc.c3$a;
import pz2.c;
import java.lang.String;
import java.lang.Object;
import pz2.e;
import java.util.Objects;

public final class h implements c3$a	// class@002150
{
    public final c a;
    public final String b;

    public void h(c p0,String p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void apply(Object p0){
       h ta = this.a;
       Objects.requireNonNull(ta);
       p0.b(ta, this.b);
    }
}
