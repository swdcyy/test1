package c57.f$b$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import c57.f$b;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import o07.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import c57.f;
import y47.k;
import java.lang.CharSequence;
import ft5.b;

public class f$b$a implements PopupInterface$h	// class@0004eb
{
    public final f$b b;

    public void f$b$a(f$b p0){
       this.b = p0;
       super();
    }
    public void B(c p0){
       o.e(this, p0);
    }
    public void H(c p0,int p1){
       f$b$a uob$a = f$b$a.class;
       if (PatchProxy.isSupport(uob$a) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob$a, "1")) {
          return;
       }
       if (p1) {
          f$b a = this.b.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(null, a, f.class, "6")) {
             a.v.m6(a.p.c(), false, true, "UNKNOWN");
          }
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
