package bjc.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bjc.f;
import bjc.h$b;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class a extends Accessor	// class@000480
{
    public final h$b c;
    public final f d;

    public void a(f p0,h$b p1){
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
