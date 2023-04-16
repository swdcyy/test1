package h6a.t;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class t implements g	// class@0025c0
{
    public final NasaGrootDetailVMFragment b;

    public void t(NasaGrootDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.booleanValue()) {
          tb.N.l2.onNext(Boolean.TRUE);
       }
       return;
    }
}
