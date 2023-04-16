package h6a.i1;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import v6a.o0;
import io.reactivex.subjects.PublishSubject;

public final class i1 implements g	// class@002592
{
    public final NasaGrootVerticalDetailVMFragment b;

    public void i1(NasaGrootVerticalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.L.R3.onNext(p0);
    }
}
