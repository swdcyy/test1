package jz8.y3;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import jz8.c4;
import jz8.n;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class y3 extends Accessor	// class@002a6c
{
    public final n c;
    public final c4 d;

    public void y3(c4 p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.f1;
    }
    public void set(Object p0){
       this.c.f1 = p0;
    }
}
