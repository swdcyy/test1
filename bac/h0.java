package bac.h0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.l0;
import bac.f0$a;
import java.lang.Object;
import fac.b;

public class h0 extends Accessor	// class@000407
{
    public final f0$a c;
    public final l0 d;

    public void h0(l0 p0,f0$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.k;
    }
    public void set(Object p0){
       this.c.k = p0;
    }
}
