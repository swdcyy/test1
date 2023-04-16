package b79.m$a;
import com.yxcorp.gifshow.widget.m;
import b79.m;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import z69.y;

public final class m$a extends m	// class@00038a
{
    public final m c;

    public void m$a(m p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m$a.class, "1")) {
          return;
       }
       a.q(p0, "v");
       m g = this.c.g;
       if (g != null) {
          g.qd();
       }
       return;
    }
}
