package h6a.v0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import java.lang.Object;
import e5a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class v0 implements g	// class@0025c5
{
    public final NasaGrootHorizontalDetailVMFragment b;

    public void v0(NasaGrootHorizontalDetailVMFragment p0){
       super();
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.J.y2.onNext(p0);
    }
}
