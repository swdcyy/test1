package h6a.k;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import qp7.t0;
import io.reactivex.subjects.PublishSubject;

public final class k implements g	// class@00259c
{
    public final SlidePage b;

    public void k(SlidePage p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.c.x.onNext(p0);
    }
}
