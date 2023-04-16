package com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel$a;
import pj1.b$b;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import jj1.a;
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

public final class LiveGiftSendModel$a implements b$b	// class@001252
{
    public final LiveGiftSendModel a;
    public final a b;
    public final e c;

    public void LiveGiftSendModel$a(LiveGiftSendModel p0,a p1,e p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftSendModel$a.class, "1")) {
          return;
       }
       a.p(p0, "result");
       LiveGiftSendModel$a tb = this.b;
       if (tb != null) {
          tb.b(p0);
       }
       this.a.d("no_panel_send_gift_with_confirm_dialog_result", p0);
       this.a.f().remove(this.c);
       b.e0(LiveGiftTag.GIFT_SEND, "[LiveProcessorCallback][onResult]", "result", p0, "task", this.c, "taskList", this.a.f());
       return;
    }
}
