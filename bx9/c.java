package bx9.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bx9.g;
import bx9.i$c;
import java.lang.Object;

public class c extends Accessor	// class@0004fd
{
    public final i$c c;
    public final g d;

    public void c(g p0,i$c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
