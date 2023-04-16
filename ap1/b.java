package ap1.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ap1.d;
import ap1.a;
import java.lang.Object;
import ol1.p;

public class b extends Accessor	// class@00026e
{
    public final a c;
    public final d d;

    public void b(d p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.q;
    }
    public void set(Object p0){
       this.c.q = p0;
    }
}
