package d12.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d12.o;
import d12.g;
import java.lang.Object;
import java.lang.Long;

public class h extends Accessor	// class@00241c
{
    public final g c;
    public final o d;

    public void h(o p0,g p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Long.valueOf(this.c.d);
    }
    public void set(Object p0){
       this.c.d = p0.longValue();
    }
}
