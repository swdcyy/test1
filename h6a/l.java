package h6a.l;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class l implements g	// class@0025a0
{
    public final SlidePage b;

    public void l(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.I1.onNext(p0);
    }
}
