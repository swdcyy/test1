package h6a.q0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import d0a.o;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class q0 implements g	// class@0025b1
{
    public final SlidePage b;

    public void q0(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.O1.onNext(p0);
    }
}
