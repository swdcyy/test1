package h6a.n0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import tp7.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class n0 implements g	// class@0025a5
{
    public final SlidePage b;

    public void n0(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.F1.onNext(p0);
    }
}
