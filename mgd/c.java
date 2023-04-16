package mgd.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import mgd.h;
import mgd.b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class c extends Accessor	// class@001d17
{
    public final b c;
    public final h d;

    public void c(h p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.a();
    }
}
