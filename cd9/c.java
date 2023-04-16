package cd9.c;
import erd.g;
import com.yxcorp.gifshow.camera.record.duet.controller.a;
import java.lang.Object;
import uc9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import bd9.f;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import android.view.View;
import pi9.e;

public final class c implements g	// class@0005a2
{
    public final a b;

    public void c(a p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, a.class, "11")) {
       }else if(tb.d.d(f.b).a == DuetLayoutManager$LayoutMode.IN){
          e.k(tb.v, p0.a);
       }
       return;
    }
}
