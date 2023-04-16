package c24.b0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import c24.d0;
import c24.a0;
import java.lang.Object;
import ks3.f0;

public class b0 extends Accessor	// class@00046d
{
    public final a0 c;
    public final d0 d;

    public void b0(d0 p0,a0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.s;
    }
    public void set(Object p0){
       this.c.s = p0;
    }
}
