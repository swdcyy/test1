package ol1.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ol1.m;
import ol1.b;
import java.lang.Object;
import java.lang.Boolean;

public class f extends Accessor	// class@00352f
{
    public final b c;
    public final m d;

    public void f(m p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.c);
    }
    public void set(Object p0){
       this.c.c = p0.booleanValue();
    }
}
