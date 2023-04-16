package h6a.b0;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h6a.d0;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class b0 extends Accessor	// class@002575
{
    public final NasaGrootDetailVMFragment c;
    public final d0 d;

    public void b0(d0 p0,NasaGrootDetailVMFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.Z;
    }
    public void set(Object p0){
       this.c.Z = p0;
    }
}
