package fx8.u;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import fx8.x;
import fx8.t;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class u extends Accessor	// class@002396
{
    public final t c;
    public final x d;

    public void u(x p0,t p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
