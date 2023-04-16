package er2.f;
import ok.o;
import java.util.List;
import java.lang.Object;
import java.lang.String;

public final class f implements o	// class@0027be
{
    public final List b;

    public void f(List p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       return (this.b.contains(p0) ^ 0x01);
    }
}
