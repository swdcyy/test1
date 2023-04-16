package a21.b;
import ne1.d;
import lp1.d;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ox0.l;

public final class b	// class@000036
{
    public l a;
    public final d b;
    public final d c;

    public void b(d p0,d p1){
       a.p(p0, "commentService");
       a.p(p1, "multiChatDelegate");
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       b ta = this.a;
       if (ta != null) {
          ta.d();
       }
       this.a = null;
       return;
    }
}
