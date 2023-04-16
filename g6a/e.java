package g6a.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g6a.i;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserCardFragment;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class e extends Accessor	// class@0023b5
{
    public final NasaGrootRecommendUserCardFragment c;
    public final i d;

    public void e(i p0,NasaGrootRecommendUserCardFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.F;
    }
    public void set(Object p0){
       this.c.F = p0;
    }
}
