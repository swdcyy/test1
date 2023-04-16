package al1.b;
import com.kuaishou.live.common.core.component.gift.gift.audience.v2.widget.LiveGiftHonorNamingView$a;
import al1.c;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintItem;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintDisplayInfo;
import com.kuaishou.live.common.core.component.gift.data.giftbox.honornaming.LiveGiftItemHintGiftNaming;
import com.kuaishou.live.external.invoke.deserializer.gift.LiveGiftItemHintActionInfo;
import ug1.u;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import al1.d;
import tx1.d;
import p91.m;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$UserPackage;
import al1.h;

public final class b implements LiveGiftHonorNamingView$a	// class@0000c7
{
    public final c a;
    public final Gift b;

    public void b(c p0,Gift p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(LiveGiftItemHintItem p0){
       b ta = this.a;
       b tb = this.b;
       Objects.requireNonNull(ta);
       if (p0 != null) {
          LiveGiftItemHintItem mDisplayInfo = p0.mDisplayInfo;
          if (mDisplayInfo != null) {
             LiveGiftItemHintDisplayInfo mGiftNaming = mDisplayInfo.mGiftNaming;
             if (mGiftNaming != null && mGiftNaming.mUserInfo != null) {
                mDisplayInfo = p0.mActionInfo;
                if (mDisplayInfo != null && mDisplayInfo.mActionType == 2) {
                   ta.q.a();
                   ta.p.G(new UserProfile(p0.mDisplayInfo.mGiftNaming.mUserInfo), LiveStreamClickType.UNKNOWN, 7, false, new d(ta, p0, tb), 106);
                   if (!PatchProxy.applyVoidTwoRefs(tb, p0, ta, c.class, "11") && tb != null) {
                      ClientContent$LiveStreamPackage liveStreamPa = ta.S8();
                      ClientContent$GiftPackage giftPackage = ta.R8(tb);
                      ClientContent$UserPackage userPackage = ta.V8(p0);
                      p0 = p0.mDescription;
                      if (!PatchProxy.applyVoidFourRefs(liveStreamPa, giftPackage, userPackage, p0, null, h.class, "4")) {
                         h.a("GIFT_HINT_CARD", p0, liveStreamPa, giftPackage, userPackage, "2457707");
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
