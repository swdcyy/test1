package a67.m;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import a67.l;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a67.b;
import y43.a;
import gq5.f;
import java.lang.Integer;
import o07.o;

public class m implements PopupInterface$h	// class@000063
{
    public final l b;

    public void m(l p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "1")) {
          return;
       }
       this.b.t.b(true);
       this.b.p.V0.j();
       return;
    }
    public void H(c p0,int p1){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, m.class, "2")) {
          return;
       }
       m tb = this.b;
       tb.v = null;
       tb.t.b(false);
       this.b.p.V0.t();
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
