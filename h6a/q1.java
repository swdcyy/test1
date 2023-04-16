package h6a.q1;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class q1 implements g	// class@0025b2
{
    public final NasaGrootVerticalDetailVMFragment b;

    public void q1(NasaGrootVerticalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q1 tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.L.l2.onNext(Boolean.TRUE);
       }
       return;
    }
}
