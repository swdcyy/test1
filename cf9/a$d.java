package cf9.a$d;
import erd.g;
import cf9.a;
import java.lang.Object;
import j4b.n;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import ze9.c;
import java.util.LinkedList;
import java.util.Collection;
import java.util.List;
import com.kwai.library.widget.popup.common.c;
import android.view.View;

public final class a$d implements g	// class@0005dc
{
    public final a b;

    public void a$d(a p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$d.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("PlatformMagicDebugController", "on MagicSelectedEvent", objArray);
          boolean b = true;
          if (p0.a != null) {
             this.b.g2(b);
             p0 = this.b.o;
             if (p0 != null && !p0.c()) {
                p0 = this.b.o;
                if (p0 == null || (PatchProxy.applyVoid(null, p0, c.class, "5") || (!p0.c() && p0.a.size() > 0))) {
                   p0.d = p0.a(new LinkedList(p0.a));
                }
             }
          label_0060 :
             p0 = this.b.p;
             if (p0 != null && p0.K() == b) {
                p0 = this.b.p;
                if (p0 != null) {
                   p0 = p0.z();
                   if (p0 != null) {
                      p0.setVisibility(0);
                   }
                }
             }
          }else {
             p0 = this.b.p;
             if (p0 != null && p0.K() == b) {
                p0 = this.b.p;
                if (p0 != null) {
                   p0 = p0.z();
                   if (p0 != null) {
                      p0.setVisibility(4);
                   }
                }
             }
          }
       }
       return;
    }
}
