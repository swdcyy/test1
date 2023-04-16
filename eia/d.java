package eia.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import eia.o;
import eia.a;
import java.lang.Object;
import java.lang.Integer;

public class d extends Accessor	// class@00268c
{
    public final a c;
    public final o d;

    public void d(o p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.i);
    }
    public void set(Object p0){
       this.c.i = p0.intValue();
    }
}
