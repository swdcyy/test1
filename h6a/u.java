package h6a.u;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import java.lang.Object;
import e5a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class u implements g	// class@0025c4
{
    public final NasaGrootDetailVMFragment b;

    public void u(NasaGrootDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.N.y2.onNext(p0);
    }
}
