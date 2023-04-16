package jz8.l4;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.t4;
import jz8.f4;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class l4 extends Accessor	// class@002a23
{
    public final f4 c;
    public final t4 d;

    public void l4(t4 p0,f4 p1){
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
