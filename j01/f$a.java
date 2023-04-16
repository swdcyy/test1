package j01.f$a;
import e82.e;
import j01.f;
import java.lang.Object;
import java.lang.String;
import e82.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo;
import com.kuaishou.live.core.show.exchangegoldcoin.LiveCreditExchangeInfo$LiveCreditExchangeInfoData;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import e82.c;
import com.kuaishou.live.core.show.exchangegoldcoin.a;
import lm1.i;
import lm1.f;
import com.kwai.framework.model.user.UserInfo;
import com.yxcorp.gifshow.models.Gift;
import j01.i0;
import mk1.b;
import com.kuaishou.live.core.show.gift.DrawingGift;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.h;
import lm1.e;

public class f$a implements e	// class@0029f2
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public void a(String p0,d p1){
       boolean b;
       Object obj = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, f$a.class, "1")) {
          return;
       }
       LiveCreditExchangeInfo$LiveCreditExchangeInfoData liveCreditEx = p1.b().getLiveCreditExchangeInfoData();
       if (liveCreditEx == null) {
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaGoldCoinPayUtil] [onExchangeSuccess] mLiveCreditExchangeInfoData is null ");
          return;
       }else {
          String exchangeId = liveCreditEx.getExchangeId();
          c uoc = p1.c();
          a.f(uoc.h());
          obj.a.Z8(uoc, 1);
          i oi = uoc.f();
          UserInfo userInfo = uoc.g();
          Gift gift = uoc.c();
          String str = obj.a.P8(uoc.d());
          b = uoc.h();
          boolean b1 = uoc.e();
          int i = obj.a.p.i();
          int i1 = (uoc.b() == null)? 0: obj.a.Y8(uoc.b());
          f uof = new f(userInfo, gift, str, b, false, b1, i, 4, true, i1, obj.a.q.O(oi.c()), null);
          oi.g(v3);
          uoc.f().f(exchangeId);
          obj.a.c9(oi, uoc.d(), uoc.e(), uoc.g(), uoc.b());
          return;
       }
    }
    public void b(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f$a.class, "2")) {
          return;
       }
       if (this.a.B != null && p1 != null) {
          c uoc = p1.c();
          this.a.Z8(uoc, p1.a());
          i oi = uoc.f();
          if (oi != null) {
             this.a.b9(oi, "CLIENT_EXCHANGE_CASH_REQUST_RESULT", "[LiveAudienceNebulaSendGiftGoldCoinWalletPresenter][onExchangeFail]:exchangeGoldCoin error", 0xf4a11);
          }else {
             b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[LiveAudienceNebulaSendGiftGoldCoinWalletPresenter] [onExchangeFail] context is null ");
          }
       }
       return;
    }
}
