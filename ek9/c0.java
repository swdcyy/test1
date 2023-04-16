package ek9.c0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ek9.s0;
import ek9.f;
import java.lang.Object;
import java.lang.Integer;

public class c0 extends Accessor	// class@002171
{
    public final f c;
    public final s0 d;

    public void c0(s0 p0,f p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.h);
    }
    public void set(Object p0){
       this.c.h = p0.intValue();
    }
}
