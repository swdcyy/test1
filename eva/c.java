package eva.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import eva.h;
import com.yxcorp.gifshow.hot.spot.fragment.HotSpotFragment;
import java.lang.Object;
import java.lang.Integer;

public class c extends Accessor	// class@002839
{
    public final HotSpotFragment c;
    public final h d;

    public void c(h p0,HotSpotFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.R);
    }
}
