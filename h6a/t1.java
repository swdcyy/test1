package h6a.t1;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import rd5.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class t1 implements g	// class@0025be
{
    public final NasaGrootVerticalDetailVMFragment b;

    public void t1(NasaGrootVerticalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.L.f1.onNext(p0);
    }
}
