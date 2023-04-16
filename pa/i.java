package pa.i;
import ox8.a;
import ql9.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import ox8.a$a;
import wkd.b;
import u49.c;
import o49.h;
import o49.f;
import p49.c;
import p49.c$a;
import com.example.commercial.diversead.banner.DiverseAdRequester$getInstreamApi$1;
import com.example.commercial.diversead.banner.DiverseAdRequester$getInstreamApi$2;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import msd.l;
import nsd.u;
import com.kwai.framework.model.feed.BaseFeed;
import brd.x;
import pa.f;
import erd.g;
import cjd.e;
import erd.o;
import pa.g;
import pa.h;

public final class i extends a	// class@0028fd
{
    public final a b;

    public void i(a p0){
       a.p(p0, "adParams");
       super();
       this.b = p0;
    }
    public t a(){
       i oi = this;
       f uof = new f(c.Z.k(), null, DiverseAdRequester$getInstreamApi$1.INSTANCE, DiverseAdRequester$getInstreamApi$2.INSTANCE, 2, null);
       h oh = new h(null, oi.b.a(), oi.b.b(), v8, null, 17, null);
       t ot = b.a(0x3a268c29).q(a.a.b(oi.b)).compose(v12).doOnNext(f.b).map(new e()).map(g.b).onErrorReturn(h.b);
       a.o(ot, "Singleton.get\(Commercial\x20\x02e ?: \"\"\n        \)\n      }\x00");
       return ot;
    }
}
