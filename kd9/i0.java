package kd9.i0;
import erd.g;
import com.yxcorp.gifshow.camera.record.frame.l;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import android.view.View;
import com.yxcorp.utility.n;

public final class i0 implements g	// class@002c55
{
    public final l b;

    public void i0(l p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       i0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, l.class, "7")) {
       }else if(PanelShowEvent.a(tb.e, p0) && p0.b == CameraPageType.PHOTO){
          PanelShowEvent c = p0.c;
          if (c == PanelShowEvent$PanelType.MAGIC || c == PanelShowEvent$PanelType.PRETTIFY) {
             l s = tb.s;
             int i = (p0.a != null || tb.k2())? 4: 0;
             n.Y(s, i, true);
          }
       }
       return;
    }
}
