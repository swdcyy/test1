package d12.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d12.o;
import d12.g;
import java.lang.Object;
import java.lang.Boolean;

public class i extends Accessor	// class@00241d
{
    public final g c;
    public final o d;

    public void i(o p0,g p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.c);
    }
    public void set(Object p0){
       this.c.c = p0.booleanValue();
    }
}
