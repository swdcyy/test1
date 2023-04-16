package ggd.r;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ggd.u;
import ggd.n;
import java.lang.Object;
import java.lang.Integer;

public class r extends Accessor	// class@000f22
{
    public final n c;
    public final u d;

    public void r(u p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.f);
    }
}
