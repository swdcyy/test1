package j99.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j99.q;
import j99.t$a;
import java.lang.Object;
import java.lang.Integer;

public class o extends Accessor	// class@0027cd
{
    public final t$a c;
    public final q d;

    public void o(q p0,t$a p1){
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
