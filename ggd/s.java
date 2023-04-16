package ggd.s;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ggd.u;
import ggd.n;
import java.lang.Object;
import java.lang.Integer;

public class s extends Accessor	// class@000f23
{
    public final n c;
    public final u d;

    public void s(u p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.d);
    }
}
