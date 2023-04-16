package h01.o$a;
import e82.e;
import h01.o;
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
import com.yxcorp.gifshow.models.Gift;
import lm1.f;
import com.kwai.framework.model.user.UserInfo;
import mk1.h;
import mk1.f;
import mk1.b;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import lm1.e;
import mk1.w;
import wk1.b;

public class o$a implements e	// class@0025f1
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void a(String p0,d p1){
       o$a a;
       Object obj = this;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, obj, o$a.class, "1")) {
          return;
       }
       LiveCreditExchangeInfo liveCreditEx = p1.b();
       if (liveCreditEx.getLiveCreditExchangeInfoData() == null) {
          b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[NormalGiftSenderPresenter] [LiveCreditExchangeResultListener] exchangeInfo.getLiveCreditExchangeInfoData\(\) is null ");
          return;
       }else {
          c uoc = p1.c();
          a.f(uoc.h());
          obj.a.R8(p1.c(), 1);
          i oi = uoc.f();
          oi.f(liveCreditEx.getLiveCreditExchangeInfoData().getExchangeId());
          if (uoc.c() == null) {
             return;
          }
          a = obj.a;
          f uof = new f(uoc.g(), uoc.c(), obj.a.y.c.s(uoc.d()), uoc.h(), false, uoc.e(), obj.a.y.e.i(), 4, false, uoc.a(), obj.a.y.O(oi.c()), w.k(a.x, a.y, uoc.c()));
          oi.g(liveCreditEx);
          obj.a.a9(uoc.e(), oi, uoc.d(), uoc.c(), uoc.a(), uoc.h(), uoc.g());
          obj.a.b9(uoc.h(), uoc.c(), uoc.a(), true, "[NormalGiftSenderPresenter][onExchangeSuccess]");
          return;
       }
    }
    public void b(String p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o$a.class, "2")) {
          return;
       }
       if (this.a.E != null && p1 != null) {
          this.a.R8(p1.c(), p1.a());
          i oi = p1.c().f();
          if (oi != null) {
             this.a.Y8(oi, "CLIENT_EXCHANGE_CASH_REQUST_RESULT", "[LiveAudienceNebulaSendGiftGoldCoinWalletPresenter][onExchangeFailAction]:exchangeGoldCoin error", 0xf4a11);
          }else {
             b.Z(LiveLogTag.LIVE_GOLD_COIN_EXCHANGE, "[NormalGiftSenderPresenter] [LiveCreditExchangeResultListener] context is null ");
          }
       }
       this.a.y.A.d("[NormalGiftSenderPresenter][onExchangeFail]");
       return;
    }
}
