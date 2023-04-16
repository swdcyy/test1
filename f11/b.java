package f11.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import f11.d;
import f11.a;
import java.lang.Object;
import lo1.c;

public class b extends Accessor	// class@00226c
{
    public final a c;
    public final d d;

    public void b(d p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.x;
    }
    public void set(Object p0){
       this.c.x = p0;
    }
}
