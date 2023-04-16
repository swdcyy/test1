package om1.c$a;
import pm1.a$b;
import om1.c;
import java.lang.Object;
import pm1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mm1.c;
import mm1.e;

public class c$a implements a$b	// class@00353d
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       LiveSendGiftBaseTraceInfo liveSendGift = p0.d();
       if (liveSendGift != null) {
          this.a.yk(liveSendGift).f(p0.b()).d(p0.a()).e(p0.e()).g(p0.c()).a();
       }
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       LiveSendGiftBaseTraceInfo liveSendGift = p0.d();
       if (liveSendGift != null) {
          this.a.yk(liveSendGift).f(p0.b()).d(p0.a()).e(p0.e()).g(0x1871d).a();
       }
       return;
    }
}
