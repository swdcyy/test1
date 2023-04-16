package jz8.l3;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class l3 extends Accessor	// class@002a22
{
    public final n c;
    public final c4 d;

    public void l3(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.t;
    }
    public void set(Object p0){
       this.c.t = p0;
    }
}
