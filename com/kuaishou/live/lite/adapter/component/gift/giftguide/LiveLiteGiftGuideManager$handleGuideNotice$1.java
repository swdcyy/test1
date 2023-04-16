package com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$handleGuideNotice$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager;
import java.lang.Object;
import java.lang.String;
import w73.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import z1.k;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.a;
import com.kuaishou.live.lite.guidance.LiveLiteGuidanceMessageQueueManager$ILiveLiteGuidanceMessage;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveLiteGiftGuideManager$handleGuideNotice$1 implements Model$a	// class@001dd6
{
    public final LiveLiteGiftGuideManager b;

    public void LiveLiteGiftGuideManager$handleGuideNotice$1(LiveLiteGiftGuideManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftGuideManager$handleGuideNotice$1.class, "1")) {
       }else {
          a.p(p0, "source");
          b.c0(LiveGiftTag.LIVE_GIFT_GUIDE_NOTICE, "onChangeValue: ", "newValue", p2);
          if (p2 != null) {
             this.b.b().get().d(new a(this, p2));
          }
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftGuideManager$handleGuideNotice$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
