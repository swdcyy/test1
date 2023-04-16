package h6a.o0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class o0 implements g	// class@0025a9
{
    public final SlidePage b;

    public void o0(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.G1.onNext(p0);
    }
}
