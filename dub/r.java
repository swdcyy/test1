package dub.r;
import ok.o;
import java.util.List;
import j9c.d;
import java.lang.Object;
import java.lang.String;
import dub.l;
import java.lang.Iterable;
import com.google.common.base.Optional;
import qk.y;

public final class r implements o	// class@00257c
{
    public final List b;
    public final d c;

    public void r(List p0,d p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       r tb = this.b;
       r tc = this.c;
       boolean b = (p0 != null && y.y(tb, new l(tc, p0)).isPresent())? true: false;
       return b;
    }
}
