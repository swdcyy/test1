package b99.h0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b99.n0;
import b99.h;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class h0 extends Accessor	// class@0003a3
{
    public final h c;
    public final n0 d;

    public void h0(n0 p0,h p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.j;
    }
    public void set(Object p0){
       this.c.j = p0;
    }
}
