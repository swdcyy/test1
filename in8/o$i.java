package in8.o$i;
import in8.o$b0;
import java.lang.Object;
import in8.m;
import in8.o;

public final class o$i implements o$b0	// class@0026d1
{

    public void o$i(){
       super();
    }
    public double a(m[] p0){
       boolean b = o.b(p0[0].value());
       int i = 1;
       while (i < p0.length && !b) {
          b = (b || o.b(p0[i].value()))? true: false;
          i = i + 1;
       }
       double d = (b)? 0x3ff0000000000000: 0;
       return d;
    }
}
