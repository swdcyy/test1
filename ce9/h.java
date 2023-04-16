package ce9.h;
import erd.g;
import com.yxcorp.gifshow.camera.record.magic.e;
import java.lang.Object;
import uc9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.camera.record.base.d;
import ug9.c;
import com.yxcorp.gifshow.camera.record.base.b;
import wd9.a;
import bd9.f;
import com.yxcorp.gifshow.camera.record.duet.controller.DuetLayoutManager$LayoutMode;
import android.view.View;
import pi9.e;

public final class h implements g	// class@0005c4
{
    public final e b;

    public void h(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, e.class, "38")) {
       }else if(tb.d.d(c.c).a != null || (tb.d.d(a.i).d != null && tb.d.d(f.b).a != DuetLayoutManager$LayoutMode.IN)){
          e.k(tb.w, p0.a);
       }
       return;
    }
}
