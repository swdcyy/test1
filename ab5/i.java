package ab5.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab5.o;
import ab5.a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class i extends Accessor	// class@000050
{
    public final a c;
    public final o d;

    public void i(o p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
