package k59.w2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k59.z2;
import k59.u2;
import java.lang.Object;
import java.lang.Integer;

public class w2 extends Accessor	// class@002b2f
{
    public final u2 c;
    public final z2 d;

    public void w2(z2 p0,u2 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.s);
    }
}
