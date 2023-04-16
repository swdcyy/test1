package ci1.a;
import ci1.a$a;
import nsd.u;
import java.lang.Object;
import com.kuaishou.live.core.show.gift.GiftMessage;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MessagePackage;
import com.kuaishou.live.basic.model.QLiveMessage;
import d61.h0;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$RoundTripStatEvent;
import java.lang.System;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$StatPackage;
import wkd.b;
import com.yxcorp.gifshow.log.h;

public final class a	// class@0004c2
{
    public static final a$a a;

    static {
       a.a = new a$a(null);
    }
    public void a(){
       super();
    }
    public static final void a(GiftMessage p0){
       a$a a;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, null, a.class, str)) {
          return;
       }
       a = a.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(p0, a, a$a.class, str)) {
          a.p(p0, "giftMessage");
          ClientContent$MessagePackage messagePacka = new ClientContent$MessagePackage();
          messagePacka.identity = h0.a(p0.mId);
          messagePacka.type = 1;
          new ClientContent$ContentPackage().messagePackage = messagePacka;
          ClientStat$RoundTripStatEvent roundTripSta = new ClientStat$RoundTripStatEvent();
          roundTripSta.type = 1;
          roundTripSta.duration = System.currentTimeMillis() - p0.mClientTimestamp;
          ClientStat$StatPackage statPackage = new ClientStat$StatPackage();
          statPackage.roundTripStatEvent = roundTripSta;
          b.a(0x4b316083).j(statPackage);
       }
       return;
    }
}
