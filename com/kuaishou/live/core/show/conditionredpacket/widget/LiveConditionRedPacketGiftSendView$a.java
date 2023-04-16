package com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketGiftSendView$a;
import com.yxcorp.gifshow.widget.m;
import com.kuaishou.live.core.show.conditionredpacket.widget.LiveConditionRedPacketGiftSendView;
import o62.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.models.Gift;
import b62.q0;
import ht5.a;
import lm1.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import tw1.d;
import java.lang.Integer;
import h62.c;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketStage;
import com.kuaishou.live.core.show.conditionredpacket.logger.LiveRedPacketAction;
import com.kuaishou.live.core.show.conditionredpacket.logger.RedPacketType;
import com.kuaishou.live.core.show.conditionredpacket.logger.FirstReportType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionType;
import com.kuaishou.live.core.show.conditionredpacket.logger.ActionStatus;
import h62.a;
import lnc.i3;
import java.lang.Number;
import h62.d;
import java.lang.Throwable;
import ht5.b$b;
import java.util.Map;
import o62.a;
import ht5.d;
import ht5.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import lm1.f;
import com.kuaishou.live.core.show.conditionredpacket.grab.base.LiveConditionRedPacketResultDialogFragment$a;

public class LiveConditionRedPacketGiftSendView$a extends m	// class@000ac9
{
    public final b c;
    public final LiveConditionRedPacketGiftSendView d;

    public void LiveConditionRedPacketGiftSendView$a(LiveConditionRedPacketGiftSendView p0,b p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public void a(View p0){
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, LiveConditionRedPacketGiftSendView$a.class, "1")) {
          return;
       }
       LiveConditionRedPacketGiftSendView$a c = obj.c;
       Objects.requireNonNull(c);
       if (PatchProxy.applyVoid(null, c, b.class, "6") || (c.g.f() != null && c.g.d() != null)) {
          i oi = c.b(c.g.f());
          LiveConditionRedPacketGiftSendView$a uoa = c;
          i oi1 = oi;
          uoa.e(oi1, "PRE_SEND_GIFT", "CLIENT_LEEE_GIFT_BUTTON_CLICK", "[LiveConditionRedPacketGiftSendButtonViewModel][onGiftSendButtonClick]: click button ", 1);
          uoa.e(oi1, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveConditionRedPacketGiftSendButtonViewModel][onGiftSendButtonClick]: click button ", 1);
          d.n(c.g.a(), c.g.g(), c.g.e(), c.g.f().mId);
          Gift mId = c.g.f().mId;
          if (!PatchProxy.isSupport(b.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(mId), c, b.class, "10")) {
             c uoc = new c(c.c(), LiveRedPacketStage.RED_PACKET_RESULT, LiveRedPacketAction.RED_PACK_POPUP_RESULT_SEND_GIFT_CLICK, c.g.g(), RedPacketType.RED_PACKET_TYPE_CONDITION, -1, -1, FirstReportType.DEFAULT, ActionType.DEFAULT, ActionStatus.SUCCESS, "1.0");
             c uoc1 = oi1.e(a.a(c.g.e()));
             i3 oi3 = i3.f();
             oi3.c("giftId", Integer.valueOf(mId));
             uoc1.d(oi3.e());
             d.j(uoc1);
          }
          c.d(ActionStatus.START, mId, null);
          b$b uob = new b$b(c.g.f());
          uob.d(1);
          uob.g(c.g.c());
          uob.f(23);
          uob.h(null);
          uob.i(1);
          uob.k(new a(c, mId));
          uob.l(d.p(c.g.e()));
          b uob1 = uob.a();
          oi.e().k(uob1);
          oi.g(f.a(uob1));
          uob1.a("key_send_gift_context", oi);
          c.g.d().O1(uob1);
          c.f.a();
       }
    label_0135 :
       return;
    }
}
