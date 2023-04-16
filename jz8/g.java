package jz8.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.i;
import jz8.b;
import java.lang.Object;

public class g extends Accessor	// class@002a06
{
    public final b c;
    public final i d;

    public void g(i p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
