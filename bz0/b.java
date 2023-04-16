package bz0.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bz0.d;
import bz0.a;
import java.lang.Object;
import ht5.a;

public class b extends Accessor	// class@000432
{
    public final a c;
    public final d d;

    public void b(d p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.t;
    }
    public void set(Object p0){
       this.c.t = p0;
    }
}
