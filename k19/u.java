package k19.u;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import k19.y;
import k19.t$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class u extends Accessor	// class@002a98
{
    public final t$a c;
    public final y d;

    public void u(y p0,t$a p1){
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
