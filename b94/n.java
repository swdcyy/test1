package b94.n;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b94.p;
import b94.m;
import java.lang.Object;
import ks3.l;

public class n extends Accessor	// class@000335
{
    public final m c;
    public final p d;

    public void n(p p0,m p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.x;
    }
    public void set(Object p0){
       this.c.x = p0;
    }
}
