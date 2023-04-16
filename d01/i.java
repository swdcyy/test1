package d01.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d01.l;
import d01.g;
import java.lang.Object;
import d01.n;

public class i extends Accessor	// class@001edc
{
    public final g c;
    public final l d;

    public void i(l p0,g p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.x;
    }
    public void set(Object p0){
       this.c.x = p0;
    }
}
