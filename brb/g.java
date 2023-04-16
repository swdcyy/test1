package brb.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import brb.i;
import brb.e;
import java.lang.Object;
import pr6.d;

public class g extends Accessor	// class@00043f
{
    public final e c;
    public final i d;

    public void g(i p0,e p1){
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
