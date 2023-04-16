package h6a.o;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Float;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class o implements g	// class@0025ac
{
    public final SlidePage b;

    public void o(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.B1.onNext(p0);
    }
}
