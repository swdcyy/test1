package gfd.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import gfd.h;
import gfd.a;
import java.lang.Object;
import java.lang.Boolean;

public class c extends Accessor	// class@000f09
{
    public final a c;
    public final h d;

    public void c(h p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.y);
    }
    public void set(Object p0){
       this.c.y = p0.booleanValue();
    }
}
