package ab5.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab5.o;
import ab5.a;
import java.lang.Object;
import db5.f;

public class g extends Accessor	// class@00004e
{
    public final a c;
    public final o d;

    public void g(o p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
