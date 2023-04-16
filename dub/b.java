package dub.b;
import ok.o;
import java.util.List;
import java.lang.Object;
import java.lang.Integer;
import dub.a;
import java.lang.Iterable;
import com.google.common.base.Optional;
import qk.y;

public final class b implements o	// class@00256c
{
    public final List b;

    public void b(List p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       return y.y(this.b, new a(p0)).isPresent();
    }
}
