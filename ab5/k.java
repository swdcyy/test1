package ab5.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab5.o;
import ab5.a;
import java.lang.Object;
import java.lang.Integer;

public class k extends Accessor	// class@000052
{
    public final a c;
    public final o d;

    public void k(o p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.i);
    }
    public void set(Object p0){
       this.c.i = p0.intValue();
    }
}
