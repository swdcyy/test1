package k59.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k59.u;
import k59.d;
import java.lang.Object;
import java.lang.Long;

public class g extends Accessor	// class@002ae0
{
    public final d c;
    public final u d;

    public void g(u p0,d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Long.valueOf(this.c.l);
    }
    public void set(Object p0){
       this.c.l = p0.longValue();
    }
}
