package btd.c;
import btd.o;
import nsd.u;
import btd.d;

public final class c extends o	// class@0002e2
{
    public final o a;
    public final double b;

    public void c(o p0,double p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void c(o p0,double p1,u p2){
       super(p0, p1);
    }
    public double a(){
       return d.k0(this.a.a(), this.b);
    }
    public o e(double p0){
       return new c(this.a, d.l0(this.b, p0), null);
    }
    public final double f(){
       return this.b;
    }
    public final o g(){
       return this.a;
    }
}
