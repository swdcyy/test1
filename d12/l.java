package d12.l;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d12.o;
import d12.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class l extends Accessor	// class@002420
{
    public final g c;
    public final o d;

    public void l(o p0,g p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f;
    }
    public void set(Object p0){
       this.c.f = p0;
    }
}
