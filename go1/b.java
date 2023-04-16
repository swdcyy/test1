package go1.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import go1.d;
import go1.a;
import java.lang.Object;
import lo1.c;

public class b extends Accessor	// class@002530
{
    public final a c;
    public final d d;

    public void b(d p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.D;
    }
    public void set(Object p0){
       this.c.D = p0;
    }
}
