package f21.f$c;
import com.kuaishou.live.common.core.component.gift.domain.giftguide.view.LiveAudienceSendExplicitGiftConfirmDialog$a;
import f21.f;
import java.lang.Object;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
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
import f21.f$c$a;
import z1.k;
import tm2.c;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import java.lang.Boolean;
import lm1.f;
import com.kuaishou.live.common.core.component.gift.gift.p;
import gq5.f;
import f21.b;
import brd.y;
import java.lang.StringBuilder;
import wkd.b;
import ad5.a;

public final class f$c implements LiveAudienceSendExplicitGiftConfirmDialog$a	// class@0022a7
{
    public final f a;

    public void f$c(f p0){
       this.a = p0;
       super();
    }
    public void a(Gift p0,int p1,int p2){
       if (PatchProxy.isSupport(f$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f$c.class, "2")) {
          return;
       }
       a.p(p0, "explicitGift");
       this.a.d(this.a.a(p0, p1), "PRE_SEND_GIFT", "CLIENT_BOTTOM_BAR_GIFT_CONFIRM_CLICK", "[LiveAudienceNormalGiftGuidePresenter][onCancelClicked]dialog click cancel", 0x30e09);
       a0 z2 = this.a.k.Z2;
       a.o(z2, "livePlayCallerContext.mLiveBasicContext");
       f.c(z2.a(), p0.mId, 1, false, false, false, p2, this.a.c());
       return;
    }
    public void b(LiveAudienceSendExplicitGiftConfirmDialog$b p0){
       LiveAudienceSendExplicitGiftConfirmDialog$b a;
       LiveAudienceSendExplicitGiftConfirmDialog$b f;
       if (PatchProxy.applyVoidOneRefs(p0, this, f$c.class, "1")) {
          return;
       }
       a.p(p0, "payload");
       if (p0.b != null && p0.a != null) {
          String str = "giftId";
          b.S(LiveLogTag.Live_LINE_GIFT_BATTLE.appendTag("PUBLIC_ID_CACHE"), "append gift id to local cache", str, Integer.valueOf(p0.a.mId));
          c uoc = this.a.a.get(Integer.valueOf(p0.a.mId));
          if (uoc != null) {
             uoc.b();
          }else {
             b.a(p0.a.mId);
          }
          if (!TextUtils.x(p0.g)) {
             LiveWebViewLocalCacheEntry liveWebViewL = new LiveWebViewLocalCacheEntry();
             liveWebViewL.mCacheKey = p0.g;
             c uoc1 = this.a.p.a(f.class);
             a.o(uoc1, "liveServiceManager.getSe¡­:class.java\n            \)");
             liveWebViewL.mSaveTimeStamp = uoc1.s();
             liveWebViewL.mExpiredDuration = TimeUnit.DAYS.toMillis(30);
             HashMap hashMap = new HashMap();
             liveWebViewL.mData = hashMap;
             a.o(hashMap, "cacheEntry.mData");
             hashMap.put(str, Integer.valueOf(p0.a.mId));
             c.b(liveWebViewL, new f$c$a(this));
          }
       }
    label_009f :
       x.E(this.a.e);
       b.S(LiveLogTag.GIFT_GUIDE.appendTag("NOT_PUBLIC_ID_CACHE"), "write checked to local cache", "isChecked", Boolean.valueOf(p0.b));
       i oi = this.a.a(p0.a, p0.d);
       int i = 1;
       i oi1 = oi;
       this.a.d(oi1, "PRE_SEND_GIFT", "CLIENT_BOTTOM_BAR_GIFT_CONFIRM_CLICK", "[LiveAudienceNormalGiftGuidePresenter][onConfirmClicked]dialog send gift", i);
       this.a.d(oi1, "SENDING_GIFT", "CLIENT_CLICK_SEND_GIFT", "[LiveAudienceNormalGiftGuidePresenter][onConfirmClicked]dialog send gift", i);
       if (p0.a == null) {
          this.a.d(oi, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][onConfirmClicked]explicitGift is null", 0x18707);
          return;
       }else {
          String str1 = this.a.c();
          a0 z2 = this.a.k.Z2;
          a.o(z2, "livePlayCallerContext.mLiveBasicContext");
          f.c(z2.a(), p0.a.mId, 1, false, true, p0.b, p0.e, str1);
          f uof = oi.b();
          uof.n(str1);
          uof.r(p0.c);
          uof.o(p0.f);
          String str2 = "payload.explicitGift";
          if (p.m(p0.a)) {
             this.a.k.g2.t();
             if (p0.d == 6) {
                this.a.s.d(true);
                this.a.s.c();
             }
             a = p0.a;
             a.o(a, str2);
             f = p0.f;
             a.o(f, "payload.giftToken");
             this.a.f(oi, a, 1, f, p0.c, p0.d, p0.e);
             this.a.b.onNext(Boolean.TRUE);
          }else {
             Object obj = b.a(0x4c90014d);
             a.o(obj, "Singleton.get\(PaymentManager::class.java\)");
             oi1 = oi;
             this.a.d(oi1, "SENDING_GIFT", "CLIENT_SEND_PRE_CHECK", "[LiveAudienceNormalGiftGuidePresenter][onConfirmClicked]kCoin:"+obj.q()+",need:"+p.g(p0.a), 0x1870a);
             a = p0.a;
             a.o(a, str2);
             this.a.e(oi1, a, 1, this.a.d, p0.f, str1, p0.d, p0.c, 0x1870a);
             this.a.g(p.h(p0.a));
          }
          return;
       }
    }
}
