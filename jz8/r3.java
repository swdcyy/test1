package jz8.r3;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class r3 extends Accessor	// class@002a46
{
    public final n c;
    public final c4 d;

    public void r3(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.I;
    }
    public void set(Object p0){
       this.c.I = p0;
    }
}
