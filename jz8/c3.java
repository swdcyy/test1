package jz8.c3;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.lang.Integer;

public class c3 extends Accessor	// class@0029eb
{
    public final n c;
    public final c4 d;

    public void c3(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.c1);
    }
    public void set(Object p0){
       this.c.c1 = p0.intValue();
    }
}
