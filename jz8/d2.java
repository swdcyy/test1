package jz8.d2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.lang.Boolean;

public class d2 extends Accessor	// class@0029f0
{
    public final n c;
    public final c4 d;

    public void d2(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.I1);
    }
    public void set(Object p0){
       this.c.I1 = p0.booleanValue();
    }
}
