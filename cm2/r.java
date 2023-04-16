package cm2.r;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cm2.u;
import cm2.b$b;
import java.lang.Object;
import java.lang.String;

public class r extends Accessor	// class@00056b
{
    public final b$b c;
    public final u d;

    public void r(u p0,b$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
