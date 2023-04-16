package j01.u;
import erd.g;
import j01.x;
import com.kuaishou.live.common.core.component.gift.data.message.LiveGiftToAudienceMessage;
import ik1.h0;
import lm1.i;
import com.yxcorp.gifshow.models.Gift;
import com.kwai.framework.model.user.UserInfo;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.WalletResponse;
import java.util.Objects;
import com.kuaishou.live.core.show.gift.GiftMessage;
import wj1.a;
import tkd.b;
import tkd.d;
import ad5.b;
import ad5.a;
import j01.i0;
import mk1.h;
import java.lang.Integer;
import android.util.SparseArray;
import com.kuaishou.live.common.core.component.gift.gift.p;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import mk1.b;
import java.lang.Enum;
import t02.a0;
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
import h01.y;
import f92.b;
import lm1.f;
import com.google.gson.JsonElement;
import java.lang.Throwable;
import lm1.d;
import ik1.i0;
import android.os.SystemClock;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import z12.e;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import bb1.o;
import com.kuaishou.live.basic.model.QLiveMessage;
import k01.a;

public final class u implements g	// class@002a0b
{
    public final x b;
    public final LiveGiftToAudienceMessage c;
    public final h0 d;
    public final i e;
    public final Gift f;
    public final int g;
    public final UserInfo h;
    public final long i;
    public final boolean j;
    public final String k;
    public final String l;

    public void u(x p0,LiveGiftToAudienceMessage p1,h0 p2,i p3,Gift p4,int p5,UserInfo p6,long p7,boolean p8,String p9,String p10){
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
       this.l = p10;
    }
    public final void accept(Object p0){
       u ou1;
       u ou = this;
       u b = ou.b;
       u c = ou.c;
       u d = ou.d;
       u e = ou.e;
       u f = ou.f;
       u g = ou.g;
       u h = ou.h;
       u i = ou.i;
       u j = ou.j;
       u k = ou.k;
       u l = ou.l;
       WalletResponse walletRespon = p0;
       Objects.requireNonNull(b);
       c.mStarLevel = walletRespon.mStarLevel;
       c.mSubStarLevel = walletRespon.mSubStarLevel;
       c.mStyleType = walletRespon.mStyleType;
       int[] ointArray = a.a(c);
       c.mNewGiftSlotStyle = ointArray[0];
       c.mDisplayDuration = ointArray[1];
       d.a(0x630bc993).d1().b(walletRespon);
       int i1 = b.q.I.get(d.i, Integer.valueOf(0)).intValue();
       if (p.b()) {
          ou1 = i;
          b uob = a.b(c.mGiftId, b.q.e.d().name(), b.u.Z2.getLiveStreamId());
          if (uob != null && (c.mComboKey == uob.d && uob.e > i1)) {
             b.d0(LiveLogTag.GIFT, "[GiftBoxSendGiftToAudiencePresenter][httpSendGiftToAudience] £º Á¬ËÍÊý¾Ý´íÎó", "CallerContext store comboCount", Integer.valueOf(i1), "storeParam store cmoboCount", Integer.valueOf(uob.e));
             i1 = uob.e;
          }
       }else {
          ou1 = i;
       }
       i1 = i1 + 1;
       b.q.I.put(d.i, Integer.valueOf(i1));
       d.j = i1;
       c.mComboCount = i1;
       e.e().r(i1);
       int i2 = 1;
       b.S8(e, "CLIENT_SEND_REQUEST_RESULT", "[GiftBoxSendGiftToAudiencePresenter][httpSendGiftToAudience]send to audience", i2);
       if (i1 > i2) {
          i0 q = b.q;
          if (d.i == q.H) {
             b uob1 = new b(f.mId, q.e.d().name(), b.u.Z2.getLiveStreamId(), d.i, w.e(b.q), b.q.t.g());
             i1.b(b.q.J);
             a.e(i1);
          }
       }
       if (walletRespon.mNeedBindMobile != null) {
          b.r.a();
       }
       WalletResponse walletRespon1 = walletRespon;
       u ou2 = l;
       u ou3 = k;
       u ou4 = j;
       b uob2 = new b(b.getLiveStreamId(), c, f, g, 1, 1, 4);
       i1.g = h;
       i1.h = b.p.c();
       i1.j = walletRespon1.mGiftSentInfo;
       i1.n = true;
       i1.b("key_send_gift_context", e);
       k = f;
       u ou5 = d;
       i1.c(b.R8(e.b(), walletRespon1, d, walletRespon1.mCsLogCorrelateInfo, 0));
       b.u.V1.o4(i1);
       ou5.g = SystemClock.elapsedRealtime() - ou1;
       int i3 = b.p.i();
       WalletResponse mCsLogCorrel = walletRespon1.mCsLogCorrelateInfo;
       x ox = x.class;
       if (PatchProxy.isSupport(ox)) {
          Object[] objArray = new Object[]{Integer.valueOf(i3),ou5,Boolean.valueOf(ou4),mCsLogCorrel,ou3,ou2};
          if (!PatchProxy.applyVoid(objArray, b, ox, "6")) {
          label_01a0 :
             String[] stringArray = new String[true];
             stringArray[0] = ou5.toString();
             e.c("LiveAudienceGiftBox", "sendGiftToAudienceSuccess", stringArray);
             a0 b2 = b.u.b2;
             if (b2 != null) {
                ou5.a.mLiveAssistantType = b2.d(QCurrentUser.ME.getId()).ordinal();
             }
          }
       }else {
          goto label_01a0 ;
       }
       i0 s = b.s;
       if (s != null && k != null) {
          s.a(i1.e, k.mId);
       }
       return;
    }
}
