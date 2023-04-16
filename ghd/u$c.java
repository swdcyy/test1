package ghd.u$c;
import a17.b$a;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class u$c implements b$a	// class@000f3f
{
    public final b$a a;

    public void u$c(b$a p0){
       this.a = p0;
       super();
    }
    public void a(c p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, u$c.class, "1")) {
          return;
       }
       a.p(p0, "sheet");
       a.p(p1, "view");
       u$c ta = this.a;
       if (ta != null) {
          ta.a(p0, p1);
       }
       return;
    }
}
