package g6a.v;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import g6a.a0;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.NasaGrootRecommendUserVideoFragment;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class v extends Accessor	// class@0023c6
{
    public final NasaGrootRecommendUserVideoFragment c;
    public final a0 d;

    public void v(a0 p0,NasaGrootRecommendUserVideoFragment p1){
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
