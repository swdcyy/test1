package j6a.d;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import j6a.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.location.NasaLocationPermissionFragment;
import java.lang.Object;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class d extends Accessor	// class@002916
{
    public final NasaLocationPermissionFragment c;
    public final g d;

    public void d(g p0,NasaLocationPermissionFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.G;
    }
    public void set(Object p0){
       this.c.G = p0;
    }
}
