package b4d.c1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b4d.e1;
import b4d.v0;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class c1 extends Accessor	// class@00035c
{
    public final v0 c;
    public final e1 d;

    public void c1(e1 p0,v0 p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.p;
    }
    public void set(Object p0){
       c1 tc = this.c;
       tc.p = p0;
    }
}
