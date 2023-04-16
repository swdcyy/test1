package h6a.x;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import java.lang.Object;
import rd5.f;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class x implements g	// class@0025d0
{
    public final NasaGrootDetailVMFragment b;

    public void x(NasaGrootDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.N.g1.onNext(p0);
    }
}
