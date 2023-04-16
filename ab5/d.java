package ab5.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab5.o;
import ab5.a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class d extends Accessor	// class@00004b
{
    public final a c;
    public final o d;

    public void d(o p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.m;
    }
    public void set(Object p0){
       this.c.m = p0;
    }
}
