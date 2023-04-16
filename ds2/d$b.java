package ds2.d$b;
import java.lang.Runnable;
import ds2.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import bs2.a;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import qu2.a;
import co2.f2;
import brd.t;
import cjd.e;
import erd.o;
import ds2.e;
import ds2.f;
import erd.g;
import crd.b;
import ekd.k1;

public final class d$b implements Runnable	// class@00258b
{
    public final d b;

    public void d$b(d p0){
       this.b = p0;
       super();
    }
    public void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d$b.class, "1")) {
          return;
       }
       d$b tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, d.class, "4")) {
          LiveVoicePartyApi.b().K(tb.g.getLiveStreamId(), tb.h.y()).map(new e()).subscribe(new e(tb), new f(tb));
       }
       k1.r(this, this.b.c);
       return;
    }
}
