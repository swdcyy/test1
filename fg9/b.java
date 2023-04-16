package fg9.b;
import erd.g;
import fg9.c;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import fg9.d;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import pi9.n;

public final class b implements g	// class@002312
{
    public final c b;

    public void b(c p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       PanelShowEvent c;
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, c.class, "4")) {
       }else if(p0.b != tb.c || !PanelShowEvent.a(tb.e, p0)){
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().s("PanelShowController", "PanelShowEvent PanelType:"+p0.c+"show:"+p0.a, objArray);
          c = p0.c;
          if (c != PanelShowEvent$PanelType.PRETTIFY && (c == PanelShowEvent$PanelType.MAGIC || c == PanelShowEvent$PanelType.MUSIC)) {
             if (tb.n == 5) {
                d c1 = tb.c;
                if (c1 != CameraPageType.TIE_TIE && c1 != CameraPageType.WHATS_UP) {
                label_006b :
                   if (i) {
                      n.a(tb.o, (p0.a ^ 1), tb.s, new d(tb));
                      n.c(tb.p, (p0.a ^ 1));
                   }
                }
             }
             i = 1;
             goto label_006b ;
          }else {
             goto label_006b ;
          }
       }
       return;
    }
}
