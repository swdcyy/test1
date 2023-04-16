package esa.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import esa.g;
import esa.a;
import java.lang.Object;
import java.lang.Boolean;

public class c extends Accessor	// class@0027c2
{
    public final a c;
    public final g d;

    public void c(g p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.b);
    }
    public void set(Object p0){
       this.c.b = p0.booleanValue();
    }
}
