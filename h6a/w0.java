package h6a.w0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class w0 implements g	// class@0025c9
{
    public final NasaGrootHorizontalDetailVMFragment b;

    public void w0(NasaGrootHorizontalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.J.j2.onNext(p0);
    }
}
