package h6a.a1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h6a.c1;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class a1 extends Accessor	// class@002572
{
    public final NasaGrootHorizontalDetailVMFragment c;
    public final c1 d;

    public void a1(c1 p0,NasaGrootHorizontalDetailVMFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.U;
    }
    public void set(Object p0){
       this.c.U = p0;
    }
}
