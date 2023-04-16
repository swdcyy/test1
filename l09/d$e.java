package l09.d$e;
import androidx.fragment.app.c$b;
import l09.d;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import yx.j0;
import com.kwai.framework.player.core.b;

public final class d$e extends c$b	// class@002c67
{
    public final d a;

    public void d$e(d p0){
       this.a = p0;
       super();
    }
    public void d(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$e.class, "3")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       this.a.S8();
       return;
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$e.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       d$e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, d.class, "14")) {
          Object[] objArray = new Object[0];
          j0.f("PopPlayVideoPresenter", "pausePlayer", objArray);
          ta.t = true;
          d s = ta.s;
          if (s != null) {
             s.pause();
          }
       }
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$e.class, "2")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       d$e ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, d.class, "15")) {
          Object[] objArray = new Object[0];
          j0.f("PopPlayVideoPresenter", "startPlayer", objArray);
          ta.t = false;
          d s = ta.s;
          if (s != null) {
             s.start();
          }
       }
       return;
    }
}
