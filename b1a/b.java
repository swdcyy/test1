package b1a.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b1a.d;
import b1a.a;
import java.lang.Object;
import b1a.e;

public class b extends Accessor	// class@000345
{
    public final a c;
    public final d d;

    public void b(d p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.m;
    }
    public void set(Object p0){
       this.c.m = p0;
    }
}
