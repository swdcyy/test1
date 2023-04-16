package k59.m;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k59.u;
import k59.d;
import java.lang.Object;
import java.lang.Boolean;

public class m extends Accessor	// class@002af8
{
    public final d c;
    public final u d;

    public void m(u p0,d p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.e);
    }
    public void set(Object p0){
       this.c.e = p0.booleanValue();
    }
}
