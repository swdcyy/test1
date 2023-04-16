package a77.a$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import a77.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import o07.o;

public class a$a implements PopupInterface$h	// class@000069
{
    public final PopupInterface$h b;
    public final a c;

    public void a$a(a p0,PopupInterface$h p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       a p = this.c.p;
       if (p != null) {
          p.B(p0);
       }
       a$a tb = this.b;
       if (tb != null) {
          tb.B(p0);
       }
       return;
    }
    public void H(c p0,int p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       a p = this.c.p;
       if (p != null) {
          p.H(p0, p1);
       }
       uoa = this.b;
       if (uoa != null) {
          uoa.H(p0, p1);
       }
       return;
    }
    public void J(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "4")) {
          return;
       }
       a p = this.c.p;
       if (p != null) {
          p.J(p0);
       }
       a$a tb = this.b;
       if (tb != null) {
          tb.J(p0);
       }
       return;
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "3")) {
          return;
       }
       a p = this.c.p;
       if (p != null) {
          p.p(p0);
       }
       a$a tb = this.b;
       if (tb != null) {
          tb.p(p0);
       }
       return;
    }
}
