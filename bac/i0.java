package bac.i0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.l0;
import bac.f0$a;
import java.lang.Object;
import fac.c;

public class i0 extends Accessor	// class@00040a
{
    public final f0$a c;
    public final l0 d;

    public void i0(l0 p0,f0$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
