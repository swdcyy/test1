package ce9.g;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.e;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.duet.controller.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import uc9.a;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import android.view.View;
import pi9.e;

public final class g implements g	// class@0005c2
{
    public final e b;

    public void g(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "37")) {
       }else {
          a a = tb.d.d(a.d).a;
          e w = tb.w;
          if (p0.c != DuetLayoutManager$LayoutMode.IN) {
             a = a.b;
          }
          e.k(w, a);
       }
       return;
    }
}
