package b1a.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b1a.n;
import b1a.e;
import java.lang.Object;
import brd.y;

public class i extends Accessor	// class@00034c
{
    public final e c;
    public final n d;

    public void i(n p0,e p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
