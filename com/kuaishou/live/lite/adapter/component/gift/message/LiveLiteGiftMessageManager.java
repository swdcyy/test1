package com.kuaishou.live.lite.adapter.component.gift.message.LiveLiteGiftMessageManager;
import com.kuaishou.live.common.core.component.gift.base.LifecycleManager;
import androidx.lifecycle.LifecycleOwner;
import com.kuaishou.live.common.core.component.trigger.LiveActionTrigger;
import ip3.a;
import com.kuaishou.live.common.core.component.gift.domain.giftsend.LiveGiftSendModel;
import ah1.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.lite.adapter.component.gift.message.LiveLiteGiftMessageManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.lite.adapter.component.gift.message.LiveLiteGiftMessageManager$2;

public final class LiveLiteGiftMessageManager extends LifecycleManager	// class@001deb
{
    public final String c;
    public final LiveActionTrigger d;
    public final a e;
    public final LiveGiftSendModel f;
    public final c g;

    public void LiveLiteGiftMessageManager(LifecycleOwner p0,LiveActionTrigger p1,a p2,LiveGiftSendModel p3,c p4){
       a.p(p0, "lifecycleOwner");
       a.p(p1, "liveActionTrigger");
       a.p(p2, "commentService");
       a.p(p3, "giftSendModel");
       a.p(p4, "giftMockMessageModel");
       super(p0);
       this.d = p1;
       this.e = p2;
       this.f = p3;
       this.g = p4;
       this.c = "LiveGiftMessageManager";
       p3.b(p0, new LiveLiteGiftMessageManager$1(this));
       p4.b(p0, new LiveLiteGiftMessageManager$2());
    }
}
