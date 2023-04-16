package jz8.b2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.lang.Boolean;

public class b2 extends Accessor	// class@0029e4
{
    public final n c;
    public final c4 d;

    public void b2(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.A1);
    }
    public void set(Object p0){
       this.c.A1 = p0.booleanValue();
    }
}
