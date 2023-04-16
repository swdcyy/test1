package in8.o$c0;
import in8.o$b0;
import java.lang.Object;
import in8.o$k;
import in8.m;
import java.lang.Double;

public abstract class o$c0 implements o$b0	// class@0026c9
{

    public void o$c0(){
       super();
    }
    public void o$c0(o$k p0){
       super();
    }
    public double a(m[] p0){
       double d = p0[0].doubleValue().doubleValue();
       for (int i = 1; i < p0.length; i = i + 1) {
          d = this.b(Double.valueOf(d), p0[i].doubleValue());
       }
       return d;
    }
    public abstract double b(Double p0,Double p1);
}
