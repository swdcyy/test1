package jz8.i3;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import brd.y;

public class i3 extends Accessor	// class@002a10
{
    public final n c;
    public final c4 d;

    public void i3(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v1;
    }
    public void set(Object p0){
       this.c.v1 = p0;
    }
}
