package k59.n2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k59.q2;
import k59.m2;
import java.lang.Object;
import java.lang.Integer;

public class n2 extends Accessor	// class@002afb
{
    public final m2 c;
    public final q2 d;

    public void n2(q2 p0,m2 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.s);
    }
}
