package l51.b;
import lp3.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import xp5.g;
import lp3.c;
import sq5.a;

public final class b	// class@002e84
{
    public boolean a;
    public boolean b;
    public boolean c;
    public final e d;

    public void b(e p0){
       a.p(p0, "serviceManager");
       super();
       this.d = p0;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       if (this.c != null) {
          return;
       }
       if (this.a != null && this.b != null) {
          c uoc = this.d.a(g.class);
          a.o(uoc, "serviceManager.getServic¡­eInfoManager::class.java\)");
          String liveStreamId = uoc.getLiveStreamId();
          if (liveStreamId == null) {
             liveStreamId = "";
          }
          a.o(liveStreamId, "serviceManager.getServic\x20\x02.java\).liveStreamId ?: \"\"\x00");
          this.d.a(a.class).ri(liveStreamId);
          this.c = true;
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       if (this.c == null) {
          return;
       }
       if (this.a != null && this.b != null) {
          return;
       }
       this.d.a(a.class).wc();
       this.c = false;
       return;
    }
}
