package g6a.g;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g6a.i;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserCardFragment;
import java.lang.Object;
import java.lang.Integer;

public class g extends Accessor	// class@0023b7
{
    public final NasaGrootRecommendUserCardFragment c;
    public final i d;

    public void g(i p0,NasaGrootRecommendUserCardFragment p1){
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
