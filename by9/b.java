package by9.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import by9.e;
import by9.a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class b extends Accessor	// class@000511
{
    public final a c;
    public final e d;

    public void b(e p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c;
    }
    public void set(Object p0){
       this.c.c = p0;
    }
}
