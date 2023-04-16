package mgd.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import mgd.h;
import mgd.b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class d extends Accessor	// class@001d18
{
    public final b c;
    public final h d;

    public void d(h p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b();
    }
}
