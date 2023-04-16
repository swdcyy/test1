package com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel$a;
import lq1.f;
import com.kuaishou.live.common.core.component.multiline.renderpart.giftbattle.model.LiveMultiLineGiftBattleModel;
import java.lang.Object;
import lq1.e;
import com.kuaishou.live.common.multiinteract.biz.adapter.BizEndReason;
import com.kuaishou.protobuf.livestream.nano.SCLiveMultiLineChatOpened;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import pr1.e;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveMultiLineGiftBattleModel$a implements f	// class@00156b
{
    public final LiveMultiLineGiftBattleModel a;

    public void LiveMultiLineGiftBattleModel$a(LiveMultiLineGiftBattleModel p0){
       this.a = p0;
       super();
    }
    public void a(){
       e.b(this);
    }
    public void b(BizEndReason p0){
       e.a(this, p0);
    }
    public void c(SCLiveMultiLineChatOpened p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiLineGiftBattleModel$a.class, "1")) {
          return;
       }
       a.p(p0, "scLineOpened");
       e.c(this, p0);
       LiveMultiLineGiftBattleModel c = this.a.c;
       if (c != null && !c.equals(p0.subModeId)) {
          b.r(e.a, "chatId is not same");
          return;
       }else {
          LiveMultiLineGiftBattleModel$a ta = this.a;
          ta.b = p0.multiLineChatId;
          p0 = p0.chatModeStartExtra;
          a.o(p0, "scLineOpened.chatModeStartExtra");
          ta.c0(p0);
          return;
       }
    }
}
