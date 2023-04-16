package eo2.h$e;
import co2.r;
import eo2.h;
import java.lang.Object;
import co2.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import ht2.a;
import kotlin.jvm.internal.a;

public final class h$e implements r	// class@0027a4
{
    public final h b;

    public void h$e(h p0){
       this.b = p0;
       super();
    }
    public void a(){
       q.d(this);
    }
    public void b0(int p0,boolean p1){
       if (PatchProxy.isSupport(h$e.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, h$e.class, "3")) {
          return;
       }
       this.b.D0();
       return;
    }
    public void c(int p0){
       if (PatchProxy.isSupport(h$e.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, h$e.class, "2")) {
          return;
       }
       this.b.D0();
       return;
    }
    public void n(int p0,LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState p1,a p2){
       if (PatchProxy.isSupport(h$e.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, h$e.class, "1")) {
          return;
       }
       a.p(p2, "micSeatChangedInfo");
       this.b.D0();
       return;
    }
}
