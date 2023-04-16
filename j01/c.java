package j01.c;
import erd.g;
import j01.f;
import lm1.i;
import com.kuaishou.live.core.show.gift.DrawingGift;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.WalletResponse;
import java.util.Objects;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import java.lang.StringBuilder;
import com.kuaishou.live.core.show.gift.GiftMessage;
import android.os.SystemClock;
import com.kuaishou.live.basic.model.QLiveMessage;
import java.util.List;
import f92.a;
import xp5.g;
import java.lang.Class;
import lp3.c;
import lp3.e;
import lm1.a;
import lm1.f;
import lm1.c;
import java.util.Map;
import lm1.b;
import java.lang.Throwable;
import t02.a0;
import ik1.i0;
import xk1.a;
import wj1.a;
import z12.e;
import l66.c;
import dda.k;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import j01.i0;
import h01.y;
import com.kuaishou.live.core.show.gift.DrawingGift$Point;
import k01.a;

public final class c implements g	// class@0029ea
{
    public final f b;
    public final i c;
    public final boolean d;
    public final DrawingGift e;
    public final UserInfo f;
    public final long g;
    public final String h;
    public final int i;
    public final Gift j;

    public void c(f p0,i p1,boolean p2,DrawingGift p3,UserInfo p4,long p5,String p6,int p7,Gift p8){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
    }
    public final void accept(Object p0){
       c uoc = this;
       c b = uoc.b;
       c c = uoc.c;
       c d = uoc.d;
       c e = uoc.e;
       c f = uoc.f;
       c h = uoc.h;
       WalletResponse walletRespon = p0;
       Objects.requireNonNull(b);
       d.a(0x630bc993).d1().b(walletRespon);
       b.b9(c, "CLIENT_SEND_REQUEST_RESULT", "[GiftBoxSendDrawingGiftPresenter][httpSendDrawingGift]send drawing to anchor "+d, 1);
       GiftMessage giftMessage = b.W8(e, d, f);
       long l = SystemClock.elapsedRealtime() - uoc.g;
       List list = b.X8(e, d, f);
       int i = b.V8(e);
       p0 = v13;
       c uoc1 = new c(h, l, null, null, null);
       a uoa = v5;
       a uoa1 = v5;
       GiftMessage giftMessage1 = giftMessage;
       GiftMessage giftMessage2 = giftMessage;
       WalletResponse walletRespon1 = walletRespon;
       c uoc2 = e;
       e = uoc.j;
       p0 = uoc.i;
       uoc = h;
       uoa = new a(b.v.a(g.class).getLiveStreamId(), giftMessage1, list, e.mPoints.size(), i, 1, d, new a(c.b(), p0, new b(walletRespon, null)));
       uoa1.a("key_send_gift_context", c);
       b.u.V1.S1(uoa1);
       b.x.b(0);
       giftMessage2.mNewGiftSlotStyle = a.a(giftMessage2)[0];
       giftMessage2.mDisplayDuration = 3000;
       String[] stringArray = new String[]{"taskSessionId=",uoc,"giftCount=",String.valueOf(p0),"timeCost=",String.valueOf(l)};
       e.c("LiveAudienceGiftBox", "sendDrawingGiftSuccess", stringArray);
       if (b.u.c != null) {
          c.a().b(new k(b.u.c.mEntity, e, p0));
       }
       if (walletRespon1.mNeedBindMobile != null) {
          b.r.a();
       }
       if (b.s != null) {
          uoc = uoc2;
          DrawingGift mPoints = uoc.mPoints;
          if (mPoints != null && !mPoints.isEmpty()) {
             b.s.a(uoa1.f, uoc.mPoints.get((uoc.mPoints.size() - 1)).mGiftId);
          }
       }
       return;
    }
}
