package bac.z;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.e0;
import bac.p$a;
import java.lang.Object;
import java.lang.Integer;

public class z extends Accessor	// class@000423
{
    public final p$a c;
    public final e0 d;

    public void z(e0 p0,p$a p1){
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
