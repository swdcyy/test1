package f11.a0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import f11.c0;
import f11.w;
import java.lang.Object;
import lq5.a;

public class a0 extends Accessor	// class@002269
{
    public final w c;
    public final c0 d;

    public void a0(c0 p0,w p1){
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
