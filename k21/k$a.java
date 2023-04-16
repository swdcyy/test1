package k21.k$a;
import oq5.b;
import k21.k;
import java.lang.Object;
import oq5.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import t02.a0;
import com.kwai.live.gzone.floatbar.LivePlayerFloatItem;
import e57.a;
import k21.w;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class k$a implements b	// class@002c6f
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public void a(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "6")) {
          return;
       }
       if (p0 != null) {
          this.a.y.remove(p0);
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "2")) {
          return;
       }
       a0 q1 = this.a.r.q1;
       if (q1 != null) {
          q1.b(LivePlayerFloatItem.ACTIVE_ORIENTATION, false);
       }
       this.a.S8().setVisible(false);
       return;
    }
    public void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "5")) {
          return;
       }
       if (p0 != null) {
          this.a.y.add(p0);
       }
       return;
    }
    public boolean d(){
       Object obj = PatchProxy.apply(null, this, k$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.a9();
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "4")) {
          return;
       }
       this.a.S8().setVisible(false);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, k$a.class, "3")) {
          return;
       }
       a0 q1 = this.a.r.q1;
       if (q1 != null) {
          q1.b(LivePlayerFloatItem.ACTIVE_ORIENTATION, true);
       }
       this.a.S8().setVisible(true);
       return;
    }
}
