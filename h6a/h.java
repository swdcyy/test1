package h6a.h;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class h implements g	// class@002590
{
    public final SlidePage b;

    public void h(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.y1.onNext(Boolean.TRUE);
    }
}
