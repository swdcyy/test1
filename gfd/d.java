package gfd.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gfd.h;
import gfd.a;
import java.lang.Object;
import aa9.d;

public class d extends Accessor	// class@000f0a
{
    public final a c;
    public final h d;

    public void d(h p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.u;
    }
    public void set(Object p0){
       this.c.u = p0;
    }
}
