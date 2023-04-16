package bjc.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bjc.f;
import bjc.h$b;
import java.lang.Object;
import com.yxcorp.gifshow.share.widget.d$e;

public class d extends Accessor	// class@000483
{
    public final h$b c;
    public final f d;

    public void d(f p0,h$b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
