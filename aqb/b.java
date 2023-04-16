package aqb.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import aqb.i;
import aqb.a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class b extends Accessor	// class@0002bd
{
    public final a c;
    public final i d;

    public void b(i p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.i;
    }
    public void set(Object p0){
       this.c.i = p0;
    }
}
