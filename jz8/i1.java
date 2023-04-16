package jz8.i1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import le5.b;

public class i1 extends Accessor	// class@002a0e
{
    public final n c;
    public final c4 d;

    public void i1(c4 p0,n p1){
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
