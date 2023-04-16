package nz9.g1;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import nz9.z0;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zm5.a;
import java.lang.Integer;
import o07.o;

public class g1 implements PopupInterface$h	// class@003221
{
    public final z0 b;

    public void g1(z0 p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g1.class, "1")) {
          return;
       }
       this.b.U.b(false, 1);
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(g1.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, g1.class, "2")) {
          return;
       }
       this.b.U.b(true, true);
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
