package h6a.r;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import mrd.a;

public final class r implements g	// class@0025b8
{
    public final SlidePage b;

    public void r(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.E1.onNext(p0);
    }
}
