package b99.b0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b99.n0;
import b99.h;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class b0 extends Accessor	// class@000395
{
    public final h c;
    public final n0 d;

    public void b0(n0 p0,h p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.n;
    }
    public void set(Object p0){
       this.c.n = p0;
    }
}
