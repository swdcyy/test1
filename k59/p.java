package k59.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k59.u;
import k59.d;
import java.lang.Object;
import java.lang.Integer;

public class p extends Accessor	// class@002b04
{
    public final d c;
    public final u d;

    public void p(u p0,d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.b);
    }
    public void set(Object p0){
       this.c.b = p0.intValue();
    }
}
