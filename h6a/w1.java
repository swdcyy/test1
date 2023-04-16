package h6a.w1;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import h6a.y1;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class w1 extends Accessor	// class@0025ca
{
    public final NasaGrootVerticalDetailVMFragment c;
    public final y1 d;

    public void w1(y1 p0,NasaGrootVerticalDetailVMFragment p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.V;
    }
    public void set(Object p0){
       this.c.V = p0;
    }
}
