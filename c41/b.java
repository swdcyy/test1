package c41.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import c41.d;
import c41.a;
import java.lang.Object;
import gs4.b;

public class b extends Accessor	// class@00046b
{
    public final a c;
    public final d d;

    public void b(d p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.Q;
    }
    public void set(Object p0){
       this.c.Q = p0;
    }
}
