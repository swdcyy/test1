package dp2.d;
import erd.o;
import dp2.i;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import jp2.c;
import brd.t;
import cjd.e;
import dp2.c;
import erd.g;
import dp2.b;

public final class d implements o	// class@00256e
{
    public final i b;

    public void d(i p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "token");
          p0 = LiveVoicePartyApi.b().x(this.b.l.b(), this.b.l.d(), this.b.l.a(), p0).map(new e()).doOnNext(new c(this));
          a.o(p0, "LiveVoicePartyApi.voiceP¡­KEN\n          \)\n        }");
          ot = p0.onErrorResumeNext(new b());
          a.o(ot, "onErrorResumeNext\(Functi¡­ble.error\(mapper\(t\)\)\n  }\)");
       }
       return ot;
    }
}
