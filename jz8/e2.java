package jz8.e2;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class e2 extends Accessor	// class@0029f6
{
    public final n c;
    public final c4 d;

    public void e2(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.g1;
    }
    public void set(Object p0){
       this.c.g1 = p0;
    }
}
