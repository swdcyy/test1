package cz0.d;
import erd.g;
import cz0.g;
import ht5.b;
import t02.a0;
import bz0.e;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.LiveSendNoPanelGiftResponse;
import java.util.Objects;
import com.yxcorp.gifshow.model.response.WalletResponse;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.nebulacredit.http.LiveNebulaCreditGiftSendResponse;
import wy0.f;
import ht5.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import fq5.b;
import p91.m;
import lp3.e;
import rp5.a;
import lp3.c;
import xp5.i;
import cz0.b;
import android.os.SystemClock;
import bz0.f;
import yc1.a;
import wh1.b;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;
import wh1.a;
import f92.b;
import lm1.c;
import w91.a;
import java.util.Map;
import lm1.g;
import com.google.gson.JsonElement;
import lm1.i;
import com.kuaishou.live.common.core.component.gift.trace.bean.LiveSendGiftBaseTraceInfo;
import lm1.d;
import lm1.f;
import lm1.e;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import ik1.i0;

public final class d implements g	// class@001ec4
{
    public final g b;
    public final b c;
    public final a0 d;
    public final e e;
    public final long f;

    public void d(g p0,b p1,a0 p2,e p3,long p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final void accept(Object p0){
       e a;
       int i;
       d uod = this;
       d b = uod.b;
       d c = uod.c;
       d e = uod.e;
       d f = uod.f;
       LiveSendNoPanelGiftResponse liveSendNoPa = p0;
       Objects.requireNonNull(b);
       LiveNebulaCreditGiftSendResponse liveNebulaCr = null;
       f.b(c.a, liveSendNoPa.getWalletResponse(), liveNebulaCr, uod.d);
       b n = c.n;
       if (n != null) {
          n.onSuccess(liveSendNoPa);
       }
       LiveSendNoPanelGiftResponse mGiftSentInf = liveSendNoPa.mGiftSentInfo;
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidFourRefs(liveSendNoPa, e, Long.valueOf(f), mGiftSentInf, b, g.class, "4")) {
          e b1 = e.b;
          a uoa = b1.b().t5().a(a.class);
          i oi = b1.b().t5().a(i.class);
          a = e.a;
          e c1 = e.c;
          e.a();
          i = 1;
          b.c(e, "CLIENT_SEND_REQUEST_RESULT", "[LiveInSendNormalGiftInterceptor][onRequestSuccess]no panel send normal gift", i);
          long l = SystemClock.elapsedRealtime() - f;
          b c2 = a.c;
          b uob = (c2 > i)? 1: null;
          a uoa1 = b1.Z2.t5().a(a.class);
          if (uoa1.rd(a.d)) {
             c2 = uoa1.L5(a.d);
          }
          if (uob && !a.a.isMagicBoxGift()) {
             b uob1 = new b(a.a.mId, GiftTab.NormalGift.name(), b1.Z2.getLiveStreamId(), a.d, c2, a.b);
             a.e(uob);
          }
          c2 = f.a(a.a, a.b, c2, a.d, b1, true, true, a.e);
          c2.i = liveSendNoPa;
          c2.j = mGiftSentInf;
          c2.n = i;
          if (a.g != null) {
             c uoc = new c(c1, l, null, b1.Z2.t5().a(a.class).d6(), a.l);
             LiveNebulaCreditGiftSendResponse liveNebulaCr1 = liveNebulaCr;
             g og = new g(null, liveSendNoPa, null, "", liveSendNoPa.mCsLogCorrelateInfo);
             i oi1 = e.b();
             if (oi1 != null) {
                oi1.e().k(a);
             }
             f uof = (oi1 != null)? oi1.b(): f.a(a);
             c2.c(new d(uof, i, liveNebulaCr1, c1));
          }
          oi = e.b();
          if (oi != null) {
             c2.b("key_send_gift_context", oi);
          }else {
             b.P(b.a, "[LiveInSendNormalGiftInterceptor][onRequestSuccess]context is null");
          }
          b1.V1.G4(c2);
       }
       return;
    }
}
