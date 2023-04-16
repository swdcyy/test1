package h6a.n1;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class n1 implements g	// class@0025a6
{
    public final NasaGrootVerticalDetailVMFragment b;

    public void n1(NasaGrootVerticalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.F.c.y1.onNext(Boolean.TRUE);
    }
}
