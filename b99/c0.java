package b99.c0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b99.n0;
import b99.h;
import java.lang.Object;
import brd.t;

public class c0 extends Accessor	// class@000398
{
    public final h c;
    public final n0 d;

    public void c0(n0 p0,h p1){
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
