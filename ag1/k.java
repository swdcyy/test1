package ag1.k;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ag1.n;
import com.kuaishou.live.common.core.component.effect.renderer.c;
import java.lang.Object;
import ag1.e;

public class k extends Accessor	// class@00008d
{
    public final c c;
    public final n d;

    public void k(n p0,c p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.A;
    }
    public void set(Object p0){
       this.c.A = p0;
    }
}
