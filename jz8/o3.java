package jz8.o3;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import rd5.e;

public class o3 extends Accessor	// class@002a34
{
    public final n c;
    public final c4 d;

    public void o3(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.D;
    }
    public void set(Object p0){
       this.c.D = p0;
    }
}
