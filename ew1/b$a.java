package ew1.b$a;
import yq5.c;
import ew1.b;
import java.lang.Object;
import yq5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import ew1.a;
import java.lang.Boolean;

public class b$a implements c	// class@002205
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "3")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_TOP_BAR, "scrollToPendant", "pendant", p0);
       b w = this.a.w;
       if (w != null) {
          w.a(p0);
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_TOP_BAR, "add pendant", "pendant", p0);
       b w = this.a.w;
       if (w != null) {
          w.b(p0);
       }
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_TOP_BAR, "remove pendant", "pendant", p0);
       b w = this.a.w;
       if (w != null) {
          w.c(p0);
       }
       return;
    }
    public void d(boolean p0){
       b$a uoa = b$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "4")) {
          return;
       }
       b.c0(LiveLogTag.LIVE_TOP_BAR, "setFlipping", "flipping", Boolean.valueOf(p0));
       b w = this.a.w;
       if (w != null) {
          w.d(p0);
       }
       return;
    }
}
