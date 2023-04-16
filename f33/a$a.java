package f33.a$a;
import androidx.fragment.app.c$b;
import androidx.fragment.app.Fragment;
import com.kuaishou.live.ext.FragmentViewControllerHostFragment;
import androidx.fragment.app.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.e;

public final class a$a extends c$b	// class@002852
{
    public final Fragment a;
    public final FragmentViewControllerHostFragment b;

    public void a$a(Fragment p0,FragmentViewControllerHostFragment p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void d(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
          return;
       }
       a.p(p0, "fragmentManager");
       a.p(p1, "fragment");
       if (p1 == this.a) {
          p0.unregisterFragmentLifecycleCallbacks(this);
       }
       return;
    }
    public void n(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "fragmentManager");
       a.p(p1, "fragment");
       a$a ta = this.a;
       if (p1 == ta) {
          ta.getChildFragmentManager().beginTransaction().u(this.b).o();
       }
       return;
    }
}
