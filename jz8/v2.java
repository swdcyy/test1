package jz8.v2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import java.util.List;

public class v2 extends Accessor	// class@002a5c
{
    public final n c;
    public final c4 d;

    public void v2(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i1;
    }
    public void set(Object p0){
       this.c.i1 = p0;
    }
}
