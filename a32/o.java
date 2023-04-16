package a32.o;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a32.q;
import a32.n;
import java.lang.Object;
import a32.r;

public class o extends Accessor	// class@00002f
{
    public final n c;
    public final q d;

    public void o(q p0,n p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.t;
    }
    public void set(Object p0){
       this.c.t = p0;
    }
}
