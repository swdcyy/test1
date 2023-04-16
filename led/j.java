package led.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import led.l;
import led.m$a;
import java.lang.Object;
import e7d.f;

public class j extends Accessor	// class@001c25
{
    public final m$a c;
    public final l d;

    public void j(l p0,m$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.h;
    }
    public void set(Object p0){
       this.c.h = p0;
    }
}
