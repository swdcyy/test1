package h6a.f0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import java.lang.Object;
import tp7.l;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class f0 implements g	// class@002585
{
    public final NasaGrootHorizontalDetailVMFragment b;

    public void f0(NasaGrootHorizontalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.J.r2.onNext(p0);
    }
}
