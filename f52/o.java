package f52.o;
import erd.o;
import java.lang.Object;
import java.lang.Long;

public final class o implements o	// class@002894
{
    public final long b;

    public void o(long p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return Long.valueOf((this.b - p0.longValue()));
    }
}
