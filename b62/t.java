package b62.t;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b62.v;
import b62.s;
import java.lang.Object;
import brd.t;

public class t extends Accessor	// class@000356
{
    public final s c;
    public final v d;

    public void t(v p0,s p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
