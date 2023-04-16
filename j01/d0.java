package j01.d0;
import erd.g;
import j01.e0;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.i;
import java.lang.String;
import lm1.g;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.LivePackSendResponse;
import java.util.Objects;
import com.kuaishou.live.external.invoke.deserializer.gift.PacketGift;
import com.kuaishou.live.common.core.component.gift.gift.p;
import com.kwai.framework.abtest.f;
import mk1.h;
import cl1.c;
import tk1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.BaseAdapter;
import java.lang.Integer;
import android.util.SparseArray;
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
import java.util.Map;
import wj1.a;
import f92.b;
import xp5.g;
import lp3.c;
import lp3.e;
import android.os.SystemClock;
import java.lang.StringBuilder;
import z12.e;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.sort.LiveGiftSortType;
import com.google.gson.JsonElement;
import lm1.c;
import fq5.b;
import w91.a;
import lm1.f;
import lm1.d;
import lm1.e;
import ik1.i0;
import l66.c;
import dda.k;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import m66.a;

public final class d0 implements g	// class@0029eb
{
    public final e0 b;
    public final Gift c;
    public final GiftMessage d;
    public final i e;
    public final int f;
    public final long g;
    public final String h;
    public final int i;
    public final g j;

    public void d0(e0 p0,Gift p1,GiftMessage p2,i p3,int p4,long p5,String p6,int p7,g p8){
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
       d0 uod0 = this;
       d0 b = uod0.b;
       d0 c = uod0.c;
       d0 d = uod0.d;
       d0 e = uod0.e;
       d0 f = uod0.f;
       d0 g = uod0.g;
       d0 h = uod0.h;
       d0 i = uod0.i;
       d0 j = uod0.j;
       LivePackSendResponse livePackSend = p0;
       Objects.requireNonNull(b);
       d0 uod01 = c;
       uod01.mCount = livePackSend.getCount();
       uod01.mExpireTime = livePackSend.getExpireTime();
       p.n(livePackSend.getServerTime(), uod01);
       uod01.mExpiredSoon = livePackSend.getExpiredSoon();
       if (!f.a("disableComboSendAutoDismissPanel")) {
          b.t.t.d();
       }
       e0 y = b.y;
       Objects.requireNonNull(y);
       if (!PatchProxy.applyVoid(null, y, b.class, "13")) {
          y.a.notifyDataSetChanged();
       }
       int i1 = b.t.I.get(d.mComboKey, Integer.valueOf(0)).intValue();
       if (p.b()) {
          b uob = a.b(d.mGiftId, b.t.e.d().name(), b.u.Z2.getLiveStreamId());
          if (uob != null && (d.mComboKey == uob.d && uob.e > i1)) {
             b.d0(LiveLogTag.GIFT, "[GiftBoxSendPacketGiftToAnchorPresenter][httpSendPacketGift] £º Á¬ËÍÊý¾Ý´íÎó", "CallerContext store comboCount", Integer.valueOf(i1), "storeParam store cmobocount", Integer.valueOf(uob.e));
             i1 = uob.e;
          }
       }
       int i2 = 1;
       i1 = i1 + i2;
       b.t.I.put(d.mComboKey, Integer.valueOf(i1));
       d.mComboCount = i1;
       e.e().r(i1);
       b.R8(e, "CLIENT_SEND_REQUEST_RESULT", "[GiftBoxSendPacketGiftToAnchorPresenter][httpSendPacketGift]send packet gift", i2);
       if (i1 > i2) {
          e0 t = b.t;
          if (d.mComboKey == t.H) {
             b uob1 = new b(c.mId, t.e.d().name(), b.u.Z2.getLiveStreamId(), d.mComboKey, w.e(b.t), b.t.t.g());
             i1.b(b.t.J);
             a.e(i1);
          }
       }
       int[] ointArray = a.a(d);
       d.mNewGiftSlotStyle = ointArray[0];
       d.mDisplayDuration = ointArray[i2];
       b uob2 = v5;
       b uob3 = v5;
       uod0 = h;
       uob2 = new b(b.v.a(g.class).getLiveStreamId(), d, c, f, 1, 0, 4);
       b uob4 = uob3;
       uob4.j = livePackSend.getGiftSentInfo();
       uob4.k = livePackSend.getAfterSendToast();
       uob4.l = livePackSend.getJumpUrl();
       uob4.n = true;
       uob4.b("key_send_gift_context", e);
       long l = SystemClock.elapsedRealtime() - g;
       String[] stringArray = new String[11];
       stringArray[0] = "taskSessionId="+uod0;
       stringArray[1] = "giftId=";
       stringArray[2] = String.valueOf(d.mGiftId);
       stringArray[3] = "giftCount=";
       stringArray[4] = String.valueOf(f);
       stringArray[5] = "giftComboCount=";
       stringArray[6] = String.valueOf(b.t.I.get(d.mComboKey));
       stringArray[7] = "giftIndex=";
       stringArray[8] = String.valueOf(i);
       stringArray[9] = "timeCost=";
       stringArray[10] = String.valueOf(l);
       e.c("LiveAudienceGiftBox", "sendPacketGiftSuccess", stringArray);
       HashMap hashMap = new HashMap();
       hashMap.put("type", Integer.valueOf(LiveGiftSortType.DEFAULT.getType()));
       d = j;
       d.b(b.r);
       c uoc = new c(uod0, l, hashMap, b.u.b().t5().a(a.class).d6(), null);
       f uof = e.b();
       uob4.c(new d(uof, g, uof.g(), d));
       b.u.V1.t2(uob4);
       if (b.u.c != null) {
          c.a().b(new k(b.u.c.mEntity, c, f));
       }
       return;
    }
}
