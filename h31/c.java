package h31.c;
import ok.o;
import h31.l;
import java.lang.Object;
import ms5.a;
import java.util.Objects;

public final class c implements o	// class@002610
{
    public final l b;

    public void c(l p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       Objects.requireNonNull(this.b);
       boolean b = (p0 != null)? true: false;
       return b;
    }
}
