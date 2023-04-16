package h6a.o1;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class o1 implements g	// class@0025aa
{
    public final NasaGrootVerticalDetailVMFragment b;

    public void o1(NasaGrootVerticalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.L.u.onNext(p0);
    }
}
