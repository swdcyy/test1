package d12.j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import d12.o;
import d12.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class j extends Accessor	// class@00241e
{
    public final g c;
    public final o d;

    public void j(o p0,g p1){
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
