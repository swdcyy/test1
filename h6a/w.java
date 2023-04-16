package h6a.w;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import java.lang.Object;
import rd5.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayPhotoDetailVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class w implements g	// class@0025cc
{
    public final NasaGrootDetailVMFragment b;

    public void w(NasaGrootDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.N.f1.onNext(p0);
    }
}
