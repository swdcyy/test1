package ab5.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab5.o;
import ab5.a;
import java.lang.Object;
import java.lang.Boolean;

public class h extends Accessor	// class@00004f
{
    public final a c;
    public final o d;

    public void h(o p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.l);
    }
    public void set(Object p0){
       this.c.l = p0.booleanValue();
    }
}
