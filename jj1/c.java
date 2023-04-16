package jj1.c;
import pj1.b$b;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import jj1.a;
import lj1.b;
import lj1.e;
import java.lang.Object;
import yg1.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements b$b	// class@002bb6
{
    public final LiveGiftSendModel a;
    public final a b;
    public final b c;
    public final e d;

    public void c(LiveGiftSendModel p0,a p1,b p2,e p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       a.p(p0, "result");
       c tb = this.b;
       if (tb != null) {
          tb.b(p0);
       }
       b p = this.c.p;
       if (p != null) {
          p.b(p0);
       }
       this.a.d("no_panel_send_gift_result", p0);
       this.a.f().remove(this.d);
       b.e0(LiveGiftTag.GIFT_SEND, "[LiveProcessorCallback][onResult]", "result", p0, "task", this.d, "taskList", this.a.f());
       return;
    }
}
