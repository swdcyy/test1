package by9.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import by9.e;
import by9.a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class c extends Accessor	// class@000512
{
    public final a c;
    public final e d;

    public void c(e p0,a p1){
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
