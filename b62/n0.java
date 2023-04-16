package b62.n0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b62.p0;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.k;
import java.lang.Object;
import mrd.a;

public class n0 extends Accessor	// class@00034b
{
    public final k c;
    public final p0 d;

    public void n0(p0 p0,k p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.M;
    }
    public void set(Object p0){
       this.c.M = p0;
    }
}
