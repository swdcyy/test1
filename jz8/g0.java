package jz8.g0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import mrd.c;

public class g0 extends Accessor	// class@002a01
{
    public final n c;
    public final c4 d;

    public void g0(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.x1;
    }
    public void set(Object p0){
       this.c.x1 = p0;
    }
}
