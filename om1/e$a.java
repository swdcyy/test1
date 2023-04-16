package om1.e$a;
import pm1.a$b;
import om1.e;
import java.lang.Object;
import pm1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;

public class e$a implements a$b	// class@003540
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "1")) {
          return;
       }
       LiveSendGiftBaseTraceInfo liveSendGift = p0.d();
       if (liveSendGift != null) {
          this.a.yk(liveSendGift).f(p0.b()).d(p0.a()).e(p0.e()).g(p0.c()).a();
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e$a.class, "2")) {
          return;
       }
       LiveSendGiftBaseTraceInfo liveSendGift = p0.d();
       if (liveSendGift != null) {
          this.a.yk(liveSendGift).f(p0.b()).d(p0.a()).e(p0.e()).g(0x1871d).a();
       }
       return;
    }
}
