package com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager$2;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.LiveLiteGiftGuideManager;
import java.lang.Object;
import java.lang.String;
import w73.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import java.util.List;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import w73.s$b;
import w73.a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveLiteGiftGuideManager$2 implements Model$a	// class@001dd2
{
    public final LiveLiteGiftGuideManager b;

    public void LiveLiteGiftGuideManager$2(LiveLiteGiftGuideManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftGuideManager$2.class, "1")) {
       }else {
          a.p(p0, "source");
          b.P(LiveGiftTag.LIVE_GIFT_GUIDE.appendTag("LiveGiftGuideManager"), "giftGuideModel callback, oldValue: "+p1+", newValue: "+p2);
          b = false;
          if (p1 != null && p2 != null) {
             LiveLiteGiftGuideManager$2 tb = this.b;
             Objects.requireNonNull(tb);
             Object obj = PatchProxy.applyTwoRefs(p1, p2, tb, LiveLiteGiftGuideManager.class, "2");
             boolean b1 = true;
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else if(p1 instanceof s$b && (p2 instanceof s$b && (a.g(p1.a().a, p2.a().a) ^ b1))){
                b1 = false;
             }
             if (!b1) {
             label_0086 :
                LiveLiteGiftGuideManager$2 tb1 = this.b;
                tb1.c(tb1.c.a(), p2);
             }
          }
       label_007f :
          this.b.g.f(b);
          goto label_0086 ;
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftGuideManager$2.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
