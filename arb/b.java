package arb.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import arb.f;
import arb.a;
import java.lang.Object;
import gsa.j0;

public class b extends Accessor	// class@0002cf
{
    public final a c;
    public final f d;

    public void b(f p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
