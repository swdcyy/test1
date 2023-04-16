package g21.a$d;
import androidx.fragment.app.c$b;
import g21.a;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import g21.b;
import java.lang.Boolean;
import java.util.List;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import android.view.View;

public final class a$d extends c$b	// class@002403
{
    public final a a;

    public void a$d(a p0){
       this.a = p0;
       super();
    }
    public void i(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$d.class, "1")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       b.S(b.a, "onFragmentResumed", "isMultiLineMode", Boolean.valueOf(this.a.e()));
       if (this.a.e()) {
          a$d ta = this.a;
          ta.s.post(ta.d);
       }
       return;
    }
    public void n(c p0,Fragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$d.class, "2")) {
          return;
       }
       a.p(p0, "fm");
       a.p(p1, "f");
       this.a.f();
       return;
    }
}
