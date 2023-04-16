package dp2.h;
import erd.o;
import dp2.i;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import jp2.c;
import brd.t;

public final class h implements o	// class@002572
{
    public final i b;

    public void h(i p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, h.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          p0.f = true;
          ot = LiveVoicePartyApi.b().g(this.b.l.b(), this.b.l.d(), this.b.l.a());
       }
       return ot;
    }
}
