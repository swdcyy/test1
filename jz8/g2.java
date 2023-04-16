package jz8.g2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.lang.Boolean;

public class g2 extends Accessor	// class@002a03
{
    public final n c;
    public final c4 d;

    public void g2(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.F);
    }
    public void set(Object p0){
       this.c.F = p0.booleanValue();
    }
}
