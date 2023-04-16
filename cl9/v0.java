package cl9.v0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cl9.k1;
import cl9.h0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class v0 extends Accessor	// class@000673
{
    public final h0 c;
    public final k1 d;

    public void v0(k1 p0,h0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
