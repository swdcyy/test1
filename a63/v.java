package a63.v;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a63.a0;
import a63.a$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class v extends Accessor	// class@000066
{
    public final a$a c;
    public final a0 d;

    public void v(a0 p0,a$a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.e;
    }
    public void set(Object p0){
       this.c.e = p0;
    }
}
