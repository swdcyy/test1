package hg2.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import hg2.d;
import hg2.a;
import java.lang.Object;
import hg2.e;

public class b extends Accessor	// class@002d94
{
    public final a c;
    public final d d;

    public void b(d p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.M;
    }
    public void set(Object p0){
       this.c.M = p0;
    }
}
