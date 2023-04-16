package cg9.c;
import erd.g;
import cg9.d;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import pi9.p;
import android.view.View;
import com.yxcorp.utility.n;

public final class c implements g	// class@0005e4
{
    public final d b;

    public void c(d p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, d.class, "11")) {
       }else {
          PanelShowEvent b = p0.b;
          if (b == CameraPageType.VIDEO || (b == CameraPageType.LIVE_COVER || (b == CameraPageType.PHOTO && p.g(p0.c)))) {
             d r = tb.r;
             int i = 4;
             int i1 = (p0.a != null)? 4: 0;
             n.Y(r, i1, true);
             b = p0.b;
             if (b == CameraPageType.PHOTO || b == CameraPageType.LIVE_COVER) {
                d s = tb.s;
                if (p0.a == null) {
                   i = 0;
                }
                n.Y(s, i, true);
             }
          }
       }
       return;
    }
}
