package bk1.a;
import ok.h;
import com.kuaishou.live.common.core.component.gift.domain.slot.model.LiveGiftSlotModel;
import java.lang.Object;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.util.Objects;
import com.kuaishou.live.core.show.gift.GiftMessage;
import com.kuaishou.live.common.core.component.gift.domain.slot.data.GiftSlotMessage;
import gm1.a;
import java.lang.String;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import om1.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.gift.DrawingGift;

public final class a implements h	// class@0003b1
{
    public final LiveGiftSlotModel b;

    public void a(LiveGiftSlotModel p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       GiftSlotMessage giftSlotMess = a.a(p0.cast());
       p0 = tb.k.Ig(p0.mId);
       giftSlotMess.traceInfo = p0;
       Objects.requireNonNull(p0);
       if (PatchProxy.applyOneRefs(giftSlotMess, p0, LiveSendGiftBaseTraceInfo.class, "6") != PatchProxyResult.class) {
       }else {
          p0.w(giftSlotMess.mGiftId);
          p0.v(String.valueOf(giftSlotMess.mMagicFaceId));
          p0.o(giftSlotMess.mIsDrawingGift);
          p0.r(giftSlotMess.mComboCount);
          p0.p(giftSlotMess.mCount);
          UserInfo user = giftSlotMess.getUser();
          if (user != null) {
             p0.C(user.mId);
          }else {
             p0.C("");
          }
          GiftSlotMessage mDrawingGift = giftSlotMess.mDrawingGift;
          if (mDrawingGift != null) {
             p0.h(mDrawingGift);
          }
       }
       return giftSlotMess;
    }
}
