package ao.b$g;
import qn.l;
import ao.b;
import java.lang.Object;
import rn.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qn.k;
import ao.e;
import rn.b;
import com.kuaishou.activity.kwaibubble.log.KwaiPopLog;
import xn.a$g;
import java.lang.Long;
import qn.m;
import xn.a;
import java.lang.Boolean;
import java.lang.Integer;

public final class b$g implements l	// class@000204
{
    public final b a;

    public void b$g(b p0){
       this.a = p0;
       super();
    }
    public void c(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$g.class, "1")) {
          return;
       }
       a.p(p0, "pop");
       k.d(this, p0);
       l ol = this.a.e().d();
       if (ol != null) {
          ol.c(this.a);
       }
       KwaiPopLog.G(KwaiPopLog.e, this.a.e().l(), a$g.b, null, null, Long.valueOf(this.a.b), null, null, null, this.a.e().b(), null, 748, null);
       return;
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$g.class, "4")) {
          return;
       }
       k.a(this, p0);
       l ol = this.a.e().d();
       if (ol != null) {
          ol.d(this.a);
       }
       return;
    }
    public void e(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$g.class, "3")) {
          return;
       }
       a.p(p0, "pop");
       k.c(this, p0);
       l ol = this.a.e().d();
       if (ol != null) {
          ol.e(this.a);
       }
       return;
    }
    public void f(a p0,int p1){
       b$g og = b$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, og, "2")) {
          return;
       }
       a.p(p0, "pop");
       k.b(this, p0, p1);
       l ol = this.a.e().d();
       if (ol != null) {
          ol.f(this.a, p1);
       }
       return;
    }
}
