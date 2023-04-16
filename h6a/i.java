package h6a.i;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class i implements g	// class@002594
{
    public final SlidePage b;

    public void i(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.z1.onNext(p0);
    }
}
