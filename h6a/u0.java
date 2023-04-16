package h6a.u0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayHorizontalPhotosVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class u0 implements g	// class@0025c1
{
    public final NasaGrootHorizontalDetailVMFragment b;

    public void u0(NasaGrootHorizontalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       u0 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.J.l2.onNext(Boolean.TRUE);
       }
       return;
    }
}
