package jz8.u3;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.lang.Integer;

public class u3 extends Accessor	// class@002a58
{
    public final n c;
    public final c4 d;

    public void u3(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.V0);
    }
    public void set(Object p0){
       this.c.V0 = p0.intValue();
    }
}
