package gc9.a$f;
import android.view.View$OnClickListener;
import gc9.a;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.camera.record.base.d;
import od9.c;
import com.yxcorp.gifshow.camera.record.base.b;
import e17.i;
import k2b.e0;
import com.yxcorp.gifshow.camera.record.CameraLogger;

public final class a$f implements View$OnClickListener	// class@00246e
{
    public final a b;

    public void a$f(a p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$f.class, "1")) {
          return;
       }
       a.o(p0, "it");
       p0.setSelected((p0.isSelected() ^ 0x01));
       if (p0.isSelected() && (a.v < 3 && this.b.d.d(c.b).a == null)) {
          a.v = a.v + 1;
          i.a(R.style.arg_RES_7f11066a, 0x7f10048e);
       }
    label_0043 :
       a$f tb = this.b;
       CameraLogger.r(tb.f, tb.h2());
       return;
    }
}
