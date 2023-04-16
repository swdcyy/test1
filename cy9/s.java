package cy9.s;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cy9.v;
import cy9.q;
import java.lang.Object;
import java.lang.Boolean;

public class s extends Accessor	// class@001e45
{
    public final q c;
    public final v d;

    public void s(v p0,q p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.i);
    }
}
