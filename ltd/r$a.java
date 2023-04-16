package ltd.r$a;
import java.lang.Object;
import nsd.u;
import msd.p;
import java.lang.Integer;

public final class r$a	// class@001e17
{

    public void r$a(){
       super();
    }
    public void r$a(u p0){
       super();
    }
    public final int a(long p0){
       int i = (p0 & 0x2000000000000000)? 2: 1;
       return i;
    }
    public final long b(long p0,int p1){
       return (this.e(p0, 0x3fffffff) | ((long)p1 << 0));
    }
    public final long c(long p0,int p1){
       return (this.e(p0, 0xfffffffc0000000) | ((long)p1 << 30));
    }
    public final Object d(long p0,p p1){
       return p1.invoke(Integer.valueOf((int)((0x3fffffff & p0) >> 0)), Integer.valueOf((int)((p0 & 0xfffffffc0000000) >> 30)));
    }
    public final long e(long p0,long p1){
       return (p0 & (~ p1));
    }
}
