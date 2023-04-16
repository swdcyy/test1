package m99.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import m99.e;
import m99.f$a;
import java.lang.Object;
import java.lang.Boolean;

public class b extends Accessor	// class@002e29
{
    public final f$a c;
    public final e d;

    public void b(e p0,f$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.j);
    }
    public void set(Object p0){
       this.c.j = p0.booleanValue();
    }
}
