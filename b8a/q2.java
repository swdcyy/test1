package b8a.q2;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.g0;
import java.lang.Object;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import xx9.a;

public final class q2 implements g	// class@0003dd
{
    public final g0 b;

    public void q2(g0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       q2 tb = this.b;
       g0 p = tb.p;
       boolean b = (p0.booleanValue() && (tb.D == null && !tb.s.isHdr()))? true: false;
       p.setScaleEnabled(b);
       if (p0.booleanValue() && tb.I != null) {
          tb.y.d(new ChangeScreenVisibleEvent(tb.s, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
       }
       return;
    }
}
