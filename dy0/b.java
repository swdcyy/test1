package dy0.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dy0.d;
import dy0.a;
import java.lang.Object;
import dy0.e;

public class b extends Accessor	// class@002061
{
    public final a c;
    public final d d;

    public void b(d p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v;
    }
    public void set(Object p0){
       this.c.v = p0;
    }
}
