package h6a.d1;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import java.lang.Object;
import java.lang.Long;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.SlidePlayVerticalPhotosVMFragment;
import v6a.o0;
import rd5.i;
import io.reactivex.subjects.PublishSubject;

public final class d1 implements g	// class@00257e
{
    public final NasaGrootVerticalDetailVMFragment b;

    public void d1(NasaGrootVerticalDetailVMFragment p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       this.b.L.r.onNext(i.e);
    }
}
