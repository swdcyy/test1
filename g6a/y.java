package g6a.y;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g6a.a0;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserVideoFragment;
import java.lang.Object;
import java.lang.Integer;

public class y extends Accessor	// class@0023c9
{
    public final NasaGrootRecommendUserVideoFragment c;
    public final a0 d;

    public void y(a0 p0,NasaGrootRecommendUserVideoFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return Integer.valueOf(this.c.J);
    }
    public void set(Object p0){
       this.c.J = p0.intValue();
    }
}
