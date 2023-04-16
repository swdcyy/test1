package com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager$c;
import zg1.c;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.LiveGiftBoxManager;
import java.lang.Object;
import zg1.a;
import com.kuaishou.live.viewcontroller.ViewController;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.gift.log.LiveGiftTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import zg1.d;
import z1.k;
import aq5.d;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import ni1.d;
import java.util.Objects;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Number;

public final class LiveGiftBoxManager$c implements c	// class@0011c8
{
    public final LiveGiftBoxManager a;

    public void LiveGiftBoxManager$c(LiveGiftBoxManager p0){
       this.a = p0;
       super();
    }
    public void a(a p0,ViewController p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxManager$c.class, "2")) {
          return;
       }
       a.p(p0, "type");
       a.p(p1, "viewController");
       if (a.g(p1, this.a.c) ^ 0x01) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxManager][onDialogDismiss]diff vc");
          return;
       }else {
          p1 = this.a.e().get();
          a.o(p1, "dialogType.get\(\)");
          this.a.d().b(p1);
          LiveGiftBoxManager$c ta = this.a;
          ta.c = null;
          ta.c().yj(AudienceBizRelation.GIFT_BOX);
          this.a.f().h();
          return;
       }
    }
    public void b(a p0,ViewController p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveGiftBoxManager$c.class, str)) {
          return;
       }
       a.p(p0, "type");
       a.p(p1, "viewController");
       if (a.g(p1, this.a.c) ^ 0x01) {
          b.Z(LiveGiftTag.GIFT_BOX, "[LiveGiftBoxManager][onDialogShow]diff vc");
          return;
       }else {
          d uod = this.a.d();
          p1 = this.a.e().get();
          a.o(p1, "dialogType.get\(\)");
          LiveGiftBoxManager l = this.a.L;
          Objects.requireNonNull(l);
          Number number = PatchProxy.apply(null, l, LiveGiftBoxConfig.class, str);
          if (number == PatchProxyResult.class) {
             number = l.h.getValue();
          }
          uod.a(p1, number.intValue());
          this.a.c().Pj(AudienceBizRelation.GIFT_BOX);
          this.a.f().g();
          return;
       }
    }
}
