package eva.b;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import eva.h;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import java.lang.Object;
import q99.a;

public class b extends Accessor	// class@002838
{
    public final HotSpotFragment c;
    public final h d;

    public void b(h p0,HotSpotFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.di();
    }
}