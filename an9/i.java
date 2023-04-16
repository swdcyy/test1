package an9.i;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import an9.k;
import an9.f;
import java.lang.Object;
import com.yxcorp.gifshow.autoplay.live.LiveAutoPlayModule;

public class i extends Accessor	// class@00010a
{
    public final f c;
    public final k d;

    public void i(k p0,f p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.r;
    }
    public void set(Object p0){
       this.c.r = p0;
    }
}
