package g33.w;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.live.external.LiveSettingsActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import lnc.i9;
import oe6.e;

public class w implements PopupInterface$h	// class@002a61
{
    public final AtomicBoolean b;
    public final LiveSettingsActivity c;

    public void w(LiveSettingsActivity p0,AtomicBoolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(w.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, w.class, "1")) {
          return;
       }
       if (!this.b.get() && !i9.a(a.a().a())) {
          e.i0(false);
          this.c.u3();
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
