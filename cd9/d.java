package cd9.d;
import erd.g;
import com.yxcorp.gifshow.camera.record.duet.controller.a;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.duet.controller.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import com.yxcorp.gifshow.camera.record.base.d;
import uc9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import android.view.View;
import pi9.e;
import bd9.g;
import j8c.a;
import q87.c;

public final class d implements g	// class@0005a3
{
    public final a b;

    public void d(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "10")) {
       }else if(p0.c == DuetLayoutManager$LayoutMode.IN){
          e.k(tb.v, tb.d.d(a.d).a);
       }else {
          e.k(tb.v, a.b);
       }
       a b = tb.B;
       Objects.requireNonNull(b);
       if (!PatchProxy.applyVoidOneRefs(p0, b, g.class, "4")) {
          Object[] objArray = new Object[0];
          a.D().w("DuetMagicController", "DuetLayoutUpdateEvent", objArray);
          b.a = p0.b;
       }
       return;
    }
}
