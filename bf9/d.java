package bf9.d;
import erd.g;
import bf9.h;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import android.app.Activity;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;

public final class d implements g	// class@00048e
{
    public final h b;

    public void d(h p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "6")) {
       }else if(!PanelShowEvent.a(tb.e, p0)){
          PanelShowEvent c = p0.c;
          if (c != PanelShowEvent$PanelType.MORE_OPTION) {
             if (c == PanelShowEvent$PanelType.BREAKPOINT) {
                h y = tb.y;
                int i = (p0.a != null)? 1: -1;
                tb.y = y + i;
             }
             if (p0.a != null) {
                tb.g2();
             }else {
                tb.i2();
             }
          }
       }
       return;
    }
}
