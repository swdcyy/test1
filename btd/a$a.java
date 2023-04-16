package btd.a$a;
import btd.o;
import btd.a;
import nsd.u;
import java.util.concurrent.TimeUnit;
import btd.e;
import btd.d;

public final class a$a extends o	// class@0002de
{
    public final double a;
    public final a b;
    public final double c;

    public void a$a(double p0,a p1,double p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public void a$a(double p0,a p1,double p2,u p3){
       super(p0, p1, p2);
    }
    public double a(){
       return d.k0(e.U((this.b.c() - this.a), this.b.b()), this.c);
    }
    public o e(double p0){
       a$a uoa = new a$a(this.a, this.b, d.l0(this.c, p0), null);
       return v7;
    }
}
