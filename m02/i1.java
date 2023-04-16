package m02.i1;
import msd.l;
import java.lang.Object;
import xj3.d;
import java.lang.Boolean;

public final class i1 implements l	// class@0030c1
{
    public final Object b;

    public void i1(Object p0){
       this.b = p0;
    }
    public final Object invoke(Object p0){
       boolean b = (p0.b() == this.b)? true: false;
       return Boolean.valueOf(b);
    }
}
