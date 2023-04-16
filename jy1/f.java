package jy1.f;
import ok.o;
import java.lang.Object;
import java.lang.Long;

public final class f implements o	// class@002c38
{
    public final long b;
    public final long c;

    public void f(long p0,long p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean apply(Object p0){
       boolean b = ((this.b - p0.longValue()) - this.c <= 0)? true: false;
       return b;
    }
}
