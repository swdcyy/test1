package az9.e;
import erd.g;
import az9.i0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import xx9.a;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import com.yxcorp.gifshow.entity.QPhoto;

public final class e implements g	// class@000323
{
    public final i0 b;

    public void e(i0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       e tb = this.b;
       boolean b = p0.booleanValue();
       Objects.requireNonNull(tb);
       i0 oi0 = i0.class;
       if (!PatchProxy.isSupport(oi0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b), tb, oi0, "7")) {
          tb.o0();
          if (b ^ tb.B.c()) {
             tb.B.d(new ChangeScreenVisibleEvent(tb.u, ChangeScreenVisibilityCause.NASA_FEATURE_SCREEN_CLEAN));
          }
       }
       return;
    }
}
