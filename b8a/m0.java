package b8a.m0;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.k;
import java.lang.Object;
import java.lang.Boolean;
import xx9.a;
import rd5.j;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.yxcorp.gifshow.entity.QPhoto;

public final class m0 implements g	// class@0003c7
{
    public final k b;

    public void m0(k p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       m0 tb = this.b;
       if (tb.s.c() && tb.s.b() != null) {
          ChangeScreenVisibilityCause sCALE_SCREEN = ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN;
          if (tb.s.b().a == sCALE_SCREEN) {
             tb.s.d(new ChangeScreenVisibleEvent(tb.r, sCALE_SCREEN));
          }
       }
       return;
    }
}
