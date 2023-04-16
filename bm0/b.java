package bm0.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bm0.e;
import bm0.a;
import java.lang.Object;
import java.lang.Integer;

public class b extends Accessor	// class@0003ba
{
    public final a c;
    public final e d;

    public void b(e p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.c);
    }
    public void set(Object p0){
       this.c.c = p0.intValue();
    }
}
