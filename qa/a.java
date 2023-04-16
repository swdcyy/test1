package qa.a;
import ox8.a;
import qa.a$a;
import nsd.u;
import ql9.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import brd.t;
import ox8.a$a;
import com.middleware.security.MXSec;
import com.middleware.security.wrapper.IKSecurityBase;
import zsd.d;
import java.util.Objects;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import yx.j0;
import wkd.b;
import u49.c;
import s00.b$b;
import s00.b;
import o49.h;
import o49.f;
import p49.c;
import p49.c$a;
import com.example.commercial.diversead.request.DiverseAdEncRequester$getDiverseAdApi$1;
import com.example.commercial.diversead.request.DiverseAdEncRequester$getDiverseAdApi$2;
import com.kwai.adclient.kscommerciallogger.model.BusinessType;
import msd.l;
import com.kwai.framework.model.feed.BaseFeed;
import brd.x;
import qa.b;
import erd.g;
import cjd.e;
import erd.o;
import qa.c;
import qa.d;

public final class a extends a	// class@0029b5
{
    public final a b;
    public static final a$a c;

    static {
       a.c = new a$a(null);
    }
    public void a(a p0){
       a.p(p0, "adParams");
       super();
       this.b = p0;
    }
    public t a(){
       a uoa = this;
       String str = a.a.b(uoa.b);
       MXSec mXSec = MXSec.get();
       a.o(mXSec, "MXSec.get\(\)");
       Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
       byte[] bytes = str.getBytes(d.a);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       byte[] uobyteArray = mXSec.getWrapper().atlasEncrypt("KwaiAdAwardVideo", "95147564-9763-4413-a937-6f0e3c12caf1", 0, bytes);
       MXSec mXSec1 = MXSec.get();
       a.o(mXSec1, "MXSec.get\(\)");
       String str1 = mXSec1.getWrapper().atlasSign("KwaiAdAwardVideo", "95147564-9763-4413-a937-6f0e3c12caf1", 0, str);
       Object[] objArray = new Object[0];
       j0.f("AdBaseDataRequester", "request params: "+str, objArray);
       t ot = b.a(0x3a268c29).o(b.b().a(uobyteArray), str1);
       f uof = new f(c.Z.k(), null, DiverseAdEncRequester$getDiverseAdApi$1.INSTANCE, DiverseAdEncRequester$getDiverseAdApi$2.INSTANCE, 2, null);
       h oh = new h(null, uoa.b.a(), uoa.b.b(), v8, null, 17, null);
       ot = ot.compose(v12).doOnNext(b.b).map(new e()).map(c.b).onErrorReturn(d.b);
       a.o(ot, "Singleton.get\(Commercial\x20\x02e ?: \"\"\n        \)\n      }\x00");
       return ot;
    }
}
