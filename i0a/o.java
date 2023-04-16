package i0a.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import i0a.v;
import i0a.k;
import java.lang.Object;
import com.yxcorp.gifshow.widget.ViewStubInflater2;

public class o extends Accessor	// class@002754
{
    public final k c;
    public final v d;

    public void o(v p0,k p1){
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
