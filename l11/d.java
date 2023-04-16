package l11.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import l11.h;
import l11.b;
import java.lang.Object;
import m11.l;

public class d extends Accessor	// class@002e58
{
    public final b c;
    public final h d;

    public void d(h p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.P;
    }
    public void set(Object p0){
       this.c.P = p0;
    }
}
