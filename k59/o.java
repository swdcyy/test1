package k59.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k59.u;
import k59.d;
import java.lang.Object;
import java.lang.Boolean;

public class o extends Accessor	// class@002b00
{
    public final d c;
    public final u d;

    public void o(u p0,d p1){
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
