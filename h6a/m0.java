package h6a.m0;
import erd.g;
import com.yxcorp.gifshow.detail.slideplay.nasa.groot.vm.NasaGrootHorizontalDetailVMFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePage;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.slide.play.detail.base.BasePage;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import uq7.a;
import mrd.a;

public final class m0 implements g	// class@0025a1
{
    public final NasaGrootHorizontalDetailVMFragment b;
    public final SlidePage c;

    public void m0(NasaGrootHorizontalDetailVMFragment p0,SlidePage p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       m0 tb = this.b;
       Objects.requireNonNull(tb);
       SlidePageConfig j1 = this.c.c.J1;
       boolean b = p0.booleanValue();
       boolean b1 = (tb.Y != p0.booleanValue())? true: false;
       j1.onNext(new a(b, b1));
       tb.Y = p0.booleanValue();
       return;
    }
}
