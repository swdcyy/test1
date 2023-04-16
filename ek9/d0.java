package ek9.d0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ek9.s0;
import ek9.f;
import java.lang.Object;
import java.util.Set;

public class d0 extends Accessor	// class@002174
{
    public final f c;
    public final s0 d;

    public void d0(s0 p0,f p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.m;
    }
    public void set(Object p0){
       this.c.m = p0;
    }
}
