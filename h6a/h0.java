package h6a.h0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import io.reactivex.subjects.PublishSubject;

public final class h0 implements g	// class@00258d
{
    public final NasaGrootHorizontalDetailVMFragment b;

    public void h0(NasaGrootHorizontalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.F.c.A1.onNext(p0);
    }
}
