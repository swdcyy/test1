package cl9.p0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cl9.k1;
import cl9.h0;
import java.lang.Object;
import brd.y;

public class p0 extends Accessor	// class@000653
{
    public final h0 c;
    public final k1 d;

    public void p0(k1 p0,h0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.z;
    }
    public void set(Object p0){
       this.c.z = p0;
    }
}
