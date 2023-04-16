package ad8.h;
import ja8.d;
import ad8.j;
import java.lang.Object;
import ja8.e;
import ja8.c;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import na8.a;
import ga8.g;
import com.mini.js.commonapitracer.c$b;
import com.mini.js.commonapitracer.b;
import zi8.p;
import com.mini.d;
import java.lang.StringBuilder;
import ad8.i;
import java.lang.Runnable;
import zi8.d1;

public final class h implements d	// class@000080
{
    public final j a;

    public void h(j p0){
       this.a = p0;
    }
    public final void a(e p0,c p1){
       h ta = this.a;
       Objects.requireNonNull(ta);
       if (PatchProxy.applyVoidTwoRefs(p0, p1, ta, j.class, "3")) {
       }else {
          a c = ta.c;
          c.b(c.j(p0), p0);
          if (p.d() && d.f()) {
             d.a("<input>", "hideKeyboard: "+p0.g());
          }
          d1.f(new i(p1, p0));
       }
       return;
    }
}
