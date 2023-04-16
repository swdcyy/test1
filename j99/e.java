package j99.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j99.g;
import j99.r$a;
import java.lang.Object;
import java.lang.Integer;

public class e extends Accessor	// class@0027c3
{
    public final r$a c;
    public final g d;

    public void e(g p0,r$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.b);
    }
    public void set(Object p0){
       this.c.b = p0.intValue();
    }
}
