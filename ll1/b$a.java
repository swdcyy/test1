package ll1.b$a;
import ll1.a;
import ll1.b;
import java.lang.Object;
import brd.t;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.sendgiftguide.LiveGiftLinkageMessage;
import brd.y;

public final class b$a implements a	// class@002f94
{
    public final b a;

    public void b$a(b p0){
       this.a = p0;
       super();
    }
    public t a(){
       t obj = PatchProxy.apply(null, this, b$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a.p.hide();
       a.o(obj, "mLiveGiftLinkageSubject.hide\(\)");
       return obj;
    }
    public void b(LiveGiftLinkageMessage p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       a.p(p0, "message");
       this.a.p.onNext(p0);
       return;
    }
}
