package jz8.b4;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class b4 extends Accessor	// class@0029e6
{
    public final n c;
    public final c4 d;

    public void b4(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.u;
    }
    public void set(Object p0){
       this.c.u = p0;
    }
}
