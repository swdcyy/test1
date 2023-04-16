package cl9.t0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cl9.k1;
import cl9.h0;
import java.lang.Object;
import java.lang.Boolean;

public class t0 extends Accessor	// class@00066a
{
    public final h0 c;
    public final k1 d;

    public void t0(k1 p0,h0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.o);
    }
    public void set(Object p0){
       this.c.o = p0.booleanValue();
    }
}
