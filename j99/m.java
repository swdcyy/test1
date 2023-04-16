package j99.m;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j99.q;
import j99.t$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class m extends Accessor	// class@0027cb
{
    public final t$a c;
    public final q d;

    public void m(q p0,t$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.d;
    }
    public void set(Object p0){
       this.c.d = p0;
    }
}
