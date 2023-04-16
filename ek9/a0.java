package ek9.a0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ek9.s0;
import ek9.f;
import java.lang.Object;
import java.lang.Boolean;

public class a0 extends Accessor	// class@00216b
{
    public final f c;
    public final s0 d;

    public void a0(s0 p0,f p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Boolean.valueOf(this.c.g);
    }
    public void set(Object p0){
       this.c.g = p0.booleanValue();
    }
}
