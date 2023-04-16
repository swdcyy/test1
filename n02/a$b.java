package n02.a$b;
import androidx.fragment.app.c$b;
import n02.a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import n02.d;
import msd.a;
import k51.b;
import n02.c;
import n02.b;
import n02.e;

public class a$b extends c$b	// class@003269
{
    public final c a;
    public final a b;

    public void a$b(a p0,c p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void e(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "3")) {
          return;
       }
       if (p1 != this.b.q) {
          return;
       }
       a$b ta = this.a;
       if (ta != null) {
          ta.unregisterFragmentLifecycleCallbacks(this);
       }
       return;
    }
    public void f(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "4")) {
          return;
       }
       if (p1 != this.b.q) {
          return;
       }
       b.b("dispatchFragmentPaused", new d(this, p0, p1));
       return;
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "2")) {
          return;
       }
       if (p1 != this.b.q) {
          return;
       }
       b.b("dispatchFragmentResumed", new c(this, p0, p1));
       return;
    }
    public void k(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "1")) {
          return;
       }
       if (p1 != this.b.q) {
          return;
       }
       b.b("dispatchFragmentStarted", new b(this, p0, p1));
       return;
    }
    public void l(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$b.class, "5")) {
          return;
       }
       if (p1 != this.b.q) {
          return;
       }
       b.b("dispatchFragmentStopped", new e(this, p0, p1));
       return;
    }
}
