package ghd.u$b;
import a17.b$b;
import erd.g;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import ghd.u;

public final class u$b implements b$b	// class@000f3e
{
    public final g a;
    public final g b;
    public final b$b c;

    public void u$b(g p0,g p1,b$b p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(c p0,View p1,int p2){
       if (PatchProxy.isSupport(u$b.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, u$b.class, "1")) {
          return;
       }
       a.p(p0, "sheet");
       int i = 2;
       if (p2) {
          int i1 = 1;
          if (p2 != i1) {
             if (p2 == i) {
                u.a.a(i1, this.a, this.b);
             }
          }else {
             u.a.a(3, this.a, this.b);
          }
       }else {
          u.a.a(i, this.a, this.b);
       }
       u$b tc = this.c;
       if (tc != null) {
          tc.a(p0, p1, p2);
       }
       return;
    }
}
