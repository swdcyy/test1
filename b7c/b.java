package b7c.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import b7c.d;
import b7c.a;
import java.lang.Object;
import com.kwai.framework.model.user.RecoUser;

public class b extends Accessor	// class@0003c3
{
    public final a c;
    public final d d;

    public void b(d p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.x;
    }
    public void set(Object p0){
       this.c.x = p0;
    }
}
