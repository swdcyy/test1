package ae3.h;
import erd.o;
import java.lang.Object;
import java.lang.Long;

public final class h implements o	// class@0000a3
{
    public final long b;

    public void h(long p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return Long.valueOf((this.b - p0.longValue()));
    }
}
