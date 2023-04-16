package jz8.x2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import brd.t;

public class x2 extends Accessor	// class@002a66
{
    public final n c;
    public final c4 d;

    public void x2(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.Q;
    }
    public void set(Object p0){
       this.c.Q = p0;
    }
}
