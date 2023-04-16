package com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager$2;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.vice.LiveLiteViceGiftGuideManager;
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
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import w73.s$b;
import w73.a;
import com.kuaishou.live.lite.adapter.component.gift.giftguide.entry.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;

public final class LiveLiteViceGiftGuideManager$2 implements Model$a	// class@001de4
{
    public final LiveLiteViceGiftGuideManager b;

    public void LiveLiteViceGiftGuideManager$2(LiveLiteViceGiftGuideManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       boolean b;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteViceGiftGuideManager$2.class, "1")) {
       }else {
          a.p(p0, "source");
          b.P(LiveGiftTag.LIVE_VICE_GIFT_GUIDE.appendTag("LiveViceGiftGuideManager"), "giftGuideModel callback, oldValue: "+p1+", newValue: "+p2);
          LiveLiteViceGiftGuideManager$2 tb = this.b;
          tb.b(p2, tb.c.a());
          if (p1 != null) {
             LiveLiteViceGiftGuideManager$2 tb1 = this.b;
             Objects.requireNonNull(tb1);
             Object obj = PatchProxy.applyTwoRefs(p1, p2, tb1, LiveLiteViceGiftGuideManager.class, "2");
             b = true;
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else if(p1 instanceof s$b && (p2 instanceof s$b && (a.g(p1.a().a, p2.a().a) ^ b))){
                b = false;
             }
             if (!b) {
             label_0092 :
                return;
             }
          }
          p1 = this.b.e;
          if (p1 != null) {
             p1.f(false);
             goto label_0092 ;
          }else {
             goto label_0092 ;
          }
       }
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteViceGiftGuideManager$2.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.b(this, p0, p1, p2);
       }
       return;
    }
}
