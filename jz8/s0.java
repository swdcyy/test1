package jz8.s0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class s0 extends Accessor	// class@002a49
{
    public final n c;
    public final c4 d;

    public void s0(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.c2;
    }
    public void set(Object p0){
       this.c.c2 = p0;
    }
}
