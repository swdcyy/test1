package b5c.a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import w2c.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s1c.o;
import java.lang.Integer;
import o07.o;

public final class a implements PopupInterface$h	// class@0003a4
{
    public final a b;

    public void a(a p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       o.q(true);
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, a.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       this.b.onDismiss();
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
