package l29.c;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kuaishou.commercial.photoreduce.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import msd.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import o07.o;
import org.greenrobot.eventbus.a;
import wl9.a;
import java.lang.Integer;
import qrd.l1;

public final class c implements PopupInterface$h	// class@002c7d
{
    public final a$a b;
    public final QPhoto c;
    public final Activity d;
    public final a e;

    public void c(a$a p0,QPhoto p1,Activity p2,a p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.e(this, p0);
       a.d().k(new a(this.c, true));
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport2(c.class, "2") && PatchProxy.applyVoidTwoRefsWithListener(p0, Integer.valueOf(p1), this, c.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       o.b(this, p0, p1);
       a.d().k(new a(this.c, false));
       p0 = this.e;
       if (p0 != null) {
          p0.invoke();
       }
       PatchProxy.onMethodExit(c.class, "2");
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
