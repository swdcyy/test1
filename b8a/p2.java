package b8a.p2;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.g0;
import java.lang.Object;
import java.lang.Boolean;
import w85.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;

public final class p2 implements g	// class@0003d9
{
    public final g0 b;

    public void p2(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       p2 tb = this.b;
       if (!tb.v.g()) {
       }else {
          p0 = tb.p;
          boolean b = (tb.D == null && (!tb.s.isHdr() && !tb.L.b1()))? true: false;
          p0.setScaleEnabled(b);
       }
       return;
    }
}
