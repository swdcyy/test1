package h6a.l1;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootVerticalDetailVMFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import uq7.a;
import mrd.a;

public final class l1 implements g	// class@00259e
{
    public final NasaGrootVerticalDetailVMFragment b;
    public final SlidePage c;

    public void l1(NasaGrootVerticalDetailVMFragment p0,SlidePage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       l1 tb = this.b;
       Objects.requireNonNull(tb);
       SlidePageConfig j1 = this.c.c.J1;
       boolean b = p0.booleanValue();
       boolean b1 = (tb.Z != p0.booleanValue())? true: false;
       j1.onNext(new a(b, b1));
       tb.Z = p0.booleanValue();
       return;
    }
}
