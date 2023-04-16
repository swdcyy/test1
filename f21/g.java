package f21.g;
import android.view.View$OnClickListener;
import f21.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import gq5.f;
import ok.x;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.core.basic.model.LiveGiftGuideConfig;
import kotlin.jvm.internal.a;
import lm1.i;
import lp3.i;
import h92.f;
import lm1.f;
import com.kuaishou.live.common.core.component.gift.gift.p;
import f21.b;
import java.lang.StringBuilder;
import wkd.b;
import ad5.a;

public final class g implements View$OnClickListener	// class@0022aa
{
    public final f b;

    public void g(f p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.b.k.g2.t();
       Gift gift = this.b.m.get();
       int i = 6;
       int i1 = 2;
       LiveGiftGuideConfig mGiftToken = this.b.l.get().mGiftToken;
       a.o(mGiftToken, "giftGuideInfoSupplier.get\(\).mGiftToken");
       i oi = this.b.a(gift, 6);
       this.b.d(oi, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveMultiLineGiftSendProcessor][initExplicitGiftAnimationView]normal guide send gift", 1);
       if (gift == null) {
          this.b.d(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveMultiLineGiftSendProcessor][initExplicitGiftAnimationView]giftGuideGift is null", 0x18707);
          return;
       }else {
          f.e(this.b.p, gift.mId);
          f uof = oi.b();
          a.o(uof, "context.giftSendParams");
          uof.n(this.b.c());
          uof.r(i1);
          uof.o(mGiftToken);
          if (p.m(gift)) {
             this.b.f(oi, gift, 1, mGiftToken, 2, i, 4);
             this.b.s.c();
          }else {
             Object obj = b.a(0x4c90014d);
             a.o(obj, "Singleton.get\(PaymentManager::class.java\)");
             this.b.d(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][initExplicitGiftAnimationView]kCoin:"+obj.q()+",need:"+p.g(gift), 0x1870a);
             g tb = this.b;
             tb.e(oi, gift, 1, tb.d, mGiftToken, tb.c(), 6, 2, 0x1870a);
             this.b.g(p.h(gift));
          }
          return;
       }
    }
}
