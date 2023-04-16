package cl9.y0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cl9.k1;
import cl9.h0;
import java.lang.Object;
import java.util.Map;

public class y0 extends Accessor	// class@000683
{
    public final h0 c;
    public final k1 d;

    public void y0(k1 p0,h0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.w;
    }
    public void set(Object p0){
       this.c.w = p0;
    }
}
