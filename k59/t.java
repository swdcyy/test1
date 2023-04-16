package k59.t;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k59.u;
import k59.d;
import java.lang.Object;
import java.lang.Boolean;

public class t extends Accessor	// class@002b1f
{
    public final d c;
    public final u d;

    public void t(u p0,d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.j);
    }
    public void set(Object p0){
       this.c.j = p0.booleanValue();
    }
}
