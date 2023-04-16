package com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter$a;
import rd1.c;
import com.kuaishou.live.audience.component.chat.single.BaseLiveAudienceSingleChatPresenter;
import java.lang.Object;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$SCLiveChatGuestGiftInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.android.live.log.LiveLogTag;
import xd1.a;
import java.util.List;
import pp.c;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;

public final class BaseLiveAudienceSingleChatPresenter$a implements c	// class@000a84
{
    public final BaseLiveAudienceSingleChatPresenter a;

    public void BaseLiveAudienceSingleChatPresenter$a(BaseLiveAudienceSingleChatPresenter p0){
       this.a = p0;
       super();
    }
    public final void a(LiveStreamMessages$SCLiveChatGuestGiftInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseLiveAudienceSingleChatPresenter$a.class, "1")) {
          return;
       }
       a.p(p0, "guestGiftInfo");
       boolean b = this.a.R8();
       LiveLogTag lIVE_CHAT_GU = LiveLogTag.LIVE_CHAT_GUEST_GIFT;
       lIVE_CHAT_GU.appendTag(this.a.getTag());
       b.T(lIVE_CHAT_GU, "audience onLiveChatGuestGiftInfoUpdate", "guestGiftInfo", p0, "canShowGuestGiftInfoInChatWindow", Boolean.valueOf(b));
       BaseLiveAudienceSingleChatPresenter$a ta = this.a;
       ta.v = p0;
       ta.C5(p0, b);
       return;
    }
}
