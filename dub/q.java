package dub.q;
import ok.o;
import java.util.List;
import java.lang.Object;
import java.lang.Integer;
import dub.p;
import java.lang.Iterable;
import com.google.common.base.Optional;
import qk.y;

public final class q implements o	// class@00257b
{
    public final List b;

    public void q(List p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       return y.y(this.b, new p(p0)).isPresent();
    }
}
