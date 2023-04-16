package h63.y$a;
import c77.o;
import h63.y;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import h63.g;
import h63.g$a;
import lnc.a1;
import h63.g$b;
import java.lang.Boolean;

public class y$a implements o	// class@002ca7
{
    public final y a;

    public void y$a(y p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       g g;
       y$a uoa = y$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       y p = this.a.p;
       if (p != null) {
          Objects.requireNonNull(p);
          g og = g.class;
          if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), p, og, "2")) {
             og = p.f;
             og.a = p1;
             og.e = p0;
             og.d = a1.a(0x7f06203d);
             g = p.g;
             if (g != null) {
                g.a();
             }
          }
       }
       return;
    }
    public void b(boolean p0){
       y$a uoa = y$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "1")) {
          return;
       }
       if (p0) {
          this.a.Y8();
          this.a.Z8();
       }else {
          this.a.V8();
       }
       return;
    }
}
