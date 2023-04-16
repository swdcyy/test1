package dw1.b$d;
import d71.c;
import dw1.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerPosition;
import com.kwai.feature.api.live.base.service.pendant.LivePendantContainerHideFlags;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.i;

public class b$d implements c	// class@002043
{
    public final b a;

    public void b$d(b p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0){
       b$d uod = b$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "1")) {
          return;
       }
       int i = 0;
       if (p0) {
          this.a.B.c6(i, (LivePendantContainerPosition.TOP.flag | LivePendantContainerPosition.BOTTOM.flag), LivePendantContainerHideFlags.AUDIENCE_BOTTOM_BAR_VISIBILITY);
       }else {
          b b = this.a.B;
          if (b.x4()) {
             i = LivePendantContainerPosition.TOP.flag;
          }
          b.c6(8, (i | LivePendantContainerPosition.BOTTOM.flag), LivePendantContainerHideFlags.AUDIENCE_BOTTOM_BAR_VISIBILITY);
       }
       return;
    }
}
