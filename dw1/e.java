package dw1.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dw1.g;
import dw1.b;
import java.lang.Object;
import dw1.a;

public class e extends Accessor	// class@002047
{
    public final b c;
    public final g d;

    public void e(g p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.A;
    }
    public void set(Object p0){
       this.c.A = p0;
    }
}
