package b8c.f;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b8c.h;
import b8c.b;
import java.lang.Object;
import java.lang.Boolean;

public class f extends Accessor	// class@0003d5
{
    public final b c;
    public final h d;

    public void f(h p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.d);
    }
    public void set(Object p0){
       this.c.d = p0.booleanValue();
    }
}
