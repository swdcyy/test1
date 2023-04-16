package g6a.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g6a.i;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserCardFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class d extends Accessor	// class@0023b4
{
    public final NasaGrootRecommendUserCardFragment c;
    public final i d;

    public void d(i p0,NasaGrootRecommendUserCardFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.I;
    }
    public void set(Object p0){
       this.c.I = p0;
    }
}
