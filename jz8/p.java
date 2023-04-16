package jz8.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class p extends Accessor	// class@002a3c
{
    public final n c;
    public final c4 d;

    public void p(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b2;
    }
    public void set(Object p0){
       this.c.b2 = p0;
    }
}
