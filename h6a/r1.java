package h6a.r1;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import e5a.a;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class r1 implements g	// class@0025b6
{
    public final NasaGrootVerticalDetailVMFragment b;

    public void r1(NasaGrootVerticalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.L.y2.onNext(p0);
    }
}
