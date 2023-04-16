package bjc.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import bjc.f;
import bjc.h$b;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class c extends Accessor	// class@000482
{
    public final h$b c;
    public final f d;

    public void c(f p0,h$b p1){
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
