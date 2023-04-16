package btd.b$a;
import btd.o;
import btd.b;
import nsd.u;
import java.util.concurrent.TimeUnit;
import btd.e;
import btd.d;

public final class b$a extends o	// class@0002e0
{
    public final long a;
    public final b b;
    public final double c;

    public void b$a(long p0,b p1,double p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void b$a(long p0,b p1,double p2,u p3){
       super(p0, p1, p2);
    }
    public double a(){
       return d.k0(e.W((this.b.c() - this.a), this.b.b()), this.c);
    }
    public o e(double p0){
       b$a uoa = new b$a(this.a, this.b, d.l0(this.c, p0), null);
       return v7;
    }
}
