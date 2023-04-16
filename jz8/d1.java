package jz8.d1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.lang.Float;

public class d1 extends Accessor	// class@0029ef
{
    public final n c;
    public final c4 d;

    public void d1(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Float.valueOf(this.c.e2);
    }
    public void set(Object p0){
       this.c.e2 = p0.floatValue();
    }
}
