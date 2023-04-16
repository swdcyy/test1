package l01.c$a;
import kl1.a;
import l01.c;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.models.Gift;
import mk1.b;
import mk1.h;
import mk1.w;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.a;

public class c$a implements a	// class@002e40
{
    public final c a;

    public void c$a(c p0){
       this.a = p0;
       super();
    }
    public void a(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2")) {
          return;
       }
       this.a.W8(p0);
       return;
    }
    public void b(Gift p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       c$a ta = this.a;
       w.i(ta.F, ta.v, p0);
       this.a.X8(new i(this.a.p.o6()));
       return;
    }
}
