package j01.k;
import erd.g;
import j01.m;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.i;
import lm1.c;
import lm1.e;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.nebulacredit.http.LiveNebulaCreditGiftSendResponse;
import t02.a0;
import wy0.f;
import wj1.a;
import j01.i0;
import mk1.h;
import java.lang.Integer;
import android.util.SparseArray;
import com.kuaishou.live.common.core.component.gift.gift.p;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b;
import java.lang.Enum;
import p91.m;
import wh1.b;
import wh1.a;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import mk1.w;
import cl1.c;
import java.util.Map;
import android.os.SystemClock;
import lm1.g;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import com.google.gson.JsonElement;
import f92.b;
import lm1.d;
import lm1.f;
import ik1.i0;
import java.lang.StringBuilder;
import z12.e;
import l66.c;
import dda.k;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;
import h01.y;
import k01.a;

public final class k implements g	// class@0029ff
{
    public final m b;
    public final Gift c;
    public final GiftMessage d;
    public final i e;
    public final long f;
    public final c g;
    public final int h;
    public final e i;
    public final String j;
    public final int k;

    public void k(m p0,Gift p1,GiftMessage p2,i p3,long p4,c p5,int p6,e p7,String p8,int p9){
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
       this.k = p9;
    }
    public final void accept(Object p0){
       b uob;
       k ok2;
       k ok = this;
       k b = ok.b;
       k c = ok.c;
       k d = ok.d;
       k e = ok.e;
       k f = ok.f;
       k g = ok.g;
       k h = ok.h;
       k i = ok.i;
       k j = ok.j;
       k k = ok.k;
       WalletResponse walletRespon = p0;
       f.b(c, walletRespon, null, b.t);
       d.mStarLevel = walletRespon.mStarLevel;
       d.mSubStarLevel = walletRespon.mSubStarLevel;
       d.mStyleType = walletRespon.mStyleType;
       int[] ointArray = a.a(d);
       d.mNewGiftSlotStyle = ointArray[0];
       d.mDisplayDuration = ointArray[1];
       int i1 = b.q.I.get(d.mComboKey, Integer.valueOf(0)).intValue();
       if (p.b()) {
          uob = a.b(d.mGiftId, b.q.e.d().name(), b.t.Z2.getLiveStreamId());
          if (uob != null && (d.mComboKey == uob.d && uob.e > i1)) {
             b.d0(LiveLogTag.GIFT, "[GiftBoxSendGiftToAnchorPresenter][createPayGiftMessage] £º Á¬ËÍÊý¾Ý´íÎó", "CallerContext store comboCount", Integer.valueOf(i1), "storeParam store cmoboCount", Integer.valueOf(uob.e));
             i1 = uob.e;
          }
       }
       i1 = i1 + 1;
       b.q.I.put(d.mComboKey, Integer.valueOf(i1));
       d.mComboCount = i1;
       e.e().r(i1);
       int i2 = 1;
       b.R8(e, "CLIENT_SEND_REQUEST_RESULT", "[GiftBoxSendGiftToAnchorPresenter][httpSendNormalGiftToAnchor]send normal to anchor", i2);
       if (i1 > i2 && (d.mComboKey == b.q.H && !c.isMagicBoxGift())) {
          b uob1 = new b(c.mId, b.q.e.d().name(), b.t.Z2.getLiveStreamId(), d.mComboKey, w.e(b.q), b.q.t.g());
          uob.b(b.q.J);
          a.e(uob);
       }
    label_00fd :
       long l = SystemClock.elapsedRealtime() - f;
       g.c(l);
       g og = new g(walletRespon, null, 0, "", walletRespon.mCsLogCorrelateInfo);
       b uob2 = i1;
       b uob3 = i1;
       long l1 = l;
       k ok1 = c;
       uob2 = new b(b.t.Z2.getLiveStreamId(), d, c, h, 1, null, 4);
       b uob4 = uob3;
       uob4.b("key_send_gift_context", e);
       WalletResponse walletRespon1 = walletRespon;
       uob4.i = walletRespon1;
       uob4.j = walletRespon1.mGiftSentInfo;
       uob4.n = true;
       uob4.c(new d(e.b(), g, i, uob));
       b.t.V1.G4(uob4);
       String[] stringArray = new String[11];
       stringArray[0] = "taskSessionId="+j;
       stringArray[1] = "giftId=";
       stringArray[2] = String.valueOf(d.mGiftId);
       stringArray[3] = "giftCount=";
       stringArray[4] = String.valueOf(h);
       stringArray[5] = "giftComboCount=";
       stringArray[6] = String.valueOf(b.q.I.get(d.mComboKey));
       stringArray[7] = "giftIndex=";
       stringArray[8] = String.valueOf(k);
       stringArray[9] = "timeCost=";
       stringArray[10] = String.valueOf(l1);
       e.c("LiveAudienceGiftBox", "sendGiftSuccess", stringArray);
       if (b.t.c != null) {
          ok2 = ok1;
          c.a().b(new k(b.t.c.mEntity, ok2, h));
       }else {
          ok2 = ok1;
       }
       if (walletRespon1.mNeedBindMobile != null) {
          b.r.a();
       }
       i0 s = b.s;
       if (s != null && ok2 != null) {
          s.a(uob4.e, ok2.mId);
       }
       return;
    }
}
