package b62.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b62.q;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.i;
import java.lang.Object;
import mrd.c;

public class o extends Accessor	// class@00034e
{
    public final i c;
    public final q d;

    public void o(q p0,i p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.r;
    }
    public void set(Object p0){
       this.c.r = p0;
    }
}
