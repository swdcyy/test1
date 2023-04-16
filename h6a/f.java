package h6a.f;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootDetailVMFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import uq7.a;
import mrd.a;

public final class f implements g	// class@002588
{
    public final NasaGrootDetailVMFragment b;
    public final SlidePage c;

    public void f(NasaGrootDetailVMFragment p0,SlidePage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       SlidePageConfig j1 = this.c.c.J1;
       boolean b = p0.booleanValue();
       boolean b1 = (tb.X0 != p0.booleanValue())? true: false;
       j1.onNext(new a(b, b1));
       tb.X0 = p0.booleanValue();
       return;
    }
}
