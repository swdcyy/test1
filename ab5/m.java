package ab5.m;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import ab5.o;
import ab5.a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class m extends Accessor	// class@000054
{
    public final a c;
    public final o d;

    public void m(o p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
