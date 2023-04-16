package jy1.g;
import ok.o;
import java.lang.Object;
import java.lang.Long;

public final class g implements o	// class@002c39
{
    public final long b;
    public final long c;

    public void g(long p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       boolean b = ((this.b - p0.longValue()) - this.c > 0)? true: false;
       return b;
    }
}
