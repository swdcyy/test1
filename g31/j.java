package g31.j;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.audience.component.topbar.d;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import ms5.a;
import ms5.a$b;

public class j extends m	// class@002411
{
    public final d c;

    public void j(d p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       j tc = this.c;
       Objects.requireNonNull(tc);
       if (!PatchProxy.applyVoid(null, tc, d.class, "11")) {
          d s = tc.S;
          if (s != null) {
             d t = tc.T;
             t = (t != null && t.Kc(s))? 1: 0;
             if (t) {
                tc.b9(s, true);
             }
          }
       }
       return;
    }
}
