package cy1.n;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import cy1.p;
import com.kuaishou.live.common.core.component.topbar.topuser.i;
import java.lang.Object;
import com.kuaishou.live.common.core.component.topbar.topuser.l;

public class n extends Accessor	// class@001eb7
{
    public final i c;
    public final p d;

    public void n(p p0,i p1){
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
