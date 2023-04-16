package h6a.p;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import rd5.e;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class p implements g	// class@0025b0
{
    public final SlidePage b;

    public void p(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.C1.onNext(p0);
    }
}
