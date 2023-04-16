package dz9.r;
import u07.u;
import dz9.u;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.popup.common.c;
import wkd.b;
import ho5.a;
import com.yxcorp.gifshow.entity.QPhoto;

public final class r implements u	// class@002020
{
    public final u b;

    public void r(u p0){
       this.b = p0;
       super();
    }
    public final void a(t p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, r.class, "1")) {
          return;
       }
       a.p(p0, "dialog");
       a.p(p1, "view");
       p0.o();
       b.a(-607332832).v(this.b.E);
       return;
    }
}
