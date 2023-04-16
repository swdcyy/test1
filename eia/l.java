package eia.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import eia.o;
import eia.a;
import java.lang.Object;
import java.lang.Boolean;

public class l extends Accessor	// class@002694
{
    public final a c;
    public final o d;

    public void l(o p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.l);
    }
    public void set(Object p0){
       this.c.l = p0.booleanValue();
    }
}
