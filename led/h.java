package led.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import led.l;
import led.m$a;
import java.lang.Object;
import e7d.h;

public class h extends Accessor	// class@001c23
{
    public final m$a c;
    public final l d;

    public void h(l p0,m$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
