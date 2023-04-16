package dl9.g1;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import dl9.c1;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import o07.o;

public final class g1 implements PopupInterface$h	// class@001f62
{
    public final c1 b;

    public void g1(c1 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g1.class, "1")) {
          return;
       }
       a.p(p0, "popup");
       this.b.S8(true);
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(g1.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, g1.class, "2")) {
          return;
       }
       a.p(p0, "popup");
       g1 tb = this.b;
       tb.C = null;
       tb.S8(false);
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
