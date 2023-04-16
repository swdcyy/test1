package h92.i0$c;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog$a;
import h92.i0;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lm1.i;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import h92.f;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog$b;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Map;
import hj1.c;
import gj1.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.webview.cache.LiveWebViewLocalCacheEntry;
import n91.f;
import lp3.c;
import lp3.i;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import h92.j0;
import z1.k;
import tm2.c;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import java.lang.Boolean;
import lm1.f;
import com.kuaishou.live.common.core.component.gift.gift.p;
import gq5.f;
import i92.l$a;
import i92.l;
import brd.y;
import java.lang.StringBuilder;
import wkd.b;
import ad5.a;

public class i0$c implements LiveAudienceSendExplicitGiftConfirmDialog$a	// class@002d0f
{
    public final i0 a;

    public void i0$c(i0 p0){
       this.a = p0;
       super();
    }
    public void a(Gift p0,int p1,int p2){
       if (PatchProxy.isSupport(i0$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, i0$c.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.a.Y8(this.a.S8(p0, p1, 1), "PRE_SEND_GIFT", "CLIENT_BOTTOM_BAR_GIFT_CONFIRM_CLICK", "[LiveAudienceNormalGiftGuidePresenter][onCancelClicked]dialog click cancel", 0x30e09);
       f.c(this.a.q.Z2.a(), p0.mId, 1, false, false, false, p2, this.a.V8());
       return;
    }
    public void b(LiveAudienceSendExplicitGiftConfirmDialog$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i0$c.class, "1")) {
          return;
       }
       if (p0.b != null && p0.a != null) {
          String str = "giftId";
          b.S(LiveLogTag.GIFT_GUIDE.appendTag("PUBLIC_ID_CACHE"), "append gift id to local cache", str, Integer.valueOf(p0.a.mId));
          c uoc = this.a.p.get(Integer.valueOf(p0.a.mId));
          if (uoc != null) {
             uoc.b();
          }else {
             b.a(p0.a.mId);
          }
          if (!TextUtils.x(p0.g)) {
             LiveWebViewLocalCacheEntry liveWebViewL = new LiveWebViewLocalCacheEntry();
             liveWebViewL.mCacheKey = p0.g;
             liveWebViewL.mSaveTimeStamp = this.a.x.a(f.class).s();
             liveWebViewL.mExpiredDuration = TimeUnit.DAYS.toMillis(30);
             HashMap hashMap = new HashMap();
             liveWebViewL.mData = hashMap;
             hashMap.put(str, Integer.valueOf(p0.a.mId));
             c.b(liveWebViewL, new j0(this));
          }
       }
    label_0090 :
       x.E(this.a.L);
       b.S(LiveLogTag.GIFT_GUIDE.appendTag("NOT_PUBLIC_ID_CACHE"), "write checked to local cache", "isChecked", Boolean.valueOf(p0.b));
       int i = 1;
       i oi = this.a.S8(p0.a, p0.d, i);
       int i1 = 1;
       i oi1 = oi;
       this.a.Y8(oi1, "PRE_SEND_GIFT", "CLIENT_BOTTOM_BAR_GIFT_CONFIRM_CLICK", "[LiveAudienceNormalGiftGuidePresenter][onConfirmClicked]dialog send gift", i1);
       this.a.Y8(oi1, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceNormalGiftGuidePresenter][onConfirmClicked]dialog send gift", i1);
       if (p0.a == null) {
          this.a.Y8(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][onConfirmClicked]explicitGift is null", 0x18707);
          return;
       }else {
          String str1 = this.a.V8();
          f.c(this.a.q.Z2.a(), p0.a.mId, 1, false, true, p0.b, p0.e, str1);
          f uof = oi.b();
          uof.n(str1);
          uof.r(p0.c);
          uof.o(p0.f);
          if (p.m(p0.a)) {
             this.a.q.g2.t();
             if (p0.d == 6) {
                this.a.w.a().d(i);
                this.a.w.a().c();
             }
             this.a.b9(oi, p0.a, 1, p0.f, "guide_gift", p0.c, p0.d, p0.e);
             this.a.G.onNext(Boolean.TRUE);
          }else {
             oi1 = oi;
             this.a.Y8(oi1, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][onConfirmClicked]kCoin:"+b.a(0x4c90014d).q()+",need:"+p.g(p0.a), 0x1870a);
             i0$c ta = this.a;
             ta.a9(oi1, p0.a, 1, ta.K, p0.f, str1, p0.d, p0.c, 0x1870a);
             this.a.d9(p.h(p0.a));
          }
          return;
       }
    }
}
