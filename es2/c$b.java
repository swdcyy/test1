package es2.c$b;
import co2.r;
import es2.c;
import java.lang.Object;
import co2.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.String;
import ds2.d;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState;
import ht2.a;

public final class c$b implements r	// class@0027ce
{
    public final c b;

    public void c$b(c p0){
       this.b = p0;
       super();
    }
    public void a(){
       q.d(this);
    }
    public void b0(int p0,boolean p1){
       if (PatchProxy.isSupport(c$b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, c$b.class, "1")) {
          return;
       }
       this.b.x0(p0);
       return;
    }
    public void c(int p0){
       q.c(this, p0);
    }
    public void n(int p0,LiveVoicePartyMicSeatsReadyResponse$VoicePartyUserInitialState p1,a p2){
       q.b(this, p0, p1, p2);
    }
}
