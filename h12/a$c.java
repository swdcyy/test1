package h12.a$c;
import co2.r;
import mrd.a;
import java.lang.Object;
import co2.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import je3.o;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import ht2.a;
import kotlin.jvm.internal.a;

public final class a$c implements r	// class@002be8
{
    public final a b;

    public void a$c(a p0){
       this.b = p0;
       super();
    }
    public void a(){
       q.d(this);
    }
    public void b0(int p0,boolean p1){
       q.a(this, p0, p1);
    }
    public void c(int p0){
       a$c uoc = a$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       this.b.onNext(new o(false));
       return;
    }
    public void n(int p0,LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState p1,a p2){
       if (PatchProxy.isSupport(a$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, a$c.class, "1")) {
          return;
       }
       a.p(p2, "micSeatChangedInfo");
       this.b.onNext(new o(true));
       return;
    }
}
