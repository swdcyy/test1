package j99.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j99.g;
import j99.r$a;
import java.lang.Object;
import java.lang.Boolean;

public class d extends Accessor	// class@0027c2
{
    public final r$a c;
    public final g d;

    public void d(g p0,r$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.e);
    }
    public void set(Object p0){
       this.c.e = p0.booleanValue();
    }
}
