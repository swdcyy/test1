package h92.c0;
import android.view.View$OnClickListener;
import h92.i0;
import java.lang.Object;
import android.view.View;
import t02.a0;
import gq5.f;
import ok.x;
import com.yxcorp.gifshow.models.Gift;
import java.lang.String;
import h92.s$d;
import lm1.i;
import lp3.i;
import h92.f;
import lm1.f;
import com.kuaishou.live.common.core.component.gift.gift.p;
import i92.l$a;
import i92.l;
import java.lang.StringBuilder;
import wkd.b;
import ad5.a;

public final class c0 implements View$OnClickListener	// class@002d01
{
    public final i0 b;

    public void c0(i0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       c0 tb = this.b;
       tb.q.g2.t();
       Object obj = tb.s.get();
       String str = tb.v.c();
       i oi = tb.S8(obj, 6, 1);
       tb.Y8(oi, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceNormalGiftGuidePresenter][initExplicitGiftAnimationView]normal guide send gift", 1);
       if (obj == null) {
          tb.Y8(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][initExplicitGiftAnimationView]explicitGift is null", 0x18707);
       }else {
          f.e(tb.x, obj.mId);
          f uof = oi.b();
          uof.n(tb.V8());
          uof.r(2);
          uof.o(str);
          if (p.m(obj)) {
             tb.b9(oi, obj, 1, str, "guide_gift", 2, 6, 4);
             tb.w.a().c();
          }else {
             c0 uoc0 = tb;
             i oi1 = oi;
             uoc0.Y8(oi1, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][initExplicitGiftAnimationView]kCoin:"+b.a(0x4c90014d).q()+",need:"+p.g(obj), 0x1870a);
             uoc0.a9(oi1, obj, 1, tb.K, str, tb.V8(), 6, 2, 0x1870a);
             tb.d9(p.h(obj));
          }
       }
       return;
    }
}
