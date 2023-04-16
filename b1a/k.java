package b1a.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b1a.n;
import b1a.e;
import java.lang.Object;
import brd.t;

public class k extends Accessor	// class@00034e
{
    public final e c;
    public final n d;

    public void k(n p0,e p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
