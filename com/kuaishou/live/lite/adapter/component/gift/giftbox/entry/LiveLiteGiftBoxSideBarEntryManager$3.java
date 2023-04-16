package com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager$3;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a;
import com.kuaishou.live.lite.adapter.component.gift.giftbox.entry.LiveLiteGiftBoxSideBarEntryManager;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.live.basic.model.LiveMessageFrequencyConfig$FrequencyConfig;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.base.model.Model$a$a;
import java.util.Objects;
import wh5.c;
import com.kwai.robust.PatchProxyResult;
import v91.k;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.QCurrentUser;
import x51.b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Long;
import java.lang.Boolean;
import pp.c;
import com.kuaishou.android.live.log.b;
import o73.d;
import java.lang.Runnable;
import ekd.k1;

public final class LiveLiteGiftBoxSideBarEntryManager$3 implements Model$a	// class@001dc0
{
    public final LiveLiteGiftBoxSideBarEntryManager b;

    public void LiveLiteGiftBoxSideBarEntryManager$3(LiveLiteGiftBoxSideBarEntryManager p0){
       this.b = p0;
       super();
    }
    public void F(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftBoxSideBarEntryManager$3.class, "2")) {
       }else {
          a.p(p0, "source");
          Model$a$a.a(this, p0, p1, p2);
       }
       return;
    }
    public void w0(String p0,Object p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveLiteGiftBoxSideBarEntryManager$3.class, "1")) {
       }else {
          a.p(p0, "source");
          LiveLiteGiftBoxSideBarEntryManager$3 tb = this.b;
          Objects.requireNonNull(tb);
          if (PatchProxy.applyVoidOneRefs(p2, tb, LiveLiteGiftBoxSideBarEntryManager.class, "1") || (!c.b() && p2 != null)) {
             k ok = PatchProxy.applyOneRefs(p2, tb, LiveLiteGiftBoxSideBarEntryManager.class, "2");
             if (ok != PatchProxyResult.class) {
             }else {
                QCurrentUser mE = QCurrentUser.ME;
                a.o(mE, "QCurrentUser.ME");
                k ok1 = new k("LiveGiftEnhanceFrequency"+mE.getId(), p2.mAppearColdTimeSpan, p2.mAppearTimesByColdTime, b.b());
             }
             b.d0(LiveLogTag.GIFT, "[tryStartShowEnhanceAnimationTimer] ", "mAudienceSafeShowTimeMs", Long.valueOf(p2.mAudienceSafeShowTimeMs), "canConsume", Boolean.valueOf(ok.b()));
             if (p2.mAudienceSafeShowTimeMs > 0 && ok.b()) {
                k1.s(new d(ok, tb), LiveLiteGiftBoxSideBarEntryManager.class, p2.mAudienceSafeShowTimeMs);
             }
          }
       }
    label_009c :
       return;
    }
}
