package j6a.e;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j6a.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.NasaLocationPermissionFragment;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class e extends Accessor	// class@002917
{
    public final NasaLocationPermissionFragment c;
    public final g d;

    public void e(g p0,NasaLocationPermissionFragment p1){
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
