package cy9.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cy9.n;
import cy9.i;
import java.lang.Object;
import java.lang.Boolean;

public class k extends Accessor	// class@001e3d
{
    public final i c;
    public final n d;

    public void k(n p0,i p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.i);
    }
}
