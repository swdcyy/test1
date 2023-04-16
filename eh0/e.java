package eh0.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import eh0.g;
import com.kuaishou.house.live.prerequest.a;
import java.lang.Object;
import com.kuaishou.house.live.prerequest.b;

public class e extends Accessor	// class@002160
{
    public final a c;
    public final g d;

    public void e(g p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.x;
    }
    public void set(Object p0){
       this.c.x = p0;
    }
}
