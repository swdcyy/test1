package jz8.t2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.util.Set;

public class t2 extends Accessor	// class@002a51
{
    public final n c;
    public final c4 d;

    public void t2(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.s;
    }
    public void set(Object p0){
       this.c.s = p0;
    }
}
