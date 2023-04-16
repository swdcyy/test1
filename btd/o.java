package btd.o;
import java.lang.Object;
import btd.d;
import btd.c;
import nsd.u;

public abstract class o	// class@0002ef
{

    public void o(){
       super();
    }
    public abstract double a();
    public final boolean b(){
       return d.i0(this.a());
    }
    public final boolean c(){
       return (d.i0(this.a()) ^ 0x01);
    }
    public o d(double p0){
       return this.e(d.G0(p0));
    }
    public o e(double p0){
       return new c(this, p0, null);
    }
}
