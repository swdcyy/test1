package cm2.h;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cm2.j;
import cm2.e;
import java.lang.Object;
import mrd.c;

public class h extends Accessor	// class@00055f
{
    public final e c;
    public final j d;

    public void h(j p0,e p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.v;
    }
    public void set(Object p0){
       this.c.v = p0;
    }
}
