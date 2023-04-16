package ac8.s;
import ja8.d;
import com.mini.js.jsapi.ui.u;
import java.lang.Object;
import ja8.e;
import ja8.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import na8.a;
import ma8.g;
import ma8.i;
import com.mini.js.helper.a;

public final class s implements d	// class@000071
{
    public final u a;

    public void s(u p0){
       this.a = p0;
    }
    public final void a(e p0,c p1){
       s ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, ta, u.class, "1")) {
       }else {
          p1.a(a.c(p0, ta.b.h().g1()));
       }
       return;
    }
}
