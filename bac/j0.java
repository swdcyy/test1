package bac.j0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bac.l0;
import bac.f0$a;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class j0 extends Accessor	// class@00040c
{
    public final f0$a c;
    public final l0 d;

    public void j0(l0 p0,f0$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.h;
    }
    public void set(Object p0){
       this.c.h = p0;
    }
}
