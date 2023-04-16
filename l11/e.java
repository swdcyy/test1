package l11.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import l11.h;
import l11.b;
import java.lang.Object;
import la2.a;

public class e extends Accessor	// class@002e59
{
    public final b c;
    public final h d;

    public void e(h p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.Q;
    }
    public void set(Object p0){
       this.c.Q = p0;
    }
}
