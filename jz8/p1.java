package jz8.p1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.lang.Boolean;

public class p1 extends Accessor	// class@002a38
{
    public final n c;
    public final c4 d;

    public void p1(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.z);
    }
    public void set(Object p0){
       this.c.z = p0.booleanValue();
    }
}
