package dq9.b;
import nsd.u;
import java.lang.Object;

public final class b	// class@001fd6
{
    public long a;
    public long b;
    public int c;

    public void b(){
       super(0, 0, 0, 7, null);
    }
    public void b(long p0,long p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void b(long p0,long p1,int p2,int p3,u p4){
       int i = 0;
       int i1 = (p3 & 0x01)? i: p0;
       if (!(p3 & 0x02)) {
          i = p1;
       }
       p3 = (p3 & 0x04)? -1: p2;
       super(i1, i, p3);
       return;
    }
    public final int a(){
       return this.c;
    }
    public final long b(){
       return this.b;
    }
    public final long c(){
       return this.a;
    }
}
