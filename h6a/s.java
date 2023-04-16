package h6a.s;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class s implements g	// class@0025bc
{
    public final NasaGrootDetailVMFragment b;

    public void s(NasaGrootDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.N.w1.onNext(p0);
    }
}
