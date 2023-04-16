package dz8.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import dz8.e;
import dz8.a;
import java.lang.Object;
import java.lang.Integer;

public class b extends Accessor	// class@002106
{
    public final a c;
    public final e d;

    public void b(e p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.h);
    }
}
