package g6a.p;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g6a.r;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserFragment;
import java.lang.Object;
import java.lang.Integer;

public class p extends Accessor	// class@0023c0
{
    public final NasaGrootRecommendUserFragment c;
    public final r d;

    public void p(r p0,NasaGrootRecommendUserFragment p1){
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
