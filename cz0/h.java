package cz0.h;
import erd.g;
import cz0.j;
import ht5.b;
import bz0.e;
import com.yxcorp.gifshow.models.Gift;
import t02.a0;
import lm1.c;
import lm1.g;
import java.lang.Object;
import com.kuaishou.live.common.core.component.gift.giftstore.api.LivePackSendResponse;
import java.util.Objects;
import ht5.d;
import java.lang.String;
import cz0.b;
import wh1.b;
import com.kuaishou.live.common.core.component.gift.trace.gift.util.GiftTab;
import java.lang.Enum;
import p91.m;
import wh1.a;
import f92.b;
import bz0.f;
import lm1.i;
import km1.b;
import java.util.List;
import com.kuaishou.android.live.log.b;
import lm1.d;
import lm1.f;
import lm1.e;
import ik1.i0;

public final class h implements g	// class@001ec9
{
    public final j b;
    public final b c;
    public final e d;
    public final Gift e;
    public final a0 f;
    public final c g;
    public final g h;

    public void h(j p0,b p1,e p2,Gift p3,a0 p4,c p5,g p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void accept(Object p0){
       h oh = this;
       h b = oh.b;
       h c = oh.c;
       h d = oh.d;
       h e = oh.e;
       h f = oh.f;
       h g = oh.g;
       h h = oh.h;
       LivePackSendResponse livePackSend = p0;
       Objects.requireNonNull(b);
       b m = c.m;
       Object obj = null;
       if (m != null) {
          m.onSuccess(obj);
       }
       int i = 1;
       b.c(d, "CLIENT_SEND_REQUEST_RESULT", "[LiveInSendPacketGiftInterceptor][onRequestSuccess]no panel send packet gift", i);
       if (c.c > i && !e.isMagicBoxGift()) {
          b uob = new b(e.mId, GiftTab.PacketGift.name(), f.Z2.getLiveStreamId(), c.d, c.c, c.b);
          a.e(b);
       }
       Object obj1 = obj;
       b uob1 = f.a(e, c.b, c.c, c.d, f, true, 1, c.e);
       uob1.j = livePackSend.getGiftSentInfo();
       uob1.n = true;
       i oi = d.b();
       if (oi != null) {
          uob1.b("key_send_gift_context", oi);
       }else {
          b.P(b.a, "[LiveInSendNormalGiftInterceptor][onRequestSuccess]context is null");
       }
       f uof = (oi != null)? oi.b(): f.a(c);
       uob1.c(new d(uof, g, obj1, h));
       f.V1.t2(uob1);
       return;
    }
}
