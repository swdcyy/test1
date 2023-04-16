package a77.g;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import a77.f;
import a77.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class g implements PopupInterface$h	// class@000072
{
    public final a b;
    public final f c;

    public void g(f p0,a p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(g.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, g.class, "1")) {
          return;
       }
       this.b.b0(null);
       g tc = this.c;
       tc.H = null;
       tc.G = Integer.MAX_VALUE;
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
