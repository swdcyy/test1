package gfd.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gfd.h;
import gfd.a;
import java.lang.Object;
import s99.p;

public class b extends Accessor	// class@000f08
{
    public final a c;
    public final h d;

    public void b(h p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.x;
    }
    public void set(Object p0){
       this.c.x = p0;
    }
}
