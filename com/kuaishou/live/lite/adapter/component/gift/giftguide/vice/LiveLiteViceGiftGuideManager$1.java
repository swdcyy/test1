package com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager$1;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import w73.s;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveLiteViceGiftGuideManager$1 implements Model$a	// class@001de3
{
    public final LiveLiteViceGiftGuideManager b;

    public void LiveLiteViceGiftGuideManager$1(LiveLiteViceGiftGuideManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteViceGiftGuideManager$1.class, "1")) {
       }else {
          a.p(p0, "source");
          b.P(LiveGiftTag.LIVE_VICE_GIFT_GUIDE.appendTag("LiveViceGiftGuideManager"), "giftGuideSwitcherModel callback, source: "+p0+", oldValue: "+p1+", newValue:"+p2);
          LiveLiteViceGiftGuideManager$1 tb = this.b;
          tb.b(tb.d.a(), p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteViceGiftGuideManager$1.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
