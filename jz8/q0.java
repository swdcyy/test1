package jz8.q0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.lang.Boolean;

public class q0 extends Accessor	// class@002a3d
{
    public final n c;
    public final c4 d;

    public void q0(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.k1);
    }
    public void set(Object p0){
       this.c.k1 = p0.booleanValue();
    }
}