package d69.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d69.o;
import d69.b;
import java.lang.Object;
import java.lang.String;

public class g extends Accessor	// class@002071
{
    public final b c;
    public final o d;

    public void g(o p0,b p1){
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
